package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputLambdaProcessorUpdate extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the new AWS Lambda function that is used to preprocess the records in the stream.  To specify an earlier version of the Lambda function than the latest, include the Lambda function version in the Lambda function ARN. For more information about Lambda ARNs, see Example ARNs: AWS Lambda  
    */
  var ResourceARNUpdate: ResourceARN
}

object InputLambdaProcessorUpdate {
  @scala.inline
  def apply(ResourceARNUpdate: ResourceARN): InputLambdaProcessorUpdate = {
    val __obj = js.Dynamic.literal(ResourceARNUpdate = ResourceARNUpdate)
  
    __obj.asInstanceOf[InputLambdaProcessorUpdate]
  }
}

