package typings
package awsDashSdkLib.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimulationApplicationSummary extends js.Object {
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
    * The version of the simulation application.
    */
  var version: js.UndefOr[Version] = js.undefined
}

object SimulationApplicationSummary {
  @scala.inline
  def apply(arn: Arn = null, lastUpdatedAt: LastUpdatedAt = null, name: Name = null, version: Version = null): SimulationApplicationSummary = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (lastUpdatedAt != null) __obj.updateDynamic("lastUpdatedAt")(lastUpdatedAt)
    if (name != null) __obj.updateDynamic("name")(name)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[SimulationApplicationSummary]
  }
}

