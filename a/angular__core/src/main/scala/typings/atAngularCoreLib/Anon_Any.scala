package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Any[T] extends js.Object {
  var providedIn: js.UndefOr[
    atAngularCoreLib.srcTypeMod.Type[_] | atAngularCoreLib.atAngularCoreLibStrings.root | atAngularCoreLib.atAngularCoreLibStrings.any | scala.Null
  ] = js.undefined
  def factory(): T
}

object Anon_Any {
  @scala.inline
  def apply[T](
    factory: js.Function0[T],
    providedIn: atAngularCoreLib.srcTypeMod.Type[_] | atAngularCoreLib.atAngularCoreLibStrings.root | atAngularCoreLib.atAngularCoreLibStrings.any = null
  ): Anon_Any[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("factory")(factory)
    if (providedIn != null) __obj.updateDynamic("providedIn")(providedIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Any[T]]
  }
}

