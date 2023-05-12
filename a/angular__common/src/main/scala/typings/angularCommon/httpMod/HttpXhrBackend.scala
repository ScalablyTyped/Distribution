package typings.angularCommon.httpMod

import typings.angularCommon.mod.XhrFactory
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectableDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common/http", "HttpXhrBackend")
@js.native
open class HttpXhrBackend protected () extends HttpBackend {
  def this(xhrFactory: XhrFactory) = this()
  
  /* private */ var xhrFactory: Any = js.native
}
/* static members */
object HttpXhrBackend {
  
  @JSImport("@angular/common/http", "HttpXhrBackend")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/common/http", "HttpXhrBackend.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[HttpXhrBackend, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[HttpXhrBackend, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/common/http", "HttpXhrBackend.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[HttpXhrBackend] = js.native
  inline def ɵprov_=(x: ɵɵInjectableDeclaration[HttpXhrBackend]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
