package typings
package aureliaDashKnockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Container extends js.Object {
  var container: aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod.Container
  def globalResources(resources: java.lang.String*): js.Any
}

object Anon_Container {
  @scala.inline
  def apply(
    container: aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod.Container,
    globalResources: js.Function1[/* repeated */ java.lang.String, js.Any]
  ): Anon_Container = {
    val __obj = js.Dynamic.literal(container = container, globalResources = globalResources)
  
    __obj.asInstanceOf[Anon_Container]
  }
}

