package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core", "ComponentFactoryResolver")
@js.native
abstract class ComponentFactoryResolver () extends js.Object {
  def resolveComponentFactory[T](component: Type[T]): ComponentFactory[T] = js.native
}

/* static members */
@JSImport("@angular/core", "ComponentFactoryResolver")
@js.native
object ComponentFactoryResolver extends js.Object {
  var NULL: atAngularCoreLib.atAngularCoreMod.ComponentFactoryResolver = js.native
}

