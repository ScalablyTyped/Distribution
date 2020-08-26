package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2AppRequest extends js.Object {
  /**
    * Surfaces available for cross surface handoff.
    */
  var availableSurfaces: js.UndefOr[js.Array[GoogleActionsV2Surface]] = js.native
  /**
    * Holds session data like the conversation ID and conversation token.
    */
  var conversation: js.UndefOr[GoogleActionsV2Conversation] = js.native
  /**
    * Information about the device the user is using to interact with the Action.
    */
  var device: js.UndefOr[GoogleActionsV2Device] = js.native
  /**
    * List of inputs corresponding to the expected inputs specified by the
    * Action. For the initial conversation trigger, the input contains
    * information on how the user triggered the conversation.
    */
  var inputs: js.UndefOr[js.Array[GoogleActionsV2Input]] = js.native
  /**
    * Indicates whether the request should be handled in sandbox mode.
    */
  var isInSandbox: js.UndefOr[Boolean] = js.native
  /**
    * Information about the surface the user is interacting with, e.g. whether it
    * can output audio or has a screen.
    */
  var surface: js.UndefOr[GoogleActionsV2Surface] = js.native
  /**
    * User who initiated the conversation.
    */
  var user: js.UndefOr[GoogleActionsV2User] = js.native
}

object GoogleActionsV2AppRequest {
  @scala.inline
  def apply(): GoogleActionsV2AppRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2AppRequest]
  }
  @scala.inline
  implicit class GoogleActionsV2AppRequestOps[Self <: GoogleActionsV2AppRequest] (val x: Self) extends AnyVal {
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
    def setAvailableSurfacesVarargs(value: GoogleActionsV2Surface*): Self = this.set("availableSurfaces", js.Array(value :_*))
    @scala.inline
    def setAvailableSurfaces(value: js.Array[GoogleActionsV2Surface]): Self = this.set("availableSurfaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailableSurfaces: Self = this.set("availableSurfaces", js.undefined)
    @scala.inline
    def setConversation(value: GoogleActionsV2Conversation): Self = this.set("conversation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConversation: Self = this.set("conversation", js.undefined)
    @scala.inline
    def setDevice(value: GoogleActionsV2Device): Self = this.set("device", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevice: Self = this.set("device", js.undefined)
    @scala.inline
    def setInputsVarargs(value: GoogleActionsV2Input*): Self = this.set("inputs", js.Array(value :_*))
    @scala.inline
    def setInputs(value: js.Array[GoogleActionsV2Input]): Self = this.set("inputs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputs: Self = this.set("inputs", js.undefined)
    @scala.inline
    def setIsInSandbox(value: Boolean): Self = this.set("isInSandbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsInSandbox: Self = this.set("isInSandbox", js.undefined)
    @scala.inline
    def setSurface(value: GoogleActionsV2Surface): Self = this.set("surface", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSurface: Self = this.set("surface", js.undefined)
    @scala.inline
    def setUser(value: GoogleActionsV2User): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
  
}

