package typings.aureliaDashDependencyDashInjection.aureliaDashDependencyDashInjectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-dependency-injection", "Parent")
@js.native
class Parent[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] protected () extends js.Object {
  def this(key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]) = this()
  def get(container: Container): TImpl = js.native
}

/* static members */
@JSImport("aurelia-dependency-injection", "Parent")
@js.native
object Parent extends js.Object {
  def of[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]): Parent[TBase, TImpl, TArgs] = js.native
}

