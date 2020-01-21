package typings.aureliaDependencyInjection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resolver_ extends js.Object {
  def get(container: Container, key: js.Any): js.Any
}

object Resolver_ {
  @scala.inline
  def apply(get: (Container, js.Any) => js.Any): Resolver_ = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get))
  
    __obj.asInstanceOf[Resolver_]
  }
}

