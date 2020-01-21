package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeshSpec extends js.Object {
  /**
    * The egress filter rules for the service mesh.
    */
  var egressFilter: js.UndefOr[EgressFilter] = js.native
}

object MeshSpec {
  @scala.inline
  def apply(egressFilter: EgressFilter = null): MeshSpec = {
    val __obj = js.Dynamic.literal()
    if (egressFilter != null) __obj.updateDynamic("egressFilter")(egressFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshSpec]
  }
}

