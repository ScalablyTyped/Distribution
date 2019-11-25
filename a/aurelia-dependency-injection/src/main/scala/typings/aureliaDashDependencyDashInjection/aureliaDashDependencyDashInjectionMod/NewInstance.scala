package typings.aureliaDashDependencyDashInjection.aureliaDashDependencyDashInjectionMod

import typings.aureliaDashDependencyDashInjection.Anon_Inject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-dependency-injection", "NewInstance")
@js.native
class NewInstance[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] protected () extends js.Object {
  def this(
    key: PrimitiveOrDependencyCtorOrFunctor[TBase, TImpl, TArgs],
    dynamicDependencies: (/* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any)*
  ) = this()
  def as(key: PrimitiveOrDependencyCtorOrFunctor[TBase, TImpl, TArgs]): this.type = js.native
  def get(container: Container): ImplOrAny[TImpl] = js.native
}

/* static members */
@JSImport("aurelia-dependency-injection", "NewInstance")
@js.native
object NewInstance extends js.Object {
  def of[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](
    key: PrimitiveOrDependencyCtorOrFunctor[TBase, TImpl, TArgs],
    dynamicDependencies: (/* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any)*
  ): NewInstance[TBase, TImpl, TArgs] = js.native
}

@JSImport("aurelia-dependency-injection", "newInstance")
@js.native
object newInstance extends js.Object {
  def apply[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](): js.Function3[
    /* target */ (DependencyCtor[TBase, TImpl, TArgs]) with Anon_Inject[TArgs], 
    /* _key */ js.Any, 
    /* index */ Double, 
    Unit
  ] = js.native
  def apply[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](
    asKeyOrTarget: (PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]) with Anon_Inject[TArgs],
    dynamicDependencies: (/* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any)*
  ): js.Function3[
    /* target */ (DependencyCtor[TBase, TImpl, TArgs]) with Anon_Inject[TArgs], 
    /* _key */ js.Any, 
    /* index */ Double, 
    Unit
  ] = js.native
}

