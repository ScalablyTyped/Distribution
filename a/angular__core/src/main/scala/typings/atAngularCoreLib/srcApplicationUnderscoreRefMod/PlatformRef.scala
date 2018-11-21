package typings
package atAngularCoreLib.srcApplicationUnderscoreRefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/application_ref", "PlatformRef")
@js.native
class PlatformRef () extends js.Object {
  var _destroyListeners: js.Any = js.native
  var _destroyed: js.Any = js.native
  var _injector: js.Any = js.native
  var _moduleDoBootstrap: js.Any = js.native
  var _modules: js.Any = js.native
  val destroyed: scala.Boolean = js.native
  /**
       * Retrieve the platform {@link Injector}, which is the parent injector for
       * every Angular application on the page and provides singleton providers.
       */
  val injector: atAngularCoreLib.srcDiMod.Injector = js.native
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
  def bootstrapModule[M](moduleType: atAngularCoreLib.srcTypeMod.Type[M]): stdLib.Promise[atAngularCoreLib.srcLinkerNgUnderscoreModuleUnderscoreFactoryMod.NgModuleRef[M]] = js.native
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
  def bootstrapModule[M](
    moduleType: atAngularCoreLib.srcTypeMod.Type[M],
    compilerOptions: atAngularCoreLib.srcLinkerCompilerMod.CompilerOptions with BootstrapOptions
  ): stdLib.Promise[atAngularCoreLib.srcLinkerNgUnderscoreModuleUnderscoreFactoryMod.NgModuleRef[M]] = js.native
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
  def bootstrapModule[M](
    moduleType: atAngularCoreLib.srcTypeMod.Type[M],
    compilerOptions: js.Array[atAngularCoreLib.srcLinkerCompilerMod.CompilerOptions with BootstrapOptions]
  ): stdLib.Promise[atAngularCoreLib.srcLinkerNgUnderscoreModuleUnderscoreFactoryMod.NgModuleRef[M]] = js.native
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
       *
       * @experimental APIs related to application bootstrap are currently under review.
       */
  def bootstrapModuleFactory[M](moduleFactory: atAngularCoreLib.srcLinkerNgUnderscoreModuleUnderscoreFactoryMod.NgModuleFactory[M]): stdLib.Promise[atAngularCoreLib.srcLinkerNgUnderscoreModuleUnderscoreFactoryMod.NgModuleRef[M]] = js.native
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
       *
       * @experimental APIs related to application bootstrap are currently under review.
       */
  def bootstrapModuleFactory[M](
    moduleFactory: atAngularCoreLib.srcLinkerNgUnderscoreModuleUnderscoreFactoryMod.NgModuleFactory[M],
    options: BootstrapOptions
  ): stdLib.Promise[atAngularCoreLib.srcLinkerNgUnderscoreModuleUnderscoreFactoryMod.NgModuleRef[M]] = js.native
  /**
       * Destroy the Angular platform and all Angular applications on the page.
       */
  def destroy(): scala.Unit = js.native
  /**
       * Register a listener to be called when the platform is disposed.
       */
  def onDestroy(callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

