package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CollapsedWidthSiderCollapsed extends js.Object {
  var collapsedWidth: js.UndefOr[java.lang.String | scala.Double]
  var siderCollapsed: js.UndefOr[scala.Boolean]
}

object Anon_CollapsedWidthSiderCollapsed {
  @scala.inline
  def apply(
    collapsedWidth: java.lang.String | scala.Double = null,
    siderCollapsed: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_CollapsedWidthSiderCollapsed = {
    val __obj = js.Dynamic.literal()
    if (collapsedWidth != null) __obj.updateDynamic("collapsedWidth")(collapsedWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(siderCollapsed)) __obj.updateDynamic("siderCollapsed")(siderCollapsed)
    __obj.asInstanceOf[Anon_CollapsedWidthSiderCollapsed]
  }
}

