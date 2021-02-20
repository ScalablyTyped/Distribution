package typings.aureliaDependencyInjection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Registration_[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] extends StObject {
  
  def registerResolver(
    container: Container,
    key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs],
    fn: DependencyCtorOrFunctor[TBase, TImpl, TArgs]
  ): Resolver_ = js.native
}
object Registration_ {
  
  @scala.inline
  def apply[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](
    registerResolver: (Container, PrimitiveOrDependencyCtor[TBase, TImpl, TArgs], DependencyCtorOrFunctor[TBase, TImpl, TArgs]) => Resolver_
  ): Registration_[TBase, TImpl, TArgs] = {
    val __obj = js.Dynamic.literal(registerResolver = js.Any.fromFunction3(registerResolver))
    __obj.asInstanceOf[Registration_[TBase, TImpl, TArgs]]
  }
  
  @scala.inline
  implicit class Registration_MutableBuilder[Self <: Registration_[_, _, _], TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] (val x: Self with (Registration_[TBase, TImpl, TArgs])) extends AnyVal {
    
    @scala.inline
    def setRegisterResolver(
      value: (Container, PrimitiveOrDependencyCtor[TBase, TImpl, TArgs], DependencyCtorOrFunctor[TBase, TImpl, TArgs]) => Resolver_
    ): Self = StObject.set(x, "registerResolver", js.Any.fromFunction3(value))
  }
}
