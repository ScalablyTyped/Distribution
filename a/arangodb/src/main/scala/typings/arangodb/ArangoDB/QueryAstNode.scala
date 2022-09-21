package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryAstNode
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var subNodes: js.UndefOr[js.Array[QueryAstNode]] = js.undefined
  
  var `type`: String
}
object QueryAstNode {
  
  inline def apply(`type`: String): QueryAstNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryAstNode]
  }
  
  extension [Self <: QueryAstNode](x: Self) {
    
    inline def setSubNodes(value: js.Array[QueryAstNode]): Self = StObject.set(x, "subNodes", value.asInstanceOf[js.Any])
    
    inline def setSubNodesUndefined: Self = StObject.set(x, "subNodes", js.undefined)
    
    inline def setSubNodesVarargs(value: QueryAstNode*): Self = StObject.set(x, "subNodes", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
