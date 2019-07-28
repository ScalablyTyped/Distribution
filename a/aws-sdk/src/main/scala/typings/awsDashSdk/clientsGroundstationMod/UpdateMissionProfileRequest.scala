package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateMissionProfileRequest extends js.Object {
  /**
    * Amount of time after a contact ends that you’d like to receive a CloudWatch event indicating the pass has finished.
    */
  var contactPostPassDurationSeconds: js.UndefOr[DurationInSeconds] = js.undefined
  /**
    * Amount of time after a contact ends that you’d like to receive a CloudWatch event indicating the pass has finished.
    */
  var contactPrePassDurationSeconds: js.UndefOr[DurationInSeconds] = js.undefined
  /**
    * A list of lists of ARNs. Each list of ARNs is an edge, with a from Config and a to 
    Config.
    */
  var dataflowEdges: js.UndefOr[DataflowEdgeList] = js.undefined
  /**
    * Smallest amount of time in seconds that you’d like to see for an available contact. AWS Ground Station will not present you with contacts shorter than this duration.
    */
  var minimumViableContactDurationSeconds: js.UndefOr[DurationInSeconds] = js.undefined
  /**
    * ID of a mission profile.
    */
  var missionProfileId: String
  /**
    * Name of a mission profile.
    */
  var name: js.UndefOr[SafeName] = js.undefined
  /**
    * ARN of a tracking Config.
    */
  var trackingConfigArn: js.UndefOr[ConfigArn] = js.undefined
}

object UpdateMissionProfileRequest {
  @scala.inline
  def apply(
    missionProfileId: String,
    contactPostPassDurationSeconds: js.UndefOr[DurationInSeconds] = js.undefined,
    contactPrePassDurationSeconds: js.UndefOr[DurationInSeconds] = js.undefined,
    dataflowEdges: DataflowEdgeList = null,
    minimumViableContactDurationSeconds: js.UndefOr[DurationInSeconds] = js.undefined,
    name: SafeName = null,
    trackingConfigArn: ConfigArn = null
  ): UpdateMissionProfileRequest = {
    val __obj = js.Dynamic.literal(missionProfileId = missionProfileId)
    if (!js.isUndefined(contactPostPassDurationSeconds)) __obj.updateDynamic("contactPostPassDurationSeconds")(contactPostPassDurationSeconds)
    if (!js.isUndefined(contactPrePassDurationSeconds)) __obj.updateDynamic("contactPrePassDurationSeconds")(contactPrePassDurationSeconds)
    if (dataflowEdges != null) __obj.updateDynamic("dataflowEdges")(dataflowEdges)
    if (!js.isUndefined(minimumViableContactDurationSeconds)) __obj.updateDynamic("minimumViableContactDurationSeconds")(minimumViableContactDurationSeconds)
    if (name != null) __obj.updateDynamic("name")(name)
    if (trackingConfigArn != null) __obj.updateDynamic("trackingConfigArn")(trackingConfigArn)
    __obj.asInstanceOf[UpdateMissionProfileRequest]
  }
}

