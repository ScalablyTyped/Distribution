package typings.aureliaDashDependencyDashInjection.aureliaDashDependencyDashInjectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-dependency-injection", "Lazy")
@js.native
class Lazy[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] protected () extends js.Object {
  def this(key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]) = this()
  def get(container: Container): js.Function0[ImplOrAny[TImpl]] = js.native
}

/* static members */
@JSImport("aurelia-dependency-injection", "Lazy")
@js.native
object Lazy extends js.Object {
  def of[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]): Lazy[TBase, TImpl, TArgs] = js.native
}

