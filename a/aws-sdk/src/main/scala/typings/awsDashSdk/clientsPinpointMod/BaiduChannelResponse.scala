package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaiduChannelResponse extends js.Object {
  /**
    * The unique identifier for the application that the Baidu channel applies to.
    */
  var ApplicationId: js.UndefOr[__string] = js.undefined
  /**
    * The date and time when the Baidu channel was enabled.
    */
  var CreationDate: js.UndefOr[__string] = js.undefined
  /**
    * The API key that you received from the Baidu Cloud Push service to communicate with the service.
    */
  var Credential: __string
  /**
    * Specifies whether the Baidu channel is enabled for the application.
    */
  var Enabled: js.UndefOr[__boolean] = js.undefined
  /**
    * (Not used) This property is retained only for backward compatibility.
    */
  var HasCredential: js.UndefOr[__boolean] = js.undefined
  /**
    * (Deprecated) An identifier for the Baidu channel. This property is retained only for backward compatibility.
    */
  var Id: js.UndefOr[__string] = js.undefined
  /**
    * Specifies whether the Baidu channel is archived.
    */
  var IsArchived: js.UndefOr[__boolean] = js.undefined
  /**
    * The user who last modified the Baidu channel.
    */
  var LastModifiedBy: js.UndefOr[__string] = js.undefined
  /**
    * The date and time when the Baidu channel was last modified.
    */
  var LastModifiedDate: js.UndefOr[__string] = js.undefined
  /**
    * The type of messaging or notification platform for the channel. For the Baidu channel, this value is BAIDU.
    */
  var Platform: __string
  /**
    * The current version of the Baidu channel.
    */
  var Version: js.UndefOr[__integer] = js.undefined
}

object BaiduChannelResponse {
  @scala.inline
  def apply(
    Credential: __string,
    Platform: __string,
    ApplicationId: __string = null,
    CreationDate: __string = null,
    Enabled: js.UndefOr[Boolean] = js.undefined,
    HasCredential: js.UndefOr[Boolean] = js.undefined,
    Id: __string = null,
    IsArchived: js.UndefOr[Boolean] = js.undefined,
    LastModifiedBy: __string = null,
    LastModifiedDate: __string = null,
    Version: Int | Double = null
  ): BaiduChannelResponse = {
    val __obj = js.Dynamic.literal(Credential = Credential, Platform = Platform)
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId)
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    if (!js.isUndefined(HasCredential)) __obj.updateDynamic("HasCredential")(HasCredential)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (!js.isUndefined(IsArchived)) __obj.updateDynamic("IsArchived")(IsArchived)
    if (LastModifiedBy != null) __obj.updateDynamic("LastModifiedBy")(LastModifiedBy)
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate)
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaiduChannelResponse]
  }
}

