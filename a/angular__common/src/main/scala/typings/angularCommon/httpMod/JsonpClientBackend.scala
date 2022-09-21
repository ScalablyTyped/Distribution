package typings.angularCommon.httpMod

import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectableDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common/http", "JsonpClientBackend")
@js.native
open class JsonpClientBackend protected () extends HttpBackend {
  def this(callbackMap: JsonpCallbackContext, document: Any) = this()
  
  /* private */ var callbackMap: Any = js.native
  
  /* private */ var document: Any = js.native
  
  /**
    * Get the name of the next callback method, by incrementing the global `nextRequestId`.
    */
  /* private */ var nextCallback: Any = js.native
  
  /* private */ var removeListeners: Any = js.native
  
  /**
    * A resolved promise that can be used to schedule microtasks in the event handlers.
    */
  /* private */ val resolvedPromise: Any = js.native
}
/* static members */
object JsonpClientBackend {
  
  @JSImport("@angular/common/http", "JsonpClientBackend")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/common/http", "JsonpClientBackend.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[JsonpClientBackend, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[JsonpClientBackend, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/common/http", "JsonpClientBackend.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[JsonpClientBackend] = js.native
  inline def ɵprov_=(x: ɵɵInjectableDeclaration[JsonpClientBackend]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
