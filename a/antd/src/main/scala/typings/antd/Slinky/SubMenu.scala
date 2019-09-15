package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.antd.esMenuSubMenuMod.SubMenuProps
import typings.antd.esMenuSubMenuMod.TitleEventEntity
import typings.antd.esMenuSubMenuMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, className, disabled */
object SubMenu
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esMenuSubMenuMod.default].asInstanceOf[String | js.Object]
  def apply(
    onTitleClick: /* e */ TitleEventEntity => Unit = null,
    onTitleMouseEnter: /* e */ TitleEventEntity => Unit = null,
    onTitleMouseLeave: /* e */ TitleEventEntity => Unit = null,
    popupClassName: String = null,
    popupOffset: js.Tuple2[Double, Double] = null,
    rootPrefixCls: String = null,
    title: TagMod[Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (onTitleClick != null) __obj.updateDynamic("onTitleClick")(js.Any.fromFunction1(onTitleClick))
    if (onTitleMouseEnter != null) __obj.updateDynamic("onTitleMouseEnter")(js.Any.fromFunction1(onTitleMouseEnter))
    if (onTitleMouseLeave != null) __obj.updateDynamic("onTitleMouseLeave")(js.Any.fromFunction1(onTitleMouseLeave))
    if (popupClassName != null) __obj.updateDynamic("popupClassName")(popupClassName)
    if (popupOffset != null) __obj.updateDynamic("popupOffset")(popupOffset)
    if (rootPrefixCls != null) __obj.updateDynamic("rootPrefixCls")(rootPrefixCls)
    if (title != null) __obj.updateDynamic("title")(title)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SubMenuProps
}

