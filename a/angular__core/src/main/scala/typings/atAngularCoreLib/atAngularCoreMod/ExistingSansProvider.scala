package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExistingSansProvider extends InjectableProvider {
  /**
    * Existing `token` to return. (Equivalent to `injector.get(useExisting)`)
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

