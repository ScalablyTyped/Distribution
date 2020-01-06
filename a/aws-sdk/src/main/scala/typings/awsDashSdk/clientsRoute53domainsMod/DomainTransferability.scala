package typings.awsDashSdk.clientsRoute53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainTransferability extends js.Object {
  var Transferable: js.UndefOr[typings.awsDashSdk.clientsRoute53domainsMod.Transferable] = js.native
}

object DomainTransferability {
  @scala.inline
  def apply(Transferable: Transferable = null): DomainTransferability = {
    val __obj = js.Dynamic.literal()
    if (Transferable != null) __obj.updateDynamic("Transferable")(Transferable.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainTransferability]
  }
}

