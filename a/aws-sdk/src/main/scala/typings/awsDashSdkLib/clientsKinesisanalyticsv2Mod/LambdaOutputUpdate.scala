package typings
package awsDashSdkLib.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LambdaOutputUpdate extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the destination AWS Lambda function.  To specify an earlier version of the Lambda function than the latest, include the Lambda function version in the Lambda function ARN. For more information about Lambda ARNs, see Example ARNs: AWS Lambda  
    */
  var ResourceARNUpdate: ResourceARN
}

object LambdaOutputUpdate {
  @scala.inline
  def apply(ResourceARNUpdate: ResourceARN): LambdaOutputUpdate = {
    val __obj = js.Dynamic.literal(ResourceARNUpdate = ResourceARNUpdate)
  
    __obj.asInstanceOf[LambdaOutputUpdate]
  }
}

