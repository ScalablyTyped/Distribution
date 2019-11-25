package typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseMediaMod

import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2MediaResponseMediaType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaResponseOptions extends js.Object {
  /**
    * Array of MediaObject held in the MediaResponse.
    * @public
    */
  var objects: js.Array[MediaObjectString]
  /**
    * Type of the media within this MediaResponse.
    * Defaults to 'AUDIO'
    * @public
    */
  var `type`: js.UndefOr[GoogleActionsV2MediaResponseMediaType] = js.undefined
}

object MediaResponseOptions {
  @scala.inline
  def apply(objects: js.Array[MediaObjectString], `type`: GoogleActionsV2MediaResponseMediaType = null): MediaResponseOptions = {
    val __obj = js.Dynamic.literal(objects = objects.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaResponseOptions]
  }
}

