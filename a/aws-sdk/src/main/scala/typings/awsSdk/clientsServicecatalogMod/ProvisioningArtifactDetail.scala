package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisioningArtifactDetail extends StObject {
  
  /**
    * Indicates whether the product version is active.
    */
  var Active: js.UndefOr[ProvisioningArtifactActive] = js.undefined
  
  /**
    * The UTC time stamp of the creation time.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the provisioning artifact.
    */
  var Description: js.UndefOr[ProvisioningArtifactName] = js.undefined
  
  /**
    * Information set by the administrator to provide guidance to end users about which provisioning artifacts to use.
    */
  var Guidance: js.UndefOr[ProvisioningArtifactGuidance] = js.undefined
  
  /**
    * The identifier of the provisioning artifact.
    */
  var Id: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.Id] = js.undefined
  
  /**
    * The name of the provisioning artifact.
    */
  var Name: js.UndefOr[ProvisioningArtifactName] = js.undefined
  
  /**
    * Specifies the revision of the external artifact that was used to automatically sync the Service Catalog product and create the provisioning artifact. Service Catalog includes this response parameter as a high level field to the existing ProvisioningArtifactDetail type, which is returned as part of the response for CreateProduct, UpdateProduct, DescribeProductAsAdmin, DescribeProvisioningArtifact, ListProvisioningArtifact, and UpdateProvisioningArticat APIs.  This field only exists for Repo-Synced products. 
    */
  var SourceRevision: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.SourceRevision] = js.undefined
  
  /**
    * The type of provisioning artifact.    CLOUD_FORMATION_TEMPLATE - CloudFormation template    MARKETPLACE_AMI - Amazon Web Services Marketplace AMI    MARKETPLACE_CAR - Amazon Web Services Marketplace Clusters and Amazon Web Services Resources  
    */
  var Type: js.UndefOr[ProvisioningArtifactType] = js.undefined
}
object ProvisioningArtifactDetail {
  
  inline def apply(): ProvisioningArtifactDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisioningArtifactDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProvisioningArtifactDetail] (val x: Self) extends AnyVal {
    
    inline def setActive(value: ProvisioningArtifactActive): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "Active", js.undefined)
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setDescription(value: ProvisioningArtifactName): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setGuidance(value: ProvisioningArtifactGuidance): Self = StObject.set(x, "Guidance", value.asInstanceOf[js.Any])
    
    inline def setGuidanceUndefined: Self = StObject.set(x, "Guidance", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: ProvisioningArtifactName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSourceRevision(value: SourceRevision): Self = StObject.set(x, "SourceRevision", value.asInstanceOf[js.Any])
    
    inline def setSourceRevisionUndefined: Self = StObject.set(x, "SourceRevision", js.undefined)
    
    inline def setType(value: ProvisioningArtifactType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
