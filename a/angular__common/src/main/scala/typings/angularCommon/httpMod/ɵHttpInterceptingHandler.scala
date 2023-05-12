package typings.angularCommon.httpMod

import typings.angularCore.mod.EnvironmentInjector
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectableDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common/http", "\u0275HttpInterceptingHandler")
@js.native
open class ɵHttpInterceptingHandler protected () extends HttpInterceptorHandler {
  def this(backend: HttpBackend, injector: EnvironmentInjector) = this()
}
object ɵHttpInterceptingHandler {
  
  @JSImport("@angular/common/http", "\u0275HttpInterceptingHandler")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("@angular/common/http", "\u0275HttpInterceptingHandler.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[HttpInterceptorHandler, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[HttpInterceptorHandler, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("@angular/common/http", "\u0275HttpInterceptingHandler.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[HttpInterceptorHandler] = js.native
  inline def ɵprov_=(x: ɵɵInjectableDeclaration[HttpInterceptorHandler]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
