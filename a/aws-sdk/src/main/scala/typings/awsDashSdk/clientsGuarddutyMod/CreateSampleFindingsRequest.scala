package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSampleFindingsRequest extends js.Object {
  /**
    * The ID of the detector to create sample findings for.
    */
  var DetectorId: typings.awsDashSdk.clientsGuarddutyMod.DetectorId
  /**
    * Types of sample findings that you want to generate.
    */
  var FindingTypes: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.FindingTypes] = js.undefined
}

object CreateSampleFindingsRequest {
  @scala.inline
  def apply(DetectorId: DetectorId, FindingTypes: FindingTypes = null): CreateSampleFindingsRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId)
    if (FindingTypes != null) __obj.updateDynamic("FindingTypes")(FindingTypes)
    __obj.asInstanceOf[CreateSampleFindingsRequest]
  }
}

