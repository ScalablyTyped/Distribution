package typings.awsDashSdk.clientsFrauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelInputConfiguration extends js.Object {
  /**
    *  Template for constructing the CSV input-data sent to SageMaker. At event-evaluation, the placeholders for variable-names in the template will be replaced with the variable values before being sent to SageMaker. 
    */
  var csvInputTemplate: js.UndefOr[String] = js.native
  /**
    *  The format of the model input configuration. The format differs depending on if it is passed through to SageMaker or constructed by Amazon Fraud Detector.
    */
  var format: js.UndefOr[ModelInputDataFormat] = js.native
  /**
    *  For an opaque-model, the input to the model will be a ByteBuffer blob provided in the getPrediction request, and will be passed to SageMaker as-is. For non-opaque models, the input will be constructed by Amazon Fraud Detector based on the model-configuration. 
    */
  var isOpaque: IsOpaque = js.native
  /**
    *  Template for constructing the JSON input-data sent to SageMaker. At event-evaluation, the placeholders for variable names in the template will be replaced with the variable values before being sent to SageMaker. 
    */
  var jsonInputTemplate: js.UndefOr[String] = js.native
}

object ModelInputConfiguration {
  @scala.inline
  def apply(
    isOpaque: IsOpaque,
    csvInputTemplate: String = null,
    format: ModelInputDataFormat = null,
    jsonInputTemplate: String = null
  ): ModelInputConfiguration = {
    val __obj = js.Dynamic.literal(isOpaque = isOpaque.asInstanceOf[js.Any])
    if (csvInputTemplate != null) __obj.updateDynamic("csvInputTemplate")(csvInputTemplate.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (jsonInputTemplate != null) __obj.updateDynamic("jsonInputTemplate")(jsonInputTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelInputConfiguration]
  }
}

