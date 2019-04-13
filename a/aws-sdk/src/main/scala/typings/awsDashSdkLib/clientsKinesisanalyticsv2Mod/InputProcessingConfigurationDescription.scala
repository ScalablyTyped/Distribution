package typings
package awsDashSdkLib.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputProcessingConfigurationDescription extends js.Object {
  /**
    * Provides configuration information about the associated InputLambdaProcessorDescription 
    */
  var InputLambdaProcessorDescription: js.UndefOr[InputLambdaProcessorDescription] = js.undefined
}

object InputProcessingConfigurationDescription {
  @scala.inline
  def apply(InputLambdaProcessorDescription: InputLambdaProcessorDescription = null): InputProcessingConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    if (InputLambdaProcessorDescription != null) __obj.updateDynamic("InputLambdaProcessorDescription")(InputLambdaProcessorDescription)
    __obj.asInstanceOf[InputProcessingConfigurationDescription]
  }
}

