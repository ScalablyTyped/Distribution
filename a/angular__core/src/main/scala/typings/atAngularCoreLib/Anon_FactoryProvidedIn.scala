package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FactoryProvidedIn[T] extends js.Object {
  var providedIn: js.UndefOr[
    atAngularCoreLib.srcTypeMod.Type[_] | atAngularCoreLib.atAngularCoreLibStrings.root | scala.Null
  ] = js.undefined
  def factory(): T
}

object Anon_FactoryProvidedIn {
  @scala.inline
  def apply[T](
    factory: () => T,
    providedIn: atAngularCoreLib.srcTypeMod.Type[_] | atAngularCoreLib.atAngularCoreLibStrings.root = null
  ): Anon_FactoryProvidedIn[T] = {
    val __obj = js.Dynamic.literal(factory = js.Any.fromFunction0(factory))
    if (providedIn != null) __obj.updateDynamic("providedIn")(providedIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FactoryProvidedIn[T]]
  }
}

