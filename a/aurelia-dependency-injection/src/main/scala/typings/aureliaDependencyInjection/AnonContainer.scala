package typings.aureliaDependencyInjection

import typings.aureliaDependencyInjection.mod.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContainer extends js.Object {
  def get(container: Container, key: js.Any): js.Any
}

object AnonContainer {
  @scala.inline
  def apply(get: (Container, js.Any) => js.Any): AnonContainer = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get))
  
    __obj.asInstanceOf[AnonContainer]
  }
}

