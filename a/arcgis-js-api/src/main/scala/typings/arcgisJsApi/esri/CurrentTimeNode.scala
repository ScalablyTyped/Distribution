package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`current-time`
import typings.arcgisJsApi.arcgisJsApiStrings.date
import typings.arcgisJsApi.arcgisJsApiStrings.timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentTimeNode
  extends StObject
     with SQLNode {
  
  /**
    * The current time node mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#CurrentTimeNode)
    */
  var mode: timestamp | date
  
  var `type`: `current-time`
}
object CurrentTimeNode {
  
  inline def apply(mode: timestamp | date): CurrentTimeNode = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("current-time")
    __obj.asInstanceOf[CurrentTimeNode]
  }
  
  extension [Self <: CurrentTimeNode](x: Self) {
    
    inline def setMode(value: timestamp | date): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setType(value: `current-time`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
