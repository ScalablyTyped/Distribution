package typings.aureliaDashDependencyDashInjection.aureliaDashDependencyDashInjectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-dependency-injection", "FactoryInvoker")
@js.native
class FactoryInvoker () extends js.Object {
  /**
    * Invokes the function with the provided dependencies.
    * @param container The calling container.
    * @param fn The constructor or factory function.
    * @param dependencies The dependencies of the function call.
    * @return The result of the function invocation.
    */
  def invoke(container: Container, fn: js.Function, dependencies: js.Array[_]): js.Any = js.native
  /**
    * Invokes the function with the provided dependencies.
    * @param container The calling container.
    * @param fn The constructor or factory function.
    * @param staticDependencies The static dependencies of the function.
    * @param dynamicDependencies Additional dependencies to use during invocation.
    * @return The result of the function invocation.
    */
  def invokeWithDynamicDependencies(
    container: Container,
    fn: js.Function,
    staticDependencies: js.Array[_],
    dynamicDependencies: js.Array[_]
  ): js.Any = js.native
}

/* static members */
@JSImport("aurelia-dependency-injection", "FactoryInvoker")
@js.native
object FactoryInvoker extends js.Object {
  /**
    * The singleton instance of the FactoryInvoker.
    */
  var instance: FactoryInvoker = js.native
}

