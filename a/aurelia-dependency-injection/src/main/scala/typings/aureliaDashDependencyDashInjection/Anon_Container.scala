package typings.aureliaDashDependencyDashInjection

import typings.aureliaDashDependencyDashInjection.aureliaDashDependencyDashInjectionMod.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Container extends js.Object {
  def get(container: Container, key: js.Any): js.Any
}

object Anon_Container {
  @scala.inline
  def apply(get: (Container, js.Any) => js.Any): Anon_Container = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get))
  
    __obj.asInstanceOf[Anon_Container]
  }
}

