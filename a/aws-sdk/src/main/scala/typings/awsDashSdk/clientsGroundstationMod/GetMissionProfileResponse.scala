package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMissionProfileResponse extends js.Object {
  /**
    * Amount of time after a contact ends that you’d like to receive a CloudWatch event indicating the pass has finished.
    */
  var contactPostPassDurationSeconds: js.UndefOr[DurationInSeconds] = js.undefined
  /**
    * Amount of time prior to contact start you’d like to receive a CloudWatch event indicating an upcoming pass.
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
    * ARN of a mission profile.
    */
  var missionProfileArn: js.UndefOr[MissionProfileArn] = js.undefined
  /**
    * ID of a mission profile.
    */
  var missionProfileId: js.UndefOr[String] = js.undefined
  /**
    * Name of a mission profile.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Region of a mission profile.
    */
  var region: js.UndefOr[String] = js.undefined
  /**
    * Tags assigned to a mission profile.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
  /**
    * ARN of a tracking Config.
    */
  var trackingConfigArn: js.UndefOr[ConfigArn] = js.undefined
}

object GetMissionProfileResponse {
  @scala.inline
  def apply(
    contactPostPassDurationSeconds: Int | scala.Double = null,
    contactPrePassDurationSeconds: Int | scala.Double = null,
    dataflowEdges: DataflowEdgeList = null,
    minimumViableContactDurationSeconds: Int | scala.Double = null,
    missionProfileArn: MissionProfileArn = null,
    missionProfileId: String = null,
    name: String = null,
    region: String = null,
    tags: TagsMap = null,
    trackingConfigArn: ConfigArn = null
  ): GetMissionProfileResponse = {
    val __obj = js.Dynamic.literal()
    if (contactPostPassDurationSeconds != null) __obj.updateDynamic("contactPostPassDurationSeconds")(contactPostPassDurationSeconds.asInstanceOf[js.Any])
    if (contactPrePassDurationSeconds != null) __obj.updateDynamic("contactPrePassDurationSeconds")(contactPrePassDurationSeconds.asInstanceOf[js.Any])
    if (dataflowEdges != null) __obj.updateDynamic("dataflowEdges")(dataflowEdges)
    if (minimumViableContactDurationSeconds != null) __obj.updateDynamic("minimumViableContactDurationSeconds")(minimumViableContactDurationSeconds.asInstanceOf[js.Any])
    if (missionProfileArn != null) __obj.updateDynamic("missionProfileArn")(missionProfileArn)
    if (missionProfileId != null) __obj.updateDynamic("missionProfileId")(missionProfileId)
    if (name != null) __obj.updateDynamic("name")(name)
    if (region != null) __obj.updateDynamic("region")(region)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (trackingConfigArn != null) __obj.updateDynamic("trackingConfigArn")(trackingConfigArn)
    __obj.asInstanceOf[GetMissionProfileResponse]
  }
}

