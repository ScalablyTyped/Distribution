package typings.aureliaDependencyInjection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-dependency-injection", "InvocationHandler")
@js.native
class InvocationHandler[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] protected () extends js.Object {
  def this(
    fn: DependencyCtorOrFunctor[TBase, TImpl, TArgs],
    invoker: Invoker_[TBase, TImpl, TArgs],
    dependencies: TArgs
  ) = this()
  var dependencies: TArgs = js.native
  var fn: DependencyCtorOrFunctor[TBase, TImpl, TArgs] = js.native
  var invoker: Invoker_[TBase, TImpl, TArgs] = js.native
  def invoke(container: Container): TImpl = js.native
  def invoke(container: Container, dynamicDependencies: js.Array[TArgs]): TImpl = js.native
}

