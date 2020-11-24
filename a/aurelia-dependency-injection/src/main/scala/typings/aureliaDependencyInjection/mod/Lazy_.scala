package typings.aureliaDependencyInjection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-dependency-injection", "Lazy")
@js.native
class Lazy_[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] protected () extends js.Object {
  def this(key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]) = this()
  
  def get(container: Container): js.Function0[ImplOrAny[TImpl]] = js.native
}
/* static members */
@JSImport("aurelia-dependency-injection", "Lazy")
@js.native
object Lazy_ extends js.Object {
  
  def of[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]): Lazy_[TBase, TImpl, TArgs] = js.native
}
