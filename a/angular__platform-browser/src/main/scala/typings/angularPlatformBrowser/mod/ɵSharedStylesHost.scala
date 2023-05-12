package typings.angularPlatformBrowser.mod

import typings.angularCore.mod.OnDestroy
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectableDeclaration
import typings.angularPlatformBrowser.anon.`0`
import typings.std.Document
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/platform-browser", "\u0275SharedStylesHost")
@js.native
open class ɵSharedStylesHost protected ()
  extends StObject
     with OnDestroy {
  def this(doc: Document, appId: String) = this()
  def this(doc: Document, appId: String, nonce: String) = this()
  def this(doc: Document, appId: String, nonce: String, platformId: js.Object) = this()
  def this(doc: Document, appId: String, nonce: Null, platformId: js.Object) = this()
  def this(doc: Document, appId: String, nonce: Unit, platformId: js.Object) = this()
  
  def addHost(hostNode: Node): Unit = js.native
  
  /* private */ var addStyleToHost: Any = js.native
  
  def addStyles(styles: js.Array[String]): Unit = js.native
  
  /* private */ val appId: Any = js.native
  
  /* private */ var changeUsageCount: Any = js.native
  
  /* private */ var collectServerRenderedStyles: Any = js.native
  
  /* private */ val doc: Any = js.native
  
  /* private */ var getAllStyles: Any = js.native
  
  /* private */ var getStyleElement: Any = js.native
  
  /* private */ val hostNodes: Any = js.native
  
  /**
    * A callback method that performs custom clean-up, invoked immediately
    * before a directive, pipe, or service instance is destroyed.
    */
  /* CompleteClass */
  override def ngOnDestroy(): Unit = js.native
  
  /* private */ var nonce: Any = js.native
  
  /* private */ var onStyleAdded: Any = js.native
  
  /* private */ var onStyleRemoved: Any = js.native
  
  val platformId: js.Object = js.native
  
  /* private */ val platformIsServer: Any = js.native
  
  def removeHost(hostNode: Node): Unit = js.native
  
  def removeStyles(styles: js.Array[String]): Unit = js.native
  
  /* private */ var resetHostNodes: Any = js.native
  
  /* private */ val styleNodesInDOM: Any = js.native
  
  /* private */ val styleRef: Any = js.native
}
/* static members */
object ɵSharedStylesHost {
  
  @JSImport("@angular/platform-browser", "\u0275SharedStylesHost")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/platform-browser", "\u0275SharedStylesHost.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[ɵSharedStylesHost, js.Tuple4[Null, Null, `0`, Null]] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[ɵSharedStylesHost, js.Tuple4[Null, Null, `0`, Null]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/platform-browser", "\u0275SharedStylesHost.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[ɵSharedStylesHost] = js.native
  inline def ɵprov_=(x: ɵɵInjectableDeclaration[ɵSharedStylesHost]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
