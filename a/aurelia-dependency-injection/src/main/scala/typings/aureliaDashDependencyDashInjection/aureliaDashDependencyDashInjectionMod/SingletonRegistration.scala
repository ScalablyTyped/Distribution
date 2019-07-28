package typings.aureliaDashDependencyDashInjection.aureliaDashDependencyDashInjectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-dependency-injection", "SingletonRegistration")
@js.native
/**
  * Creates an instance of SingletonRegistration.
  * @param key The key to register as.
  */
class SingletonRegistration () extends js.Object {
  def this(keyOrRegisterInChild: js.Any) = this()
  def this(keyOrRegisterInChild: js.Any, registerInChild: Boolean) = this()
  /**
    * Called by the container to register the resolver.
    * @param container The container the resolver is being registered with.
    * @param key The key the resolver should be registered as.
    * @param fn The function to create the resolver for.
    * @return The resolver that was registered.
    */
  def registerResolver(container: Container, key: js.Any, fn: js.Function): Resolver = js.native
}

