package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Distribution extends StObject {
  
  /**
    * The specific AMI settings; for example, launch permissions or AMI tags.
    */
  var amiDistributionConfiguration: js.UndefOr[AmiDistributionConfiguration] = js.undefined
  
  /**
    * Container distribution settings for encryption, licensing, and sharing in a specific Region.
    */
  var containerDistributionConfiguration: js.UndefOr[ContainerDistributionConfiguration] = js.undefined
  
  /**
    * The Windows faster-launching configurations to use for AMI distribution.
    */
  var fastLaunchConfigurations: js.UndefOr[FastLaunchConfigurationList] = js.undefined
  
  /**
    * A group of launchTemplateConfiguration settings that apply to image distribution for specified accounts.
    */
  var launchTemplateConfigurations: js.UndefOr[LaunchTemplateConfigurationList] = js.undefined
  
  /**
    * The License Manager Configuration to associate with the AMI in the specified Region.
    */
  var licenseConfigurationArns: js.UndefOr[LicenseConfigurationArnList] = js.undefined
  
  /**
    * The target Region.
    */
  var region: NonEmptyString
  
  /**
    * Configure export settings to deliver disk images created from your image build, using a file format that is compatible with your VMs in that Region.
    */
  var s3ExportConfiguration: js.UndefOr[S3ExportConfiguration] = js.undefined
}
object Distribution {
  
  inline def apply(region: NonEmptyString): Distribution = {
    val __obj = js.Dynamic.literal(region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distribution]
  }
  
  extension [Self <: Distribution](x: Self) {
    
    inline def setAmiDistributionConfiguration(value: AmiDistributionConfiguration): Self = StObject.set(x, "amiDistributionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAmiDistributionConfigurationUndefined: Self = StObject.set(x, "amiDistributionConfiguration", js.undefined)
    
    inline def setContainerDistributionConfiguration(value: ContainerDistributionConfiguration): Self = StObject.set(x, "containerDistributionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setContainerDistributionConfigurationUndefined: Self = StObject.set(x, "containerDistributionConfiguration", js.undefined)
    
    inline def setFastLaunchConfigurations(value: FastLaunchConfigurationList): Self = StObject.set(x, "fastLaunchConfigurations", value.asInstanceOf[js.Any])
    
    inline def setFastLaunchConfigurationsUndefined: Self = StObject.set(x, "fastLaunchConfigurations", js.undefined)
    
    inline def setFastLaunchConfigurationsVarargs(value: FastLaunchConfiguration*): Self = StObject.set(x, "fastLaunchConfigurations", js.Array(value*))
    
    inline def setLaunchTemplateConfigurations(value: LaunchTemplateConfigurationList): Self = StObject.set(x, "launchTemplateConfigurations", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateConfigurationsUndefined: Self = StObject.set(x, "launchTemplateConfigurations", js.undefined)
    
    inline def setLaunchTemplateConfigurationsVarargs(value: LaunchTemplateConfiguration*): Self = StObject.set(x, "launchTemplateConfigurations", js.Array(value*))
    
    inline def setLicenseConfigurationArns(value: LicenseConfigurationArnList): Self = StObject.set(x, "licenseConfigurationArns", value.asInstanceOf[js.Any])
    
    inline def setLicenseConfigurationArnsUndefined: Self = StObject.set(x, "licenseConfigurationArns", js.undefined)
    
    inline def setLicenseConfigurationArnsVarargs(value: LicenseConfigurationArn*): Self = StObject.set(x, "licenseConfigurationArns", js.Array(value*))
    
    inline def setRegion(value: NonEmptyString): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setS3ExportConfiguration(value: S3ExportConfiguration): Self = StObject.set(x, "s3ExportConfiguration", value.asInstanceOf[js.Any])
    
    inline def setS3ExportConfigurationUndefined: Self = StObject.set(x, "s3ExportConfiguration", js.undefined)
  }
}
