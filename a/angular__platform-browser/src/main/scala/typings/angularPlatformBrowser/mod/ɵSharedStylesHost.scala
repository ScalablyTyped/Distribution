package typings.angularPlatformBrowser.mod

import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectableDeclaration
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/platform-browser", "\u0275SharedStylesHost")
@js.native
open class ɵSharedStylesHost () extends StObject {
  
  def addStyles(styles: js.Array[String]): Unit = js.native
  
  def getAllStyles(): js.Array[String] = js.native
  
  def onStylesAdded(additions: Set[String]): Unit = js.native
}
/* static members */
object ɵSharedStylesHost {
  
  @JSImport("@angular/platform-browser", "\u0275SharedStylesHost")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/platform-browser", "\u0275SharedStylesHost.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[ɵSharedStylesHost, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[ɵSharedStylesHost, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/platform-browser", "\u0275SharedStylesHost.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[ɵSharedStylesHost] = js.native
  inline def ɵprov_=(x: ɵɵInjectableDeclaration[ɵSharedStylesHost]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
