package typings.angularPlatformBrowser.mod

import typings.angularCore.mod.OnDestroy
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectableDeclaration
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/platform-browser", "\u0275DomSharedStylesHost")
@js.native
open class ɵDomSharedStylesHost protected ()
  extends ɵSharedStylesHost
     with OnDestroy {
  def this(_doc: Any) = this()
  
  /* private */ var _addStylesToHost: Any = js.native
  
  /* private */ var _doc: Any = js.native
  
  /* private */ var _hostNodes: Any = js.native
  
  def addHost(hostNode: Node): Unit = js.native
  
  /**
    * A callback method that performs custom clean-up, invoked immediately
    * before a directive, pipe, or service instance is destroyed.
    */
  /* CompleteClass */
  override def ngOnDestroy(): Unit = js.native
  
  def removeHost(hostNode: Node): Unit = js.native
}
/* static members */
object ɵDomSharedStylesHost {
  
  @JSImport("@angular/platform-browser", "\u0275DomSharedStylesHost")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/platform-browser", "\u0275DomSharedStylesHost.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[ɵDomSharedStylesHost, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[ɵDomSharedStylesHost, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/platform-browser", "\u0275DomSharedStylesHost.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[ɵDomSharedStylesHost] = js.native
  inline def ɵprov_=(x: ɵɵInjectableDeclaration[ɵDomSharedStylesHost]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
