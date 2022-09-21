package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.case_expression
import typings.arcgisJsApi.arcgisJsApiStrings.simple
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleCaseNode
  extends StObject
     with Object
     with SQLNode {
  
  /**
    * When nodes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#SimpleCaseNode)
    */
  var clauses: js.Array[WhenNode]
  
  /**
    * else sql node.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#SimpleCaseNode)
    */
  var `else`: SQLNode
  
  var format: simple
  
  /**
    * SQL node.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#SimpleCaseNode)
    */
  var operand: SQLNode
  
  var `type`: case_expression
}
object SimpleCaseNode {
  
  inline def apply(
    clauses: js.Array[WhenNode],
    constructor: js.Function,
    `else`: SQLNode,
    hasOwnProperty: PropertyKey => Boolean,
    operand: SQLNode,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SimpleCaseNode = {
    val __obj = js.Dynamic.literal(clauses = clauses.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], format = "simple", hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), operand = operand.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("else")(`else`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("case_expression")
    __obj.asInstanceOf[SimpleCaseNode]
  }
  
  extension [Self <: SimpleCaseNode](x: Self) {
    
    inline def setClauses(value: js.Array[WhenNode]): Self = StObject.set(x, "clauses", value.asInstanceOf[js.Any])
    
    inline def setClausesVarargs(value: WhenNode*): Self = StObject.set(x, "clauses", js.Array(value*))
    
    inline def setElse(value: SQLNode): Self = StObject.set(x, "else", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: simple): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setOperand(value: SQLNode): Self = StObject.set(x, "operand", value.asInstanceOf[js.Any])
    
    inline def setType(value: case_expression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
