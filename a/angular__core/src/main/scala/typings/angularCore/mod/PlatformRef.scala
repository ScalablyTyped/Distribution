package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core", "PlatformRef")
@js.native
class PlatformRef () extends js.Object {
  var _destroyListeners: js.Any = js.native
  var _destroyed: js.Any = js.native
  var _injector: js.Any = js.native
  var _moduleDoBootstrap: js.Any = js.native
  var _modules: js.Any = js.native
  val destroyed: Boolean = js.native
  /**
    * Retrieve the platform {@link Injector}, which is the parent injector for
    * every Angular application on the page and provides singleton providers.
    */
  val injector: Injector = js.native
  /**
    * Creates an instance of an `@NgModule` for a given platform using the given runtime compiler.
    *
    * @usageNotes
    * ### Simple Example
    *
    * ```typescript
    * @NgModule({
    *   imports: [BrowserModule]
    * })
    * class MyModule {}
    *
    * let moduleRef = platformBrowser().bootstrapModule(MyModule);
    * ```
    *
    */
  def bootstrapModule[M](moduleType: Type[M]): js.Promise[NgModuleRef[M]] = js.native
  def bootstrapModule[M](moduleType: Type[M], compilerOptions: CompilerOptions with BootstrapOptions): js.Promise[NgModuleRef[M]] = js.native
  def bootstrapModule[M](moduleType: Type[M], compilerOptions: js.Array[CompilerOptions with BootstrapOptions]): js.Promise[NgModuleRef[M]] = js.native
  /**
    * Creates an instance of an `@NgModule` for the given platform
    * for offline compilation.
    *
    * @usageNotes
    * ### Simple Example
    *
    * ```typescript
    * my_module.ts:
    *
    * @NgModule({
    *   imports: [BrowserModule]
    * })
    * class MyModule {}
    *
    * main.ts:
    * import {MyModuleNgFactory} from './my_module.ngfactory';
    * import {platformBrowser} from '@angular/platform-browser';
    *
    * let moduleRef = platformBrowser().bootstrapModuleFactory(MyModuleNgFactory);
    * ```
    */
  def bootstrapModuleFactory[M](moduleFactory: NgModuleFactory[M]): js.Promise[NgModuleRef[M]] = js.native
  def bootstrapModuleFactory[M](moduleFactory: NgModuleFactory[M], options: BootstrapOptions): js.Promise[NgModuleRef[M]] = js.native
  /**
    * Destroy the Angular platform and all Angular applications on the page.
    */
  def destroy(): Unit = js.native
  /**
    * Register a listener to be called when the platform is disposed.
    */
  def onDestroy(callback: js.Function0[Unit]): Unit = js.native
}

