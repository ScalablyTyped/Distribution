package typings
package awsDashSdkLib.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDetectorModelRequest extends js.Object {
  /**
    * Information that defines how the detectors operate.
    */
  var detectorModelDefinition: DetectorModelDefinition
  /**
    * A brief description of the detector model.
    */
  var detectorModelDescription: js.UndefOr[DetectorModelDescription] = js.undefined
  /**
    * The name of the detector model.
    */
  var detectorModelName: DetectorModelName
  /**
    * The input attribute key used to identify a device or system in order to create a detector (an instance of the detector model) and then to route each input received to the appropriate detector (instance). This parameter uses a JSON-path expression to specify the attribute-value pair in the message payload of each input that is used to identify the device associated with the input.
    */
  var key: js.UndefOr[AttributeJsonPath] = js.undefined
  /**
    * The ARN of the role that grants permission to AWS IoT Events to perform its operations.
    */
  var roleArn: AmazonResourceName
  /**
    * Metadata which can be used to manage the detector model.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}

object CreateDetectorModelRequest {
  @scala.inline
  def apply(
    detectorModelDefinition: DetectorModelDefinition,
    detectorModelName: DetectorModelName,
    roleArn: AmazonResourceName,
    detectorModelDescription: DetectorModelDescription = null,
    key: AttributeJsonPath = null,
    tags: Tags = null
  ): CreateDetectorModelRequest = {
    val __obj = js.Dynamic.literal(detectorModelDefinition = detectorModelDefinition, detectorModelName = detectorModelName, roleArn = roleArn)
    if (detectorModelDescription != null) __obj.updateDynamic("detectorModelDescription")(detectorModelDescription)
    if (key != null) __obj.updateDynamic("key")(key)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreateDetectorModelRequest]
  }
}

