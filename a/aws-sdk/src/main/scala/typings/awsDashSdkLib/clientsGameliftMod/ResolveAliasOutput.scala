package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveAliasOutput extends js.Object {
  /**
    * Fleet identifier that is associated with the requested alias.
    */
  var FleetId: js.UndefOr[FleetId] = js.undefined
}

object ResolveAliasOutput {
  @scala.inline
  def apply(FleetId: FleetId = null): ResolveAliasOutput = {
    val __obj = js.Dynamic.literal()
    if (FleetId != null) __obj.updateDynamic("FleetId")(FleetId)
    __obj.asInstanceOf[ResolveAliasOutput]
  }
}

