package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APNSVoipChannelResponse extends js.Object {
  /**
    * The unique identifier for the application that the APNs VoIP channel applies to.
    */
  var ApplicationId: js.UndefOr[__string] = js.undefined
  /**
    * The date and time when the APNs VoIP channel was enabled.
    */
  var CreationDate: js.UndefOr[__string] = js.undefined
  /**
    * The default authentication method that Amazon Pinpoint uses to authenticate with APNs for this channel, key or certificate.
    */
  var DefaultAuthenticationMethod: js.UndefOr[__string] = js.undefined
  /**
    * Specifies whether the APNs VoIP channel is enabled for the application.
    */
  var Enabled: js.UndefOr[__boolean] = js.undefined
  /**
    * (Not used) This property is retained only for backward compatibility.
    */
  var HasCredential: js.UndefOr[__boolean] = js.undefined
  /**
    * Specifies whether the APNs VoIP channel is configured to communicate with APNs by using APNs tokens. To provide an authentication key for APNs tokens, set the TokenKey property of the channel.
    */
  var HasTokenKey: js.UndefOr[__boolean] = js.undefined
  /**
    * (Deprecated) An identifier for the APNs VoIP channel. This property is retained only for backward compatibility.
    */
  var Id: js.UndefOr[__string] = js.undefined
  /**
    * Specifies whether the APNs VoIP channel is archived.
    */
  var IsArchived: js.UndefOr[__boolean] = js.undefined
  /**
    * The user who last modified the APNs VoIP channel.
    */
  var LastModifiedBy: js.UndefOr[__string] = js.undefined
  /**
    * The date and time when the APNs VoIP channel was last modified.
    */
  var LastModifiedDate: js.UndefOr[__string] = js.undefined
  /**
    * The type of messaging or notification platform for the channel. For the APNs VoIP channel, this value is APNS_VOIP.
    */
  var Platform: __string
  /**
    * The current version of the APNs VoIP channel.
    */
  var Version: js.UndefOr[__integer] = js.undefined
}

object APNSVoipChannelResponse {
  @scala.inline
  def apply(
    Platform: __string,
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
    Version: js.UndefOr[__integer] = js.undefined
  ): APNSVoipChannelResponse = {
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
    if (!js.isUndefined(Version)) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[APNSVoipChannelResponse]
  }
}

