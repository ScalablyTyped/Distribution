package typings.awsDashSdk.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputProcessingConfiguration extends js.Object {
  /**
    * The InputLambdaProcessor that is used to preprocess the records in the stream before being processed by your application code.
    */
  var InputLambdaProcessor: typings.awsDashSdk.clientsKinesisanalyticsMod.InputLambdaProcessor
}

object InputProcessingConfiguration {
  @scala.inline
  def apply(InputLambdaProcessor: InputLambdaProcessor): InputProcessingConfiguration = {
    val __obj = js.Dynamic.literal(InputLambdaProcessor = InputLambdaProcessor)
  
    __obj.asInstanceOf[InputProcessingConfiguration]
  }
}

