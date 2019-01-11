package typings
package atAngularRouterLib.srcRouterUnderscoreModuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router/src/router_module", "RouterInitializer")
@js.native
class RouterInitializer protected () extends js.Object {
  def this(injector: atAngularCoreLib.atAngularCoreMod.Injector) = this()
  var initNavigation: js.Any = js.native
  var injector: js.Any = js.native
  var isLegacyDisabled: js.Any = js.native
  var isLegacyEnabled: js.Any = js.native
  var resultOfPreactivationDone: js.Any = js.native
  def appInitializer(): js.Promise[_] = js.native
  def bootstrapListener(bootstrappedComponentRef: atAngularCoreLib.atAngularCoreMod.ComponentRef[_]): scala.Unit = js.native
}

