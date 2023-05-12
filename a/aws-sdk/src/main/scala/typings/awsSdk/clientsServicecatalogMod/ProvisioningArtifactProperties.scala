package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisioningArtifactProperties extends StObject {
  
  /**
    * The description of the provisioning artifact, including how it differs from the previous provisioning artifact.
    */
  var Description: js.UndefOr[ProvisioningArtifactDescription] = js.undefined
  
  /**
    * If set to true, Service Catalog stops validating the specified provisioning artifact even if it is invalid.
    */
  var DisableTemplateValidation: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.DisableTemplateValidation] = js.undefined
  
  /**
    * Specify the template source with one of the following options, but not both. Keys accepted: [ LoadTemplateFromURL, ImportFromPhysicalId ] The URL of the CloudFormation template in Amazon S3 or GitHub in JSON format. Specify the URL in JSON format as follows:  "LoadTemplateFromURL": "https://s3.amazonaws.com/cf-templates-ozkq9d3hgiq2-us-east-1/..."   ImportFromPhysicalId: The physical id of the resource that contains the template. Currently only supports CloudFormation stack arn. Specify the physical id in JSON format as follows: ImportFromPhysicalId: “arn:aws:cloudformation:[us-east-1]:[accountId]:stack/[StackName]/[resourceId] 
    */
  var Info: js.UndefOr[ProvisioningArtifactInfo] = js.undefined
  
  /**
    * The name of the provisioning artifact (for example, v1 v2beta). No spaces are allowed.
    */
  var Name: js.UndefOr[ProvisioningArtifactName] = js.undefined
  
  /**
    * The type of provisioning artifact.    CLOUD_FORMATION_TEMPLATE - CloudFormation template    MARKETPLACE_AMI - Amazon Web Services Marketplace AMI    MARKETPLACE_CAR - Amazon Web Services Marketplace Clusters and Amazon Web Services Resources    TERRAFORM_OPEN_SOURCE - Terraform open source configuration file  
    */
  var Type: js.UndefOr[ProvisioningArtifactType] = js.undefined
}
object ProvisioningArtifactProperties {
  
  inline def apply(): ProvisioningArtifactProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisioningArtifactProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProvisioningArtifactProperties] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: ProvisioningArtifactDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDisableTemplateValidation(value: DisableTemplateValidation): Self = StObject.set(x, "DisableTemplateValidation", value.asInstanceOf[js.Any])
    
    inline def setDisableTemplateValidationUndefined: Self = StObject.set(x, "DisableTemplateValidation", js.undefined)
    
    inline def setInfo(value: ProvisioningArtifactInfo): Self = StObject.set(x, "Info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "Info", js.undefined)
    
    inline def setName(value: ProvisioningArtifactName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setType(value: ProvisioningArtifactType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
