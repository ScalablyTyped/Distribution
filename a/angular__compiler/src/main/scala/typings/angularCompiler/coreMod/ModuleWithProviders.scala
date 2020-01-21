package typings.angularCompiler.coreMod

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
    val __obj = js.Dynamic.literal(ngModule = ngModule.asInstanceOf[js.Any])
    if (providers != null) __obj.updateDynamic("providers")(providers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleWithProviders]
  }
}

