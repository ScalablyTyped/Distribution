package typings.antd.libAlertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertState extends js.Object {
  var closed: Boolean
  var closing: Boolean
}

object AlertState {
  @scala.inline
  def apply(closed: Boolean, closing: Boolean): AlertState = {
    val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], closing = closing.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AlertState]
  }
}

