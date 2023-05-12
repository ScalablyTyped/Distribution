package typings.angularPlatformBrowser.mod

import typings.angularCore.mod.NgZone
import typings.angularCore.mod.OnDestroy
import typings.angularCore.mod.RendererFactory2
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectableDeclaration
import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/platform-browser", "\u0275DomRendererFactory2")
@js.native
open class ɵDomRendererFactory2 protected ()
  extends RendererFactory2
     with OnDestroy {
  def this(
    eventManager: EventManager,
    sharedStylesHost: ɵSharedStylesHost,
    appId: String,
    removeStylesOnCompDestory: Boolean,
    doc: Document,
    platformId: js.Object,
    ngZone: NgZone
  ) = this()
  def this(
    eventManager: EventManager,
    sharedStylesHost: ɵSharedStylesHost,
    appId: String,
    removeStylesOnCompDestory: Boolean,
    doc: Document,
    platformId: js.Object,
    ngZone: NgZone,
    nonce: String
  ) = this()
  
  /* private */ val appId: Any = js.native
  
  /* private */ val defaultRenderer: Any = js.native
  
  /* private */ val doc: Any = js.native
  
  /* private */ val eventManager: Any = js.native
  
  /* private */ var getOrCreateRenderer: Any = js.native
  
  /**
    * A callback method that performs custom clean-up, invoked immediately
    * before a directive, pipe, or service instance is destroyed.
    */
  /* CompleteClass */
  override def ngOnDestroy(): Unit = js.native
  
  val ngZone: NgZone = js.native
  
  /* private */ val nonce: Any = js.native
  
  val platformId: js.Object = js.native
  
  /* private */ val platformIsServer: Any = js.native
  
  /* private */ var removeStylesOnCompDestory: Any = js.native
  
  /* private */ val rendererByCompId: Any = js.native
  
  /* private */ val sharedStylesHost: Any = js.native
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
