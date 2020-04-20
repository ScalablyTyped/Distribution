package typings.asyncblock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey extends js.Object {
  var key: js.Any
  var runtime: Double
}

object AnonKey {
  @scala.inline
  def apply(key: js.Any, runtime: Double): AnonKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKey]
  }
}

