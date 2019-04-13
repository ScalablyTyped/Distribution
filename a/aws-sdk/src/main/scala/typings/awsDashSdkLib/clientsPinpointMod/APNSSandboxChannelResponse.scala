package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APNSSandboxChannelResponse extends js.Object {
  /**
    * The ID of the application to which the channel applies.
    */
  var ApplicationId: js.UndefOr[__string] = js.undefined
  /**
    * When was this segment created
    */
  var CreationDate: js.UndefOr[__string] = js.undefined
  /**
    * The default authentication method used for APNs.
    */
  var DefaultAuthenticationMethod: js.UndefOr[__string] = js.undefined
  /**
    * If the channel is enabled for sending messages.
    */
  var Enabled: js.UndefOr[__boolean] = js.undefined
  /**
    * Not used. Retained for backwards compatibility.
    */
  var HasCredential: js.UndefOr[__boolean] = js.undefined
  /**
    * Indicates whether the channel is configured with a key for APNs token authentication. Provide a token key by setting the TokenKey attribute.
    */
  var HasTokenKey: js.UndefOr[__boolean] = js.undefined
  /**
    * Channel ID. Not used, only for backwards compatibility.
    */
  var Id: js.UndefOr[__string] = js.undefined
  /**
    * Is this channel archived
    */
  var IsArchived: js.UndefOr[__boolean] = js.undefined
  /**
    * Who last updated this entry
    */
  var LastModifiedBy: js.UndefOr[__string] = js.undefined
  /**
    * Last date this was updated
    */
  var LastModifiedDate: js.UndefOr[__string] = js.undefined
  /**
    * The platform type. Will be APNS_SANDBOX.
    */
  var Platform: js.UndefOr[__string] = js.undefined
  /**
    * Version of channel
    */
  var Version: js.UndefOr[__integer] = js.undefined
}

object APNSSandboxChannelResponse {
  @scala.inline
  def apply(
    ApplicationId: __string = null,
    CreationDate: __string = null,
    DefaultAuthenticationMethod: __string = null,
    Enabled: js.UndefOr[__boolean] = js.undefined,
    HasCredential: js.UndefOr[__boolean] = js.undefined,
    HasTokenKey: js.UndefOr[__boolean] = js.undefined,
    Id: __string = null,
    IsArchived: js.UndefOr[__boolean] = js.undefined,
    LastModifiedBy: __string = null,
    LastModifiedDate: __string = null,
    Platform: __string = null,
    Version: js.UndefOr[__integer] = js.undefined
  ): APNSSandboxChannelResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId)
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (DefaultAuthenticationMethod != null) __obj.updateDynamic("DefaultAuthenticationMethod")(DefaultAuthenticationMethod)
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    if (!js.isUndefined(HasCredential)) __obj.updateDynamic("HasCredential")(HasCredential)
    if (!js.isUndefined(HasTokenKey)) __obj.updateDynamic("HasTokenKey")(HasTokenKey)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (!js.isUndefined(IsArchived)) __obj.updateDynamic("IsArchived")(IsArchived)
    if (LastModifiedBy != null) __obj.updateDynamic("LastModifiedBy")(LastModifiedBy)
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate)
    if (Platform != null) __obj.updateDynamic("Platform")(Platform)
    if (!js.isUndefined(Version)) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[APNSSandboxChannelResponse]
  }
}

