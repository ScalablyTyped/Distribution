package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSupportedResourceTypesOutput extends js.Object {
  
  /**
    * Contains a string with the supported AWS resource types:    DynamoDB for Amazon DynamoDB    EBS for Amazon Elastic Block Store    EC2 for Amazon Elastic Compute Cloud    EFS for Amazon Elastic File System    RDS for Amazon Relational Database Service    Storage Gateway for AWS Storage Gateway  
    */
  var ResourceTypes: js.UndefOr[typings.awsSdk.backupMod.ResourceTypes] = js.native
}
object GetSupportedResourceTypesOutput {
  
  @scala.inline
  def apply(): GetSupportedResourceTypesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSupportedResourceTypesOutput]
  }
  
  @scala.inline
  implicit class GetSupportedResourceTypesOutputOps[Self <: GetSupportedResourceTypesOutput] (val x: Self) extends AnyVal {
    
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
    def setResourceTypesVarargs(value: ResourceType*): Self = this.set("ResourceTypes", js.Array(value :_*))
    
    @scala.inline
    def setResourceTypes(value: ResourceTypes): Self = this.set("ResourceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceTypes: Self = this.set("ResourceTypes", js.undefined)
  }
}
