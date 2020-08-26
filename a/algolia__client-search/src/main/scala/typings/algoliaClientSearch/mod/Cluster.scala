package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cluster extends js.Object {
  /**
    * The cluster name
    */
  val clusterName: String = js.native
  /**
    * Data size taken by all the users assigned to the cluster.
    */
  val dataSize: Double = js.native
  /**
    * Number of records in the cluster.
    */
  val nbRecords: Double = js.native
  /**
    * Number of users assign to the cluster.
    */
  val nbUserIDs: Double = js.native
}

object Cluster {
  @scala.inline
  def apply(clusterName: String, dataSize: Double, nbRecords: Double, nbUserIDs: Double): Cluster = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], dataSize = dataSize.asInstanceOf[js.Any], nbRecords = nbRecords.asInstanceOf[js.Any], nbUserIDs = nbUserIDs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cluster]
  }
  @scala.inline
  implicit class ClusterOps[Self <: Cluster] (val x: Self) extends AnyVal {
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
    def setClusterName(value: String): Self = this.set("clusterName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataSize(value: Double): Self = this.set("dataSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setNbRecords(value: Double): Self = this.set("nbRecords", value.asInstanceOf[js.Any])
    @scala.inline
    def setNbUserIDs(value: Double): Self = this.set("nbUserIDs", value.asInstanceOf[js.Any])
  }
  
}

