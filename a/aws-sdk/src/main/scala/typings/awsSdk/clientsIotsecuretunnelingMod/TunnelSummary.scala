package typings.awsSdk.clientsIotsecuretunnelingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TunnelSummary extends StObject {
  
  /**
    * The time the tunnel was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A description of the tunnel.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The time the tunnel was last updated.
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status of a tunnel. Valid values are: Open and Closed.
    */
  var status: js.UndefOr[TunnelStatus] = js.undefined
  
  /**
    * The Amazon Resource Name of the tunnel. 
    */
  var tunnelArn: js.UndefOr[TunnelArn] = js.undefined
  
  /**
    * The unique alpha-numeric identifier for the tunnel.
    */
  var tunnelId: js.UndefOr[TunnelId] = js.undefined
}
object TunnelSummary {
  
  inline def apply(): TunnelSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TunnelSummary]
  }
  
  extension [Self <: TunnelSummary](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    inline def setStatus(value: TunnelStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTunnelArn(value: TunnelArn): Self = StObject.set(x, "tunnelArn", value.asInstanceOf[js.Any])
    
    inline def setTunnelArnUndefined: Self = StObject.set(x, "tunnelArn", js.undefined)
    
    inline def setTunnelId(value: TunnelId): Self = StObject.set(x, "tunnelId", value.asInstanceOf[js.Any])
    
    inline def setTunnelIdUndefined: Self = StObject.set(x, "tunnelId", js.undefined)
  }
}
