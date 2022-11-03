package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePortalRequest extends StObject {
  
  /**
    * Contains the configuration information of an alarm created in an IoT SiteWise Monitor portal. You can use the alarm to monitor an asset property and get notified when the asset property value is outside a specified range. For more information, see Monitoring with alarms in the IoT SiteWise Application Guide.
    */
  var alarms: js.UndefOr[Alarms] = js.undefined
  
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The email address that sends alarm notifications.  If you use the IoT Events managed Lambda function to manage your emails, you must verify the sender email address in Amazon SES. 
    */
  var notificationSenderEmail: js.UndefOr[Email] = js.undefined
  
  /**
    * The service to use to authenticate users to the portal. Choose from the following options:    SSO – The portal uses IAM Identity Center (successor to Single Sign-On) to authenticate users and manage user permissions. Before you can create a portal that uses IAM Identity Center, you must enable IAM Identity Center. For more information, see Enabling IAM Identity Center in the IoT SiteWise User Guide. This option is only available in Amazon Web Services Regions other than the China Regions.    IAM – The portal uses Identity and Access Management to authenticate users and manage user permissions.   You can't change this value after you create a portal. Default: SSO 
    */
  var portalAuthMode: js.UndefOr[AuthMode] = js.undefined
  
  /**
    * The Amazon Web Services administrator's contact email address.
    */
  var portalContactEmail: Email
  
  /**
    * A description for the portal.
    */
  var portalDescription: js.UndefOr[Description] = js.undefined
  
  /**
    * A logo image to display in the portal. Upload a square, high-resolution image. The image is displayed on a dark background.
    */
  var portalLogoImageFile: js.UndefOr[ImageFile] = js.undefined
  
  /**
    * A friendly name for the portal.
    */
  var portalName: Name
  
  /**
    * The ARN of a service role that allows the portal's users to access your IoT SiteWise resources on your behalf. For more information, see Using service roles for IoT SiteWise Monitor in the IoT SiteWise User Guide.
    */
  var roleArn: ARN
  
  /**
    * A list of key-value pairs that contain metadata for the portal. For more information, see Tagging your IoT SiteWise resources in the IoT SiteWise User Guide.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreatePortalRequest {
  
  inline def apply(portalContactEmail: Email, portalName: Name, roleArn: ARN): CreatePortalRequest = {
    val __obj = js.Dynamic.literal(portalContactEmail = portalContactEmail.asInstanceOf[js.Any], portalName = portalName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePortalRequest]
  }
  
  extension [Self <: CreatePortalRequest](x: Self) {
    
    inline def setAlarms(value: Alarms): Self = StObject.set(x, "alarms", value.asInstanceOf[js.Any])
    
    inline def setAlarmsUndefined: Self = StObject.set(x, "alarms", js.undefined)
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setNotificationSenderEmail(value: Email): Self = StObject.set(x, "notificationSenderEmail", value.asInstanceOf[js.Any])
    
    inline def setNotificationSenderEmailUndefined: Self = StObject.set(x, "notificationSenderEmail", js.undefined)
    
    inline def setPortalAuthMode(value: AuthMode): Self = StObject.set(x, "portalAuthMode", value.asInstanceOf[js.Any])
    
    inline def setPortalAuthModeUndefined: Self = StObject.set(x, "portalAuthMode", js.undefined)
    
    inline def setPortalContactEmail(value: Email): Self = StObject.set(x, "portalContactEmail", value.asInstanceOf[js.Any])
    
    inline def setPortalDescription(value: Description): Self = StObject.set(x, "portalDescription", value.asInstanceOf[js.Any])
    
    inline def setPortalDescriptionUndefined: Self = StObject.set(x, "portalDescription", js.undefined)
    
    inline def setPortalLogoImageFile(value: ImageFile): Self = StObject.set(x, "portalLogoImageFile", value.asInstanceOf[js.Any])
    
    inline def setPortalLogoImageFileUndefined: Self = StObject.set(x, "portalLogoImageFile", js.undefined)
    
    inline def setPortalName(value: Name): Self = StObject.set(x, "portalName", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: ARN): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
