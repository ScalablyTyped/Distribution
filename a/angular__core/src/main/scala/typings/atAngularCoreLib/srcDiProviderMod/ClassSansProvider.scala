package typings
package atAngularCoreLib.srcDiProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassSansProvider
  extends atAngularCoreLib.srcDiInjectableMod.InjectableProvider {
  /**
    * Class to instantiate for the `token`.
    */
  var useClass: atAngularCoreLib.srcTypeMod.Type[_]
}

object ClassSansProvider {
  @scala.inline
  def apply(useClass: atAngularCoreLib.srcTypeMod.Type[_]): ClassSansProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("useClass")(useClass)
    __obj.asInstanceOf[ClassSansProvider]
  }
}

