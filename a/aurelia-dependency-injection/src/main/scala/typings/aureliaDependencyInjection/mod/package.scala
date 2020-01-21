package typings.aureliaDependencyInjection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Args[TBase] = typings.aureliaDependencyInjection.mod.CtorArgs[TBase] | typings.aureliaDependencyInjection.mod.FuncArgs[TBase]
  type CtorArgs[TBase] = js.Array[js.Any]
  type CtorImpl[TBase] = js.Any
  type DependencyCtor[TBase, TImpl /* <: typings.aureliaDependencyInjection.mod.Impl[TBase] */, TArgs /* <: typings.aureliaDependencyInjection.mod.Args[TBase] */] = org.scalablytyped.runtime.Instantiable1[/* args */ TArgs, TImpl | TBase]
  type DependencyCtorOrFunctor[TBase, TImpl /* <: typings.aureliaDependencyInjection.mod.Impl[TBase] */, TArgs /* <: typings.aureliaDependencyInjection.mod.Args[TBase] */] = (typings.aureliaDependencyInjection.mod.DependencyCtor[TBase, TImpl, TArgs]) | (typings.aureliaDependencyInjection.mod.DependencyFunctor[TBase, TImpl, TArgs])
  type DependencyFunctor[TBase, TImpl /* <: typings.aureliaDependencyInjection.mod.Impl[TBase] */, TArgs /* <: typings.aureliaDependencyInjection.mod.Args[TBase] */] = js.Function1[/* args */ TArgs, TImpl | TBase]
  type FuncArgs[TBase] = js.Array[js.Any]
  type FuncReturns[TBase] = js.Any
  type Impl[TBase] = typings.aureliaDependencyInjection.mod.CtorImpl[TBase] | typings.aureliaDependencyInjection.mod.FuncReturns[TBase]
  type ImplOrAny[TImpl] = TImpl
  type Injectable = js.Function with typings.aureliaDependencyInjection.AnonInjectAnyArray
  type Primitive = scala.Boolean | java.lang.String | scala.Double | js.Symbol | js.Object | (js.Function1[/* repeated */ js.Any, js.Any]) | js.Array[js.Any]
  type PrimitiveOrDependencyCtor[TBase, TImpl /* <: typings.aureliaDependencyInjection.mod.Impl[TBase] */, TArgs /* <: typings.aureliaDependencyInjection.mod.Args[TBase] */] = (typings.aureliaDependencyInjection.mod.DependencyCtor[TBase, TImpl, TArgs]) | typings.aureliaDependencyInjection.mod.Primitive
  type PrimitiveOrDependencyCtorOrFunctor[TBase, TImpl /* <: typings.aureliaDependencyInjection.mod.Impl[TBase] */, TArgs /* <: typings.aureliaDependencyInjection.mod.Args[TBase] */] = (typings.aureliaDependencyInjection.mod.DependencyCtor[TBase, TImpl, TArgs]) | (typings.aureliaDependencyInjection.mod.DependencyFunctor[TBase, TImpl, TArgs]) | typings.aureliaDependencyInjection.mod.Primitive
  type StrategyFunctor[TBase, TImpl /* <: typings.aureliaDependencyInjection.mod.Impl[TBase] */, TArgs /* <: typings.aureliaDependencyInjection.mod.Args[TBase] */] = js.Function3[
    /* container */ js.UndefOr[typings.aureliaDependencyInjection.mod.Container], 
    /* ctor */ js.UndefOr[
      typings.aureliaDependencyInjection.mod.PrimitiveOrDependencyCtorOrFunctor[TBase, TImpl, TArgs]
    ], 
    /* strategyResolver */ js.UndefOr[js.Any], 
    TImpl
  ]
}
