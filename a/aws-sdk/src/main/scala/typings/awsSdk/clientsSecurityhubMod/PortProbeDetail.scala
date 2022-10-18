package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortProbeDetail extends StObject {
  
  /**
    * Provides information about the IP address where the scanned port is located.
    */
  var LocalIpDetails: js.UndefOr[ActionLocalIpDetails] = js.undefined
  
  /**
    * Provides information about the port that was scanned.
    */
  var LocalPortDetails: js.UndefOr[ActionLocalPortDetails] = js.undefined
  
  /**
    * Provides information about the remote IP address that performed the scan.
    */
  var RemoteIpDetails: js.UndefOr[ActionRemoteIpDetails] = js.undefined
}
object PortProbeDetail {
  
  inline def apply(): PortProbeDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortProbeDetail]
  }
  
  extension [Self <: PortProbeDetail](x: Self) {
    
    inline def setLocalIpDetails(value: ActionLocalIpDetails): Self = StObject.set(x, "LocalIpDetails", value.asInstanceOf[js.Any])
    
    inline def setLocalIpDetailsUndefined: Self = StObject.set(x, "LocalIpDetails", js.undefined)
    
    inline def setLocalPortDetails(value: ActionLocalPortDetails): Self = StObject.set(x, "LocalPortDetails", value.asInstanceOf[js.Any])
    
    inline def setLocalPortDetailsUndefined: Self = StObject.set(x, "LocalPortDetails", js.undefined)
    
    inline def setRemoteIpDetails(value: ActionRemoteIpDetails): Self = StObject.set(x, "RemoteIpDetails", value.asInstanceOf[js.Any])
    
    inline def setRemoteIpDetailsUndefined: Self = StObject.set(x, "RemoteIpDetails", js.undefined)
  }
}
