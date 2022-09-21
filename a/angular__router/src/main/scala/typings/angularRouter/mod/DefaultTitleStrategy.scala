package typings.angularRouter.mod

import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectableDeclaration
import typings.angularPlatformBrowser.mod.Title
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/router", "DefaultTitleStrategy")
@js.native
open class DefaultTitleStrategy protected () extends TitleStrategy {
  def this(title: Title) = this()
  
  val title: Title = js.native
}
/* static members */
object DefaultTitleStrategy {
  
  @JSImport("@angular/router", "DefaultTitleStrategy")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/router", "DefaultTitleStrategy.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[DefaultTitleStrategy, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[DefaultTitleStrategy, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/router", "DefaultTitleStrategy.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[DefaultTitleStrategy] = js.native
  inline def ɵprov_=(x: ɵɵInjectableDeclaration[DefaultTitleStrategy]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
