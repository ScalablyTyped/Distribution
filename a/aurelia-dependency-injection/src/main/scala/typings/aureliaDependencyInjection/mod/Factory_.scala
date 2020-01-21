package typings.aureliaDependencyInjection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-dependency-injection", "Factory")
@js.native
class Factory_[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] protected () extends js.Object {
  def this(key: PrimitiveOrDependencyCtorOrFunctor[TBase, TImpl, TArgs]) = this()
  def get(container: Container): DependencyFunctor[TBase, TImpl, TArgs] = js.native
}

/* static members */
@JSImport("aurelia-dependency-injection", "Factory")
@js.native
object Factory_ extends js.Object {
  def of[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: DependencyCtor[TBase, TImpl, TArgs]): Factory_[TBase, TImpl, TArgs] = js.native
}

