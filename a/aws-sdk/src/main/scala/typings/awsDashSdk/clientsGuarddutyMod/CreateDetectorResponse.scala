package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDetectorResponse extends js.Object {
  /**
    * The unique ID of the created detector.
    */
  var DetectorId: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.DetectorId] = js.undefined
}

object CreateDetectorResponse {
  @scala.inline
  def apply(DetectorId: DetectorId = null): CreateDetectorResponse = {
    val __obj = js.Dynamic.literal()
    if (DetectorId != null) __obj.updateDynamic("DetectorId")(DetectorId)
    __obj.asInstanceOf[CreateDetectorResponse]
  }
}

