package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackupSelection extends StObject {
  
  /**
    * The ARN of the IAM role that AWS Backup uses to authenticate when backing up the target resource; for example, arn:aws:iam::123456789012:role/S3Access.
    */
  var IamRoleArn: IAMRoleArn = js.native
  
  /**
    * An array of conditions used to specify a set of resources to assign to a backup plan; for example, "StringEquals": {"ec2:ResourceTag/Department": "accounting".
    */
  var ListOfTags: js.UndefOr[typings.awsSdk.backupMod.ListOfTags] = js.native
  
  /**
    * An array of strings that contain Amazon Resource Names (ARNs) of resources to assign to a backup plan.
    */
  var Resources: js.UndefOr[ResourceArns] = js.native
  
  /**
    * The display name of a resource selection document.
    */
  var SelectionName: BackupSelectionName = js.native
}
object BackupSelection {
  
  @scala.inline
  def apply(IamRoleArn: IAMRoleArn, SelectionName: BackupSelectionName): BackupSelection = {
    val __obj = js.Dynamic.literal(IamRoleArn = IamRoleArn.asInstanceOf[js.Any], SelectionName = SelectionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupSelection]
  }
  
  @scala.inline
  implicit class BackupSelectionMutableBuilder[Self <: BackupSelection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIamRoleArn(value: IAMRoleArn): Self = StObject.set(x, "IamRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListOfTags(value: ListOfTags): Self = StObject.set(x, "ListOfTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListOfTagsUndefined: Self = StObject.set(x, "ListOfTags", js.undefined)
    
    @scala.inline
    def setListOfTagsVarargs(value: Condition*): Self = StObject.set(x, "ListOfTags", js.Array(value :_*))
    
    @scala.inline
    def setResources(value: ResourceArns): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "Resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: ARN*): Self = StObject.set(x, "Resources", js.Array(value :_*))
    
    @scala.inline
    def setSelectionName(value: BackupSelectionName): Self = StObject.set(x, "SelectionName", value.asInstanceOf[js.Any])
  }
}
