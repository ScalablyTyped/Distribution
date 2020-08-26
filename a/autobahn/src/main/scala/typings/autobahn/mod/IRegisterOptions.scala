package typings.autobahn.mod

import typings.autobahn.autobahnStrings.first
import typings.autobahn.autobahnStrings.last
import typings.autobahn.autobahnStrings.random
import typings.autobahn.autobahnStrings.roundrobin
import typings.autobahn.autobahnStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRegisterOptions extends js.Object {
  var disclose_caller: js.UndefOr[Boolean] = js.native
  var invoke: js.UndefOr[single | roundrobin | random | first | last] = js.native
}

object IRegisterOptions {
  @scala.inline
  def apply(): IRegisterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRegisterOptions]
  }
  @scala.inline
  implicit class IRegisterOptionsOps[Self <: IRegisterOptions] (val x: Self) extends AnyVal {
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
    def setDisclose_caller(value: Boolean): Self = this.set("disclose_caller", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisclose_caller: Self = this.set("disclose_caller", js.undefined)
    @scala.inline
    def setInvoke(value: single | roundrobin | random | first | last): Self = this.set("invoke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvoke: Self = this.set("invoke", js.undefined)
  }
  
}

