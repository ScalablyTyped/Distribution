package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.antd.esRadioRadioButtonMod.RadioButtonProps
import typings.antd.esRadioRadioButtonMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: name, tabIndex, onMouseLeave, onClick, onKeyDown, checked, style, autoFocus, id, className, disabled, onKeyPress, defaultChecked, onMouseEnter */
object RadioButton
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esRadioRadioButtonMod.default].asInstanceOf[String | js.Object]
  def apply[T](onChange: /* e */ T => Unit = null, prefixCls: String = null, value: js.Any = null): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (value != null) __obj.updateDynamic("value")(value)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = RadioButtonProps
}

