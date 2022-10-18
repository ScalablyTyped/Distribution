package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceSettingsResponse extends StObject {
  
  /**
    * Indicates whether cross-account discovery is enabled.
    */
  var EnableCrossAccountsDiscovery: js.UndefOr[BoxBoolean] = js.undefined
  
  /**
    * Amazon Resource Name (ARN) of the resource share. The License Manager management account provides member accounts with access to this share.
    */
  var LicenseManagerResourceShareArn: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether Organizations is integrated with License Manager for cross-account discovery.
    */
  var OrganizationConfiguration: js.UndefOr[typings.awsSdk.clientsLicensemanagerMod.OrganizationConfiguration] = js.undefined
  
  /**
    * Regional S3 bucket path for storing reports, license trail event data, discovery data, and so on.
    */
  var S3BucketArn: js.UndefOr[String] = js.undefined
  
  /**
    * SNS topic configured to receive notifications from License Manager.
    */
  var SnsTopicArn: js.UndefOr[String] = js.undefined
}
object GetServiceSettingsResponse {
  
  inline def apply(): GetServiceSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServiceSettingsResponse]
  }
  
  extension [Self <: GetServiceSettingsResponse](x: Self) {
    
    inline def setEnableCrossAccountsDiscovery(value: BoxBoolean): Self = StObject.set(x, "EnableCrossAccountsDiscovery", value.asInstanceOf[js.Any])
    
    inline def setEnableCrossAccountsDiscoveryUndefined: Self = StObject.set(x, "EnableCrossAccountsDiscovery", js.undefined)
    
    inline def setLicenseManagerResourceShareArn(value: String): Self = StObject.set(x, "LicenseManagerResourceShareArn", value.asInstanceOf[js.Any])
    
    inline def setLicenseManagerResourceShareArnUndefined: Self = StObject.set(x, "LicenseManagerResourceShareArn", js.undefined)
    
    inline def setOrganizationConfiguration(value: OrganizationConfiguration): Self = StObject.set(x, "OrganizationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setOrganizationConfigurationUndefined: Self = StObject.set(x, "OrganizationConfiguration", js.undefined)
    
    inline def setS3BucketArn(value: String): Self = StObject.set(x, "S3BucketArn", value.asInstanceOf[js.Any])
    
    inline def setS3BucketArnUndefined: Self = StObject.set(x, "S3BucketArn", js.undefined)
    
    inline def setSnsTopicArn(value: String): Self = StObject.set(x, "SnsTopicArn", value.asInstanceOf[js.Any])
    
    inline def setSnsTopicArnUndefined: Self = StObject.set(x, "SnsTopicArn", js.undefined)
  }
}
