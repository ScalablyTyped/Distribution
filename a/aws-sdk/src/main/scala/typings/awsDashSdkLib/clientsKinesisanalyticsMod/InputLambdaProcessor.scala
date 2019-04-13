package typings
package awsDashSdkLib.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputLambdaProcessor extends js.Object {
  /**
    * The ARN of the AWS Lambda function that operates on records in the stream.
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

