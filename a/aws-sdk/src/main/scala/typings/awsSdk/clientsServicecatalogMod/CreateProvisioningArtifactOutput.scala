package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProvisioningArtifactOutput extends StObject {
  
  /**
    * Specify the template source with one of the following options, but not both. Keys accepted: [ LoadTemplateFromURL, ImportFromPhysicalId ]. The URL of the CloudFormation template in Amazon S3, Amazon Web Services CodeCommit, or GitHub in JSON format.   LoadTemplateFromURL  Use the URL of the CloudFormation template in Amazon S3, Amazon Web Services CodeCommit, or GitHub in JSON format.  ImportFromPhysicalId  Use the physical id of the resource that contains the template; currently supports CloudFormation stack ARN.
    */
  var Info: js.UndefOr[ProvisioningArtifactInfo] = js.undefined
  
  /**
    * Information about the provisioning artifact.
    */
  var ProvisioningArtifactDetail: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.ProvisioningArtifactDetail] = js.undefined
  
  /**
    * The status of the current request.
    */
  var Status: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.Status] = js.undefined
}
object CreateProvisioningArtifactOutput {
  
  inline def apply(): CreateProvisioningArtifactOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateProvisioningArtifactOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateProvisioningArtifactOutput] (val x: Self) extends AnyVal {
    
    inline def setInfo(value: ProvisioningArtifactInfo): Self = StObject.set(x, "Info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "Info", js.undefined)
    
    inline def setProvisioningArtifactDetail(value: ProvisioningArtifactDetail): Self = StObject.set(x, "ProvisioningArtifactDetail", value.asInstanceOf[js.Any])
    
    inline def setProvisioningArtifactDetailUndefined: Self = StObject.set(x, "ProvisioningArtifactDetail", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
