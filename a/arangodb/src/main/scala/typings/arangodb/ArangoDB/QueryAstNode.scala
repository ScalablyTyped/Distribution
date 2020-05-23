package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryAstNode
  extends /* key */ StringDictionary[js.Any] {
  var subNodes: js.UndefOr[js.Array[QueryAstNode]] = js.undefined
  var `type`: String
}

object QueryAstNode {
  @scala.inline
  def apply(
    `type`: String,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    subNodes: js.Array[QueryAstNode] = null
  ): QueryAstNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (subNodes != null) __obj.updateDynamic("subNodes")(subNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryAstNode]
  }
}

