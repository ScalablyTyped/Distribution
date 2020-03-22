package typings.antDesignIconsSvg.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractNode extends js.Object {
  var attrs: StringDictionary[String]
  var children: js.UndefOr[js.Array[AbstractNode]] = js.undefined
  var tag: String
}

object AbstractNode {
  @scala.inline
  def apply(attrs: StringDictionary[String], tag: String, children: js.Array[AbstractNode] = null): AbstractNode = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractNode]
  }
}

