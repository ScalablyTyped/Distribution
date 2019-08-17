package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimulationJobSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the simulation job.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  /**
    * The names of the data sources.
    */
  var dataSourceNames: js.UndefOr[DataSourceNames] = js.undefined
  /**
    * The time, in milliseconds since the epoch, when the simulation job was last updated.
    */
  var lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined
  /**
    * The name of the simulation job.
    */
  var name: js.UndefOr[Name] = js.undefined
  /**
    * A list of simulation job robot application names.
    */
  var robotApplicationNames: js.UndefOr[RobotApplicationNames] = js.undefined
  /**
    * A list of simulation job simulation application names.
    */
  var simulationApplicationNames: js.UndefOr[SimulationApplicationNames] = js.undefined
  /**
    * The status of the simulation job.
    */
  var status: js.UndefOr[SimulationJobStatus] = js.undefined
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
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (dataSourceNames != null) __obj.updateDynamic("dataSourceNames")(dataSourceNames)
    if (lastUpdatedAt != null) __obj.updateDynamic("lastUpdatedAt")(lastUpdatedAt)
    if (name != null) __obj.updateDynamic("name")(name)
    if (robotApplicationNames != null) __obj.updateDynamic("robotApplicationNames")(robotApplicationNames)
    if (simulationApplicationNames != null) __obj.updateDynamic("simulationApplicationNames")(simulationApplicationNames)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimulationJobSummary]
  }
}

