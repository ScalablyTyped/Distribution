package typings.antd

import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMonthReactNode extends js.Object {
  var monthReactNode: Element | Null
  var yearReactNode: Element
}

object AnonMonthReactNode {
  @scala.inline
  def apply(yearReactNode: Element, monthReactNode: Element = null): AnonMonthReactNode = {
    val __obj = js.Dynamic.literal(yearReactNode = yearReactNode.asInstanceOf[js.Any])
    if (monthReactNode != null) __obj.updateDynamic("monthReactNode")(monthReactNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMonthReactNode]
  }
}

