package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "PlatformRef")
@js.native
open class PlatformRef () extends StObject {
  
  /* private */ var _destroyListeners: Any = js.native
  
  /* private */ var _destroyed: Any = js.native
  
  /* private */ var _injector: Any = js.native
  
  /* private */ var _moduleDoBootstrap: Any = js.native
  
  /* private */ var _modules: Any = js.native
  
  /**
    * Creates an instance of an `@NgModule` for a given platform.
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
  def bootstrapModule[M](moduleType: Type[M], compilerOptions: CompilerOptions & BootstrapOptions): js.Promise[NgModuleRef[M]] = js.native
  def bootstrapModule[M](moduleType: Type[M], compilerOptions: js.Array[CompilerOptions & BootstrapOptions]): js.Promise[NgModuleRef[M]] = js.native
  
  /**
    * Creates an instance of an `@NgModule` for the given platform.
    *
    * @deprecated Passing NgModule factories as the `PlatformRef.bootstrapModuleFactory` function
    *     argument is deprecated. Use the `PlatformRef.bootstrapModule` API instead.
    */
  def bootstrapModuleFactory[M](moduleFactory: NgModuleFactory[M]): js.Promise[NgModuleRef[M]] = js.native
  def bootstrapModuleFactory[M](moduleFactory: NgModuleFactory[M], options: BootstrapOptions): js.Promise[NgModuleRef[M]] = js.native
  
  /**
    * Destroys the current Angular platform and all Angular applications on the page.
    * Destroys all modules and listeners registered with the platform.
    */
  def destroy(): Unit = js.native
  
  /**
    * Indicates whether this instance was destroyed.
    */
  def destroyed: Boolean = js.native
  
  /**
    * Retrieves the platform {@link Injector}, which is the parent injector for
    * every Angular application on the page and provides singleton providers.
    */
  def injector: Injector = js.native
  
  /**
    * Registers a listener to be called when the platform is destroyed.
    */
  def onDestroy(callback: js.Function0[Unit]): Unit = js.native
}
/* static members */
object PlatformRef {
  
  @JSImport("@angular/core", "PlatformRef")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/core", "PlatformRef.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[PlatformRef, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[PlatformRef, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/core", "PlatformRef.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[PlatformRef] = js.native
  inline def ɵprov_=(x: ɵɵInjectableDeclaration[PlatformRef]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
