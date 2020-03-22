package typings.angularCore

import typings.angularCore.angularCoreStrings.any
import typings.angularCore.angularCoreStrings.platform
import typings.angularCore.angularCoreStrings.root
import typings.angularCore.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProvidedIn extends js.Object {
  var providedIn: Type[_] | root | platform | any | Null
}

object AnonProvidedIn {
  @scala.inline
  def apply(providedIn: Type[_] | root | platform | any = null): AnonProvidedIn = {
    val __obj = js.Dynamic.literal()
    if (providedIn != null) __obj.updateDynamic("providedIn")(providedIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProvidedIn]
  }
}

