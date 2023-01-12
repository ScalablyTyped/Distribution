package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.string_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringNode
  extends StObject
     with SQLNode {
  
  var `type`: string_
  
  /**
    * The string value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#StringNode)
    */
  var value: String
}
object StringNode {
  
  inline def apply(value: String): StringNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[StringNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StringNode] (val x: Self) extends AnyVal {
    
    inline def setType(value: string_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
