package typings.aureliaDependencyInjection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  @JSImport("aurelia-dependency-injection", "Optional")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def of[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]): Optional_[TBase, TImpl, TArgs] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(key.asInstanceOf[js.Any]).asInstanceOf[Optional_[TBase, TImpl, TArgs]]
  @scala.inline
  def of[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs], checkParent: Boolean): Optional_[TBase, TImpl, TArgs] = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(key.asInstanceOf[js.Any], checkParent.asInstanceOf[js.Any])).asInstanceOf[Optional_[TBase, TImpl, TArgs]]
}
