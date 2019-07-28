package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LambdaOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the destination Lambda function to write to.  To specify an earlier version of the Lambda function than the latest, include the Lambda function version in the Lambda function ARN. For more information about Lambda ARNs, see Example ARNs: AWS Lambda  
    */
  var ResourceARN: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ResourceARN
}

object LambdaOutput {
  @scala.inline
  def apply(ResourceARN: ResourceARN): LambdaOutput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN)
  
    __obj.asInstanceOf[LambdaOutput]
  }
}

