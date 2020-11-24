package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListConnectorEntitiesResponse extends js.Object {
  
  /**
    *  The response of ListConnectorEntities lists entities grouped by category. This map's key represents the group name, and its value contains the list of entities belonging to that group. 
    */
  var connectorEntityMap: ConnectorEntityMap = js.native
}
object ListConnectorEntitiesResponse {
  
  @scala.inline
  def apply(connectorEntityMap: ConnectorEntityMap): ListConnectorEntitiesResponse = {
    val __obj = js.Dynamic.literal(connectorEntityMap = connectorEntityMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListConnectorEntitiesResponse]
  }
  
  @scala.inline
  implicit class ListConnectorEntitiesResponseOps[Self <: ListConnectorEntitiesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConnectorEntityMap(value: ConnectorEntityMap): Self = this.set("connectorEntityMap", value.asInstanceOf[js.Any])
  }
}
