package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathStatementRequest extends StObject {
  
  /**
    * The packet header statement.
    */
  var PacketHeaderStatement: js.UndefOr[PacketHeaderStatementRequest] = js.undefined
  
  /**
    * The resource statement.
    */
  var ResourceStatement: js.UndefOr[ResourceStatementRequest] = js.undefined
}
object PathStatementRequest {
  
  inline def apply(): PathStatementRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathStatementRequest]
  }
  
  extension [Self <: PathStatementRequest](x: Self) {
    
    inline def setPacketHeaderStatement(value: PacketHeaderStatementRequest): Self = StObject.set(x, "PacketHeaderStatement", value.asInstanceOf[js.Any])
    
    inline def setPacketHeaderStatementUndefined: Self = StObject.set(x, "PacketHeaderStatement", js.undefined)
    
    inline def setResourceStatement(value: ResourceStatementRequest): Self = StObject.set(x, "ResourceStatement", value.asInstanceOf[js.Any])
    
    inline def setResourceStatementUndefined: Self = StObject.set(x, "ResourceStatement", js.undefined)
  }
}
