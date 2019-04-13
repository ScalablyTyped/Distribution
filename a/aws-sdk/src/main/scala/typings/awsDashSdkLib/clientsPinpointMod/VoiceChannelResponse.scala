package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoiceChannelResponse extends js.Object {
  /**
    * Application id
    */
  var ApplicationId: js.UndefOr[__string] = js.undefined
  /**
    * The date that the settings were last updated in ISO 8601 format.
    */
  var CreationDate: js.UndefOr[__string] = js.undefined
  /**
    * If the channel is enabled for sending messages.
    */
  var Enabled: js.UndefOr[__boolean] = js.undefined
  var HasCredential: js.UndefOr[__boolean] = js.undefined
  /**
    * Channel ID. Not used, only for backwards compatibility.
    */
  var Id: js.UndefOr[__string] = js.undefined
  /**
    * Is this channel archived
    */
  var IsArchived: js.UndefOr[__boolean] = js.undefined
  /**
    * Who made the last change
    */
  var LastModifiedBy: js.UndefOr[__string] = js.undefined
  /**
    * Last date this was updated
    */
  var LastModifiedDate: js.UndefOr[__string] = js.undefined
  /**
    * Platform type. Will be "Voice"
    */
  var Platform: js.UndefOr[__string] = js.undefined
  /**
    * Version of channel
    */
  var Version: js.UndefOr[__integer] = js.undefined
}

object VoiceChannelResponse {
  @scala.inline
  def apply(
    ApplicationId: __string = null,
    CreationDate: __string = null,
    Enabled: js.UndefOr[__boolean] = js.undefined,
    HasCredential: js.UndefOr[__boolean] = js.undefined,
    Id: __string = null,
    IsArchived: js.UndefOr[__boolean] = js.undefined,
    LastModifiedBy: __string = null,
    LastModifiedDate: __string = null,
    Platform: __string = null,
    Version: js.UndefOr[__integer] = js.undefined
  ): VoiceChannelResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId)
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    if (!js.isUndefined(HasCredential)) __obj.updateDynamic("HasCredential")(HasCredential)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (!js.isUndefined(IsArchived)) __obj.updateDynamic("IsArchived")(IsArchived)
    if (LastModifiedBy != null) __obj.updateDynamic("LastModifiedBy")(LastModifiedBy)
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate)
    if (Platform != null) __obj.updateDynamic("Platform")(Platform)
    if (!js.isUndefined(Version)) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[VoiceChannelResponse]
  }
}

