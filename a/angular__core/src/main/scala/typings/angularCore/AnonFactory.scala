package typings.angularCore

import typings.angularCore.angularCoreStrings.any
import typings.angularCore.angularCoreStrings.platform
import typings.angularCore.angularCoreStrings.root
import typings.angularCore.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFactory[T] extends js.Object {
  var providedIn: js.UndefOr[Type[_] | root | platform | any | Null] = js.undefined
  var token: js.Any
  def factory(): T
}

object AnonFactory {
  @scala.inline
  def apply[T](factory: () => T, token: js.Any, providedIn: Type[_] | root | platform | any = null): AnonFactory[T] = {
    val __obj = js.Dynamic.literal(factory = js.Any.fromFunction0(factory), token = token.asInstanceOf[js.Any])
    if (providedIn != null) __obj.updateDynamic("providedIn")(providedIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFactory[T]]
  }
}

