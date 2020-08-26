package typings.auth0Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckSessionOptions extends AuthorizeOptions {
  /**
    * optional parameter for auth0 to use postMessage to communicate between the silent callback and the SPA.
    */
  var usePostMessage: js.UndefOr[Boolean] = js.native
}

object CheckSessionOptions {
  @scala.inline
  def apply(): CheckSessionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckSessionOptions]
  }
  @scala.inline
  implicit class CheckSessionOptionsOps[Self <: CheckSessionOptions] (val x: Self) extends AnyVal {
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
    def setUsePostMessage(value: Boolean): Self = this.set("usePostMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsePostMessage: Self = this.set("usePostMessage", js.undefined)
  }
  
}

