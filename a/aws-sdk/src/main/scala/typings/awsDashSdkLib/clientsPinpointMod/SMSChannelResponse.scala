package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SMSChannelResponse extends js.Object {
  /**
    * The unique ID of the application to which the SMS channel belongs.
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
  /**
    * Not used. Retained for backwards compatibility.
    */
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
    * Who last updated this entry
    */
  var LastModifiedBy: js.UndefOr[__string] = js.undefined
  /**
    * Last date this was updated
    */
  var LastModifiedDate: js.UndefOr[__string] = js.undefined
  /**
    * Platform type. Will be "SMS"
    */
  var Platform: js.UndefOr[__string] = js.undefined
  /**
    * Promotional messages per second that can be sent
    */
  var PromotionalMessagesPerSecond: js.UndefOr[__integer] = js.undefined
  /**
    * Sender identifier of your messages.
    */
  var SenderId: js.UndefOr[__string] = js.undefined
  /**
    * The short code registered with the phone provider.
    */
  var ShortCode: js.UndefOr[__string] = js.undefined
  /**
    * Transactional messages per second that can be sent
    */
  var TransactionalMessagesPerSecond: js.UndefOr[__integer] = js.undefined
  /**
    * Version of channel
    */
  var Version: js.UndefOr[__integer] = js.undefined
}

object SMSChannelResponse {
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
    PromotionalMessagesPerSecond: js.UndefOr[__integer] = js.undefined,
    SenderId: __string = null,
    ShortCode: __string = null,
    TransactionalMessagesPerSecond: js.UndefOr[__integer] = js.undefined,
    Version: js.UndefOr[__integer] = js.undefined
  ): SMSChannelResponse = {
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
    if (!js.isUndefined(PromotionalMessagesPerSecond)) __obj.updateDynamic("PromotionalMessagesPerSecond")(PromotionalMessagesPerSecond)
    if (SenderId != null) __obj.updateDynamic("SenderId")(SenderId)
    if (ShortCode != null) __obj.updateDynamic("ShortCode")(ShortCode)
    if (!js.isUndefined(TransactionalMessagesPerSecond)) __obj.updateDynamic("TransactionalMessagesPerSecond")(TransactionalMessagesPerSecond)
    if (!js.isUndefined(Version)) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[SMSChannelResponse]
  }
}

