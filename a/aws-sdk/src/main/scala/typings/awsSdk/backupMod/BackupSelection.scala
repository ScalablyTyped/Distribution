package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackupSelection extends js.Object {
  
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
  implicit class BackupSelectionOps[Self <: BackupSelection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIamRoleArn(value: IAMRoleArn): Self = this.set("IamRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionName(value: BackupSelectionName): Self = this.set("SelectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListOfTagsVarargs(value: Condition*): Self = this.set("ListOfTags", js.Array(value :_*))
    
    @scala.inline
    def setListOfTags(value: ListOfTags): Self = this.set("ListOfTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListOfTags: Self = this.set("ListOfTags", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: ARN*): Self = this.set("Resources", js.Array(value :_*))
    
    @scala.inline
    def setResources(value: ResourceArns): Self = this.set("Resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResources: Self = this.set("Resources", js.undefined)
  }
}
