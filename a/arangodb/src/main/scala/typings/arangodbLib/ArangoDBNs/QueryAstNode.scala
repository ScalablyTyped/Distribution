package typings
package arangodbLib.ArangoDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryAstNode
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var subNodes: js.UndefOr[js.Array[QueryAstNode]] = js.undefined
  var `type`: java.lang.String
}

object QueryAstNode {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    subNodes: js.Array[QueryAstNode] = null
  ): QueryAstNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (subNodes != null) __obj.updateDynamic("subNodes")(subNodes)
    __obj.asInstanceOf[QueryAstNode]
  }
}

