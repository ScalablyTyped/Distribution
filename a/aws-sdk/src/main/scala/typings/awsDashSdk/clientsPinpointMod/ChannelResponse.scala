package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelResponse extends js.Object {
  /**
    * The unique identifier for the application.
    */
  var ApplicationId: js.UndefOr[__string] = js.undefined
  /**
    * The date and time, in ISO 8601 format, when the channel was enabled.
    */
  var CreationDate: js.UndefOr[__string] = js.undefined
  /**
    * Specifies whether the channel is enabled for the application.
    */
  var Enabled: js.UndefOr[__boolean] = js.undefined
  /**
    * (Not used) This property is retained only for backward compatibility.
    */
  var HasCredential: js.UndefOr[__boolean] = js.undefined
  /**
    * (Deprecated) An identifier for the channel. This property is retained only for backward compatibility.
    */
  var Id: js.UndefOr[__string] = js.undefined
  /**
    * Specifies whether the channel is archived.
    */
  var IsArchived: js.UndefOr[__boolean] = js.undefined
  /**
    * The user who last modified the channel.
    */
  var LastModifiedBy: js.UndefOr[__string] = js.undefined
  /**
    * The date and time, in ISO 8601 format, when the channel was last modified.
    */
  var LastModifiedDate: js.UndefOr[__string] = js.undefined
  /**
    * The current version of the channel.
    */
  var Version: js.UndefOr[__integer] = js.undefined
}

object ChannelResponse {
  @scala.inline
  def apply(
    ApplicationId: __string = null,
    CreationDate: __string = null,
    Enabled: js.UndefOr[Boolean] = js.undefined,
    HasCredential: js.UndefOr[Boolean] = js.undefined,
    Id: __string = null,
    IsArchived: js.UndefOr[Boolean] = js.undefined,
    LastModifiedBy: __string = null,
    LastModifiedDate: __string = null,
    Version: Int | Double = null
  ): ChannelResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId)
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    if (!js.isUndefined(HasCredential)) __obj.updateDynamic("HasCredential")(HasCredential)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (!js.isUndefined(IsArchived)) __obj.updateDynamic("IsArchived")(IsArchived)
    if (LastModifiedBy != null) __obj.updateDynamic("LastModifiedBy")(LastModifiedBy)
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate)
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelResponse]
  }
}

