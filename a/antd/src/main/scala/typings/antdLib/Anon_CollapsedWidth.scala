package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CollapsedWidth extends js.Object {
  var collapsedWidth: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String | scala.Double]
  var siderCollapsed: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean]
}

object Anon_CollapsedWidth {
  @scala.inline
  def apply(
    collapsedWidth: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String | scala.Double],
    siderCollapsed: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean]
  ): Anon_CollapsedWidth = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("collapsedWidth")(collapsedWidth)
    __obj.updateDynamic("siderCollapsed")(siderCollapsed)
    __obj.asInstanceOf[Anon_CollapsedWidth]
  }
}

