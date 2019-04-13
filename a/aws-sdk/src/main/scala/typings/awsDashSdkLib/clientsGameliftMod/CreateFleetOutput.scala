package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFleetOutput extends js.Object {
  /**
    * Properties for the newly created fleet.
    */
  var FleetAttributes: js.UndefOr[FleetAttributes] = js.undefined
}

object CreateFleetOutput {
  @scala.inline
  def apply(FleetAttributes: FleetAttributes = null): CreateFleetOutput = {
    val __obj = js.Dynamic.literal()
    if (FleetAttributes != null) __obj.updateDynamic("FleetAttributes")(FleetAttributes)
    __obj.asInstanceOf[CreateFleetOutput]
  }
}

