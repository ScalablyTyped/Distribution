package typings.angularPlatformBrowser.mod

import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectableDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/platform-browser", "Title")
@js.native
open class Title protected () extends StObject {
  def this(_doc: Any) = this()
  
  /* private */ var _doc: Any = js.native
  
  /**
    * Get the title of the current HTML document.
    */
  def getTitle(): String = js.native
  
  /**
    * Set the title of the current HTML document.
    * @param newTitle
    */
  def setTitle(newTitle: String): Unit = js.native
}
/* static members */
object Title {
  
  @JSImport("@angular/platform-browser", "Title")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/platform-browser", "Title.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[Title, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[Title, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/platform-browser", "Title.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[Title] = js.native
  inline def ɵprov_=(x: ɵɵInjectableDeclaration[Title]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
