package typings.awsSdk.clientsNeptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBParameterGroupsMessage extends StObject {
  
  /**
    * A list of DBParameterGroup instances.
    */
  var DBParameterGroups: js.UndefOr[DBParameterGroupList] = js.undefined
  
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object DBParameterGroupsMessage {
  
  inline def apply(): DBParameterGroupsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBParameterGroupsMessage]
  }
  
  extension [Self <: DBParameterGroupsMessage](x: Self) {
    
    inline def setDBParameterGroups(value: DBParameterGroupList): Self = StObject.set(x, "DBParameterGroups", value.asInstanceOf[js.Any])
    
    inline def setDBParameterGroupsUndefined: Self = StObject.set(x, "DBParameterGroups", js.undefined)
    
    inline def setDBParameterGroupsVarargs(value: DBParameterGroup*): Self = StObject.set(x, "DBParameterGroups", js.Array(value*))
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
