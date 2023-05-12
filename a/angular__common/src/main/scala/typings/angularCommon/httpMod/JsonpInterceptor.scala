package typings.angularCommon.httpMod

import typings.angularCore.mod.EnvironmentInjector
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectableDeclaration
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common/http", "JsonpInterceptor")
@js.native
open class JsonpInterceptor protected () extends StObject {
  def this(injector: EnvironmentInjector) = this()
  
  /* private */ var injector: Any = js.native
  
  /**
    * Identifies and handles a given JSONP request.
    * @param initialRequest The outgoing request object to handle.
    * @param next The next interceptor in the chain, or the backend
    * if no interceptors remain in the chain.
    * @returns An observable of the event stream.
    */
  def intercept(initialRequest: HttpRequest[Any], next: HttpHandler): Observable_[HttpEvent[Any]] = js.native
}
/* static members */
object JsonpInterceptor {
  
  @JSImport("@angular/common/http", "JsonpInterceptor")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/common/http", "JsonpInterceptor.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[JsonpInterceptor, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[JsonpInterceptor, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/common/http", "JsonpInterceptor.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[JsonpInterceptor] = js.native
  inline def ɵprov_=(x: ɵɵInjectableDeclaration[JsonpInterceptor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
