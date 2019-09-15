package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.antd.antdStrings.error
import typings.antd.antdStrings.finish
import typings.antd.antdStrings.horizontal
import typings.antd.antdStrings.navigation
import typings.antd.antdStrings.process
import typings.antd.antdStrings.small
import typings.antd.antdStrings.vertical
import typings.antd.antdStrings.wait
import typings.antd.esStepsMod.StepsProps
import typings.antd.esStepsMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, direction, className */
object Steps
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esStepsMod.default].asInstanceOf[String | js.Object]
  def apply(
    current: Int | Double = null,
    iconPrefix: String = null,
    initial: Int | Double = null,
    labelPlacement: horizontal | vertical = null,
    onChange: /* current */ Double => Unit = null,
    prefixCls: String = null,
    progressDot: Boolean | js.Function = null,
    size: typings.antd.antdStrings.default | small = null,
    status: wait | process | finish | error = null,
    `type`: typings.antd.antdStrings.default | navigation = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (iconPrefix != null) __obj.updateDynamic("iconPrefix")(iconPrefix)
    if (initial != null) __obj.updateDynamic("initial")(initial.asInstanceOf[js.Any])
    if (labelPlacement != null) __obj.updateDynamic("labelPlacement")(labelPlacement.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (progressDot != null) __obj.updateDynamic("progressDot")(progressDot.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = StepsProps
}

