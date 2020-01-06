package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait APNSSandboxChannelResponse extends js.Object {
  /**
    * The unique identifier for the application that the APNs sandbox channel applies to.
    */
  var ApplicationId: js.UndefOr[__string] = js.native
  /**
    * The date and time when the APNs sandbox channel was enabled.
    */
  var CreationDate: js.UndefOr[__string] = js.native
  /**
    * The default authentication method that Amazon Pinpoint uses to authenticate with the APNs sandbox environment for this channel, key or certificate.
    */
  var DefaultAuthenticationMethod: js.UndefOr[__string] = js.native
  /**
    * Specifies whether the APNs sandbox channel is enabled for the application.
    */
  var Enabled: js.UndefOr[__boolean] = js.native
  /**
    * (Not used) This property is retained only for backward compatibility.
    */
  var HasCredential: js.UndefOr[__boolean] = js.native
  /**
    * Specifies whether the APNs sandbox channel is configured to communicate with APNs by using APNs tokens. To provide an authentication key for APNs tokens, set the TokenKey property of the channel.
    */
  var HasTokenKey: js.UndefOr[__boolean] = js.native
  /**
    * (Deprecated) An identifier for the APNs sandbox channel. This property is retained only for backward compatibility.
    */
  var Id: js.UndefOr[__string] = js.native
  /**
    * Specifies whether the APNs sandbox channel is archived.
    */
  var IsArchived: js.UndefOr[__boolean] = js.native
  /**
    * The user who last modified the APNs sandbox channel.
    */
  var LastModifiedBy: js.UndefOr[__string] = js.native
  /**
    * The date and time when the APNs sandbox channel was last modified.
    */
  var LastModifiedDate: js.UndefOr[__string] = js.native
  /**
    * The type of messaging or notification platform for the channel. For the APNs sandbox channel, this value is APNS_SANDBOX.
    */
  var Platform: __string = js.native
  /**
    * The current version of the APNs sandbox channel.
    */
  var Version: js.UndefOr[__integer] = js.native
}

object APNSSandboxChannelResponse {
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
  ): APNSSandboxChannelResponse = {
    val __obj = js.Dynamic.literal(Platform = Platform.asInstanceOf[js.Any])
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (DefaultAuthenticationMethod != null) __obj.updateDynamic("DefaultAuthenticationMethod")(DefaultAuthenticationMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(HasCredential)) __obj.updateDynamic("HasCredential")(HasCredential.asInstanceOf[js.Any])
    if (!js.isUndefined(HasTokenKey)) __obj.updateDynamic("HasTokenKey")(HasTokenKey.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (!js.isUndefined(IsArchived)) __obj.updateDynamic("IsArchived")(IsArchived.asInstanceOf[js.Any])
    if (LastModifiedBy != null) __obj.updateDynamic("LastModifiedBy")(LastModifiedBy.asInstanceOf[js.Any])
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[APNSSandboxChannelResponse]
  }
}

