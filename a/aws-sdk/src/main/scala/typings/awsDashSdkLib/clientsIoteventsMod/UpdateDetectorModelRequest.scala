package typings
package awsDashSdkLib.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDetectorModelRequest extends js.Object {
  /**
    * Information that defines how a detector operates.
    */
  var detectorModelDefinition: DetectorModelDefinition
  /**
    * A brief description of the detector model.
    */
  var detectorModelDescription: js.UndefOr[DetectorModelDescription] = js.undefined
  /**
    * The name of the detector model that is updated.
    */
  var detectorModelName: DetectorModelName
  /**
    * The ARN of the role that grants permission to AWS IoT Events to perform its operations.
    */
  var roleArn: AmazonResourceName
}

object UpdateDetectorModelRequest {
  @scala.inline
  def apply(
    detectorModelDefinition: DetectorModelDefinition,
    detectorModelName: DetectorModelName,
    roleArn: AmazonResourceName,
    detectorModelDescription: DetectorModelDescription = null
  ): UpdateDetectorModelRequest = {
    val __obj = js.Dynamic.literal(detectorModelDefinition = detectorModelDefinition, detectorModelName = detectorModelName, roleArn = roleArn)
    if (detectorModelDescription != null) __obj.updateDynamic("detectorModelDescription")(detectorModelDescription)
    __obj.asInstanceOf[UpdateDetectorModelRequest]
  }
}

