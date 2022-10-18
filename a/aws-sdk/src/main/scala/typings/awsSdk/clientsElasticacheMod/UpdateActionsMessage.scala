package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateActionsMessage extends StObject {
  
  /**
    * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * Returns a list of update actions
    */
  var UpdateActions: js.UndefOr[UpdateActionList] = js.undefined
}
object UpdateActionsMessage {
  
  inline def apply(): UpdateActionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateActionsMessage]
  }
  
  extension [Self <: UpdateActionsMessage](x: Self) {
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setUpdateActions(value: UpdateActionList): Self = StObject.set(x, "UpdateActions", value.asInstanceOf[js.Any])
    
    inline def setUpdateActionsUndefined: Self = StObject.set(x, "UpdateActions", js.undefined)
    
    inline def setUpdateActionsVarargs(value: UpdateAction*): Self = StObject.set(x, "UpdateActions", js.Array(value*))
  }
}
