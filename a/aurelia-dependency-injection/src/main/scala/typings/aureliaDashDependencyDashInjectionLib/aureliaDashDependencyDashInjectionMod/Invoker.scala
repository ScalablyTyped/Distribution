package typings
package aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Invoker extends js.Object {
  /**
      * Invokes the function with the provided dependencies.
      * @param fn The constructor or factory function.
      * @param dependencies The dependencies of the function call.
      * @return The result of the function invocation.
      */
  def invoke(container: Container, fn: js.Function, dependencies: js.Array[_]): js.Any
  /**
      * Invokes the function with the provided dependencies.
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
  ): js.Any
}

