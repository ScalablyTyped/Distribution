package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This structure contains all properties of a bitmap when used as FillStyle.
  * @see com.sun.star.drawing.FillProperties
  */
trait FillBitmap extends js.Object {
  /**
    * this enum selects how a area is filled with a single bitmap.
    *
    * It may be repeated, stretched or displayed with blank space around it.
    */
  var aBitmapMode: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.BitmapMode
  /**
    * This is the horizontal and vertical offset where the tile starts.
    *
    * It is given in percent in relation to the width of the bitmap.
    */
  var aOffset: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point
  /** Every second line (X) / row (Y) of tiles is moved the given percent of the width of the bitmap. */
  var aPositionOffset: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point
  /** The RectanglePoint specifies the position inside of the bitmap to use as the top left position for rendering. */
  var aRectanglePoint: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.RectanglePoint
  /**
    * This is the size of the tile for filling.
    *
    * Depending on the property LogicalSize, this is either relative or absolute.
    */
  var aSize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size
  /** a URL to the bitmap used. This may be an internal URL of the graphics manager. */
  var aURL: java.lang.String
  /**
    * specifies if the size is given in percentage or as an absolute value.
    *
    * If this is `TRUE` , the properties SizeX and SizeY contain the size of the tile in percent of the size of the original bitmap. If this is `FALSE` ,
    * the size of the tile is specified with 1/100th mm.
    */
  var bLogicalSize: scala.Boolean
}

object FillBitmap {
  @scala.inline
  def apply(
    aBitmapMode: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.BitmapMode,
    aOffset: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    aPositionOffset: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    aRectanglePoint: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.RectanglePoint,
    aSize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    aURL: java.lang.String,
    bLogicalSize: scala.Boolean
  ): FillBitmap = {
    val __obj = js.Dynamic.literal(aBitmapMode = aBitmapMode, aOffset = aOffset, aPositionOffset = aPositionOffset, aRectanglePoint = aRectanglePoint, aSize = aSize, aURL = aURL, bLogicalSize = bLogicalSize)
  
    __obj.asInstanceOf[FillBitmap]
  }
}

