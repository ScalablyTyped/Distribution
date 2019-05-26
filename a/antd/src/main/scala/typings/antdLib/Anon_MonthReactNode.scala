package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MonthReactNode extends js.Object {
  var monthReactNode: reactLib.reactMod.Global.JSXNs.Element | scala.Null
  var yearReactNode: reactLib.reactMod.Global.JSXNs.Element
}

object Anon_MonthReactNode {
  @scala.inline
  def apply(
    yearReactNode: reactLib.reactMod.Global.JSXNs.Element,
    monthReactNode: reactLib.reactMod.Global.JSXNs.Element = null
  ): Anon_MonthReactNode = {
    val __obj = js.Dynamic.literal(yearReactNode = yearReactNode)
    if (monthReactNode != null) __obj.updateDynamic("monthReactNode")(monthReactNode)
    __obj.asInstanceOf[Anon_MonthReactNode]
  }
}

