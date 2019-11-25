package typings.atAngularCore

import typings.atAngularCore.atAngularCoreMod.Type
import typings.atAngularCore.atAngularCoreStrings.any
import typings.atAngularCore.atAngularCoreStrings.root
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Any[T] extends js.Object {
  var providedIn: js.UndefOr[Type[_] | root | any | Null] = js.undefined
  var token: js.Any
  def factory(): T
}

object Anon_Any {
  @scala.inline
  def apply[T](factory: () => T, token: js.Any, providedIn: Type[_] | root | any = null): Anon_Any[T] = {
    val __obj = js.Dynamic.literal(factory = js.Any.fromFunction0(factory), token = token.asInstanceOf[js.Any])
    if (providedIn != null) __obj.updateDynamic("providedIn")(providedIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Any[T]]
  }
}

