package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Factory[T] extends js.Object {
  var providedIn: js.UndefOr[
    atAngularCoreLib.atAngularCoreMod.Type[_] | atAngularCoreLib.atAngularCoreLibStrings.root | scala.Null
  ] = js.undefined
  def factory(): T
}

object Anon_Factory {
  @scala.inline
  def apply[T](
    factory: () => T,
    providedIn: atAngularCoreLib.atAngularCoreMod.Type[_] | atAngularCoreLib.atAngularCoreLibStrings.root = null
  ): Anon_Factory[T] = {
    val __obj = js.Dynamic.literal(factory = js.Any.fromFunction0(factory))
    if (providedIn != null) __obj.updateDynamic("providedIn")(providedIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Factory[T]]
  }
}

