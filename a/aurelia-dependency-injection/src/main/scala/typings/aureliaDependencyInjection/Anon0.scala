package typings.aureliaDependencyInjection

import typings.aureliaDependencyInjection.mod.Args
import typings.aureliaDependencyInjection.mod.Container
import typings.aureliaDependencyInjection.mod.Impl
import typings.aureliaDependencyInjection.mod.PrimitiveOrDependencyCtor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] extends js.Object {
  def get(container: Container, key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]): TImpl
}

object Anon0 {
  @scala.inline
  def apply[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](get: (Container, PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]) => TImpl): Anon0[TBase, TImpl, TArgs] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get))
  
    __obj.asInstanceOf[Anon0[TBase, TImpl, TArgs]]
  }
}

