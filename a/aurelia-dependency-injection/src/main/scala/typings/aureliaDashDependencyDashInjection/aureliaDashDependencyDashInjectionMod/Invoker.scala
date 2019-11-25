package typings.aureliaDashDependencyDashInjection.aureliaDashDependencyDashInjectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Invoker[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] extends js.Object {
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

object Invoker {
  @scala.inline
  def apply[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](
    invoke: (Container, DependencyCtorOrFunctor[TBase, TImpl, TArgs], TArgs) => ImplOrAny[TImpl],
    invokeWithDynamicDependencies: (Container, DependencyCtorOrFunctor[TBase, TImpl, TArgs], js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any
    ], js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any
    ]) => ImplOrAny[TImpl]
  ): Invoker[TBase, TImpl, TArgs] = {
    val __obj = js.Dynamic.literal(invoke = js.Any.fromFunction3(invoke), invokeWithDynamicDependencies = js.Any.fromFunction4(invokeWithDynamicDependencies))
  
    __obj.asInstanceOf[Invoker[TBase, TImpl, TArgs]]
  }
}

@JSImport("aurelia-dependency-injection", "invoker")
@js.native
object invoker extends js.Object {
  def apply[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](value: Invoker[TBase, TImpl, TArgs]): js.Function1[/* target */ DependencyCtor[TBase, TImpl, TArgs], Unit] = js.native
}

