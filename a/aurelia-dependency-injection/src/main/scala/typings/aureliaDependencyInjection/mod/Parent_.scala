package typings.aureliaDependencyInjection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-dependency-injection", "Parent")
@js.native
class Parent_[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] protected () extends StObject {
  def this(key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]) = this()
  
  def get(container: Container): TImpl = js.native
}
/* static members */
object Parent_ {
  
  @JSImport("aurelia-dependency-injection", "Parent")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def of[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]): Parent_[TBase, TImpl, TArgs] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(key.asInstanceOf[js.Any]).asInstanceOf[Parent_[TBase, TImpl, TArgs]]
}
