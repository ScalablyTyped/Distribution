package typings.awsDashSdk.clientsIoteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Detector extends js.Object {
  /**
    * The time the detector (instance) was created.
    */
  var creationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The name of the detector model that created this detector (instance).
    */
  var detectorModelName: js.UndefOr[DetectorModelName] = js.undefined
  /**
    * The version of the detector model that created this detector (instance).
    */
  var detectorModelVersion: js.UndefOr[DetectorModelVersion] = js.undefined
  /**
    * The value of the key (identifying the device or system) that caused the creation of this detector (instance).
    */
  var keyValue: js.UndefOr[KeyValue] = js.undefined
  /**
    * The time the detector (instance) was last updated.
    */
  var lastUpdateTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The current state of the detector (instance).
    */
  var state: js.UndefOr[DetectorState] = js.undefined
}

object Detector {
  @scala.inline
  def apply(
    creationTime: Timestamp = null,
    detectorModelName: DetectorModelName = null,
    detectorModelVersion: DetectorModelVersion = null,
    keyValue: KeyValue = null,
    lastUpdateTime: Timestamp = null,
    state: DetectorState = null
  ): Detector = {
    val __obj = js.Dynamic.literal()
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime)
    if (detectorModelName != null) __obj.updateDynamic("detectorModelName")(detectorModelName)
    if (detectorModelVersion != null) __obj.updateDynamic("detectorModelVersion")(detectorModelVersion)
    if (keyValue != null) __obj.updateDynamic("keyValue")(keyValue)
    if (lastUpdateTime != null) __obj.updateDynamic("lastUpdateTime")(lastUpdateTime)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[Detector]
  }
}

