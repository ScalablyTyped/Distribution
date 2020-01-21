package typings.aureliaKnockout

import typings.aureliaDependencyInjection.mod.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContainer extends js.Object {
  var container: Container
  def globalResources(resources: String*): js.Any
}

object AnonContainer {
  @scala.inline
  def apply(container: Container, globalResources: /* repeated */ String => js.Any): AnonContainer = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], globalResources = js.Any.fromFunction1(globalResources))
  
    __obj.asInstanceOf[AnonContainer]
  }
}

