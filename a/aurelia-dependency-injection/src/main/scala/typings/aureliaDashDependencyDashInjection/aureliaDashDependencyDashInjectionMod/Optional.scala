package typings.aureliaDashDependencyDashInjection.aureliaDashDependencyDashInjectionMod

import typings.aureliaDashDependencyDashInjection.Anon_Inject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-dependency-injection", "Optional")
@js.native
class Optional[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] protected () extends js.Object {
  def this(key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]) = this()
  def this(key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs], checkParent: Boolean) = this()
  def get(container: Container): TImpl = js.native
}

/* static members */
@JSImport("aurelia-dependency-injection", "Optional")
@js.native
object Optional extends js.Object {
  def of[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]): Optional[TBase, TImpl, TArgs] = js.native
  def of[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs], checkParent: Boolean): Optional[TBase, TImpl, TArgs] = js.native
}

@JSImport("aurelia-dependency-injection", "optional")
@js.native
object optional extends js.Object {
  def apply[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](): js.Function3[
    /* target */ (DependencyCtor[TBase, TImpl, TArgs]) with Anon_Inject[TArgs], 
    /* _key */ js.Any, 
    /* index */ Double, 
    Unit
  ] = js.native
  def apply[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](checkParentOrTarget: Boolean): js.Function3[
    /* target */ (DependencyCtor[TBase, TImpl, TArgs]) with Anon_Inject[TArgs], 
    /* _key */ js.Any, 
    /* index */ Double, 
    Unit
  ] = js.native
}

