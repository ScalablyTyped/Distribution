package typings
package awsDashSdkLib.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListClustersOutput extends js.Object {
  /**
    * The list of clusters for the account based on the given filters.
    */
  var Clusters: js.UndefOr[ClusterSummaryList] = js.undefined
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[Marker] = js.undefined
}

object ListClustersOutput {
  @scala.inline
  def apply(Clusters: ClusterSummaryList = null, Marker: Marker = null): ListClustersOutput = {
    val __obj = js.Dynamic.literal()
    if (Clusters != null) __obj.updateDynamic("Clusters")(Clusters)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[ListClustersOutput]
  }
}

