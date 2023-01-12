package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Project extends StObject {
  
  /**
    * Who created the project.
    */
  var CreatedBy: js.UndefOr[UserContext] = js.undefined
  
  /**
    * A timestamp specifying when the project was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  var LastModifiedBy: js.UndefOr[UserContext] = js.undefined
  
  /**
    * A timestamp container for when the project was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the project.
    */
  var ProjectArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ProjectArn] = js.undefined
  
  /**
    * The description of the project.
    */
  var ProjectDescription: js.UndefOr[EntityDescription] = js.undefined
  
  /**
    * The ID of the project.
    */
  var ProjectId: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ProjectId] = js.undefined
  
  /**
    * The name of the project.
    */
  var ProjectName: js.UndefOr[ProjectEntityName] = js.undefined
  
  /**
    * The status of the project.
    */
  var ProjectStatus: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ProjectStatus] = js.undefined
  
  var ServiceCatalogProvisionedProductDetails: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ServiceCatalogProvisionedProductDetails] = js.undefined
  
  var ServiceCatalogProvisioningDetails: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ServiceCatalogProvisioningDetails] = js.undefined
  
  /**
    * An array of key-value pairs. You can use tags to categorize your Amazon Web Services resources in different ways, for example, by purpose, owner, or environment. For more information, see Tagging Amazon Web Services Resources.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object Project {
  
  inline def apply(): Project = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Project]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Project] (val x: Self) extends AnyVal {
    
    inline def setCreatedBy(value: UserContext): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setLastModifiedBy(value: UserContext): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "LastModifiedBy", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setProjectArn(value: ProjectArn): Self = StObject.set(x, "ProjectArn", value.asInstanceOf[js.Any])
    
    inline def setProjectArnUndefined: Self = StObject.set(x, "ProjectArn", js.undefined)
    
    inline def setProjectDescription(value: EntityDescription): Self = StObject.set(x, "ProjectDescription", value.asInstanceOf[js.Any])
    
    inline def setProjectDescriptionUndefined: Self = StObject.set(x, "ProjectDescription", js.undefined)
    
    inline def setProjectId(value: ProjectId): Self = StObject.set(x, "ProjectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "ProjectId", js.undefined)
    
    inline def setProjectName(value: ProjectEntityName): Self = StObject.set(x, "ProjectName", value.asInstanceOf[js.Any])
    
    inline def setProjectNameUndefined: Self = StObject.set(x, "ProjectName", js.undefined)
    
    inline def setProjectStatus(value: ProjectStatus): Self = StObject.set(x, "ProjectStatus", value.asInstanceOf[js.Any])
    
    inline def setProjectStatusUndefined: Self = StObject.set(x, "ProjectStatus", js.undefined)
    
    inline def setServiceCatalogProvisionedProductDetails(value: ServiceCatalogProvisionedProductDetails): Self = StObject.set(x, "ServiceCatalogProvisionedProductDetails", value.asInstanceOf[js.Any])
    
    inline def setServiceCatalogProvisionedProductDetailsUndefined: Self = StObject.set(x, "ServiceCatalogProvisionedProductDetails", js.undefined)
    
    inline def setServiceCatalogProvisioningDetails(value: ServiceCatalogProvisioningDetails): Self = StObject.set(x, "ServiceCatalogProvisioningDetails", value.asInstanceOf[js.Any])
    
    inline def setServiceCatalogProvisioningDetailsUndefined: Self = StObject.set(x, "ServiceCatalogProvisioningDetails", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
