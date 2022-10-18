package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelPackageGroup extends StObject {
  
  var CreatedBy: js.UndefOr[UserContext] = js.undefined
  
  /**
    * The time that the model group was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the model group.
    */
  var ModelPackageGroupArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ModelPackageGroupArn] = js.undefined
  
  /**
    * The description for the model group.
    */
  var ModelPackageGroupDescription: js.UndefOr[EntityDescription] = js.undefined
  
  /**
    * The name of the model group.
    */
  var ModelPackageGroupName: js.UndefOr[EntityName] = js.undefined
  
  /**
    * The status of the model group. This can be one of the following values.    PENDING - The model group is pending being created.    IN_PROGRESS - The model group is in the process of being created.    COMPLETED - The model group was successfully created.    FAILED - The model group failed.    DELETING - The model group is in the process of being deleted.    DELETE_FAILED - SageMaker failed to delete the model group.  
    */
  var ModelPackageGroupStatus: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ModelPackageGroupStatus] = js.undefined
  
  /**
    * A list of the tags associated with the model group. For more information, see Tagging Amazon Web Services resources in the Amazon Web Services General Reference Guide.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object ModelPackageGroup {
  
  inline def apply(): ModelPackageGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelPackageGroup]
  }
  
  extension [Self <: ModelPackageGroup](x: Self) {
    
    inline def setCreatedBy(value: UserContext): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setModelPackageGroupArn(value: ModelPackageGroupArn): Self = StObject.set(x, "ModelPackageGroupArn", value.asInstanceOf[js.Any])
    
    inline def setModelPackageGroupArnUndefined: Self = StObject.set(x, "ModelPackageGroupArn", js.undefined)
    
    inline def setModelPackageGroupDescription(value: EntityDescription): Self = StObject.set(x, "ModelPackageGroupDescription", value.asInstanceOf[js.Any])
    
    inline def setModelPackageGroupDescriptionUndefined: Self = StObject.set(x, "ModelPackageGroupDescription", js.undefined)
    
    inline def setModelPackageGroupName(value: EntityName): Self = StObject.set(x, "ModelPackageGroupName", value.asInstanceOf[js.Any])
    
    inline def setModelPackageGroupNameUndefined: Self = StObject.set(x, "ModelPackageGroupName", js.undefined)
    
    inline def setModelPackageGroupStatus(value: ModelPackageGroupStatus): Self = StObject.set(x, "ModelPackageGroupStatus", value.asInstanceOf[js.Any])
    
    inline def setModelPackageGroupStatusUndefined: Self = StObject.set(x, "ModelPackageGroupStatus", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
