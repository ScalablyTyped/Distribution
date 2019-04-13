package typings
package awsDashSdkLib.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LambdaOutput extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the destination Lambda function to write to.
    */
  var ResourceARN: awsDashSdkLib.clientsKinesisanalyticsMod.ResourceARN
  /**
    * ARN of the IAM role that Amazon Kinesis Analytics can assume to write to the destination function on your behalf. You need to grant the necessary permissions to this role. 
    */
  var RoleARN: awsDashSdkLib.clientsKinesisanalyticsMod.RoleARN
}

object LambdaOutput {
  @scala.inline
  def apply(ResourceARN: ResourceARN, RoleARN: RoleARN): LambdaOutput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN, RoleARN = RoleARN)
  
    __obj.asInstanceOf[LambdaOutput]
  }
}

