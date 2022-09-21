package typings.angularRouter.mod

import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectableDeclaration
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/router", "ChildrenOutletContexts")
@js.native
open class ChildrenOutletContexts () extends StObject {
  
  /* private */ var contexts: Any = js.native
  
  def getContext(childName: String): OutletContext | Null = js.native
  
  def getOrCreateContext(childName: String): OutletContext = js.native
  
  /** Called when a `RouterOutlet` directive is instantiated */
  def onChildOutletCreated(childName: String, outlet: RouterOutletContract): Unit = js.native
  
  /**
    * Called when a `RouterOutlet` directive is destroyed.
    * We need to keep the context as the outlet could be destroyed inside a NgIf and might be
    * re-created later.
    */
  def onChildOutletDestroyed(childName: String): Unit = js.native
  
  /**
    * Called when the corresponding route is deactivated during navigation.
    * Because the component get destroyed, all children outlet are destroyed.
    */
  def onOutletDeactivated(): Map[String, OutletContext] = js.native
  
  def onOutletReAttached(contexts: Map[String, OutletContext]): Unit = js.native
}
/* static members */
object ChildrenOutletContexts {
  
  @JSImport("@angular/router", "ChildrenOutletContexts")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/router", "ChildrenOutletContexts.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[ChildrenOutletContexts, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[ChildrenOutletContexts, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/router", "ChildrenOutletContexts.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[ChildrenOutletContexts] = js.native
  inline def ɵprov_=(x: ɵɵInjectableDeclaration[ChildrenOutletContexts]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
