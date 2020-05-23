package typings.aureliaDependencyInjection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Registration_[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] extends js.Object {
  def registerResolver(
    container: Container,
    key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs],
    fn: DependencyCtorOrFunctor[TBase, TImpl, TArgs]
  ): Resolver_
}

object Registration_ {
  @scala.inline
  def apply[TBase, TImpl, TArgs](
    registerResolver: (Container, PrimitiveOrDependencyCtor[TBase, TImpl, TArgs], DependencyCtorOrFunctor[TBase, TImpl, TArgs]) => Resolver_
  ): Registration_[TBase, TImpl, TArgs] = {
    val __obj = js.Dynamic.literal(registerResolver = js.Any.fromFunction3(registerResolver))
    __obj.asInstanceOf[Registration_[TBase, TImpl, TArgs]]
  }
}

