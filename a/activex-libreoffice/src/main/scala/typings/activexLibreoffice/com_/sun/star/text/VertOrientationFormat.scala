package typings.activexLibreoffice.com_.sun.star.text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes the vertical orientation of an object.
  *
  * If `VerticalOrientation == VERT_NONE` , then the value "YPos" describes the distance from the top of the context. Otherwise "YPos" is ignored.
  */
@js.native
trait VertOrientationFormat extends js.Object {
  
  /** determines the vertical alignment of an object. The values refer to com::sun::star::VertOrientation. */
  var VerticalOrientation: Double = js.native
  
  /**
    * determines the reference position of the vertical alignment.
    * @see com.sun.star.text.RelOrientation
    */
  var VerticalRelation: Double = js.native
  
  /** contains the distance from top. Only valid if the property VerticalOrientation contains the value VERT_NONE. */
  var YPos: Double = js.native
}
object VertOrientationFormat {
  
  @scala.inline
  def apply(VerticalOrientation: Double, VerticalRelation: Double, YPos: Double): VertOrientationFormat = {
    val __obj = js.Dynamic.literal(VerticalOrientation = VerticalOrientation.asInstanceOf[js.Any], VerticalRelation = VerticalRelation.asInstanceOf[js.Any], YPos = YPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[VertOrientationFormat]
  }
  
  @scala.inline
  implicit class VertOrientationFormatOps[Self <: VertOrientationFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setVerticalOrientation(value: Double): Self = this.set("VerticalOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalRelation(value: Double): Self = this.set("VerticalRelation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYPos(value: Double): Self = this.set("YPos", value.asInstanceOf[js.Any])
  }
}
