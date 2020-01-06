package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessingResources extends js.Object {
  /**
    * The configuration for the resources in a cluster used to run the processing job.
    */
  var ClusterConfig: ProcessingClusterConfig = js.native
}

object ProcessingResources {
  @scala.inline
  def apply(ClusterConfig: ProcessingClusterConfig): ProcessingResources = {
    val __obj = js.Dynamic.literal(ClusterConfig = ClusterConfig.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProcessingResources]
  }
}

