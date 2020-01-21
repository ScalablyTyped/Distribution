package typings.antDesignReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRefresh extends js.Object {
  def refresh(): Unit
}

object AnonRefresh {
  @scala.inline
  def apply(refresh: () => Unit): AnonRefresh = {
    val __obj = js.Dynamic.literal(refresh = js.Any.fromFunction0(refresh))
  
    __obj.asInstanceOf[AnonRefresh]
  }
}

