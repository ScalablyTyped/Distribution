package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePortalResponse extends StObject {
  
  /**
    * Contains the configuration information of an alarm created in an IoT SiteWise Monitor portal.
    */
  var alarms: js.UndefOr[Alarms] = js.undefined
  
  /**
    * The email address that sends alarm notifications.
    */
  var notificationSenderEmail: js.UndefOr[Email] = js.undefined
  
  /**
    * The ARN of the portal, which has the following format.  arn:${Partition}:iotsitewise:${Region}:${Account}:portal/${PortalId} 
    */
  var portalArn: ARN
  
  /**
    * The service to use to authenticate users to the portal.
    */
  var portalAuthMode: js.UndefOr[AuthMode] = js.undefined
  
  /**
    * The Amazon Web Services SSO application generated client ID (used with Amazon Web Services SSO APIs). IoT SiteWise includes portalClientId for only portals that use Amazon Web Services SSO to authenticate users.
    */
  var portalClientId: PortalClientId
  
  /**
    * The Amazon Web Services administrator's contact email address.
    */
  var portalContactEmail: Email
  
  /**
    * The date the portal was created, in Unix epoch time.
    */
  var portalCreationDate: js.Date
  
  /**
    * The portal's description.
    */
  var portalDescription: js.UndefOr[Description] = js.undefined
  
  /**
    * The ID of the portal.
    */
  var portalId: ID
  
  /**
    * The date the portal was last updated, in Unix epoch time.
    */
  var portalLastUpdateDate: js.Date
  
  /**
    * The portal's logo image, which is available at a URL.
    */
  var portalLogoImageLocation: js.UndefOr[ImageLocation] = js.undefined
  
  /**
    * The name of the portal.
    */
  var portalName: Name
  
  /**
    * The URL for the IoT SiteWise Monitor portal. You can use this URL to access portals that use Amazon Web Services SSO for authentication. For portals that use IAM for authentication, you must use the IoT SiteWise console to get a URL that you can use to access the portal.
    */
  var portalStartUrl: Url
  
  /**
    * The current status of the portal, which contains a state and any error message.
    */
  var portalStatus: PortalStatus
  
  /**
    * The ARN of the service role that allows the portal's users to access your IoT SiteWise resources on your behalf. For more information, see Using service roles for IoT SiteWise Monitor in the IoT SiteWise User Guide.
    */
  var roleArn: js.UndefOr[ARN] = js.undefined
}
object DescribePortalResponse {
  
  inline def apply(
    portalArn: ARN,
    portalClientId: PortalClientId,
    portalContactEmail: Email,
    portalCreationDate: js.Date,
    portalId: ID,
    portalLastUpdateDate: js.Date,
    portalName: Name,
    portalStartUrl: Url,
    portalStatus: PortalStatus
  ): DescribePortalResponse = {
    val __obj = js.Dynamic.literal(portalArn = portalArn.asInstanceOf[js.Any], portalClientId = portalClientId.asInstanceOf[js.Any], portalContactEmail = portalContactEmail.asInstanceOf[js.Any], portalCreationDate = portalCreationDate.asInstanceOf[js.Any], portalId = portalId.asInstanceOf[js.Any], portalLastUpdateDate = portalLastUpdateDate.asInstanceOf[js.Any], portalName = portalName.asInstanceOf[js.Any], portalStartUrl = portalStartUrl.asInstanceOf[js.Any], portalStatus = portalStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePortalResponse]
  }
  
  extension [Self <: DescribePortalResponse](x: Self) {
    
    inline def setAlarms(value: Alarms): Self = StObject.set(x, "alarms", value.asInstanceOf[js.Any])
    
    inline def setAlarmsUndefined: Self = StObject.set(x, "alarms", js.undefined)
    
    inline def setNotificationSenderEmail(value: Email): Self = StObject.set(x, "notificationSenderEmail", value.asInstanceOf[js.Any])
    
    inline def setNotificationSenderEmailUndefined: Self = StObject.set(x, "notificationSenderEmail", js.undefined)
    
    inline def setPortalArn(value: ARN): Self = StObject.set(x, "portalArn", value.asInstanceOf[js.Any])
    
    inline def setPortalAuthMode(value: AuthMode): Self = StObject.set(x, "portalAuthMode", value.asInstanceOf[js.Any])
    
    inline def setPortalAuthModeUndefined: Self = StObject.set(x, "portalAuthMode", js.undefined)
    
    inline def setPortalClientId(value: PortalClientId): Self = StObject.set(x, "portalClientId", value.asInstanceOf[js.Any])
    
    inline def setPortalContactEmail(value: Email): Self = StObject.set(x, "portalContactEmail", value.asInstanceOf[js.Any])
    
    inline def setPortalCreationDate(value: js.Date): Self = StObject.set(x, "portalCreationDate", value.asInstanceOf[js.Any])
    
    inline def setPortalDescription(value: Description): Self = StObject.set(x, "portalDescription", value.asInstanceOf[js.Any])
    
    inline def setPortalDescriptionUndefined: Self = StObject.set(x, "portalDescription", js.undefined)
    
    inline def setPortalId(value: ID): Self = StObject.set(x, "portalId", value.asInstanceOf[js.Any])
    
    inline def setPortalLastUpdateDate(value: js.Date): Self = StObject.set(x, "portalLastUpdateDate", value.asInstanceOf[js.Any])
    
    inline def setPortalLogoImageLocation(value: ImageLocation): Self = StObject.set(x, "portalLogoImageLocation", value.asInstanceOf[js.Any])
    
    inline def setPortalLogoImageLocationUndefined: Self = StObject.set(x, "portalLogoImageLocation", js.undefined)
    
    inline def setPortalName(value: Name): Self = StObject.set(x, "portalName", value.asInstanceOf[js.Any])
    
    inline def setPortalStartUrl(value: Url): Self = StObject.set(x, "portalStartUrl", value.asInstanceOf[js.Any])
    
    inline def setPortalStatus(value: PortalStatus): Self = StObject.set(x, "portalStatus", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: ARN): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
  }
}
