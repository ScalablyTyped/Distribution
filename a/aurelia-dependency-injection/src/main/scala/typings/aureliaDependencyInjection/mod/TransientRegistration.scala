package typings.aureliaDependencyInjection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-dependency-injection", "TransientRegistration")
@js.native
class TransientRegistration[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] ()
  extends StObject
     with Registration_[TBase, TImpl, TArgs] {
  def this(key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]) = this()
  
  /* CompleteClass */
  override def registerResolver(
    container: Container,
    key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs],
    fn: DependencyCtorOrFunctor[TBase, TImpl, TArgs]
  ): Resolver_ = js.native
}
