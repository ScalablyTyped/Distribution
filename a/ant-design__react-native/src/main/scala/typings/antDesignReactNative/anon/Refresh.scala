package typings.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Refresh extends js.Object {
  def refresh(): Unit
}

object Refresh {
  @scala.inline
  def apply(refresh: () => Unit): Refresh = {
    val __obj = js.Dynamic.literal(refresh = js.Any.fromFunction0(refresh))
    __obj.asInstanceOf[Refresh]
  }
}

