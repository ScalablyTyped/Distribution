package typings.atAngularCompiler.srcCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleWithProviders extends js.Object {
  var ngModule: Type
  var providers: js.UndefOr[js.Array[Provider]] = js.undefined
}

object ModuleWithProviders {
  @scala.inline
  def apply(ngModule: Type, providers: js.Array[Provider] = null): ModuleWithProviders = {
    val __obj = js.Dynamic.literal(ngModule = ngModule)
    if (providers != null) __obj.updateDynamic("providers")(providers)
    __obj.asInstanceOf[ModuleWithProviders]
  }
}

