package typings.aureliaDependencyInjection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-dependency-injection", "Optional")
@js.native
class Optional_[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] protected () extends js.Object {
  def this(key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]) = this()
  def this(key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs], checkParent: Boolean) = this()
  
  def get(container: Container): TImpl = js.native
}
/* static members */
@JSImport("aurelia-dependency-injection", "Optional")
@js.native
object Optional_ extends js.Object {
  
  def of[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]): Optional_[TBase, TImpl, TArgs] = js.native
  def of[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs], checkParent: Boolean): Optional_[TBase, TImpl, TArgs] = js.native
}
