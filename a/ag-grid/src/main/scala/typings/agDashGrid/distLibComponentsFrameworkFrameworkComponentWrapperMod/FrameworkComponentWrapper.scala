package typings.agDashGrid.distLibComponentsFrameworkFrameworkComponentWrapperMod

import typings.agDashGrid.Anon_Any
import typings.agDashGrid.distLibInterfacesIComponentMod.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FrameworkComponentWrapper extends js.Object {
  def wrap[A /* <: IComponent[_] */](frameworkComponent: Anon_Any, methodList: js.Array[String]): A = js.native
  def wrap[A /* <: IComponent[_] */](frameworkComponent: Anon_Any, methodList: js.Array[String], optionalMethodList: js.Array[String]): A = js.native
  def wrap[A /* <: IComponent[_] */](
    frameworkComponent: Anon_Any,
    methodList: js.Array[String],
    optionalMethodList: js.Array[String],
    componentName: String
  ): A = js.native
}

