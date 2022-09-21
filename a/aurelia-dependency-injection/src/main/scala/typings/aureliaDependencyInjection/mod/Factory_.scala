package typings.aureliaDependencyInjection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-dependency-injection", "Factory")
@js.native
open class Factory_[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] protected () extends StObject {
  def this(key: PrimitiveOrDependencyCtorOrFunctor[TBase, TImpl, TArgs]) = this()
  
  def get(container: Container): DependencyFunctor[TBase, TImpl, TArgs] = js.native
}
/* static members */
object Factory_ {
  
  @JSImport("aurelia-dependency-injection", "Factory")
  @js.native
  val ^ : js.Any = js.native
  
  inline def of[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: DependencyCtor[TBase, TImpl, TArgs]): Factory_[TBase, TImpl, TArgs] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(key.asInstanceOf[js.Any]).asInstanceOf[Factory_[TBase, TImpl, TArgs]]
}
