package typings.aureliaDependencyInjection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Invoker_[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] extends js.Object {
  def invoke(container: Container, fn: DependencyCtorOrFunctor[TBase, TImpl, TArgs], dependencies: TArgs): ImplOrAny[TImpl]
  def invokeWithDynamicDependencies(
    container: Container,
    fn: DependencyCtorOrFunctor[TBase, TImpl, TArgs],
    staticDependencies: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any
    ],
    dynamicDependencies: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any
    ]
  ): ImplOrAny[TImpl]
}

object Invoker_ {
  @scala.inline
  def apply[TBase, /* <: typings.aureliaDependencyInjection.mod.Impl[TBase] */ TImpl, /* <: typings.aureliaDependencyInjection.mod.Args[TBase] */ TArgs](
    invoke: (Container, DependencyCtorOrFunctor[TBase, TImpl, TArgs], TArgs) => ImplOrAny[TImpl],
    invokeWithDynamicDependencies: (Container, DependencyCtorOrFunctor[TBase, TImpl, TArgs], js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any
    ], js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any
    ]) => ImplOrAny[TImpl]
  ): Invoker_[TBase, TImpl, TArgs] = {
    val __obj = js.Dynamic.literal(invoke = js.Any.fromFunction3(invoke), invokeWithDynamicDependencies = js.Any.fromFunction4(invokeWithDynamicDependencies))
    __obj.asInstanceOf[Invoker_[TBase, TImpl, TArgs]]
  }
}

