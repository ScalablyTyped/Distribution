package typings.aureliaDashDependencyDashInjection.aureliaDashDependencyDashInjectionMod

import typings.aureliaDashDependencyDashInjection.Anon_Decorates
import typings.aureliaDashDependencyDashInjection.Anon_Inject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-dependency-injection", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val _emptyParameters: js.Array[js.Any] = js.native
  val resolver: Anon_Decorates with js.Function0[_] = js.native
  def all[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](keyValue: js.Any): js.Function3[
    /* target */ (DependencyCtor[TBase, TImpl, TArgs]) with Anon_Inject[TArgs], 
    /* _key */ js.Any, 
    /* index */ Double, 
    Unit
  ] = js.native
  def autoinject[TPotential](): (js.Function1[/* target */ Injectable, Unit]) | Unit = js.native
  def autoinject[TPotential](potentialTarget: TPotential): (js.Function1[/* target */ Injectable, Unit]) | Unit = js.native
  def factory[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](keyValue: js.Any): js.Function3[
    /* target */ (DependencyCtor[TBase, TImpl, TArgs]) with Anon_Inject[TArgs], 
    /* _key */ js.Any, 
    /* index */ Double, 
    Unit
  ] = js.native
  def getDecoratorDependencies[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](target: (DependencyCtor[TBase, TImpl, TArgs]) with Anon_Inject[TArgs]): js.Array[
    /* import warning: ImportType.apply Failed type conversion: TArgs[number] */ js.Any
  ] = js.native
  def inject[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](rest: (/* import warning: ImportType.apply Failed type conversion: TArgs[number] */ js.Any)*): js.Any = js.native
  def invokeAsFactory[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](): Unit | (js.Function1[/* target */ DependencyCtor[TBase, TImpl, TArgs], Unit]) = js.native
  def invokeAsFactory[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](potentialTarget: DependencyCtor[TBase, TImpl, TArgs]): Unit | (js.Function1[/* target */ DependencyCtor[TBase, TImpl, TArgs], Unit]) = js.native
  def invoker[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](value: Invoker[TBase, TImpl, TArgs]): js.Function1[/* target */ DependencyCtor[TBase, TImpl, TArgs], Unit] = js.native
  def `lazy`[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](keyValue: js.Any): js.Function3[
    /* target */ (DependencyCtor[TBase, TImpl, TArgs]) with Anon_Inject[TArgs], 
    /* _key */ js.Any, 
    /* index */ Double, 
    Unit
  ] = js.native
  def newInstance[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](): js.Function3[
    /* target */ (DependencyCtor[TBase, TImpl, TArgs]) with Anon_Inject[TArgs], 
    /* _key */ js.Any, 
    /* index */ Double, 
    Unit
  ] = js.native
  def newInstance[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](
    asKeyOrTarget: (PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]) with Anon_Inject[TArgs],
    dynamicDependencies: (/* import warning: ImportType.apply Failed type conversion: TArgs[number] */ js.Any)*
  ): js.Function3[
    /* target */ (DependencyCtor[TBase, TImpl, TArgs]) with Anon_Inject[TArgs], 
    /* _key */ js.Any, 
    /* index */ Double, 
    Unit
  ] = js.native
  def optional[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](): js.Function3[
    /* target */ (DependencyCtor[TBase, TImpl, TArgs]) with Anon_Inject[TArgs], 
    /* _key */ js.Any, 
    /* index */ Double, 
    Unit
  ] = js.native
  def optional[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](checkParentOrTarget: Boolean): js.Function3[
    /* target */ (DependencyCtor[TBase, TImpl, TArgs]) with Anon_Inject[TArgs], 
    /* _key */ js.Any, 
    /* index */ Double, 
    Unit
  ] = js.native
  def parent[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](target: (DependencyCtor[TBase, TImpl, TArgs]) with Anon_Inject[TArgs], _key: js.Any, index: Double): Unit = js.native
  def registration[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](value: Registration[TBase, TImpl, TArgs]): js.Function1[/* target */ DependencyCtor[TBase, TImpl, TArgs], Unit] = js.native
  def singleton(): js.Any = js.native
  def singleton(registerInChild: Boolean): js.Any = js.native
  def singleton[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]): js.Any = js.native
  def singleton[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs], registerInChild: Boolean): js.Any = js.native
  @JSName("singleton")
  def singleton_TBaseTImpl_ImplTBaseTArgs_ArgsTBase[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](): js.Any = js.native
  def transient[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](): js.Function1[/* target */ DependencyCtor[TBase, TImpl, TArgs], Unit] = js.native
  def transient[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]): js.Function1[/* target */ DependencyCtor[TBase, TImpl, TArgs], Unit] = js.native
}

