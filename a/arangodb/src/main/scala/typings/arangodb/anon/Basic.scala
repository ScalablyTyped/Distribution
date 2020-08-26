package typings.arangodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Basic extends js.Object {
  var basic: js.UndefOr[Username] = js.native
  var bearer: js.UndefOr[String] = js.native
}

object Basic {
  @scala.inline
  def apply(): Basic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Basic]
  }
  @scala.inline
  implicit class BasicOps[Self <: Basic] (val x: Self) extends AnyVal {
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
    def setBasic(value: Username): Self = this.set("basic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasic: Self = this.set("basic", js.undefined)
    @scala.inline
    def setBearer(value: String): Self = this.set("bearer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBearer: Self = this.set("bearer", js.undefined)
  }
  
}

