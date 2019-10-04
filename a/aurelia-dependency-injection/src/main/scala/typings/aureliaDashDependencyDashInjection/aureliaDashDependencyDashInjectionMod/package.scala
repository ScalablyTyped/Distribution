package typings.aureliaDashDependencyDashInjection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object aureliaDashDependencyDashInjectionMod {
  import org.scalablytyped.runtime.Instantiable1
  import typings.aureliaDashDependencyDashInjection.Anon_InjectAnyArray

  type Args[TBase] = CtorArgs[TBase] | FuncArgs[TBase]
  type CtorArgs[TBase] = js.Array[js.Any]
  type CtorImpl[TBase] = js.Any
  type DependencyCtor[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] = Instantiable1[/* args */ TArgs, TImpl | TBase]
  type DependencyCtorOrFunctor[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] = (DependencyCtor[TBase, TImpl, TArgs]) | (DependencyFunctor[TBase, TImpl, TArgs])
  type DependencyFunctor[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] = js.Function1[/* args */ TArgs, TImpl | TBase]
  type FuncArgs[TBase] = js.Array[js.Any]
  type FuncReturns[TBase] = js.Any
  type Impl[TBase] = CtorImpl[TBase] | FuncReturns[TBase]
  type ImplOrAny[TImpl] = TImpl
  type Injectable = js.Function with Anon_InjectAnyArray
  type Primitive = Boolean | String | Double | js.Symbol | js.Object | (js.Function1[/* repeated */ js.Any, js.Any]) | js.Array[js.Any]
  type PrimitiveOrDependencyCtor[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] = (DependencyCtor[TBase, TImpl, TArgs]) | Primitive
  type PrimitiveOrDependencyCtorOrFunctor[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] = (DependencyCtor[TBase, TImpl, TArgs]) | (DependencyFunctor[TBase, TImpl, TArgs]) | Primitive
  type StrategyFunctor[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] = js.Function3[
    /* container */ js.UndefOr[Container], 
    /* ctor */ js.UndefOr[PrimitiveOrDependencyCtorOrFunctor[TBase, TImpl, TArgs]], 
    /* strategyResolver */ js.UndefOr[js.Any], 
    TImpl
  ]
}
