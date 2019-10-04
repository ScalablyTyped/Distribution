package typings.aureliaDashDependencyDashInjection.aureliaDashDependencyDashInjectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-dependency-injection", "NewInstance")
@js.native
class NewInstance[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] protected () extends js.Object {
  def this(
    key: PrimitiveOrDependencyCtorOrFunctor[TBase, TImpl, TArgs],
    dynamicDependencies: (/* import warning: ImportType.apply Failed type conversion: TArgs[number] */ js.Any)*
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
    dynamicDependencies: (/* import warning: ImportType.apply Failed type conversion: TArgs[number] */ js.Any)*
  ): NewInstance[TBase, TImpl, TArgs] = js.native
}

