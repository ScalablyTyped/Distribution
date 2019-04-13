package typings
package awsDashSdkLib.clientsEksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logging extends js.Object {
  /**
    * The cluster control plane logging configuration for your cluster.
    */
  var clusterLogging: js.UndefOr[LogSetups] = js.undefined
}

object Logging {
  @scala.inline
  def apply(clusterLogging: LogSetups = null): Logging = {
    val __obj = js.Dynamic.literal()
    if (clusterLogging != null) __obj.updateDynamic("clusterLogging")(clusterLogging)
    __obj.asInstanceOf[Logging]
  }
}

