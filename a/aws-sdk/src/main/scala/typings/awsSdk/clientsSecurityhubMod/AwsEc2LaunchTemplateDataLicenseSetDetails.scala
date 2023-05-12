package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2LaunchTemplateDataLicenseSetDetails extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the license configuration. 
    */
  var LicenseConfigurationArn: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2LaunchTemplateDataLicenseSetDetails {
  
  inline def apply(): AwsEc2LaunchTemplateDataLicenseSetDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2LaunchTemplateDataLicenseSetDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEc2LaunchTemplateDataLicenseSetDetails] (val x: Self) extends AnyVal {
    
    inline def setLicenseConfigurationArn(value: NonEmptyString): Self = StObject.set(x, "LicenseConfigurationArn", value.asInstanceOf[js.Any])
    
    inline def setLicenseConfigurationArnUndefined: Self = StObject.set(x, "LicenseConfigurationArn", js.undefined)
  }
}
