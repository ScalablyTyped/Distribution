package typings
package awsDashSdkLib.clientsIoteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDetectorRequest extends js.Object {
  /**
    * The name of the detector model that created the detectors (instances).
    */
  var detectorModelName: DetectorModelName
  /**
    * The value of the input key attribute (identifying the device or system) that caused the creation of this detector (instance).
    */
  var keyValue: js.UndefOr[KeyValue] = js.undefined
  /**
    * The ID you wish to assign to the detector update "message". Each "messageId" must be unique within each batch sent.
    */
  var messageId: MessageId
  /**
    * The new state, variable values, and timer settings of the detector (instance).
    */
  var state: DetectorStateDefinition
}

object UpdateDetectorRequest {
  @scala.inline
  def apply(
    detectorModelName: DetectorModelName,
    messageId: MessageId,
    state: DetectorStateDefinition,
    keyValue: KeyValue = null
  ): UpdateDetectorRequest = {
    val __obj = js.Dynamic.literal(detectorModelName = detectorModelName, messageId = messageId, state = state)
    if (keyValue != null) __obj.updateDynamic("keyValue")(keyValue)
    __obj.asInstanceOf[UpdateDetectorRequest]
  }
}

