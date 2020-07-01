package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSupportedResourceTypesOutput extends js.Object {
  /**
    * Contains a string with the supported AWS resource types:    DynamoDB for Amazon DynamoDB    EBS for Amazon Elastic Block Store    EC2 for Amazon Elastic Compute Cloud    EFS for Amazon Elastic File System    RDS for Amazon Relational Database Service    Storage Gateway for AWS Storage Gateway  
    */
  var ResourceTypes: js.UndefOr[typings.awsSdk.backupMod.ResourceTypes] = js.native
}

object GetSupportedResourceTypesOutput {
  @scala.inline
  def apply(ResourceTypes: ResourceTypes = null): GetSupportedResourceTypesOutput = {
    val __obj = js.Dynamic.literal()
    if (ResourceTypes != null) __obj.updateDynamic("ResourceTypes")(ResourceTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSupportedResourceTypesOutput]
  }
}

