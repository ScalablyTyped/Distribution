package typings
package aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resolver extends js.Object {
  /**
    * Called by the container to allow custom resolution of dependencies for a function/class.
    * @param container The container to resolve from.
    * @param key The key that the resolver was registered as.
    * @return Returns the resolved object.
    */
  def get(container: Container, key: js.Any): js.Any
}

