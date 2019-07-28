package typings.aureliaDashDependencyDashInjection.aureliaDashDependencyDashInjectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-dependency-injection", "InvocationHandler")
@js.native
class InvocationHandler protected () extends js.Object {
  /**
    * Instantiates an InvocationDescription.
    * @param fn The Function described by this description object.
    * @param invoker The strategy for invoking the function.
    * @param dependencies The static dependencies of the function call.
    */
  def this(fn: js.Function, invoker: Invoker, dependencies: js.Array[_]) = this()
  /**
    * The statically known dependencies of this function invocation.
    */
  var dependencies: js.Array[_] = js.native
  /**
    * The function to be invoked by this handler.
    */
  var fn: js.Function = js.native
  /**
    * The invoker implementation that will be used to actually invoke the function.
    */
  var invoker: Invoker = js.native
  /**
    * Invokes the function.
    * @param container The calling container.
    * @param dynamicDependencies Additional dependencies to use during invocation.
    * @return The result of the function invocation.
    */
  def invoke(container: Container): js.Any = js.native
  def invoke(container: Container, dynamicDependencies: js.Array[_]): js.Any = js.native
}

