package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateRobotApplicationResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the updated robot application.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  /**
    * The time, in milliseconds since the epoch, when the robot application was last updated.
    */
  var lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined
  /**
    * The name of the robot application.
    */
  var name: js.UndefOr[Name] = js.undefined
  /**
    * The revision id of the robot application.
    */
  var revisionId: js.UndefOr[RevisionId] = js.undefined
  /**
    * The robot software suite used by the robot application.
    */
  var robotSoftwareSuite: js.UndefOr[RobotSoftwareSuite] = js.undefined
  /**
    * The sources of the robot application.
    */
  var sources: js.UndefOr[Sources] = js.undefined
  /**
    * The version of the robot application.
    */
  var version: js.UndefOr[Version] = js.undefined
}

object UpdateRobotApplicationResponse {
  @scala.inline
  def apply(
    arn: Arn = null,
    lastUpdatedAt: LastUpdatedAt = null,
    name: Name = null,
    revisionId: RevisionId = null,
    robotSoftwareSuite: RobotSoftwareSuite = null,
    sources: Sources = null,
    version: Version = null
  ): UpdateRobotApplicationResponse = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (lastUpdatedAt != null) __obj.updateDynamic("lastUpdatedAt")(lastUpdatedAt)
    if (name != null) __obj.updateDynamic("name")(name)
    if (revisionId != null) __obj.updateDynamic("revisionId")(revisionId)
    if (robotSoftwareSuite != null) __obj.updateDynamic("robotSoftwareSuite")(robotSoftwareSuite)
    if (sources != null) __obj.updateDynamic("sources")(sources)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[UpdateRobotApplicationResponse]
  }
}

