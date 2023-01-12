package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`null`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NullNode
  extends StObject
     with SQLNode {
  
  var `type`: `null`
  
  /**
    * Null value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#NullNode)
    */
  var value: Null
}
object NullNode {
  
  inline def apply(value: Null): NullNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("null")
    __obj.asInstanceOf[NullNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NullNode] (val x: Self) extends AnyVal {
    
    inline def setType(value: `null`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Null): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
