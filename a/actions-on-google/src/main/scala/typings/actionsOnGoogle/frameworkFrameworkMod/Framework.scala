package typings.actionsOnGoogle.frameworkFrameworkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Framework[THandler] extends js.Object {
  /** @public */
  def check(args: js.Any*): Boolean
  /** @public */
  def handle(base: StandardHandler): THandler
}

object Framework {
  @scala.inline
  def apply[THandler](check: /* repeated */ js.Any => Boolean, handle: StandardHandler => THandler): Framework[THandler] = {
    val __obj = js.Dynamic.literal(check = js.Any.fromFunction1(check), handle = js.Any.fromFunction1(handle))
  
    __obj.asInstanceOf[Framework[THandler]]
  }
}

