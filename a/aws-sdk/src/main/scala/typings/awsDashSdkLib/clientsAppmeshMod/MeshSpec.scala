package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshSpec extends js.Object {
  /**
    * The egress filter rules for the service mesh.
    */
  var egressFilter: js.UndefOr[EgressFilter] = js.undefined
}

object MeshSpec {
  @scala.inline
  def apply(egressFilter: EgressFilter = null): MeshSpec = {
    val __obj = js.Dynamic.literal()
    if (egressFilter != null) __obj.updateDynamic("egressFilter")(egressFilter)
    __obj.asInstanceOf[MeshSpec]
  }
}

