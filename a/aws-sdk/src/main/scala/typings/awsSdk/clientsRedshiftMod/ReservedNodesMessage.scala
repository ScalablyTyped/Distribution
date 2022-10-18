package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReservedNodesMessage extends StObject {
  
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The list of ReservedNode objects.
    */
  var ReservedNodes: js.UndefOr[ReservedNodeList] = js.undefined
}
object ReservedNodesMessage {
  
  inline def apply(): ReservedNodesMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedNodesMessage]
  }
  
  extension [Self <: ReservedNodesMessage](x: Self) {
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setReservedNodes(value: ReservedNodeList): Self = StObject.set(x, "ReservedNodes", value.asInstanceOf[js.Any])
    
    inline def setReservedNodesUndefined: Self = StObject.set(x, "ReservedNodes", js.undefined)
    
    inline def setReservedNodesVarargs(value: ReservedNode*): Self = StObject.set(x, "ReservedNodes", js.Array(value*))
  }
}
