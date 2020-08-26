package typings.activexExcel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Arg2 extends js.Object {
  val Arg1: Double = js.native
  val Arg2: Double = js.native
  val ElementID: Double = js.native
}

object Arg2 {
  @scala.inline
  def apply(Arg1: Double, Arg2: Double, ElementID: Double): Arg2 = {
    val __obj = js.Dynamic.literal(Arg1 = Arg1.asInstanceOf[js.Any], Arg2 = Arg2.asInstanceOf[js.Any], ElementID = ElementID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arg2]
  }
  @scala.inline
  implicit class Arg2Ops[Self <: Arg2] (val x: Self) extends AnyVal {
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
    def setElementID(value: Double): Self = this.set("ElementID", value.asInstanceOf[js.Any])
  }
  
}

