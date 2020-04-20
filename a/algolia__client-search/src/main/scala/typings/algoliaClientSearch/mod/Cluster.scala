package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cluster extends js.Object {
  /**
    * The cluster name
    */
  val clusterName: String
  /**
    * Data size taken by all the users assigned to the cluster.
    */
  val dataSize: Double
  /**
    * Number of records in the cluster.
    */
  val nbRecords: Double
  /**
    * Number of users assign to the cluster.
    */
  val nbUserIDs: Double
}

object Cluster {
  @scala.inline
  def apply(clusterName: String, dataSize: Double, nbRecords: Double, nbUserIDs: Double): Cluster = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], dataSize = dataSize.asInstanceOf[js.Any], nbRecords = nbRecords.asInstanceOf[js.Any], nbUserIDs = nbUserIDs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cluster]
  }
}

