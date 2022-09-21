package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.function
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionNode
  extends StObject
     with Object
     with SQLNode {
  
  /**
    * Function arguments.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#FunctionNode)
    */
  var args: ListNode
  
  /**
    * Name of the SQL function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#FunctionNode)
    */
  var name: String
  
  var `type`: function
}
object FunctionNode {
  
  inline def apply(
    args: ListNode,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    name: String,
    propertyIsEnumerable: PropertyKey => Boolean
  ): FunctionNode = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("function")
    __obj.asInstanceOf[FunctionNode]
  }
  
  extension [Self <: FunctionNode](x: Self) {
    
    inline def setArgs(value: ListNode): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: function): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
