package typings.aureliaDependencyInjection.anon

import typings.aureliaDependencyInjection.mod.Args
import typings.aureliaDependencyInjection.mod.Container
import typings.aureliaDependencyInjection.mod.Impl
import typings.aureliaDependencyInjection.mod.PrimitiveOrDependencyCtor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `0`[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] extends js.Object {
  def get(container: Container, key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]): TImpl = js.native
}

object `0` {
  @scala.inline
  def apply[TBase, /* <: typings.aureliaDependencyInjection.mod.Impl[TBase] */ TImpl, /* <: typings.aureliaDependencyInjection.mod.Args[TBase] */ TArgs](get: (Container, PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]) => TImpl): `0`[TBase, TImpl, TArgs] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get))
    __obj.asInstanceOf[`0`[TBase, TImpl, TArgs]]
  }
  @scala.inline
  implicit class `0Ops`[Self <: `0`[_, _, _], TBase, /* <: typings.aureliaDependencyInjection.mod.Impl[TBase] */ TImpl, /* <: typings.aureliaDependencyInjection.mod.Args[TBase] */ TArgs] (val x: Self with (`0`[TBase, TImpl, TArgs])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGet(value: (Container, PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]) => TImpl): Self = this.set("get", js.Any.fromFunction2(value))
  }
  
}

