package typings.activexLibreoffice.com_.sun.star.text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait HoriOrientationFormat extends js.Object {
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
  implicit class HoriOrientationFormatOps[Self <: HoriOrientationFormat] (val x: Self) extends AnyVal {
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
    def setHorizontalOrientation(value: Double): Self = this.set("HorizontalOrientation", value.asInstanceOf[js.Any])
    @scala.inline
    def setHorizontalRelation(value: Double): Self = this.set("HorizontalRelation", value.asInstanceOf[js.Any])
    @scala.inline
    def setPositionToggle(value: Boolean): Self = this.set("PositionToggle", value.asInstanceOf[js.Any])
    @scala.inline
    def setXPos(value: Double): Self = this.set("XPos", value.asInstanceOf[js.Any])
  }
  
}

