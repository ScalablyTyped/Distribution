package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListConnectorEntitiesResponse extends StObject {
  
  /**
    *  The response of ListConnectorEntities lists entities grouped by category. This map's key represents the group name, and its value contains the list of entities belonging to that group. 
    */
  var connectorEntityMap: ConnectorEntityMap
}
object ListConnectorEntitiesResponse {
  
  @scala.inline
  def apply(connectorEntityMap: ConnectorEntityMap): ListConnectorEntitiesResponse = {
    val __obj = js.Dynamic.literal(connectorEntityMap = connectorEntityMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListConnectorEntitiesResponse]
  }
  
  @scala.inline
  implicit class ListConnectorEntitiesResponseMutableBuilder[Self <: ListConnectorEntitiesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectorEntityMap(value: ConnectorEntityMap): Self = StObject.set(x, "connectorEntityMap", value.asInstanceOf[js.Any])
  }
}
