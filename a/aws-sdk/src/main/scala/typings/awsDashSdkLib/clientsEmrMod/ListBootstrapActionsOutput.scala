package typings
package awsDashSdkLib.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBootstrapActionsOutput extends js.Object {
  /**
    * The bootstrap actions associated with the cluster.
    */
  var BootstrapActions: js.UndefOr[CommandList] = js.undefined
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[Marker] = js.undefined
}

object ListBootstrapActionsOutput {
  @scala.inline
  def apply(BootstrapActions: CommandList = null, Marker: Marker = null): ListBootstrapActionsOutput = {
    val __obj = js.Dynamic.literal()
    if (BootstrapActions != null) __obj.updateDynamic("BootstrapActions")(BootstrapActions)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[ListBootstrapActionsOutput]
  }
}

