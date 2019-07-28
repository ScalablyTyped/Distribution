package typings.aframe.aframeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentDescriptor[T /* <: Component[_, System[_]] */] extends js.Object {
  var Component: ComponentConstructor[T]
  var dependencies: js.UndefOr[js.Array[String]] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
}

object ComponentDescriptor {
  @scala.inline
  def apply[T /* <: Component[_, System[_]] */](
    Component: ComponentConstructor[T],
    dependencies: js.Array[String] = null,
    multiple: js.UndefOr[Boolean] = js.undefined
  ): ComponentDescriptor[T] = {
    val __obj = js.Dynamic.literal(Component = Component)
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies)
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    __obj.asInstanceOf[ComponentDescriptor[T]]
  }
}

