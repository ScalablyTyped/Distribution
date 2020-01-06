package typings.awsDashSdk.clientsFrauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPredictionRequest extends js.Object {
  /**
    * The detector ID. 
    */
  var detectorId: String = js.native
  /**
    * The detector version ID.
    */
  var detectorVersionId: js.UndefOr[String] = js.native
  /**
    * Names of variables you defined in Amazon Fraud Detector to represent event data elements and their corresponding values for the event you are sending for evaluation.
    */
  var eventAttributes: js.UndefOr[EventAttributeMap] = js.native
  /**
    * The unique ID used to identify the event.
    */
  var eventId: String = js.native
  /**
    * The Amazon SageMaker model endpoint input data blobs.
    */
  var externalModelEndpointDataBlobs: js.UndefOr[ExternalModelEndpointDataBlobMap] = js.native
}

object GetPredictionRequest {
  @scala.inline
  def apply(
    detectorId: String,
    eventId: String,
    detectorVersionId: String = null,
    eventAttributes: EventAttributeMap = null,
    externalModelEndpointDataBlobs: ExternalModelEndpointDataBlobMap = null
  ): GetPredictionRequest = {
    val __obj = js.Dynamic.literal(detectorId = detectorId.asInstanceOf[js.Any], eventId = eventId.asInstanceOf[js.Any])
    if (detectorVersionId != null) __obj.updateDynamic("detectorVersionId")(detectorVersionId.asInstanceOf[js.Any])
    if (eventAttributes != null) __obj.updateDynamic("eventAttributes")(eventAttributes.asInstanceOf[js.Any])
    if (externalModelEndpointDataBlobs != null) __obj.updateDynamic("externalModelEndpointDataBlobs")(externalModelEndpointDataBlobs.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPredictionRequest]
  }
}

