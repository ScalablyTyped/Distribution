package typings
package awsDashSdkLib.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputLambdaProcessorUpdate extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the new AWS Lambda function that is used to preprocess the records in the stream.
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

