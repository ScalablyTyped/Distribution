package typings.agGrid.frameworkComponentWrapperMod

import typings.agGrid.anon.InstantiableAny
import typings.agGrid.iComponentMod.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FrameworkComponentWrapper extends js.Object {
  def wrap[A /* <: IComponent[_] */](frameworkComponent: InstantiableAny, methodList: js.Array[String]): A = js.native
  def wrap[A /* <: IComponent[_] */](
    frameworkComponent: InstantiableAny,
    methodList: js.Array[String],
    optionalMethodList: js.UndefOr[scala.Nothing],
    componentName: String
  ): A = js.native
  def wrap[A /* <: IComponent[_] */](
    frameworkComponent: InstantiableAny,
    methodList: js.Array[String],
    optionalMethodList: js.Array[String]
  ): A = js.native
  def wrap[A /* <: IComponent[_] */](
    frameworkComponent: InstantiableAny,
    methodList: js.Array[String],
    optionalMethodList: js.Array[String],
    componentName: String
  ): A = js.native
}

