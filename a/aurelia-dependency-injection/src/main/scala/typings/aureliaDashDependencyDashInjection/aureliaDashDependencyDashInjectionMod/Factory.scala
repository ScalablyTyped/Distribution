package typings.aureliaDashDependencyDashInjection.aureliaDashDependencyDashInjectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-dependency-injection", "Factory")
@js.native
class Factory[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] protected () extends js.Object {
  def this(key: PrimitiveOrDependencyCtorOrFunctor[TBase, TImpl, TArgs]) = this()
  def get(container: Container): DependencyFunctor[TBase, TImpl, TArgs] = js.native
}

/* static members */
@JSImport("aurelia-dependency-injection", "Factory")
@js.native
object Factory extends js.Object {
  def of[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: DependencyCtor[TBase, TImpl, TArgs]): Factory[TBase, TImpl, TArgs] = js.native
}

