package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainDeliverabilityCampaign extends StObject {
  
  /**
    * The unique identifier for the campaign. The Deliverability dashboard automatically generates and assigns this identifier to a campaign.
    */
  var CampaignId: js.UndefOr[typings.awsSdk.clientsSesv2Mod.CampaignId] = js.undefined
  
  /**
    * The percentage of email messages that were deleted by recipients, without being opened first. Due to technical limitations, this value only includes recipients who opened the message by using an email client that supports images.
    */
  var DeleteRate: js.UndefOr[Percentage] = js.undefined
  
  /**
    * The major email providers who handled the email message.
    */
  var Esps: js.UndefOr[typings.awsSdk.clientsSesv2Mod.Esps] = js.undefined
  
  /**
    * The first time when the email message was delivered to any recipient's inbox. This value can help you determine how long it took for a campaign to deliver an email message.
    */
  var FirstSeenDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The verified email address that the email message was sent from.
    */
  var FromAddress: js.UndefOr[Identity] = js.undefined
  
  /**
    * The URL of an image that contains a snapshot of the email message that was sent.
    */
  var ImageUrl: js.UndefOr[typings.awsSdk.clientsSesv2Mod.ImageUrl] = js.undefined
  
  /**
    * The number of email messages that were delivered to recipients’ inboxes.
    */
  var InboxCount: js.UndefOr[Volume] = js.undefined
  
  /**
    * The last time when the email message was delivered to any recipient's inbox. This value can help you determine how long it took for a campaign to deliver an email message.
    */
  var LastSeenDateTime: js.UndefOr[js.Date] = js.undefined
  
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
  var Subject: js.UndefOr[typings.awsSdk.clientsSesv2Mod.Subject] = js.undefined
}
object DomainDeliverabilityCampaign {
  
  inline def apply(): DomainDeliverabilityCampaign = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainDeliverabilityCampaign]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DomainDeliverabilityCampaign] (val x: Self) extends AnyVal {
    
    inline def setCampaignId(value: CampaignId): Self = StObject.set(x, "CampaignId", value.asInstanceOf[js.Any])
    
    inline def setCampaignIdUndefined: Self = StObject.set(x, "CampaignId", js.undefined)
    
    inline def setDeleteRate(value: Percentage): Self = StObject.set(x, "DeleteRate", value.asInstanceOf[js.Any])
    
    inline def setDeleteRateUndefined: Self = StObject.set(x, "DeleteRate", js.undefined)
    
    inline def setEsps(value: Esps): Self = StObject.set(x, "Esps", value.asInstanceOf[js.Any])
    
    inline def setEspsUndefined: Self = StObject.set(x, "Esps", js.undefined)
    
    inline def setEspsVarargs(value: Esp*): Self = StObject.set(x, "Esps", js.Array(value*))
    
    inline def setFirstSeenDateTime(value: js.Date): Self = StObject.set(x, "FirstSeenDateTime", value.asInstanceOf[js.Any])
    
    inline def setFirstSeenDateTimeUndefined: Self = StObject.set(x, "FirstSeenDateTime", js.undefined)
    
    inline def setFromAddress(value: Identity): Self = StObject.set(x, "FromAddress", value.asInstanceOf[js.Any])
    
    inline def setFromAddressUndefined: Self = StObject.set(x, "FromAddress", js.undefined)
    
    inline def setImageUrl(value: ImageUrl): Self = StObject.set(x, "ImageUrl", value.asInstanceOf[js.Any])
    
    inline def setImageUrlUndefined: Self = StObject.set(x, "ImageUrl", js.undefined)
    
    inline def setInboxCount(value: Volume): Self = StObject.set(x, "InboxCount", value.asInstanceOf[js.Any])
    
    inline def setInboxCountUndefined: Self = StObject.set(x, "InboxCount", js.undefined)
    
    inline def setLastSeenDateTime(value: js.Date): Self = StObject.set(x, "LastSeenDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastSeenDateTimeUndefined: Self = StObject.set(x, "LastSeenDateTime", js.undefined)
    
    inline def setProjectedVolume(value: Volume): Self = StObject.set(x, "ProjectedVolume", value.asInstanceOf[js.Any])
    
    inline def setProjectedVolumeUndefined: Self = StObject.set(x, "ProjectedVolume", js.undefined)
    
    inline def setReadDeleteRate(value: Percentage): Self = StObject.set(x, "ReadDeleteRate", value.asInstanceOf[js.Any])
    
    inline def setReadDeleteRateUndefined: Self = StObject.set(x, "ReadDeleteRate", js.undefined)
    
    inline def setReadRate(value: Percentage): Self = StObject.set(x, "ReadRate", value.asInstanceOf[js.Any])
    
    inline def setReadRateUndefined: Self = StObject.set(x, "ReadRate", js.undefined)
    
    inline def setSendingIps(value: IpList): Self = StObject.set(x, "SendingIps", value.asInstanceOf[js.Any])
    
    inline def setSendingIpsUndefined: Self = StObject.set(x, "SendingIps", js.undefined)
    
    inline def setSendingIpsVarargs(value: Ip*): Self = StObject.set(x, "SendingIps", js.Array(value*))
    
    inline def setSpamCount(value: Volume): Self = StObject.set(x, "SpamCount", value.asInstanceOf[js.Any])
    
    inline def setSpamCountUndefined: Self = StObject.set(x, "SpamCount", js.undefined)
    
    inline def setSubject(value: Subject): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "Subject", js.undefined)
  }
}
