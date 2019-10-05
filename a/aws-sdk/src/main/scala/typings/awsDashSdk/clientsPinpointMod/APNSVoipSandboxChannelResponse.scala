package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APNSVoipSandboxChannelResponse extends js.Object {
  /**
    * The unique identifier for the application that the APNs VoIP sandbox channel applies to.
    */
  var ApplicationId: js.UndefOr[__string] = js.undefined
  /**
    * The date and time when the APNs VoIP sandbox channel was enabled.
    */
  var CreationDate: js.UndefOr[__string] = js.undefined
  /**
    * The default authentication method that Amazon Pinpoint uses to authenticate with the APNs sandbox environment for this channel, key or certificate.
    */
  var DefaultAuthenticationMethod: js.UndefOr[__string] = js.undefined
  /**
    * Specifies whether the APNs VoIP sandbox channel is enabled for the application.
    */
  var Enabled: js.UndefOr[__boolean] = js.undefined
  /**
    * (Not used) This property is retained only for backward compatibility.
    */
  var HasCredential: js.UndefOr[__boolean] = js.undefined
  /**
    * Specifies whether the APNs VoIP sandbox channel is configured to communicate with APNs by using APNs tokens. To provide an authentication key for APNs tokens, set the TokenKey property of the channel.
    */
  var HasTokenKey: js.UndefOr[__boolean] = js.undefined
  /**
    * (Deprecated) An identifier for the APNs VoIP sandbox channel. This property is retained only for backward compatibility.
    */
  var Id: js.UndefOr[__string] = js.undefined
  /**
    * Specifies whether the APNs VoIP sandbox channel is archived.
    */
  var IsArchived: js.UndefOr[__boolean] = js.undefined
  /**
    * The user who last modified the APNs VoIP sandbox channel.
    */
  var LastModifiedBy: js.UndefOr[__string] = js.undefined
  /**
    * The date and time when the APNs VoIP sandbox channel was last modified.
    */
  var LastModifiedDate: js.UndefOr[__string] = js.undefined
  /**
    * The type of messaging or notification platform for the channel. For the APNs VoIP sandbox channel, this value is APNS_VOIP_SANDBOX.
    */
  var Platform: __string
  /**
    * The current version of the APNs VoIP sandbox channel.
    */
  var Version: js.UndefOr[__integer] = js.undefined
}

object APNSVoipSandboxChannelResponse {
  @scala.inline
  def apply(
    Platform: __string,
    ApplicationId: __string = null,
    CreationDate: __string = null,
    DefaultAuthenticationMethod: __string = null,
    Enabled: js.UndefOr[Boolean] = js.undefined,
    HasCredential: js.UndefOr[Boolean] = js.undefined,
    HasTokenKey: js.UndefOr[Boolean] = js.undefined,
    Id: __string = null,
    IsArchived: js.UndefOr[Boolean] = js.undefined,
    LastModifiedBy: __string = null,
    LastModifiedDate: __string = null,
    Version: Int | Double = null
  ): APNSVoipSandboxChannelResponse = {
    val __obj = js.Dynamic.literal(Platform = Platform)
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
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[APNSVoipSandboxChannelResponse]
  }
}

