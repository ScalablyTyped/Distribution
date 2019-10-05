package typings.aureliaDashDependencyDashInjection.aureliaDashDependencyDashInjectionMod

import typings.aureliaDashDependencyDashInjection.Anon_Inject
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

@JSImport("aurelia-dependency-injection", "factory")
@js.native
object factory extends js.Object {
  def apply[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](keyValue: js.Any): js.Function3[
    /* target */ (DependencyCtor[TBase, TImpl, TArgs]) with Anon_Inject[TArgs], 
    /* _key */ js.Any, 
    /* index */ Double, 
    Unit
  ] = js.native
}

