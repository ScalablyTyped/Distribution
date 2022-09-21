package typings.angularCommon.httpMod

import typings.angularCore.mod.Injector
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectableDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common/http", "\u0275HttpInterceptingHandler")
@js.native
open class ɵHttpInterceptingHandler protected () extends HttpHandler {
  def this(backend: HttpBackend, injector: Injector) = this()
  
  /* private */ var backend: Any = js.native
  
  /* private */ var chain: Any = js.native
  
  /* private */ var injector: Any = js.native
}
/* static members */
object ɵHttpInterceptingHandler {
  
  @JSImport("@angular/common/http", "\u0275HttpInterceptingHandler")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/common/http", "\u0275HttpInterceptingHandler.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[ɵHttpInterceptingHandler, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[ɵHttpInterceptingHandler, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/common/http", "\u0275HttpInterceptingHandler.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[ɵHttpInterceptingHandler] = js.native
  inline def ɵprov_=(x: ɵɵInjectableDeclaration[ɵHttpInterceptingHandler]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
