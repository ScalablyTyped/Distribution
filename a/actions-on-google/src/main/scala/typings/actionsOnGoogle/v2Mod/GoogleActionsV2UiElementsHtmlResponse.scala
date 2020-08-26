package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2UiElementsHtmlResponse extends js.Object {
  /**
    * Provide an option so that mic won't be opened after this immersive
    * response.
    */
  var suppressMic: js.UndefOr[Boolean] = js.native
  /**
    * Communicate the following JSON object to the app.
    */
  var updatedState: js.UndefOr[ApiClientObjectMap[_]] = js.native
  /**
    * The url of the application.
    */
  var url: js.UndefOr[String] = js.native
}

object GoogleActionsV2UiElementsHtmlResponse {
  @scala.inline
  def apply(): GoogleActionsV2UiElementsHtmlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UiElementsHtmlResponse]
  }
  @scala.inline
  implicit class GoogleActionsV2UiElementsHtmlResponseOps[Self <: GoogleActionsV2UiElementsHtmlResponse] (val x: Self) extends AnyVal {
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
    def setSuppressMic(value: Boolean): Self = this.set("suppressMic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressMic: Self = this.set("suppressMic", js.undefined)
    @scala.inline
    def setUpdatedState(value: ApiClientObjectMap[_]): Self = this.set("updatedState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdatedState: Self = this.set("updatedState", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

