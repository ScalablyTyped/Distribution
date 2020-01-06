package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitoringResources extends js.Object {
  /**
    * The configuration for the cluster resources used to run the processing job.
    */
  var ClusterConfig: MonitoringClusterConfig = js.native
}

object MonitoringResources {
  @scala.inline
  def apply(ClusterConfig: MonitoringClusterConfig): MonitoringResources = {
    val __obj = js.Dynamic.literal(ClusterConfig = ClusterConfig.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MonitoringResources]
  }
}

