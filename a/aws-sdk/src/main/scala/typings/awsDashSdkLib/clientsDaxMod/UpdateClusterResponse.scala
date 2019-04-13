package typings
package awsDashSdkLib.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateClusterResponse extends js.Object {
  /**
    * A description of the DAX cluster, after it has been modified.
    */
  var Cluster: js.UndefOr[Cluster] = js.undefined
}

object UpdateClusterResponse {
  @scala.inline
  def apply(Cluster: Cluster = null): UpdateClusterResponse = {
    val __obj = js.Dynamic.literal()
    if (Cluster != null) __obj.updateDynamic("Cluster")(Cluster)
    __obj.asInstanceOf[UpdateClusterResponse]
  }
}

