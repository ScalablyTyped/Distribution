package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSimulationApplicationRequest extends js.Object {
  /**
    * The application information for the simulation application.
    */
  var application: Arn
  /**
    * The revision id for the robot application.
    */
  var currentRevisionId: js.UndefOr[RevisionId] = js.undefined
  /**
    * The rendering engine for the simulation application.
    */
  var renderingEngine: js.UndefOr[RenderingEngine] = js.undefined
  /**
    * Information about the robot software suite.
    */
  var robotSoftwareSuite: RobotSoftwareSuite
  /**
    * The simulation software suite used by the simulation application.
    */
  var simulationSoftwareSuite: SimulationSoftwareSuite
  /**
    * The sources of the simulation application.
    */
  var sources: SourceConfigs
}

object UpdateSimulationApplicationRequest {
  @scala.inline
  def apply(
    application: Arn,
    robotSoftwareSuite: RobotSoftwareSuite,
    simulationSoftwareSuite: SimulationSoftwareSuite,
    sources: SourceConfigs,
    currentRevisionId: RevisionId = null,
    renderingEngine: RenderingEngine = null
  ): UpdateSimulationApplicationRequest = {
    val __obj = js.Dynamic.literal(application = application, robotSoftwareSuite = robotSoftwareSuite, simulationSoftwareSuite = simulationSoftwareSuite, sources = sources)
    if (currentRevisionId != null) __obj.updateDynamic("currentRevisionId")(currentRevisionId)
    if (renderingEngine != null) __obj.updateDynamic("renderingEngine")(renderingEngine)
    __obj.asInstanceOf[UpdateSimulationApplicationRequest]
  }
}

