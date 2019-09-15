package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.antd.esButtonButtonMod.ButtonType
import typings.antd.esButtonButtonMod.NativeButtonProps
import typings.antd.esModalActionButtonMod.ActionButtonProps
import typings.antd.esModalActionButtonMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: autoFocus */
object ActionButton
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esModalActionButtonMod.default].asInstanceOf[String | js.Object]
  def apply(
    closeModal: js.Function,
    actionFn: /* repeated */ js.Any => _ | js.Thenable[_] = null,
    buttonProps: NativeButtonProps = null,
    `type`: ButtonType = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(closeModal = closeModal)
    if (actionFn != null) __obj.updateDynamic("actionFn")(js.Any.fromFunction1(actionFn))
    if (buttonProps != null) __obj.updateDynamic("buttonProps")(buttonProps)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ActionButtonProps
}

