package typings
package aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-dependency-injection", "Optional")
@js.native
class Optional protected () extends js.Object {
  /**
    * Creates an instance of the Optional class.
    * @param key The key to optionally resolve for.
    * @param checkParent Indicates whether or not the parent container hierarchy should be checked.
    */
  def this(key: js.Any) = this()
  def this(key: js.Any, checkParent: scala.Boolean) = this()
  /**
    * Called by the container to provide optional resolution of the key.
    * @param container The container to resolve from.
    * @return Returns the instance if found; otherwise null.
    */
  def get(container: Container): js.Any = js.native
}

/* static members */
@JSImport("aurelia-dependency-injection", "Optional")
@js.native
object Optional extends js.Object {
  /**
    * Creates an Optional Resolver for the supplied key.
    * @param key The key to optionally resolve for.
    * @param [checkParent=true] Indicates whether or not the parent container hierarchy should be checked.
    * @return Returns an instance of Optional for the key.
    */
  def of(key: js.Any): aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod.Optional = js.native
  def of(key: js.Any, checkParent: scala.Boolean): aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod.Optional = js.native
}

