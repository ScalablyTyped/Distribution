package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CollapsedWidthCollapsible extends js.Object {
  var collapsedWidth: scala.Double
  var collapsible: scala.Boolean
  var defaultCollapsed: scala.Boolean
  var reverseArrow: scala.Boolean
  var theme: antdLib.libLayoutSiderMod.SiderTheme
  var width: scala.Double
}

object Anon_CollapsedWidthCollapsible {
  @scala.inline
  def apply(
    collapsedWidth: scala.Double,
    collapsible: scala.Boolean,
    defaultCollapsed: scala.Boolean,
    reverseArrow: scala.Boolean,
    theme: antdLib.libLayoutSiderMod.SiderTheme,
    width: scala.Double
  ): Anon_CollapsedWidthCollapsible = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("collapsedWidth")(collapsedWidth)
    __obj.updateDynamic("collapsible")(collapsible)
    __obj.updateDynamic("defaultCollapsed")(defaultCollapsed)
    __obj.updateDynamic("reverseArrow")(reverseArrow)
    __obj.updateDynamic("theme")(theme)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Anon_CollapsedWidthCollapsible]
  }
}

