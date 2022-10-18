package typings.angularRouter.mod

import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectableDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@angular/router", "TitleStrategy")
@js.native
open class TitleStrategy () extends StObject {
  
  /**
    * @returns The `title` of the deepest primary route.
    */
  def buildTitle(snapshot: RouterStateSnapshot): js.UndefOr[String] = js.native
  
  /**
    * Given an `ActivatedRouteSnapshot`, returns the final value of the
    * `Route.title` property, which can either be a static string or a resolved value.
    */
  def getResolvedTitleForRoute(snapshot: ActivatedRouteSnapshot): Any = js.native
  
  /** Performs the application title update. */
  def updateTitle(snapshot: RouterStateSnapshot): Unit = js.native
}
/* static members */
object TitleStrategy {
  
  @JSImport("@angular/router", "TitleStrategy")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/router", "TitleStrategy.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[TitleStrategy, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[TitleStrategy, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/router", "TitleStrategy.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[TitleStrategy] = js.native
  inline def ɵprov_=(x: ɵɵInjectableDeclaration[TitleStrategy]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
