package typings.angularRouter.mod

import typings.angularCore.mod.Compiler
import typings.angularCore.mod.EnvironmentInjector
import typings.angularCore.mod.OnDestroy
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectableDeclaration
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/router", "RouterPreloader")
@js.native
open class RouterPreloader protected ()
  extends StObject
     with OnDestroy {
  def this(
    router: Router,
    compiler: Compiler,
    injector: EnvironmentInjector,
    preloadingStrategy: PreloadingStrategy,
    loader: RouterConfigLoader
  ) = this()
  
  /* private */ var injector: Any = js.native
  
  /* private */ var loader: Any = js.native
  
  /**
    * A callback method that performs custom clean-up, invoked immediately
    * before a directive, pipe, or service instance is destroyed.
    */
  /* CompleteClass */
  override def ngOnDestroy(): Unit = js.native
  
  def preload(): Observable_[Any] = js.native
  
  /* private */ var preloadConfig: Any = js.native
  
  /* private */ var preloadingStrategy: Any = js.native
  
  /* private */ var processRoutes: Any = js.native
  
  /* private */ var router: Any = js.native
  
  def setUpPreloading(): Unit = js.native
  
  /* private */ var subscription: Any = js.native
}
/* static members */
object RouterPreloader {
  
  @JSImport("@angular/router", "RouterPreloader")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/router", "RouterPreloader.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[RouterPreloader, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[RouterPreloader, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/router", "RouterPreloader.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[RouterPreloader] = js.native
  inline def ɵprov_=(x: ɵɵInjectableDeclaration[RouterPreloader]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
