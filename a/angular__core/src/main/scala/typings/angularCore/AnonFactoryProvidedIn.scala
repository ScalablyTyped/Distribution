package typings.angularCore

import typings.angularCore.angularCoreStrings.any
import typings.angularCore.angularCoreStrings.platform
import typings.angularCore.angularCoreStrings.root
import typings.angularCore.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFactoryProvidedIn[T] extends js.Object {
  var providedIn: js.UndefOr[Type[_] | root | platform | any | Null] = js.undefined
  def factory(): T
}

object AnonFactoryProvidedIn {
  @scala.inline
  def apply[T](factory: () => T, providedIn: Type[_] | root | platform | any = null): AnonFactoryProvidedIn[T] = {
    val __obj = js.Dynamic.literal(factory = js.Any.fromFunction0(factory))
    if (providedIn != null) __obj.updateDynamic("providedIn")(providedIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFactoryProvidedIn[T]]
  }
}

