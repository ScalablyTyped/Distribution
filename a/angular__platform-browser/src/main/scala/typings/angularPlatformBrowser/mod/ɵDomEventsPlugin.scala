package typings.angularPlatformBrowser.mod

import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectableDeclaration
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/platform-browser", "\u0275DomEventsPlugin")
@js.native
open class ɵDomEventsPlugin protected ()
  extends StObject
     with EventManagerPlugin {
  def this(doc: Any) = this()
  
  /* private */ /* CompleteClass */
  var _doc: Any = js.native
  
  /* CompleteClass */
  override def addEventListener(element: HTMLElement, eventName: String, handler: js.Function): js.Function = js.native
  
  /* CompleteClass */
  var manager: EventManager = js.native
  
  def removeEventListener(target: Any, eventName: String, callback: js.Function): Unit = js.native
  
  /* CompleteClass */
  override def supports(eventName: String): Boolean = js.native
}
/* static members */
object ɵDomEventsPlugin {
  
  @JSImport("@angular/platform-browser", "\u0275DomEventsPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/platform-browser", "\u0275DomEventsPlugin.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[ɵDomEventsPlugin, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[ɵDomEventsPlugin, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/platform-browser", "\u0275DomEventsPlugin.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[ɵDomEventsPlugin] = js.native
  inline def ɵprov_=(x: ɵɵInjectableDeclaration[ɵDomEventsPlugin]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
