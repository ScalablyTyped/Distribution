package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSimulationApplicationRequest extends js.Object {
  /**
    * The name of the simulation application.
    */
  var name: Name
  /**
    * The rendering engine for the simulation application.
    */
  var renderingEngine: js.UndefOr[RenderingEngine] = js.undefined
  /**
    * The robot software suite of the simulation application.
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
  /**
    * A map that contains tag keys and tag values that are attached to the simulation application.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}

object CreateSimulationApplicationRequest {
  @scala.inline
  def apply(
    name: Name,
    robotSoftwareSuite: RobotSoftwareSuite,
    simulationSoftwareSuite: SimulationSoftwareSuite,
    sources: SourceConfigs,
    renderingEngine: RenderingEngine = null,
    tags: TagMap = null
  ): CreateSimulationApplicationRequest = {
    val __obj = js.Dynamic.literal(name = name, robotSoftwareSuite = robotSoftwareSuite, simulationSoftwareSuite = simulationSoftwareSuite, sources = sources)
    if (renderingEngine != null) __obj.updateDynamic("renderingEngine")(renderingEngine)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreateSimulationApplicationRequest]
  }
}

