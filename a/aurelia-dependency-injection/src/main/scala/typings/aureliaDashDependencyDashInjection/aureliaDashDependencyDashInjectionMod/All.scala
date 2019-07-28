package typings.aureliaDashDependencyDashInjection.aureliaDashDependencyDashInjectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-dependency-injection", "All")
@js.native
class All protected () extends js.Object {
  /**
    * Creates an instance of the All class.
    * @param key The key to lazily resolve all matches for.
    */
  def this(key: js.Any) = this()
  /**
    * Called by the container to resolve all matching dependencies as an array of instances.
    * @param container The container to resolve from.
    * @return Returns an array of all matching instances.
    */
  def get(container: Container): js.Array[_] = js.native
}

/* static members */
@JSImport("aurelia-dependency-injection", "All")
@js.native
object All extends js.Object {
  /**
    * Creates an All Resolver for the supplied key.
    * @param key The key to resolve all instances for.
    * @return Returns an instance of All for the key.
    */
  def of(key: js.Any): All = js.native
}

