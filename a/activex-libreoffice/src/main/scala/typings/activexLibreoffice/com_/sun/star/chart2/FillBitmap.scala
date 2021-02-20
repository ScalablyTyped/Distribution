package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.com_.sun.star.awt.Point
import typings.activexLibreoffice.com_.sun.star.awt.Size
import typings.activexLibreoffice.com_.sun.star.drawing.BitmapMode
import typings.activexLibreoffice.com_.sun.star.drawing.RectanglePoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This structure contains all properties of a bitmap when used as FillStyle.
  * @see com.sun.star.drawing.FillProperties
  */
@js.native
trait FillBitmap extends StObject {
  
  /**
    * this enum selects how a area is filled with a single bitmap.
    *
    * It may be repeated, stretched or displayed with blank space around it.
    */
  var aBitmapMode: BitmapMode = js.native
  
  /**
    * This is the horizontal and vertical offset where the tile starts.
    *
    * It is given in percent in relation to the width of the bitmap.
    */
  var aOffset: Point = js.native
  
  /** Every second line (X) / row (Y) of tiles is moved the given percent of the width of the bitmap. */
  var aPositionOffset: Point = js.native
  
  /** The RectanglePoint specifies the position inside of the bitmap to use as the top left position for rendering. */
  var aRectanglePoint: RectanglePoint = js.native
  
  /**
    * This is the size of the tile for filling.
    *
    * Depending on the property LogicalSize, this is either relative or absolute.
    */
  var aSize: Size = js.native
  
  /** a URL to the bitmap used. This may be an internal URL of the graphics manager. */
  var aURL: String = js.native
  
  /**
    * specifies if the size is given in percentage or as an absolute value.
    *
    * If this is `TRUE` , the properties SizeX and SizeY contain the size of the tile in percent of the size of the original bitmap. If this is `FALSE` ,
    * the size of the tile is specified with 1/100th mm.
    */
  var bLogicalSize: Boolean = js.native
}
object FillBitmap {
  
  @scala.inline
  def apply(
    aBitmapMode: BitmapMode,
    aOffset: Point,
    aPositionOffset: Point,
    aRectanglePoint: RectanglePoint,
    aSize: Size,
    aURL: String,
    bLogicalSize: Boolean
  ): FillBitmap = {
    val __obj = js.Dynamic.literal(aBitmapMode = aBitmapMode.asInstanceOf[js.Any], aOffset = aOffset.asInstanceOf[js.Any], aPositionOffset = aPositionOffset.asInstanceOf[js.Any], aRectanglePoint = aRectanglePoint.asInstanceOf[js.Any], aSize = aSize.asInstanceOf[js.Any], aURL = aURL.asInstanceOf[js.Any], bLogicalSize = bLogicalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillBitmap]
  }
  
  @scala.inline
  implicit class FillBitmapMutableBuilder[Self <: FillBitmap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setABitmapMode(value: BitmapMode): Self = StObject.set(x, "aBitmapMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAOffset(value: Point): Self = StObject.set(x, "aOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAPositionOffset(value: Point): Self = StObject.set(x, "aPositionOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARectanglePoint(value: RectanglePoint): Self = StObject.set(x, "aRectanglePoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setASize(value: Size): Self = StObject.set(x, "aSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAURL(value: String): Self = StObject.set(x, "aURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBLogicalSize(value: Boolean): Self = StObject.set(x, "bLogicalSize", value.asInstanceOf[js.Any])
  }
}
