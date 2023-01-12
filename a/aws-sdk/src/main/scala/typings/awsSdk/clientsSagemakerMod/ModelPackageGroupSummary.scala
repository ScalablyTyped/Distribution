package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelPackageGroupSummary extends StObject {
  
  /**
    * The time that the model group was created.
    */
  var CreationTime: js.Date
  
  /**
    * The Amazon Resource Name (ARN) of the model group.
    */
  var ModelPackageGroupArn: typings.awsSdk.clientsSagemakerMod.ModelPackageGroupArn
  
  /**
    * A description of the model group.
    */
  var ModelPackageGroupDescription: js.UndefOr[EntityDescription] = js.undefined
  
  /**
    * The name of the model group.
    */
  var ModelPackageGroupName: EntityName
  
  /**
    * The status of the model group.
    */
  var ModelPackageGroupStatus: typings.awsSdk.clientsSagemakerMod.ModelPackageGroupStatus
}
object ModelPackageGroupSummary {
  
  inline def apply(
    CreationTime: js.Date,
    ModelPackageGroupArn: ModelPackageGroupArn,
    ModelPackageGroupName: EntityName,
    ModelPackageGroupStatus: ModelPackageGroupStatus
  ): ModelPackageGroupSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], ModelPackageGroupArn = ModelPackageGroupArn.asInstanceOf[js.Any], ModelPackageGroupName = ModelPackageGroupName.asInstanceOf[js.Any], ModelPackageGroupStatus = ModelPackageGroupStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelPackageGroupSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModelPackageGroupSummary] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setModelPackageGroupArn(value: ModelPackageGroupArn): Self = StObject.set(x, "ModelPackageGroupArn", value.asInstanceOf[js.Any])
    
    inline def setModelPackageGroupDescription(value: EntityDescription): Self = StObject.set(x, "ModelPackageGroupDescription", value.asInstanceOf[js.Any])
    
    inline def setModelPackageGroupDescriptionUndefined: Self = StObject.set(x, "ModelPackageGroupDescription", js.undefined)
    
    inline def setModelPackageGroupName(value: EntityName): Self = StObject.set(x, "ModelPackageGroupName", value.asInstanceOf[js.Any])
    
    inline def setModelPackageGroupStatus(value: ModelPackageGroupStatus): Self = StObject.set(x, "ModelPackageGroupStatus", value.asInstanceOf[js.Any])
  }
}
