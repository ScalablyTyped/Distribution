package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeClustersResponse extends js.Object {
  /**
    * The list of clusters.
    */
  var clusters: js.UndefOr[Clusters] = js.undefined
  /**
    * Any failures associated with the call.
    */
  var failures: js.UndefOr[Failures] = js.undefined
}

object DescribeClustersResponse {
  @scala.inline
  def apply(clusters: Clusters = null, failures: Failures = null): DescribeClustersResponse = {
    val __obj = js.Dynamic.literal()
    if (clusters != null) __obj.updateDynamic("clusters")(clusters)
    if (failures != null) __obj.updateDynamic("failures")(failures)
    __obj.asInstanceOf[DescribeClustersResponse]
  }
}

