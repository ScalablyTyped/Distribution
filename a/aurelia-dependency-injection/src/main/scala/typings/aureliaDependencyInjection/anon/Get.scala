package typings.aureliaDependencyInjection.anon

import typings.aureliaDependencyInjection.mod.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Get extends js.Object {
  def get(container: Container, key: js.Any): js.Any
}

object Get {
  @scala.inline
  def apply(get: (Container, js.Any) => js.Any): Get = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get))
    __obj.asInstanceOf[Get]
  }
}

