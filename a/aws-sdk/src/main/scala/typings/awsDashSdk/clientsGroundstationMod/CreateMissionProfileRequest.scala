package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMissionProfileRequest extends js.Object {
  /**
    * Amount of time after a contact ends that you’d like to receive a CloudWatch event indicating the pass has finished.
    */
  var contactPostPassDurationSeconds: js.UndefOr[DurationInSeconds] = js.native
  /**
    * Amount of time prior to contact start you’d like to receive a CloudWatch event indicating an upcoming pass.
    */
  var contactPrePassDurationSeconds: js.UndefOr[DurationInSeconds] = js.native
  /**
    * A list of lists of ARNs. Each list of ARNs is an edge, with a from Config and a to 
    Config.
    */
  var dataflowEdges: DataflowEdgeList = js.native
  /**
    * Smallest amount of time in seconds that you’d like to see for an available contact. AWS Ground Station will not present you with contacts shorter than this duration.
    */
  var minimumViableContactDurationSeconds: DurationInSeconds = js.native
  /**
    * Name of a mission profile.
    */
  var name: SafeName = js.native
  /**
    * Tags assigned to a mission profile.
    */
  var tags: js.UndefOr[TagsMap] = js.native
  /**
    * ARN of a tracking Config.
    */
  var trackingConfigArn: ConfigArn = js.native
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
    val __obj = js.Dynamic.literal(dataflowEdges = dataflowEdges.asInstanceOf[js.Any], minimumViableContactDurationSeconds = minimumViableContactDurationSeconds.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], trackingConfigArn = trackingConfigArn.asInstanceOf[js.Any])
    if (contactPostPassDurationSeconds != null) __obj.updateDynamic("contactPostPassDurationSeconds")(contactPostPassDurationSeconds.asInstanceOf[js.Any])
    if (contactPrePassDurationSeconds != null) __obj.updateDynamic("contactPrePassDurationSeconds")(contactPrePassDurationSeconds.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMissionProfileRequest]
  }
}

