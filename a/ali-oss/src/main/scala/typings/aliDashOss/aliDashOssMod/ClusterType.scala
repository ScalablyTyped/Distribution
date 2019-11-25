package typings.aliDashOss.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterType extends js.Object {
  var accessKeyId: String
  var accessKeySecret: String
  var host: String
}

object ClusterType {
  @scala.inline
  def apply(accessKeyId: String, accessKeySecret: String, host: String): ClusterType = {
    val __obj = js.Dynamic.literal(accessKeyId = accessKeyId.asInstanceOf[js.Any], accessKeySecret = accessKeySecret.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClusterType]
  }
}

