package typings.atAngularCore

import typings.atAngularCore.atAngularCoreMod.Type
import typings.atAngularCore.atAngularCoreStrings.root
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Factory[T] extends js.Object {
  var providedIn: js.UndefOr[Type[_] | root | Null] = js.undefined
  def factory(): T
}

object Anon_Factory {
  @scala.inline
  def apply[T](factory: () => T, providedIn: Type[_] | root = null): Anon_Factory[T] = {
    val __obj = js.Dynamic.literal(factory = js.Any.fromFunction0(factory))
    if (providedIn != null) __obj.updateDynamic("providedIn")(providedIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Factory[T]]
  }
}

