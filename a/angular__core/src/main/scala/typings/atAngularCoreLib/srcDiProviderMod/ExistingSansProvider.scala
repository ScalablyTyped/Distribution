package typings
package atAngularCoreLib.srcDiProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExistingSansProvider
  extends atAngularCoreLib.srcDiInjectableMod.InjectableProvider {
  /**
    * Existing `token` to return. (equivalent to `injector.get(useExisting)`)
    */
  var useExisting: js.Any
}

object ExistingSansProvider {
  @scala.inline
  def apply(useExisting: js.Any): ExistingSansProvider = {
    val __obj = js.Dynamic.literal(useExisting = useExisting)
  
    __obj.asInstanceOf[ExistingSansProvider]
  }
}

