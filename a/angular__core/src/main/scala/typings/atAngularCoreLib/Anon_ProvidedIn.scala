package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ProvidedIn extends js.Object {
  var providedIn: atAngularCoreLib.atAngularCoreMod.Type[_] | atAngularCoreLib.atAngularCoreLibStrings.root | scala.Null
}

object Anon_ProvidedIn {
  @scala.inline
  def apply(
    providedIn: atAngularCoreLib.atAngularCoreMod.Type[_] | atAngularCoreLib.atAngularCoreLibStrings.root = null
  ): Anon_ProvidedIn = {
    val __obj = js.Dynamic.literal()
    if (providedIn != null) __obj.updateDynamic("providedIn")(providedIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ProvidedIn]
  }
}

