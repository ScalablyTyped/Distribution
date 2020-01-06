package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBootstrapActionsOutput extends js.Object {
  /**
    * The bootstrap actions associated with the cluster.
    */
  var BootstrapActions: js.UndefOr[CommandList] = js.native
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[typings.awsDashSdk.clientsEmrMod.Marker] = js.native
}

object ListBootstrapActionsOutput {
  @scala.inline
  def apply(BootstrapActions: CommandList = null, Marker: Marker = null): ListBootstrapActionsOutput = {
    val __obj = js.Dynamic.literal()
    if (BootstrapActions != null) __obj.updateDynamic("BootstrapActions")(BootstrapActions.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBootstrapActionsOutput]
  }
}

