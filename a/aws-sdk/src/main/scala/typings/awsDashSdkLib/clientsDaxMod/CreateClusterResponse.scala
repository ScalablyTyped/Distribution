package typings
package awsDashSdkLib.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateClusterResponse extends js.Object {
  /**
    * A description of the DAX cluster that you have created.
    */
  var Cluster: js.UndefOr[Cluster] = js.undefined
}

object CreateClusterResponse {
  @scala.inline
  def apply(Cluster: Cluster = null): CreateClusterResponse = {
    val __obj = js.Dynamic.literal()
    if (Cluster != null) __obj.updateDynamic("Cluster")(Cluster)
    __obj.asInstanceOf[CreateClusterResponse]
  }
}

