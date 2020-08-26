package typings.auth0Angular.auth0.angular

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITokenOptions extends js.Object {
  var api: js.UndefOr[String] = js.native
  var targetClientId: js.UndefOr[String] = js.native
}

object ITokenOptions {
  @scala.inline
  def apply(): ITokenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITokenOptions]
  }
  @scala.inline
  implicit class ITokenOptionsOps[Self <: ITokenOptions] (val x: Self) extends AnyVal {
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
    def setApi(value: String): Self = this.set("api", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApi: Self = this.set("api", js.undefined)
    @scala.inline
    def setTargetClientId(value: String): Self = this.set("targetClientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetClientId: Self = this.set("targetClientId", js.undefined)
  }
  
}

