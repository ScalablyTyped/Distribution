package typings
package awsDashSdkLib.clientsSnowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateClusterResult extends js.Object {
  /**
    * The automatically generated ID for a cluster.
    */
  var ClusterId: js.UndefOr[ClusterId] = js.undefined
}

object CreateClusterResult {
  @scala.inline
  def apply(ClusterId: ClusterId = null): CreateClusterResult = {
    val __obj = js.Dynamic.literal()
    if (ClusterId != null) __obj.updateDynamic("ClusterId")(ClusterId)
    __obj.asInstanceOf[CreateClusterResult]
  }
}

