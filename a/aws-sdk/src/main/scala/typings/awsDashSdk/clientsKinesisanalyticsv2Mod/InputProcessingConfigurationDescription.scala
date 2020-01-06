package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputProcessingConfigurationDescription extends js.Object {
  /**
    * Provides configuration information about the associated InputLambdaProcessorDescription 
    */
  var InputLambdaProcessorDescription: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.InputLambdaProcessorDescription] = js.native
}

object InputProcessingConfigurationDescription {
  @scala.inline
  def apply(InputLambdaProcessorDescription: InputLambdaProcessorDescription = null): InputProcessingConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    if (InputLambdaProcessorDescription != null) __obj.updateDynamic("InputLambdaProcessorDescription")(InputLambdaProcessorDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputProcessingConfigurationDescription]
  }
}

