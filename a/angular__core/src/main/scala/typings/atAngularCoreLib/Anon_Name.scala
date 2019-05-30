package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var parent: js.UndefOr[atAngularCoreLib.atAngularCoreMod.Injector] = js.undefined
  var providers: js.Array[atAngularCoreLib.atAngularCoreMod.StaticProvider]
}

object Anon_Name {
  @scala.inline
  def apply(
    providers: js.Array[atAngularCoreLib.atAngularCoreMod.StaticProvider],
    name: java.lang.String = null,
    parent: atAngularCoreLib.atAngularCoreMod.Injector = null
  ): Anon_Name = {
    val __obj = js.Dynamic.literal(providers = providers)
    if (name != null) __obj.updateDynamic("name")(name)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[Anon_Name]
  }
}

