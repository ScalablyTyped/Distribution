package typings.angularRouter.mod

import typings.angularCore.mod.Compiler
import typings.angularCore.mod.Injector
import typings.angularCore.mod.NgModuleFactoryLoader
import typings.angularCore.mod.OnDestroy
import typings.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router", "RouterPreloader")
@js.native
class RouterPreloader protected () extends OnDestroy {
  def this(
    router: Router,
    moduleLoader: NgModuleFactoryLoader,
    compiler: Compiler,
    injector: Injector,
    preloadingStrategy: PreloadingStrategy
  ) = this()
  var injector: js.Any = js.native
  var loader: js.Any = js.native
  var preloadConfig: js.Any = js.native
  var preloadingStrategy: js.Any = js.native
  var processRoutes: js.Any = js.native
  var router: js.Any = js.native
  var subscription: js.Any = js.native
  /**
    * A callback method that performs custom clean-up, invoked immediately
    * before a directive, pipe, or service instance is destroyed.
    */
  /* CompleteClass */
  override def ngOnDestroy(): Unit = js.native
  def preload(): Observable_[_] = js.native
  def setUpPreloading(): Unit = js.native
}

