package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`case-expression`
import typings.arcgisJsApi.arcgisJsApiStrings.searched
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchedCaseNode
  extends StObject
     with SQLNode {
  
  /**
    * When clauses.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#SearchedCaseNode)
    */
  var clauses: js.Array[WhenNode]
  
  /**
    * Else SQL node.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#SearchedCaseNode)
    */
  var `else`: SQLNode
  
  /**
    * Case expression format.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#SearchedCaseNode)
    */
  var format: searched
  
  var `type`: `case-expression`
}
object SearchedCaseNode {
  
  inline def apply(clauses: js.Array[WhenNode], `else`: SQLNode): SearchedCaseNode = {
    val __obj = js.Dynamic.literal(clauses = clauses.asInstanceOf[js.Any], format = "searched")
    __obj.updateDynamic("else")(`else`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("case-expression")
    __obj.asInstanceOf[SearchedCaseNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchedCaseNode] (val x: Self) extends AnyVal {
    
    inline def setClauses(value: js.Array[WhenNode]): Self = StObject.set(x, "clauses", value.asInstanceOf[js.Any])
    
    inline def setClausesVarargs(value: WhenNode*): Self = StObject.set(x, "clauses", js.Array(value*))
    
    inline def setElse(value: SQLNode): Self = StObject.set(x, "else", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: searched): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setType(value: `case-expression`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
