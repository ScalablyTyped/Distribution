package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "ApplicationInitStatus")
@js.native
open class ApplicationInitStatus () extends StObject {
  
  /* private */ val appInits: Any = js.native
  
  val done: /* false */ Boolean = js.native
  
  val donePromise: js.Promise[Any] = js.native
  
  /* private */ var initialized: Any = js.native
  
  /* private */ var reject: Any = js.native
  
  /* private */ var resolve: Any = js.native
}
/* static members */
object ApplicationInitStatus {
  
  @JSImport("@angular/core", "ApplicationInitStatus")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/core", "ApplicationInitStatus.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[ApplicationInitStatus, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[ApplicationInitStatus, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/core", "ApplicationInitStatus.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[ApplicationInitStatus] = js.native
  inline def ɵprov_=(x: ɵɵInjectableDeclaration[ApplicationInitStatus]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
