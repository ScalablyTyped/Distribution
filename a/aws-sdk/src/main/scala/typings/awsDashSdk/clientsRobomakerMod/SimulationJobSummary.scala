package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimulationJobSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the simulation job.
    */
  var arn: js.UndefOr[Arn] = js.native
  /**
    * The names of the data sources.
    */
  var dataSourceNames: js.UndefOr[DataSourceNames] = js.native
  /**
    * The time, in milliseconds since the epoch, when the simulation job was last updated.
    */
  var lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.native
  /**
    * The name of the simulation job.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * A list of simulation job robot application names.
    */
  var robotApplicationNames: js.UndefOr[RobotApplicationNames] = js.native
  /**
    * A list of simulation job simulation application names.
    */
  var simulationApplicationNames: js.UndefOr[SimulationApplicationNames] = js.native
  /**
    * The status of the simulation job.
    */
  var status: js.UndefOr[SimulationJobStatus] = js.native
}

object SimulationJobSummary {
  @scala.inline
  def apply(
    arn: Arn = null,
    dataSourceNames: DataSourceNames = null,
    lastUpdatedAt: LastUpdatedAt = null,
    name: Name = null,
    robotApplicationNames: RobotApplicationNames = null,
    simulationApplicationNames: SimulationApplicationNames = null,
    status: SimulationJobStatus = null
  ): SimulationJobSummary = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (dataSourceNames != null) __obj.updateDynamic("dataSourceNames")(dataSourceNames.asInstanceOf[js.Any])
    if (lastUpdatedAt != null) __obj.updateDynamic("lastUpdatedAt")(lastUpdatedAt.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (robotApplicationNames != null) __obj.updateDynamic("robotApplicationNames")(robotApplicationNames.asInstanceOf[js.Any])
    if (simulationApplicationNames != null) __obj.updateDynamic("simulationApplicationNames")(simulationApplicationNames.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimulationJobSummary]
  }
}

