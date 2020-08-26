package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterType extends js.Object {
  var accessKeyId: String = js.native
  var accessKeySecret: String = js.native
  var host: String = js.native
}

object ClusterType {
  @scala.inline
  def apply(accessKeyId: String, accessKeySecret: String, host: String): ClusterType = {
    val __obj = js.Dynamic.literal(accessKeyId = accessKeyId.asInstanceOf[js.Any], accessKeySecret = accessKeySecret.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterType]
  }
  @scala.inline
  implicit class ClusterTypeOps[Self <: ClusterType] (val x: Self) extends AnyVal {
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
    def setAccessKeyId(value: String): Self = this.set("accessKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessKeySecret(value: String): Self = this.set("accessKeySecret", value.asInstanceOf[js.Any])
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
  }
  
}

