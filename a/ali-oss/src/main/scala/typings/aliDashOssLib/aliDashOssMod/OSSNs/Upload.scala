package typings
package aliDashOssLib.aliDashOssMod.OSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Upload extends js.Object {
  var initiated: js.Any
  var name: java.lang.String
  var uploadId: java.lang.String
}

object Upload {
  @scala.inline
  def apply(initiated: js.Any, name: java.lang.String, uploadId: java.lang.String): Upload = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("initiated")(initiated)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("uploadId")(uploadId)
    __obj.asInstanceOf[Upload]
  }
}

