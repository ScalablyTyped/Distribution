package typings
package atAngularRouterLib.srcRouterUnderscorePreloaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router/src/router_preloader", "RouterPreloader")
@js.native
class RouterPreloader protected ()
  extends atAngularCoreLib.srcMetadataLifecycleUnderscoreHooksMod.OnDestroy {
  def this(router: atAngularRouterLib.srcRouterMod.Router, moduleLoader: atAngularCoreLib.coreMod.NgModuleFactoryLoader, compiler: atAngularCoreLib.coreMod.Compiler, injector: atAngularCoreLib.coreMod.Injector, preloadingStrategy: PreloadingStrategy) = this()
  var injector: js.Any = js.native
  var loader: js.Any = js.native
  var preloadConfig: js.Any = js.native
  var preloadingStrategy: js.Any = js.native
  var processRoutes: js.Any = js.native
  var router: js.Any = js.native
  var subscription: js.Any = js.native
  /**
       * A callback method that performs custom clean-up, invoked immediately
       * after a directive, pipe, or service instance is destroyed.
       */
  /* CompleteClass */
  override def ngOnDestroy(): scala.Unit = js.native
  def preload(): rxjsLib.rxjsMod.Observable[_] = js.native
  def setUpPreloading(): scala.Unit = js.native
}

