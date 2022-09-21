package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "\u0275Console")
@js.native
open class ɵConsole () extends StObject {
  
  def log(message: String): Unit = js.native
  
  def warn(message: String): Unit = js.native
}
/* static members */
object ɵConsole {
  
  @JSImport("@angular/core", "\u0275Console")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/core", "\u0275Console.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[ɵConsole, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[ɵConsole, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/core", "\u0275Console.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[ɵConsole] = js.native
  inline def ɵprov_=(x: ɵɵInjectableDeclaration[ɵConsole]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
