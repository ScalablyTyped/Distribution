package typings.amapJsApiPlaceSearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cpid extends js.Object {
  var cpid: String = js.native
  var floor: String = js.native
  var truefloor: String = js.native
}

object Cpid {
  @scala.inline
  def apply(cpid: String, floor: String, truefloor: String): Cpid = {
    val __obj = js.Dynamic.literal(cpid = cpid.asInstanceOf[js.Any], floor = floor.asInstanceOf[js.Any], truefloor = truefloor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cpid]
  }
  @scala.inline
  implicit class CpidOps[Self <: Cpid] (val x: Self) extends AnyVal {
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
    def setCpid(value: String): Self = this.set("cpid", value.asInstanceOf[js.Any])
    @scala.inline
    def setFloor(value: String): Self = this.set("floor", value.asInstanceOf[js.Any])
    @scala.inline
    def setTruefloor(value: String): Self = this.set("truefloor", value.asInstanceOf[js.Any])
  }
  
}

