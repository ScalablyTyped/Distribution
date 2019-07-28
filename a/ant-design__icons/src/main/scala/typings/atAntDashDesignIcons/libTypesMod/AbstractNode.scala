package typings.atAntDashDesignIcons.libTypesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractNode extends js.Object {
  var attrs: StringDictionary[String | Boolean]
  var children: js.UndefOr[js.Array[AbstractNode]] = js.undefined
  var tag: String
}

object AbstractNode {
  @scala.inline
  def apply(attrs: StringDictionary[String | Boolean], tag: String, children: js.Array[AbstractNode] = null): AbstractNode = {
    val __obj = js.Dynamic.literal(attrs = attrs, tag = tag)
    if (children != null) __obj.updateDynamic("children")(children)
    __obj.asInstanceOf[AbstractNode]
  }
}

