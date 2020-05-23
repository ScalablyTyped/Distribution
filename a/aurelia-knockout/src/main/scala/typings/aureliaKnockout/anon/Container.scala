package typings.aureliaKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Container extends js.Object {
  var container: typings.aureliaDependencyInjection.mod.Container
  def globalResources(resources: String*): js.Any
}

object Container {
  @scala.inline
  def apply(
    container: typings.aureliaDependencyInjection.mod.Container,
    globalResources: /* repeated */ String => js.Any
  ): Container = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], globalResources = js.Any.fromFunction1(globalResources))
    __obj.asInstanceOf[Container]
  }
}

