package typings.angularRouter.mod

import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectableDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@angular/router", "UrlHandlingStrategy")
@js.native
open class UrlHandlingStrategy () extends StObject {
  
  /**
    * Extracts the part of the URL that should be handled by the router.
    * The rest of the URL will remain untouched.
    */
  def extract(url: UrlTree): UrlTree = js.native
  
  /**
    * Merges the URL fragment with the rest of the URL.
    */
  def merge(newUrlPart: UrlTree, rawUrl: UrlTree): UrlTree = js.native
  
  /**
    * Tells the router if this URL should be processed.
    *
    * When it returns true, the router will execute the regular navigation.
    * When it returns false, the router will set the router state to an empty state.
    * As a result, all the active components will be destroyed.
    *
    */
  def shouldProcessUrl(url: UrlTree): Boolean = js.native
}
/* static members */
object UrlHandlingStrategy {
  
  @JSImport("@angular/router", "UrlHandlingStrategy")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/router", "UrlHandlingStrategy.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[UrlHandlingStrategy, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[UrlHandlingStrategy, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/router", "UrlHandlingStrategy.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[UrlHandlingStrategy] = js.native
  inline def ɵprov_=(x: ɵɵInjectableDeclaration[UrlHandlingStrategy]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
