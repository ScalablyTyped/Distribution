package typings
package awsDashSdkLib.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectorModelConfiguration extends js.Object {
  /**
    * The time the detector model was created.
    */
  var creationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The ARN of the detector model.
    */
  var detectorModelArn: js.UndefOr[DetectorModelArn] = js.undefined
  /**
    * A brief description of the detector model.
    */
  var detectorModelDescription: js.UndefOr[DetectorModelDescription] = js.undefined
  /**
    * The name of the detector model.
    */
  var detectorModelName: js.UndefOr[DetectorModelName] = js.undefined
  /**
    * The version of the detector model.
    */
  var detectorModelVersion: js.UndefOr[DetectorModelVersion] = js.undefined
  /**
    * The input attribute key used to identify a device or system in order to create a detector (an instance of the detector model) and then to route each input received to the appropriate detector (instance). This parameter uses a JSON-path expression to specify the attribute-value pair in the message payload of each input that is used to identify the device associated with the input.
    */
  var key: js.UndefOr[AttributeJsonPath] = js.undefined
  /**
    * The time the detector model was last updated.
    */
  var lastUpdateTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The ARN of the role that grants permission to AWS IoT Events to perform its operations.
    */
  var roleArn: js.UndefOr[AmazonResourceName] = js.undefined
  /**
    * The status of the detector model.
    */
  var status: js.UndefOr[DetectorModelVersionStatus] = js.undefined
}

object DetectorModelConfiguration {
  @scala.inline
  def apply(
    creationTime: Timestamp = null,
    detectorModelArn: DetectorModelArn = null,
    detectorModelDescription: DetectorModelDescription = null,
    detectorModelName: DetectorModelName = null,
    detectorModelVersion: DetectorModelVersion = null,
    key: AttributeJsonPath = null,
    lastUpdateTime: Timestamp = null,
    roleArn: AmazonResourceName = null,
    status: DetectorModelVersionStatus = null
  ): DetectorModelConfiguration = {
    val __obj = js.Dynamic.literal()
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime)
    if (detectorModelArn != null) __obj.updateDynamic("detectorModelArn")(detectorModelArn)
    if (detectorModelDescription != null) __obj.updateDynamic("detectorModelDescription")(detectorModelDescription)
    if (detectorModelName != null) __obj.updateDynamic("detectorModelName")(detectorModelName)
    if (detectorModelVersion != null) __obj.updateDynamic("detectorModelVersion")(detectorModelVersion)
    if (key != null) __obj.updateDynamic("key")(key)
    if (lastUpdateTime != null) __obj.updateDynamic("lastUpdateTime")(lastUpdateTime)
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectorModelConfiguration]
  }
}

