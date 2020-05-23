package typings.aliOss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Headers extends js.Object {
  var headers: js.Object
  var rt: Double
  var size: Double
  var status: Double
}

object Headers {
  @scala.inline
  def apply(headers: js.Object, rt: Double, size: Double, status: Double): Headers = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], rt = rt.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers]
  }
}

