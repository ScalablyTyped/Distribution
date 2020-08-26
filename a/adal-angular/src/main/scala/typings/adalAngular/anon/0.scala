package typings.adalAngular.anon

import typings.adalAngular.adalAngularStrings.ERRORColon
import typings.adalAngular.adalAngularStrings.INFOColon
import typings.adalAngular.adalAngularStrings.VERBOSEColon
import typings.adalAngular.adalAngularStrings.WARNINGColon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `0` extends js.Object {
  var `0`: ERRORColon = js.native
  var `1`: WARNINGColon = js.native
  var `2`: INFOColon = js.native
  var `3`: VERBOSEColon = js.native
}

object `0` {
  @scala.inline
  def apply(`0`: ERRORColon, `1`: WARNINGColon, `2`: INFOColon, `3`: VERBOSEColon): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  @scala.inline
  implicit class `0Ops`[Self <: `0`] (val x: Self) extends AnyVal {
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
    def set0(value: ERRORColon): Self = this.set("0", value.asInstanceOf[js.Any])
    @scala.inline
    def set1(value: WARNINGColon): Self = this.set("1", value.asInstanceOf[js.Any])
    @scala.inline
    def set2(value: INFOColon): Self = this.set("2", value.asInstanceOf[js.Any])
    @scala.inline
    def set3(value: VERBOSEColon): Self = this.set("3", value.asInstanceOf[js.Any])
  }
  
}

