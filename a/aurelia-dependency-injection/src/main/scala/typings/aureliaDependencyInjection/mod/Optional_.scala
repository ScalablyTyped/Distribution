package typings.aureliaDependencyInjection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-dependency-injection", "Optional")
@js.native
class Optional_[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] protected () extends StObject {
  def this(key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]) = this()
  def this(key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs], checkParent: Boolean) = this()
  
  def get(container: Container): TImpl = js.native
}
/* static members */
object Optional_ {
  
  @JSImport("aurelia-dependency-injection", "Optional.of")
  @js.native
  def of[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]): Optional_[TBase, TImpl, TArgs] = js.native
  @JSImport("aurelia-dependency-injection", "Optional.of")
  @js.native
  def of[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs], checkParent: Boolean): Optional_[TBase, TImpl, TArgs] = js.native
}
