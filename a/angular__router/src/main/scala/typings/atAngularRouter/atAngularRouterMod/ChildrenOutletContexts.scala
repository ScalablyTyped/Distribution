package typings.atAngularRouter.atAngularRouterMod

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router", "ChildrenOutletContexts")
@js.native
class ChildrenOutletContexts () extends js.Object {
  var contexts: js.Any = js.native
  def getContext(childName: String): OutletContext | Null = js.native
  def getOrCreateContext(childName: String): OutletContext = js.native
  /** Called when a `RouterOutlet` directive is instantiated */
  def onChildOutletCreated(childName: String, outlet: RouterOutlet): Unit = js.native
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

