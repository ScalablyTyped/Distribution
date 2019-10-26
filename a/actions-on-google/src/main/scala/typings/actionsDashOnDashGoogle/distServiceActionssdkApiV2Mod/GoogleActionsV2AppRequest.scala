package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2AppRequest extends js.Object {
  /**
    * Surfaces available for cross surface handoff.
    */
  var availableSurfaces: js.UndefOr[js.Array[GoogleActionsV2Surface]] = js.undefined
  /**
    * Holds session data like the conversation ID and conversation token.
    */
  var conversation: js.UndefOr[GoogleActionsV2Conversation] = js.undefined
  /**
    * Information about the device the user is using to interact with the Action.
    */
  var device: js.UndefOr[GoogleActionsV2Device] = js.undefined
  /**
    * List of inputs corresponding to the expected inputs specified by the
    * Action. For the initial conversation trigger, the input contains
    * information on how the user triggered the conversation.
    */
  var inputs: js.UndefOr[js.Array[GoogleActionsV2Input]] = js.undefined
  /**
    * Indicates whether the request should be handled in sandbox mode.
    */
  var isInSandbox: js.UndefOr[Boolean] = js.undefined
  /**
    * Information about the surface the user is interacting with, e.g. whether it
    * can output audio or has a screen.
    */
  var surface: js.UndefOr[GoogleActionsV2Surface] = js.undefined
  /**
    * User who initiated the conversation.
    */
  var user: js.UndefOr[GoogleActionsV2User] = js.undefined
}

object GoogleActionsV2AppRequest {
  @scala.inline
  def apply(
    availableSurfaces: js.Array[GoogleActionsV2Surface] = null,
    conversation: GoogleActionsV2Conversation = null,
    device: GoogleActionsV2Device = null,
    inputs: js.Array[GoogleActionsV2Input] = null,
    isInSandbox: js.UndefOr[Boolean] = js.undefined,
    surface: GoogleActionsV2Surface = null,
    user: GoogleActionsV2User = null
  ): GoogleActionsV2AppRequest = {
    val __obj = js.Dynamic.literal()
    if (availableSurfaces != null) __obj.updateDynamic("availableSurfaces")(availableSurfaces)
    if (conversation != null) __obj.updateDynamic("conversation")(conversation)
    if (device != null) __obj.updateDynamic("device")(device)
    if (inputs != null) __obj.updateDynamic("inputs")(inputs)
    if (!js.isUndefined(isInSandbox)) __obj.updateDynamic("isInSandbox")(isInSandbox)
    if (surface != null) __obj.updateDynamic("surface")(surface)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[GoogleActionsV2AppRequest]
  }
}

