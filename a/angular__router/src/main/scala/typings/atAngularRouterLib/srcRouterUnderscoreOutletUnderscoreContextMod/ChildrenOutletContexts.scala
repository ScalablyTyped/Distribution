package typings
package atAngularRouterLib.srcRouterUnderscoreOutletUnderscoreContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router/src/router_outlet_context", "ChildrenOutletContexts")
@js.native
class ChildrenOutletContexts () extends js.Object {
  var contexts: js.Any = js.native
  def getContext(childName: java.lang.String): OutletContext | scala.Null = js.native
  def getOrCreateContext(childName: java.lang.String): OutletContext = js.native
  /** Called when a `RouterOutlet` directive is instantiated */
  def onChildOutletCreated(
    childName: java.lang.String,
    outlet: atAngularRouterLib.srcDirectivesRouterUnderscoreOutletMod.RouterOutlet
  ): scala.Unit = js.native
  /**
    * Called when a `RouterOutlet` directive is destroyed.
    * We need to keep the context as the outlet could be destroyed inside a NgIf and might be
    * re-created later.
    */
  def onChildOutletDestroyed(childName: java.lang.String): scala.Unit = js.native
  /**
    * Called when the corresponding route is deactivated during navigation.
    * Because the component get destroyed, all children outlet are destroyed.
    */
  def onOutletDeactivated(): stdLib.Map[java.lang.String, OutletContext] = js.native
  def onOutletReAttached(contexts: stdLib.Map[java.lang.String, OutletContext]): scala.Unit = js.native
}

