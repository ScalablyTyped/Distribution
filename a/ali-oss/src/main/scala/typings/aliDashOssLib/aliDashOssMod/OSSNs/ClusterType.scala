package typings
package aliDashOssLib.aliDashOssMod.OSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterType extends js.Object {
  var accessKeyId: java.lang.String
  var accessKeySecret: java.lang.String
  var host: java.lang.String
}

object ClusterType {
  @scala.inline
  def apply(accessKeyId: java.lang.String, accessKeySecret: java.lang.String, host: java.lang.String): ClusterType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accessKeyId")(accessKeyId)
    __obj.updateDynamic("accessKeySecret")(accessKeySecret)
    __obj.updateDynamic("host")(host)
    __obj.asInstanceOf[ClusterType]
  }
}

