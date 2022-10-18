package typings.angularRouter.mod

import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectableDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@angular/router", "UrlSerializer")
@js.native
open class UrlSerializer () extends StObject {
  
  /** Parse a url into a `UrlTree` */
  def parse(url: String): UrlTree = js.native
  
  /** Converts a `UrlTree` into a url */
  def serialize(tree: UrlTree): String = js.native
}
/* static members */
object UrlSerializer {
  
  @JSImport("@angular/router", "UrlSerializer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/router", "UrlSerializer.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[UrlSerializer, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[UrlSerializer, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/router", "UrlSerializer.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[UrlSerializer] = js.native
  inline def ɵprov_=(x: ɵɵInjectableDeclaration[UrlSerializer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
