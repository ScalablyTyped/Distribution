package typings.aureliaDependencyInjection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-dependency-injection", "Lazy")
@js.native
open class Lazy_[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] protected () extends StObject {
  def this(key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]) = this()
  
  def get(container: Container): js.Function0[ImplOrAny[TImpl]] = js.native
}
/* static members */
object Lazy_ {
  
  @JSImport("aurelia-dependency-injection", "Lazy")
  @js.native
  val ^ : js.Any = js.native
  
  inline def of[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]): Lazy_[TBase, TImpl, TArgs] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(key.asInstanceOf[js.Any]).asInstanceOf[Lazy_[TBase, TImpl, TArgs]]
}
