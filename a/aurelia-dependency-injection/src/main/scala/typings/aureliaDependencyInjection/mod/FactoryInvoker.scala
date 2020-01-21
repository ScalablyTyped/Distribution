package typings.aureliaDependencyInjection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-dependency-injection", "FactoryInvoker")
@js.native
class FactoryInvoker[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] () extends Invoker_[TBase, TImpl, TArgs] {
  /* CompleteClass */
  override def invoke(container: Container, fn: DependencyCtorOrFunctor[TBase, TImpl, TArgs], dependencies: TArgs): ImplOrAny[TImpl] = js.native
  /* CompleteClass */
  override def invokeWithDynamicDependencies(
    container: Container,
    fn: DependencyCtorOrFunctor[TBase, TImpl, TArgs],
    staticDependencies: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any
    ],
    dynamicDependencies: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any
    ]
  ): ImplOrAny[TImpl] = js.native
}

/* static members */
@JSImport("aurelia-dependency-injection", "FactoryInvoker")
@js.native
object FactoryInvoker extends js.Object {
  var instance: FactoryInvoker[_, Impl[_], Args[_]] = js.native
}

