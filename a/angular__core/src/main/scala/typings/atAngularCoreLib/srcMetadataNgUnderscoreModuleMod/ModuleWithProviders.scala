package typings
package atAngularCoreLib.srcMetadataNgUnderscoreModuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleWithProviders[T] extends js.Object {
  var ngModule: atAngularCoreLib.srcTypeMod.Type[T]
  var providers: js.UndefOr[js.Array[atAngularCoreLib.srcDiProviderMod.Provider]] = js.undefined
}

object ModuleWithProviders {
  @scala.inline
  def apply[T](
    ngModule: atAngularCoreLib.srcTypeMod.Type[T],
    providers: js.Array[atAngularCoreLib.srcDiProviderMod.Provider] = null
  ): ModuleWithProviders[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ngModule")(ngModule)
    if (providers != null) __obj.updateDynamic("providers")(providers)
    __obj.asInstanceOf[ModuleWithProviders[T]]
  }
}

