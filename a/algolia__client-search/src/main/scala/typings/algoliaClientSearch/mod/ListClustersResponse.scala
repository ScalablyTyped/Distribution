package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListClustersResponse extends js.Object {
  /**
    * List of clusters.
    */
  val clusters: js.Array[Cluster]
}

object ListClustersResponse {
  @scala.inline
  def apply(clusters: js.Array[Cluster]): ListClustersResponse = {
    val __obj = js.Dynamic.literal(clusters = clusters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListClustersResponse]
  }
}

