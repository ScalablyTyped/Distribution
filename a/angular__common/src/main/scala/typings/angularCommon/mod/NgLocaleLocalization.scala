package typings.angularCommon.mod

import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectableDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "NgLocaleLocalization")
@js.native
open class NgLocaleLocalization protected () extends NgLocalization {
  def this(locale: String) = this()
  
  /* protected */ var locale: String = js.native
}
/* static members */
object NgLocaleLocalization {
  
  @JSImport("@angular/common", "NgLocaleLocalization")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/common", "NgLocaleLocalization.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[NgLocaleLocalization, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[NgLocaleLocalization, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/common", "NgLocaleLocalization.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[NgLocaleLocalization] = js.native
  inline def ɵprov_=(x: ɵɵInjectableDeclaration[NgLocaleLocalization]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
