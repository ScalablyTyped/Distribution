package typings.awsDashSdk.clientsFrauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDetectorVersionResult extends js.Object {
  /**
    * The timestamp when the detector version was created. 
    */
  var createdTime: js.UndefOr[time] = js.native
  /**
    * The detector version description.
    */
  var description: js.UndefOr[typings.awsDashSdk.clientsFrauddetectorMod.description] = js.native
  /**
    * The detector ID.
    */
  var detectorId: js.UndefOr[identifier] = js.native
  /**
    * The detector version ID.
    */
  var detectorVersionId: js.UndefOr[nonEmptyString] = js.native
  /**
    * The Amazon SageMaker model endpoints included in the detector version.
    */
  var externalModelEndpoints: js.UndefOr[ListOfStrings] = js.native
  /**
    * The timestamp when the detector version was last updated. 
    */
  var lastUpdatedTime: js.UndefOr[time] = js.native
  /**
    * The model versions included in the detector version. 
    */
  var modelVersions: js.UndefOr[ListOfModelVersions] = js.native
  /**
    * The rules included in the detector version.
    */
  var rules: js.UndefOr[RuleList] = js.native
  /**
    * The status of the detector version.
    */
  var status: js.UndefOr[DetectorVersionStatus] = js.native
}

object GetDetectorVersionResult {
  @scala.inline
  def apply(
    createdTime: time = null,
    description: description = null,
    detectorId: identifier = null,
    detectorVersionId: nonEmptyString = null,
    externalModelEndpoints: ListOfStrings = null,
    lastUpdatedTime: time = null,
    modelVersions: ListOfModelVersions = null,
    rules: RuleList = null,
    status: DetectorVersionStatus = null
  ): GetDetectorVersionResult = {
    val __obj = js.Dynamic.literal()
    if (createdTime != null) __obj.updateDynamic("createdTime")(createdTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (detectorId != null) __obj.updateDynamic("detectorId")(detectorId.asInstanceOf[js.Any])
    if (detectorVersionId != null) __obj.updateDynamic("detectorVersionId")(detectorVersionId.asInstanceOf[js.Any])
    if (externalModelEndpoints != null) __obj.updateDynamic("externalModelEndpoints")(externalModelEndpoints.asInstanceOf[js.Any])
    if (lastUpdatedTime != null) __obj.updateDynamic("lastUpdatedTime")(lastUpdatedTime.asInstanceOf[js.Any])
    if (modelVersions != null) __obj.updateDynamic("modelVersions")(modelVersions.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDetectorVersionResult]
  }
}

