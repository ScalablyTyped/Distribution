package typings.angularPlatformBrowser.mod

import typings.angularCore.mod.RendererFactory2
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectableDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/platform-browser", "\u0275DomRendererFactory2")
@js.native
open class ɵDomRendererFactory2 protected () extends RendererFactory2 {
  def this(eventManager: EventManager, sharedStylesHost: ɵDomSharedStylesHost, appId: String) = this()
  
  /* private */ var appId: Any = js.native
  
  @JSName("begin")
  def begin_MɵDomRendererFactory2(): Unit = js.native
  
  /* private */ var defaultRenderer: Any = js.native
  
  @JSName("end")
  def end_MɵDomRendererFactory2(): Unit = js.native
  
  /* private */ var eventManager: Any = js.native
  
  /* private */ var rendererByCompId: Any = js.native
  
  /* private */ var sharedStylesHost: Any = js.native
}
/* static members */
object ɵDomRendererFactory2 {
  
  @JSImport("@angular/platform-browser", "\u0275DomRendererFactory2")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/platform-browser", "\u0275DomRendererFactory2.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[ɵDomRendererFactory2, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[ɵDomRendererFactory2, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/platform-browser", "\u0275DomRendererFactory2.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[ɵDomRendererFactory2] = js.native
  inline def ɵprov_=(x: ɵɵInjectableDeclaration[ɵDomRendererFactory2]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
