package typings.aureliaDashDependencyDashInjection.aureliaDashDependencyDashInjectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resolver extends js.Object {
  def get(container: Container, key: js.Any): js.Any
}

object Resolver {
  @scala.inline
  def apply(get: (Container, js.Any) => js.Any): Resolver = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get))
  
    __obj.asInstanceOf[Resolver]
  }
}

