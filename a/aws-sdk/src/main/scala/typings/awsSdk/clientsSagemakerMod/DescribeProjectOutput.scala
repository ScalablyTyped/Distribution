package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProjectOutput extends StObject {
  
  var CreatedBy: js.UndefOr[UserContext] = js.undefined
  
  /**
    * The time when the project was created.
    */
  var CreationTime: js.Date
  
  var LastModifiedBy: js.UndefOr[UserContext] = js.undefined
  
  /**
    * The timestamp when project was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the project.
    */
  var ProjectArn: typings.awsSdk.clientsSagemakerMod.ProjectArn
  
  /**
    * The description of the project.
    */
  var ProjectDescription: js.UndefOr[EntityDescription] = js.undefined
  
  /**
    * The ID of the project.
    */
  var ProjectId: typings.awsSdk.clientsSagemakerMod.ProjectId
  
  /**
    * The name of the project.
    */
  var ProjectName: ProjectEntityName
  
  /**
    * The status of the project.
    */
  var ProjectStatus: typings.awsSdk.clientsSagemakerMod.ProjectStatus
  
  /**
    * Information about a provisioned service catalog product.
    */
  var ServiceCatalogProvisionedProductDetails: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ServiceCatalogProvisionedProductDetails] = js.undefined
  
  /**
    * Information used to provision a service catalog product. For information, see What is Amazon Web Services Service Catalog.
    */
  var ServiceCatalogProvisioningDetails: typings.awsSdk.clientsSagemakerMod.ServiceCatalogProvisioningDetails
}
object DescribeProjectOutput {
  
  inline def apply(
    CreationTime: js.Date,
    ProjectArn: ProjectArn,
    ProjectId: ProjectId,
    ProjectName: ProjectEntityName,
    ProjectStatus: ProjectStatus,
    ServiceCatalogProvisioningDetails: ServiceCatalogProvisioningDetails
  ): DescribeProjectOutput = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], ProjectArn = ProjectArn.asInstanceOf[js.Any], ProjectId = ProjectId.asInstanceOf[js.Any], ProjectName = ProjectName.asInstanceOf[js.Any], ProjectStatus = ProjectStatus.asInstanceOf[js.Any], ServiceCatalogProvisioningDetails = ServiceCatalogProvisioningDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProjectOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeProjectOutput] (val x: Self) extends AnyVal {
    
    inline def setCreatedBy(value: UserContext): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedBy(value: UserContext): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "LastModifiedBy", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setProjectArn(value: ProjectArn): Self = StObject.set(x, "ProjectArn", value.asInstanceOf[js.Any])
    
    inline def setProjectDescription(value: EntityDescription): Self = StObject.set(x, "ProjectDescription", value.asInstanceOf[js.Any])
    
    inline def setProjectDescriptionUndefined: Self = StObject.set(x, "ProjectDescription", js.undefined)
    
    inline def setProjectId(value: ProjectId): Self = StObject.set(x, "ProjectId", value.asInstanceOf[js.Any])
    
    inline def setProjectName(value: ProjectEntityName): Self = StObject.set(x, "ProjectName", value.asInstanceOf[js.Any])
    
    inline def setProjectStatus(value: ProjectStatus): Self = StObject.set(x, "ProjectStatus", value.asInstanceOf[js.Any])
    
    inline def setServiceCatalogProvisionedProductDetails(value: ServiceCatalogProvisionedProductDetails): Self = StObject.set(x, "ServiceCatalogProvisionedProductDetails", value.asInstanceOf[js.Any])
    
    inline def setServiceCatalogProvisionedProductDetailsUndefined: Self = StObject.set(x, "ServiceCatalogProvisionedProductDetails", js.undefined)
    
    inline def setServiceCatalogProvisioningDetails(value: ServiceCatalogProvisioningDetails): Self = StObject.set(x, "ServiceCatalogProvisioningDetails", value.asInstanceOf[js.Any])
  }
}
