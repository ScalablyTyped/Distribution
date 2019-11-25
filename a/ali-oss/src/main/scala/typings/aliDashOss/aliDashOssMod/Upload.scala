package typings.aliDashOss.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Upload extends js.Object {
  var initiated: js.Any
  var name: String
  var uploadId: String
}

object Upload {
  @scala.inline
  def apply(initiated: js.Any, name: String, uploadId: String): Upload = {
    val __obj = js.Dynamic.literal(initiated = initiated.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Upload]
  }
}

