package typings
package antdLib.libLayoutSiderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SiderContext extends js.Object {
  var siderCollapsed: scala.Boolean
}

object SiderContext {
  @scala.inline
  def apply(siderCollapsed: scala.Boolean): SiderContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("siderCollapsed")(siderCollapsed)
    __obj.asInstanceOf[SiderContext]
  }
}

