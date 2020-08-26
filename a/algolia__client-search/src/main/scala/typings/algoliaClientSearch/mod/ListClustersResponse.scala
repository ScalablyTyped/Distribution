package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListClustersResponse extends js.Object {
  /**
    * List of clusters.
    */
  var clusters: js.Array[Cluster] = js.native
}

object ListClustersResponse {
  @scala.inline
  def apply(clusters: js.Array[Cluster]): ListClustersResponse = {
    val __obj = js.Dynamic.literal(clusters = clusters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListClustersResponse]
  }
  @scala.inline
  implicit class ListClustersResponseOps[Self <: ListClustersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClustersVarargs(value: Cluster*): Self = this.set("clusters", js.Array(value :_*))
    @scala.inline
    def setClusters(value: js.Array[Cluster]): Self = this.set("clusters", value.asInstanceOf[js.Any])
  }
  
}

