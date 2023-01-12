package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`unary-expression`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnaryNode
  extends StObject
     with SQLNode {
  
  /**
    * The sql node.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#UnaryNode)
    */
  var expr: SQLNode
  
  var `type`: `unary-expression`
}
object UnaryNode {
  
  inline def apply(expr: SQLNode): UnaryNode = {
    val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("unary-expression")
    __obj.asInstanceOf[UnaryNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnaryNode] (val x: Self) extends AnyVal {
    
    inline def setExpr(value: SQLNode): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
    
    inline def setType(value: `unary-expression`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
