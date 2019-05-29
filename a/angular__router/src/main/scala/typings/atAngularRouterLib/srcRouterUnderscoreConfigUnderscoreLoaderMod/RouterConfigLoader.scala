package typings
package atAngularRouterLib.srcRouterUnderscoreConfigUnderscoreLoaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router/src/router_config_loader", "RouterConfigLoader")
@js.native
class RouterConfigLoader protected () extends js.Object {
  def this(loader: atAngularCoreLib.atAngularCoreMod.NgModuleFactoryLoader, compiler: atAngularCoreLib.atAngularCoreMod.Compiler) = this()
  def this(loader: atAngularCoreLib.atAngularCoreMod.NgModuleFactoryLoader, compiler: atAngularCoreLib.atAngularCoreMod.Compiler, onLoadStartListener: js.Function1[/* r */ atAngularRouterLib.srcConfigMod.Route, scala.Unit]) = this()
  def this(loader: atAngularCoreLib.atAngularCoreMod.NgModuleFactoryLoader, compiler: atAngularCoreLib.atAngularCoreMod.Compiler, onLoadStartListener: js.UndefOr[scala.Nothing], onLoadEndListener: js.Function1[/* r */ atAngularRouterLib.srcConfigMod.Route, scala.Unit]) = this()
  def this(loader: atAngularCoreLib.atAngularCoreMod.NgModuleFactoryLoader, compiler: atAngularCoreLib.atAngularCoreMod.Compiler, onLoadStartListener: js.Function1[/* r */ atAngularRouterLib.srcConfigMod.Route, scala.Unit], onLoadEndListener: js.Function1[/* r */ atAngularRouterLib.srcConfigMod.Route, scala.Unit]) = this()
  var compiler: js.Any = js.native
  var loadModuleFactory: js.Any = js.native
  var loader: js.Any = js.native
  var onLoadEndListener: js.UndefOr[js.Any] = js.native
  var onLoadStartListener: js.UndefOr[js.Any] = js.native
  def load(
    parentInjector: atAngularCoreLib.atAngularCoreMod.Injector,
    route: atAngularRouterLib.srcConfigMod.Route
  ): rxjsLib.rxjsMod.Observable[atAngularRouterLib.srcConfigMod.LoadedRouterConfig] = js.native
}

