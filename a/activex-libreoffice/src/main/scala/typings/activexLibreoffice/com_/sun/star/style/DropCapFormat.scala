package typings.activexLibreoffice.com_.sun.star.style

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This struct describes drop caps at a paragraph object. */
@js.native
trait DropCapFormat extends js.Object {
  /** This is the number of characters in the drop cap. */
  var Count: Double = js.native
  /** This is the distance between the drop cap in the following text. */
  var Distance: Double = js.native
  /** This is the number of lines used for a drop cap. */
  var Lines: Double = js.native
}

object DropCapFormat {
  @scala.inline
  def apply(Count: Double, Distance: Double, Lines: Double): DropCapFormat = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Distance = Distance.asInstanceOf[js.Any], Lines = Lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropCapFormat]
  }
  @scala.inline
  implicit class DropCapFormatOps[Self <: DropCapFormat] (val x: Self) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setDistance(value: Double): Self = this.set("Distance", value.asInstanceOf[js.Any])
    @scala.inline
    def setLines(value: Double): Self = this.set("Lines", value.asInstanceOf[js.Any])
  }
  
}

