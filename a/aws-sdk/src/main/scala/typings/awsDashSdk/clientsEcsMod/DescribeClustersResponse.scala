package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeClustersResponse extends js.Object {
  /**
    * The list of clusters.
    */
  var clusters: js.UndefOr[Clusters] = js.native
  /**
    * Any failures associated with the call.
    */
  var failures: js.UndefOr[Failures] = js.native
}

object DescribeClustersResponse {
  @scala.inline
  def apply(clusters: Clusters = null, failures: Failures = null): DescribeClustersResponse = {
    val __obj = js.Dynamic.literal()
    if (clusters != null) __obj.updateDynamic("clusters")(clusters.asInstanceOf[js.Any])
    if (failures != null) __obj.updateDynamic("failures")(failures.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeClustersResponse]
  }
}

