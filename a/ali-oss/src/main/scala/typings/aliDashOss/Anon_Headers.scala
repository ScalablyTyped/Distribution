package typings.aliDashOss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Headers extends js.Object {
  var headers: js.Object
  var rt: Double
  var size: Double
  var status: Double
}

object Anon_Headers {
  @scala.inline
  def apply(headers: js.Object, rt: Double, size: Double, status: Double): Anon_Headers = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], rt = rt.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Headers]
  }
}

