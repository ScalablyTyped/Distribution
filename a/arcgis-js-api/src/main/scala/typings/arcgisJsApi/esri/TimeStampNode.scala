package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeStampNode
  extends StObject
     with SQLNode {
  
  var `type`: timestamp
  
  /**
    * String date value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#TimeStampNode)
    */
  var value: String
}
object TimeStampNode {
  
  inline def apply(value: String): TimeStampNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("timestamp")
    __obj.asInstanceOf[TimeStampNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeStampNode] (val x: Self) extends AnyVal {
    
    inline def setType(value: timestamp): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
