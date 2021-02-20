package typings.activexLibreoffice.com_.sun.star.text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes the horizontal orientation of an object.
  *
  * If `HorizontalOrientation == HORI_NONE` , then the value "XPos" describes the distance from the left border of the context. Otherwise "XPos" is
  * ignored.
  *
  * The following flags are used to adapt the position of the object to odd and even pages. If "PositionToggle" is set, then the horizontal position is
  * mirrored.
  */
@js.native
trait HoriOrientationFormat extends StObject {
  
  /** determines the horizontal alignment of an object. The values refer to com::sun::star::HoriOrientation. */
  var HorizontalOrientation: Double = js.native
  
  /**
    * determines the reference position of the horizontal alignment.
    * @see com.sun.star.text.RelOrientation
    */
  var HorizontalRelation: Double = js.native
  
  /** determines if the orientation toggles between left and right pages. */
  var PositionToggle: Boolean = js.native
  
  /** contains the distance from the left border. Only valid if the property HorizontalOrientation contains the value HORI_NONE. */
  var XPos: Double = js.native
}
object HoriOrientationFormat {
  
  @scala.inline
  def apply(HorizontalOrientation: Double, HorizontalRelation: Double, PositionToggle: Boolean, XPos: Double): HoriOrientationFormat = {
    val __obj = js.Dynamic.literal(HorizontalOrientation = HorizontalOrientation.asInstanceOf[js.Any], HorizontalRelation = HorizontalRelation.asInstanceOf[js.Any], PositionToggle = PositionToggle.asInstanceOf[js.Any], XPos = XPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoriOrientationFormat]
  }
  
  @scala.inline
  implicit class HoriOrientationFormatMutableBuilder[Self <: HoriOrientationFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHorizontalOrientation(value: Double): Self = StObject.set(x, "HorizontalOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalRelation(value: Double): Self = StObject.set(x, "HorizontalRelation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionToggle(value: Boolean): Self = StObject.set(x, "PositionToggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXPos(value: Double): Self = StObject.set(x, "XPos", value.asInstanceOf[js.Any])
  }
}
