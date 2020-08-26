package typings.aceBuilds.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mac extends js.Object {
  var mac: js.UndefOr[String] = js.native
  var win: js.UndefOr[String] = js.native
}

object Mac {
  @scala.inline
  def apply(): Mac = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mac]
  }
  @scala.inline
  implicit class MacOps[Self <: Mac] (val x: Self) extends AnyVal {
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
    def setMac(value: String): Self = this.set("mac", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMac: Self = this.set("mac", js.undefined)
    @scala.inline
    def setWin(value: String): Self = this.set("win", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWin: Self = this.set("win", js.undefined)
  }
  
}

