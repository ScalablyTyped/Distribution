package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.antd.esTagCheckableTagMod.CheckableTagProps
import typings.antd.esTagCheckableTagMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: checked, style, className */
object CheckableTag
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esTagCheckableTagMod.default].asInstanceOf[String | js.Object]
  def apply(onChange: /* checked */ Boolean => Unit = null, prefixCls: String = null): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CheckableTagProps
}

