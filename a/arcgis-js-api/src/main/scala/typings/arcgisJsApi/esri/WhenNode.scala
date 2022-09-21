package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`when-clause`
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WhenNode
  extends StObject
     with Object
     with SQLNode {
  
  /**
    * operand.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#WhenNode)
    */
  var operand: SQLNode
  
  var `type`: `when-clause`
  
  /**
    * value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#WhenNode)
    */
  var value: SQLNode
}
object WhenNode {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    operand: SQLNode,
    propertyIsEnumerable: PropertyKey => Boolean,
    value: SQLNode
  ): WhenNode = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), operand = operand.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("when-clause")
    __obj.asInstanceOf[WhenNode]
  }
  
  extension [Self <: WhenNode](x: Self) {
    
    inline def setOperand(value: SQLNode): Self = StObject.set(x, "operand", value.asInstanceOf[js.Any])
    
    inline def setType(value: `when-clause`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: SQLNode): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
