package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMode extends js.Object {
  var mode: String
  var reverse: Boolean
}

object AnonMode {
  @scala.inline
  def apply(mode: String, reverse: Boolean): AnonMode = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMode]
  }
}

