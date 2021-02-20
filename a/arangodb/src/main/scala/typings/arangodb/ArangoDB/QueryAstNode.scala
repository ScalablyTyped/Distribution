package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryAstNode
  extends /* key */ StringDictionary[js.Any] {
  
  var subNodes: js.UndefOr[js.Array[QueryAstNode]] = js.native
  
  var `type`: String = js.native
}
object QueryAstNode {
  
  @scala.inline
  def apply(`type`: String): QueryAstNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryAstNode]
  }
  
  @scala.inline
  implicit class QueryAstNodeMutableBuilder[Self <: QueryAstNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubNodes(value: js.Array[QueryAstNode]): Self = StObject.set(x, "subNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubNodesUndefined: Self = StObject.set(x, "subNodes", js.undefined)
    
    @scala.inline
    def setSubNodesVarargs(value: QueryAstNode*): Self = StObject.set(x, "subNodes", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
