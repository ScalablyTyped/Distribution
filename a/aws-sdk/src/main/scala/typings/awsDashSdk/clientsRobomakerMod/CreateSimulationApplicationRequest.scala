package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSimulationApplicationRequest extends js.Object {
  /**
    * The name of the simulation application.
    */
  var name: Name = js.native
  /**
    * The rendering engine for the simulation application.
    */
  var renderingEngine: js.UndefOr[RenderingEngine] = js.native
  /**
    * The robot software suite of the simulation application.
    */
  var robotSoftwareSuite: RobotSoftwareSuite = js.native
  /**
    * The simulation software suite used by the simulation application.
    */
  var simulationSoftwareSuite: SimulationSoftwareSuite = js.native
  /**
    * The sources of the simulation application.
    */
  var sources: SourceConfigs = js.native
  /**
    * A map that contains tag keys and tag values that are attached to the simulation application.
    */
  var tags: js.UndefOr[TagMap] = js.native
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
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], robotSoftwareSuite = robotSoftwareSuite.asInstanceOf[js.Any], simulationSoftwareSuite = simulationSoftwareSuite.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
    if (renderingEngine != null) __obj.updateDynamic("renderingEngine")(renderingEngine.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSimulationApplicationRequest]
  }
}

