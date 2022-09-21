package typings.angularCommon.mod

import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectableDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "NgLocalization")
@js.native
abstract class NgLocalization () extends StObject {
  
  def getPluralCategory(value: Any): String = js.native
  def getPluralCategory(value: Any, locale: String): String = js.native
}
/* static members */
object NgLocalization {
  
  @JSImport("@angular/common", "NgLocalization")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/common", "NgLocalization.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[NgLocalization, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[NgLocalization, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/common", "NgLocalization.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[NgLocalization] = js.native
  inline def ɵprov_=(x: ɵɵInjectableDeclaration[NgLocalization]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
