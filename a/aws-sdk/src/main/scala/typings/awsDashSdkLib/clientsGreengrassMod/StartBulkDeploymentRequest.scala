package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartBulkDeploymentRequest extends js.Object {
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[__string] = js.undefined
  /**
    * The ARN of the execution role to associate with the bulk deployment operation. This IAM role must allow the ''greengrass:CreateDeployment'' action for all group versions that are listed in the input file. This IAM role must have access to the S3 bucket containing the input file.
    */
  var ExecutionRoleArn: js.UndefOr[__string] = js.undefined
  /**
    * The URI of the input file contained in the S3 bucket. The execution role must have ''getObject'' permissions on this bucket to access the input file. The input file is a JSON-serialized, line delimited file with UTF-8 encoding that provides a list of group and version IDs and the deployment type. This file must be less than 100 MB. Currently, AWS IoT Greengrass supports only ''NewDeployment'' deployment types.
    */
  var InputFileUri: js.UndefOr[__string] = js.undefined
  /**
    * Tag(s) to add to the new resource
    */
  var tags: js.UndefOr[Tags] = js.undefined
}

object StartBulkDeploymentRequest {
  @scala.inline
  def apply(
    AmznClientToken: __string = null,
    ExecutionRoleArn: __string = null,
    InputFileUri: __string = null,
    tags: Tags = null
  ): StartBulkDeploymentRequest = {
    val __obj = js.Dynamic.literal()
    if (AmznClientToken != null) __obj.updateDynamic("AmznClientToken")(AmznClientToken)
    if (ExecutionRoleArn != null) __obj.updateDynamic("ExecutionRoleArn")(ExecutionRoleArn)
    if (InputFileUri != null) __obj.updateDynamic("InputFileUri")(InputFileUri)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[StartBulkDeploymentRequest]
  }
}

