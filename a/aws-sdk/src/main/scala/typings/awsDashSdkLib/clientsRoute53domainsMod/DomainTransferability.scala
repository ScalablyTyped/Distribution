package typings
package awsDashSdkLib.clientsRoute53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainTransferability extends js.Object {
  var Transferable: js.UndefOr[Transferable] = js.undefined
}

object DomainTransferability {
  @scala.inline
  def apply(Transferable: Transferable = null): DomainTransferability = {
    val __obj = js.Dynamic.literal()
    if (Transferable != null) __obj.updateDynamic("Transferable")(Transferable.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainTransferability]
  }
}

