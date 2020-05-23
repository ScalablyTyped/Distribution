package typings.angularCore.anon

import typings.angularCore.angularCoreStrings.any
import typings.angularCore.angularCoreStrings.platform
import typings.angularCore.angularCoreStrings.root
import typings.angularCore.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FactoryProvidedIn[T] extends js.Object {
  var providedIn: js.UndefOr[Type[_] | root | platform | any | Null] = js.undefined
  def factory(): T
}

object FactoryProvidedIn {
  @scala.inline
  def apply[T](factory: () => T, providedIn: js.UndefOr[Null | Type[_] | root | platform | any] = js.undefined): FactoryProvidedIn[T] = {
    val __obj = js.Dynamic.literal(factory = js.Any.fromFunction0(factory))
    if (!js.isUndefined(providedIn)) __obj.updateDynamic("providedIn")(providedIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[FactoryProvidedIn[T]]
  }
}

