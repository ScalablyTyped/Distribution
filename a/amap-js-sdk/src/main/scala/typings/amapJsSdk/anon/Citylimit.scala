package typings.amapJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Citylimit extends js.Object {
  var city: js.UndefOr[String] = js.native
  var citylimit: js.UndefOr[Boolean] = js.native
  var datatype: js.UndefOr[String] = js.native
  var input: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object Citylimit {
  @scala.inline
  def apply(): Citylimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Citylimit]
  }
  @scala.inline
  implicit class CitylimitOps[Self <: Citylimit] (val x: Self) extends AnyVal {
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
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCity: Self = this.set("city", js.undefined)
    @scala.inline
    def setCitylimit(value: Boolean): Self = this.set("citylimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCitylimit: Self = this.set("citylimit", js.undefined)
    @scala.inline
    def setDatatype(value: String): Self = this.set("datatype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatatype: Self = this.set("datatype", js.undefined)
    @scala.inline
    def setInput(value: String): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

