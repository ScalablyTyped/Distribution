package typings.antd.esLayoutSiderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SiderContextProps extends js.Object {
  var collapsedWidth: js.UndefOr[String | Double] = js.undefined
  var siderCollapsed: js.UndefOr[Boolean] = js.undefined
}

object SiderContextProps {
  @scala.inline
  def apply(collapsedWidth: String | Double = null, siderCollapsed: js.UndefOr[Boolean] = js.undefined): SiderContextProps = {
    val __obj = js.Dynamic.literal()
    if (collapsedWidth != null) __obj.updateDynamic("collapsedWidth")(collapsedWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(siderCollapsed)) __obj.updateDynamic("siderCollapsed")(siderCollapsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[SiderContextProps]
  }
}

