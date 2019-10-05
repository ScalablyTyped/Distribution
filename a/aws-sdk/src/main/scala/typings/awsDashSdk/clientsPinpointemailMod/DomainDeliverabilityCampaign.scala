package typings.awsDashSdk.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainDeliverabilityCampaign extends js.Object {
  /**
    * The unique identifier for the campaign. Amazon Pinpoint automatically generates and assigns this identifier to a campaign. This value is not the same as the campaign identifier that Amazon Pinpoint assigns to campaigns that you create and manage by using the Amazon Pinpoint API or the Amazon Pinpoint console.
    */
  var CampaignId: js.UndefOr[typings.awsDashSdk.clientsPinpointemailMod.CampaignId] = js.undefined
  /**
    * The percentage of email messages that were deleted by recipients, without being opened first. Due to technical limitations, this value only includes recipients who opened the message by using an email client that supports images.
    */
  var DeleteRate: js.UndefOr[Percentage] = js.undefined
  /**
    * The major email providers who handled the email message.
    */
  var Esps: js.UndefOr[typings.awsDashSdk.clientsPinpointemailMod.Esps] = js.undefined
  /**
    * The first time, in Unix time format, when the email message was delivered to any recipient's inbox. This value can help you determine how long it took for a campaign to deliver an email message.
    */
  var FirstSeenDateTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The verified email address that the email message was sent from.
    */
  var FromAddress: js.UndefOr[Identity] = js.undefined
  /**
    * The URL of an image that contains a snapshot of the email message that was sent.
    */
  var ImageUrl: js.UndefOr[typings.awsDashSdk.clientsPinpointemailMod.ImageUrl] = js.undefined
  /**
    * The number of email messages that were delivered to recipients’ inboxes.
    */
  var InboxCount: js.UndefOr[Volume] = js.undefined
  /**
    * The last time, in Unix time format, when the email message was delivered to any recipient's inbox. This value can help you determine how long it took for a campaign to deliver an email message.
    */
  var LastSeenDateTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The projected number of recipients that the email message was sent to.
    */
  var ProjectedVolume: js.UndefOr[Volume] = js.undefined
  /**
    * The percentage of email messages that were opened and then deleted by recipients. Due to technical limitations, this value only includes recipients who opened the message by using an email client that supports images.
    */
  var ReadDeleteRate: js.UndefOr[Percentage] = js.undefined
  /**
    * The percentage of email messages that were opened by recipients. Due to technical limitations, this value only includes recipients who opened the message by using an email client that supports images.
    */
  var ReadRate: js.UndefOr[Percentage] = js.undefined
  /**
    * The IP addresses that were used to send the email message.
    */
  var SendingIps: js.UndefOr[IpList] = js.undefined
  /**
    * The number of email messages that were delivered to recipients' spam or junk mail folders.
    */
  var SpamCount: js.UndefOr[Volume] = js.undefined
  /**
    * The subject line, or title, of the email message.
    */
  var Subject: js.UndefOr[typings.awsDashSdk.clientsPinpointemailMod.Subject] = js.undefined
}

object DomainDeliverabilityCampaign {
  @scala.inline
  def apply(
    CampaignId: CampaignId = null,
    DeleteRate: Int | Double = null,
    Esps: Esps = null,
    FirstSeenDateTime: Timestamp = null,
    FromAddress: Identity = null,
    ImageUrl: ImageUrl = null,
    InboxCount: Int | Double = null,
    LastSeenDateTime: Timestamp = null,
    ProjectedVolume: Int | Double = null,
    ReadDeleteRate: Int | Double = null,
    ReadRate: Int | Double = null,
    SendingIps: IpList = null,
    SpamCount: Int | Double = null,
    Subject: Subject = null
  ): DomainDeliverabilityCampaign = {
    val __obj = js.Dynamic.literal()
    if (CampaignId != null) __obj.updateDynamic("CampaignId")(CampaignId)
    if (DeleteRate != null) __obj.updateDynamic("DeleteRate")(DeleteRate.asInstanceOf[js.Any])
    if (Esps != null) __obj.updateDynamic("Esps")(Esps)
    if (FirstSeenDateTime != null) __obj.updateDynamic("FirstSeenDateTime")(FirstSeenDateTime)
    if (FromAddress != null) __obj.updateDynamic("FromAddress")(FromAddress)
    if (ImageUrl != null) __obj.updateDynamic("ImageUrl")(ImageUrl)
    if (InboxCount != null) __obj.updateDynamic("InboxCount")(InboxCount.asInstanceOf[js.Any])
    if (LastSeenDateTime != null) __obj.updateDynamic("LastSeenDateTime")(LastSeenDateTime)
    if (ProjectedVolume != null) __obj.updateDynamic("ProjectedVolume")(ProjectedVolume.asInstanceOf[js.Any])
    if (ReadDeleteRate != null) __obj.updateDynamic("ReadDeleteRate")(ReadDeleteRate.asInstanceOf[js.Any])
    if (ReadRate != null) __obj.updateDynamic("ReadRate")(ReadRate.asInstanceOf[js.Any])
    if (SendingIps != null) __obj.updateDynamic("SendingIps")(SendingIps)
    if (SpamCount != null) __obj.updateDynamic("SpamCount")(SpamCount.asInstanceOf[js.Any])
    if (Subject != null) __obj.updateDynamic("Subject")(Subject)
    __obj.asInstanceOf[DomainDeliverabilityCampaign]
  }
}

