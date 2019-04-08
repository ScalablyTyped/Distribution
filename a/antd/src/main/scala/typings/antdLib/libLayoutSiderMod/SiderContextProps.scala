package typings
package antdLib.libLayoutSiderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SiderContextProps extends js.Object {
  var collapsedWidth: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var siderCollapsed: js.UndefOr[scala.Boolean] = js.undefined
}

object SiderContextProps {
  @scala.inline
  def apply(
    collapsedWidth: java.lang.String | scala.Double = null,
    siderCollapsed: js.UndefOr[scala.Boolean] = js.undefined
  ): SiderContextProps = {
    val __obj = js.Dynamic.literal()
    if (collapsedWidth != null) __obj.updateDynamic("collapsedWidth")(collapsedWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(siderCollapsed)) __obj.updateDynamic("siderCollapsed")(siderCollapsed)
    __obj.asInstanceOf[SiderContextProps]
  }
}

