package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.antd.esTabsMod.TabPaneProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, className, disabled */
object TabPane
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  override val component: String | js.Object = typings.antd.esTabsMod.default.TabPane.asInstanceOf[String | js.Object]
  def apply(
    closable: js.UndefOr[Boolean] = js.undefined,
    forceRender: js.UndefOr[Boolean] = js.undefined,
    tab: TagMod[Any] | String = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable)
    if (!js.isUndefined(forceRender)) __obj.updateDynamic("forceRender")(forceRender)
    if (tab != null) __obj.updateDynamic("tab")(tab.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TabPaneProps
}

