package typings.atAngularCore

import typings.atAngularCore.atAngularCoreMod.Injector
import typings.atAngularCore.atAngularCoreMod.StaticProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var parent: js.UndefOr[Injector] = js.undefined
  var providers: js.Array[StaticProvider]
}

object Anon_Name {
  @scala.inline
  def apply(providers: js.Array[StaticProvider], name: String = null, parent: Injector = null): Anon_Name = {
    val __obj = js.Dynamic.literal(providers = providers)
    if (name != null) __obj.updateDynamic("name")(name)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[Anon_Name]
  }
}

