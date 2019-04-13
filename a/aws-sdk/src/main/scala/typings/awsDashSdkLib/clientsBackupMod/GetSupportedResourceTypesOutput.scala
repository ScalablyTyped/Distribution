package typings
package awsDashSdkLib.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSupportedResourceTypesOutput extends js.Object {
  /**
    * Contains a string with the supported AWS resource types:    EBS for Amazon Elastic Block Store    SGW for AWS Storage Gateway    RDS for Amazon Relational Database Service    DDB for Amazon DynamoDB    EFS for Amazon Elastic File System  
    */
  var ResourceTypes: js.UndefOr[ResourceTypes] = js.undefined
}

object GetSupportedResourceTypesOutput {
  @scala.inline
  def apply(ResourceTypes: ResourceTypes = null): GetSupportedResourceTypesOutput = {
    val __obj = js.Dynamic.literal()
    if (ResourceTypes != null) __obj.updateDynamic("ResourceTypes")(ResourceTypes)
    __obj.asInstanceOf[GetSupportedResourceTypesOutput]
  }
}

