package typings
package atAntDashDesignIconsLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractNode extends js.Object {
  var attrs: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Boolean]
  var children: js.UndefOr[js.Array[AbstractNode]] = js.undefined
  var tag: java.lang.String
}

object AbstractNode {
  @scala.inline
  def apply(
    attrs: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Boolean],
    tag: java.lang.String,
    children: js.Array[AbstractNode] = null
  ): AbstractNode = {
    val __obj = js.Dynamic.literal(attrs = attrs, tag = tag)
    if (children != null) __obj.updateDynamic("children")(children)
    __obj.asInstanceOf[AbstractNode]
  }
}

