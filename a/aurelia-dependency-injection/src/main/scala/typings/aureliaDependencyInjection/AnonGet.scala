package typings.aureliaDependencyInjection

import typings.aureliaDependencyInjection.mod.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGet extends js.Object {
  def get(container: Container, key: js.Any): js.Any
}

object AnonGet {
  @scala.inline
  def apply(get: (Container, js.Any) => js.Any): AnonGet = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get))
  
    __obj.asInstanceOf[AnonGet]
  }
}

