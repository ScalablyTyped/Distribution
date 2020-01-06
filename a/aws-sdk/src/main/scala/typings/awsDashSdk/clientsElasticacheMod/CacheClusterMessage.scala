package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheClusterMessage extends js.Object {
  /**
    * A list of clusters. Each item in the list contains detailed information about one cluster.
    */
  var CacheClusters: js.UndefOr[CacheClusterList] = js.native
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var Marker: js.UndefOr[String] = js.native
}

object CacheClusterMessage {
  @scala.inline
  def apply(CacheClusters: CacheClusterList = null, Marker: String = null): CacheClusterMessage = {
    val __obj = js.Dynamic.literal()
    if (CacheClusters != null) __obj.updateDynamic("CacheClusters")(CacheClusters.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheClusterMessage]
  }
}

