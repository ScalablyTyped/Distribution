package typings.aframe.mod

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
  def apply[T](
    Component: ComponentConstructor[T],
    dependencies: js.Array[String] = null,
    multiple: js.UndefOr[Boolean] = js.undefined
  ): ComponentDescriptor[T] = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentDescriptor[T]]
  }
}

