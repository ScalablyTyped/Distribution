package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateMissionProfileRequest extends js.Object {
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
  var dataflowEdges: DataflowEdgeList
  /**
    * Smallest amount of time in seconds that you’d like to see for an available contact. AWS Ground Station will not present you with contacts shorter than this duration.
    */
  var minimumViableContactDurationSeconds: DurationInSeconds
  /**
    * Name of a mission profile.
    */
  var name: SafeName
  /**
    * Tags assigned to a mission profile.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
  /**
    * ARN of a tracking Config.
    */
  var trackingConfigArn: ConfigArn
}

object CreateMissionProfileRequest {
  @scala.inline
  def apply(
    dataflowEdges: DataflowEdgeList,
    minimumViableContactDurationSeconds: DurationInSeconds,
    name: SafeName,
    trackingConfigArn: ConfigArn,
    contactPostPassDurationSeconds: Int | scala.Double = null,
    contactPrePassDurationSeconds: Int | scala.Double = null,
    tags: TagsMap = null
  ): CreateMissionProfileRequest = {
    val __obj = js.Dynamic.literal(dataflowEdges = dataflowEdges, minimumViableContactDurationSeconds = minimumViableContactDurationSeconds, name = name, trackingConfigArn = trackingConfigArn)
    if (contactPostPassDurationSeconds != null) __obj.updateDynamic("contactPostPassDurationSeconds")(contactPostPassDurationSeconds.asInstanceOf[js.Any])
    if (contactPrePassDurationSeconds != null) __obj.updateDynamic("contactPrePassDurationSeconds")(contactPrePassDurationSeconds.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreateMissionProfileRequest]
  }
}

