package typings.aureliaDashDependencyDashInjection.aureliaDashDependencyDashInjectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-dependency-injection", "TransientRegistration")
@js.native
/**
  * Creates an instance of TransientRegistration.
  * @param key The key to register as.
  */
class TransientRegistration () extends js.Object {
  def this(key: js.Any) = this()
  /**
    * Called by the container to register the resolver.
    * @param container The container the resolver is being registered with.
    * @param key The key the resolver should be registered as.
    * @param fn The function to create the resolver for.
    * @return The resolver that was registered.
    */
  def registerResolver(container: Container, key: js.Any, fn: js.Function): Resolver = js.native
}

