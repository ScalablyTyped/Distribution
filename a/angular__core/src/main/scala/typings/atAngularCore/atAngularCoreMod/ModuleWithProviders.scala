package typings.atAngularCore.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleWithProviders[T] extends js.Object {
  var ngModule: Type[T]
  var providers: js.UndefOr[js.Array[Provider]] = js.undefined
}

object ModuleWithProviders {
  @scala.inline
  def apply[T](ngModule: Type[T], providers: js.Array[Provider] = null): ModuleWithProviders[T] = {
    val __obj = js.Dynamic.literal(ngModule = ngModule.asInstanceOf[js.Any])
    if (providers != null) __obj.updateDynamic("providers")(providers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleWithProviders[T]]
  }
}

