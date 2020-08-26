package typings.aureliaDependencyInjection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resolver_ extends js.Object {
  def get(container: Container, key: js.Any): js.Any = js.native
}

object Resolver_ {
  @scala.inline
  def apply(get: (Container, js.Any) => js.Any): Resolver_ = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get))
    __obj.asInstanceOf[Resolver_]
  }
  @scala.inline
  implicit class Resolver_Ops[Self <: Resolver_] (val x: Self) extends AnyVal {
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
    def setGet(value: (Container, js.Any) => js.Any): Self = this.set("get", js.Any.fromFunction2(value))
  }
  
}

