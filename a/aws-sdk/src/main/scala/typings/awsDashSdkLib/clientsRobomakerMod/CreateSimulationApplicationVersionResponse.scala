package typings
package awsDashSdkLib.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSimulationApplicationVersionResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the simulation application.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  /**
    * The time, in milliseconds since the epoch, when the simulation application was last updated.
    */
  var lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined
  /**
    * The name of the simulation application.
    */
  var name: js.UndefOr[Name] = js.undefined
  /**
    * The rendering engine for the simulation application.
    */
  var renderingEngine: js.UndefOr[RenderingEngine] = js.undefined
  /**
    * The revision ID of the simulation application.
    */
  var revisionId: js.UndefOr[RevisionId] = js.undefined
  /**
    * Information about the robot software suite.
    */
  var robotSoftwareSuite: js.UndefOr[RobotSoftwareSuite] = js.undefined
  /**
    * The simulation software suite used by the simulation application.
    */
  var simulationSoftwareSuite: js.UndefOr[SimulationSoftwareSuite] = js.undefined
  /**
    * The sources of the simulation application.
    */
  var sources: js.UndefOr[Sources] = js.undefined
  /**
    * The version of the simulation application.
    */
  var version: js.UndefOr[Version] = js.undefined
}

object CreateSimulationApplicationVersionResponse {
  @scala.inline
  def apply(
    arn: Arn = null,
    lastUpdatedAt: LastUpdatedAt = null,
    name: Name = null,
    renderingEngine: RenderingEngine = null,
    revisionId: RevisionId = null,
    robotSoftwareSuite: RobotSoftwareSuite = null,
    simulationSoftwareSuite: SimulationSoftwareSuite = null,
    sources: Sources = null,
    version: Version = null
  ): CreateSimulationApplicationVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (lastUpdatedAt != null) __obj.updateDynamic("lastUpdatedAt")(lastUpdatedAt)
    if (name != null) __obj.updateDynamic("name")(name)
    if (renderingEngine != null) __obj.updateDynamic("renderingEngine")(renderingEngine)
    if (revisionId != null) __obj.updateDynamic("revisionId")(revisionId)
    if (robotSoftwareSuite != null) __obj.updateDynamic("robotSoftwareSuite")(robotSoftwareSuite)
    if (simulationSoftwareSuite != null) __obj.updateDynamic("simulationSoftwareSuite")(simulationSoftwareSuite)
    if (sources != null) __obj.updateDynamic("sources")(sources)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[CreateSimulationApplicationVersionResponse]
  }
}

