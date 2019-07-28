package typings.atAngularCore

import typings.atAngularCore.atAngularCoreMod.Type
import typings.atAngularCore.atAngularCoreStrings.root
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ProvidedIn extends js.Object {
  var providedIn: Type[_] | root | Null
}

object Anon_ProvidedIn {
  @scala.inline
  def apply(providedIn: Type[_] | root = null): Anon_ProvidedIn = {
    val __obj = js.Dynamic.literal()
    if (providedIn != null) __obj.updateDynamic("providedIn")(providedIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ProvidedIn]
  }
}

