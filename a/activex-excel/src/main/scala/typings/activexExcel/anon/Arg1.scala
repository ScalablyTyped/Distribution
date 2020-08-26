package typings.activexExcel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Arg1 extends js.Object {
  val Arg1: Double = js.native
  val Arg2: Double = js.native
  var Cancel: Boolean = js.native
  val ElementID: Double = js.native
}

object Arg1 {
  @scala.inline
  def apply(Arg1: Double, Arg2: Double, Cancel: Boolean, ElementID: Double): Arg1 = {
    val __obj = js.Dynamic.literal(Arg1 = Arg1.asInstanceOf[js.Any], Arg2 = Arg2.asInstanceOf[js.Any], Cancel = Cancel.asInstanceOf[js.Any], ElementID = ElementID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arg1]
  }
  @scala.inline
  implicit class Arg1Ops[Self <: Arg1] (val x: Self) extends AnyVal {
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
    def setArg1(value: Double): Self = this.set("Arg1", value.asInstanceOf[js.Any])
    @scala.inline
    def setArg2(value: Double): Self = this.set("Arg2", value.asInstanceOf[js.Any])
    @scala.inline
    def setCancel(value: Boolean): Self = this.set("Cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setElementID(value: Double): Self = this.set("ElementID", value.asInstanceOf[js.Any])
  }
  
}

