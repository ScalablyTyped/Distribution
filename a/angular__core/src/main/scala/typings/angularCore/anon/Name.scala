package typings.angularCore.anon

import typings.angularCore.mod.Injector
import typings.angularCore.mod.StaticProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var parent: js.UndefOr[Injector] = js.undefined
  var providers: js.Array[StaticProvider]
}

object Name {
  @scala.inline
  def apply(providers: js.Array[StaticProvider], name: String = null, parent: Injector = null): Name = {
    val __obj = js.Dynamic.literal(providers = providers.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

