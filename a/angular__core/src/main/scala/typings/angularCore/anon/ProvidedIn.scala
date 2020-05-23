package typings.angularCore.anon

import typings.angularCore.angularCoreStrings.any
import typings.angularCore.angularCoreStrings.platform
import typings.angularCore.angularCoreStrings.root
import typings.angularCore.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProvidedIn extends js.Object {
  var providedIn: Type[_] | root | platform | any | Null
}

object ProvidedIn {
  @scala.inline
  def apply(providedIn: Type[_] | root | platform | any = null): ProvidedIn = {
    val __obj = js.Dynamic.literal(providedIn = providedIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvidedIn]
  }
}

