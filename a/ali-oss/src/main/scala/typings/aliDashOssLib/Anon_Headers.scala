package typings
package aliDashOssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Headers extends js.Object {
  var headers: js.Object
  var rt: scala.Double
  var size: scala.Double
  var status: scala.Double
}

object Anon_Headers {
  @scala.inline
  def apply(headers: js.Object, rt: scala.Double, size: scala.Double, status: scala.Double): Anon_Headers = {
    val __obj = js.Dynamic.literal(headers = headers, rt = rt, size = size, status = status)
  
    __obj.asInstanceOf[Anon_Headers]
  }
}

