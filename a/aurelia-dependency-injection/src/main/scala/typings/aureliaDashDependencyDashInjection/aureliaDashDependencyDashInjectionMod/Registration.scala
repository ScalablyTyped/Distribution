package typings.aureliaDashDependencyDashInjection.aureliaDashDependencyDashInjectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Registration[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] extends js.Object {
  def registerResolver(
    container: Container,
    key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs],
    fn: DependencyCtorOrFunctor[TBase, TImpl, TArgs]
  ): Resolver
}

object Registration {
  @scala.inline
  def apply[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](
    registerResolver: (Container, PrimitiveOrDependencyCtor[TBase, TImpl, TArgs], DependencyCtorOrFunctor[TBase, TImpl, TArgs]) => Resolver
  ): Registration[TBase, TImpl, TArgs] = {
    val __obj = js.Dynamic.literal(registerResolver = js.Any.fromFunction3(registerResolver))
  
    __obj.asInstanceOf[Registration[TBase, TImpl, TArgs]]
  }
}

