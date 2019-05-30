package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Any[T] extends js.Object {
  var providedIn: js.UndefOr[
    atAngularCoreLib.atAngularCoreMod.Type[_] | atAngularCoreLib.atAngularCoreLibStrings.root | atAngularCoreLib.atAngularCoreLibStrings.any | scala.Null
  ] = js.undefined
  def factory(): T
}

object Anon_Any {
  @scala.inline
  def apply[T](
    factory: () => T,
    providedIn: atAngularCoreLib.atAngularCoreMod.Type[_] | atAngularCoreLib.atAngularCoreLibStrings.root | atAngularCoreLib.atAngularCoreLibStrings.any = null
  ): Anon_Any[T] = {
    val __obj = js.Dynamic.literal(factory = js.Any.fromFunction0(factory))
    if (providedIn != null) __obj.updateDynamic("providedIn")(providedIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Any[T]]
  }
}

