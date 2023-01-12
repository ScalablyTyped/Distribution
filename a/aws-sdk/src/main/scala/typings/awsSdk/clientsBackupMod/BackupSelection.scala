package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackupSelection extends StObject {
  
  /**
    * A list of conditions that you define to assign resources to your backup plans using tags. For example, "StringEquals": { "ConditionKey": "aws:ResourceTag/CreatedByCryo", "ConditionValue": "true" },. Condition operators are case sensitive.  Conditions differs from ListOfTags as follows:   When you specify more than one condition, you only assign the resources that match ALL conditions (using AND logic).    Conditions supports StringEquals, StringLike, StringNotEquals, and StringNotLike. ListOfTags only supports StringEquals.  
    */
  var Conditions: js.UndefOr[typings.awsSdk.clientsBackupMod.Conditions] = js.undefined
  
  /**
    * The ARN of the IAM role that Backup uses to authenticate when backing up the target resource; for example, arn:aws:iam::123456789012:role/S3Access.
    */
  var IamRoleArn: IAMRoleArn
  
  /**
    * A list of conditions that you define to assign resources to your backup plans using tags. For example, "StringEquals": { "ConditionKey": "aws:ResourceTag/CreatedByCryo", "ConditionValue": "true" },. Condition operators are case sensitive.  ListOfTags differs from Conditions as follows:   When you specify more than one condition, you assign all resources that match AT LEAST ONE condition (using OR logic).    ListOfTags only supports StringEquals. Conditions supports StringEquals, StringLike, StringNotEquals, and StringNotLike.   
    */
  var ListOfTags: js.UndefOr[typings.awsSdk.clientsBackupMod.ListOfTags] = js.undefined
  
  /**
    * A list of Amazon Resource Names (ARNs) to exclude from a backup plan. The maximum number of ARNs is 500 without wildcards, or 30 ARNs with wildcards. If you need to exclude many resources from a backup plan, consider a different resource selection strategy, such as assigning only one or a few resource types or refining your resource selection using tags.
    */
  var NotResources: js.UndefOr[ResourceArns] = js.undefined
  
  /**
    * A list of Amazon Resource Names (ARNs) to assign to a backup plan. The maximum number of ARNs is 500 without wildcards, or 30 ARNs with wildcards. If you need to assign many resources to a backup plan, consider a different resource selection strategy, such as assigning all resources of a resource type or refining your resource selection using tags.
    */
  var Resources: js.UndefOr[ResourceArns] = js.undefined
  
  /**
    * The display name of a resource selection document. Must contain 1 to 50 alphanumeric or '-_.' characters.
    */
  var SelectionName: BackupSelectionName
}
object BackupSelection {
  
  inline def apply(IamRoleArn: IAMRoleArn, SelectionName: BackupSelectionName): BackupSelection = {
    val __obj = js.Dynamic.literal(IamRoleArn = IamRoleArn.asInstanceOf[js.Any], SelectionName = SelectionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupSelection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackupSelection] (val x: Self) extends AnyVal {
    
    inline def setConditions(value: Conditions): Self = StObject.set(x, "Conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "Conditions", js.undefined)
    
    inline def setIamRoleArn(value: IAMRoleArn): Self = StObject.set(x, "IamRoleArn", value.asInstanceOf[js.Any])
    
    inline def setListOfTags(value: ListOfTags): Self = StObject.set(x, "ListOfTags", value.asInstanceOf[js.Any])
    
    inline def setListOfTagsUndefined: Self = StObject.set(x, "ListOfTags", js.undefined)
    
    inline def setListOfTagsVarargs(value: Condition*): Self = StObject.set(x, "ListOfTags", js.Array(value*))
    
    inline def setNotResources(value: ResourceArns): Self = StObject.set(x, "NotResources", value.asInstanceOf[js.Any])
    
    inline def setNotResourcesUndefined: Self = StObject.set(x, "NotResources", js.undefined)
    
    inline def setNotResourcesVarargs(value: ARN*): Self = StObject.set(x, "NotResources", js.Array(value*))
    
    inline def setResources(value: ResourceArns): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "Resources", js.undefined)
    
    inline def setResourcesVarargs(value: ARN*): Self = StObject.set(x, "Resources", js.Array(value*))
    
    inline def setSelectionName(value: BackupSelectionName): Self = StObject.set(x, "SelectionName", value.asInstanceOf[js.Any])
  }
}
