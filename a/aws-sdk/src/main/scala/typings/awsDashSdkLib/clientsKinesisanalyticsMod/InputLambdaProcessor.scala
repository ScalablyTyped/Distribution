package typings
package awsDashSdkLib.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputLambdaProcessor extends js.Object {
  /**
    * The ARN of the AWS Lambda function that operates on records in the stream.  To specify an earlier version of the Lambda function than the latest, include the Lambda function version in the Lambda function ARN. For more information about Lambda ARNs, see Example ARNs: AWS Lambda  
    */
  var ResourceARN: awsDashSdkLib.clientsKinesisanalyticsMod.ResourceARN
  /**
    * The ARN of the IAM role that is used to access the AWS Lambda function.
    */
  var RoleARN: awsDashSdkLib.clientsKinesisanalyticsMod.RoleARN
}

object InputLambdaProcessor {
  @scala.inline
  def apply(ResourceARN: ResourceARN, RoleARN: RoleARN): InputLambdaProcessor = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN, RoleARN = RoleARN)
  
    __obj.asInstanceOf[InputLambdaProcessor]
  }
}

