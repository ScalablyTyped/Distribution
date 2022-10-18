package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetHostedZoneResponse extends StObject {
  
  /**
    * A complex type that lists the Amazon Route 53 name servers for the specified hosted zone.
    */
  var DelegationSet: js.UndefOr[typings.awsSdk.clientsRoute53Mod.DelegationSet] = js.undefined
  
  /**
    * A complex type that contains general information about the specified hosted zone.
    */
  var HostedZone: typings.awsSdk.clientsRoute53Mod.HostedZone
  
  /**
    * A complex type that contains information about the VPCs that are associated with the specified hosted zone.
    */
  var VPCs: js.UndefOr[typings.awsSdk.clientsRoute53Mod.VPCs] = js.undefined
}
object GetHostedZoneResponse {
  
  inline def apply(HostedZone: HostedZone): GetHostedZoneResponse = {
    val __obj = js.Dynamic.literal(HostedZone = HostedZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHostedZoneResponse]
  }
  
  extension [Self <: GetHostedZoneResponse](x: Self) {
    
    inline def setDelegationSet(value: DelegationSet): Self = StObject.set(x, "DelegationSet", value.asInstanceOf[js.Any])
    
    inline def setDelegationSetUndefined: Self = StObject.set(x, "DelegationSet", js.undefined)
    
    inline def setHostedZone(value: HostedZone): Self = StObject.set(x, "HostedZone", value.asInstanceOf[js.Any])
    
    inline def setVPCs(value: VPCs): Self = StObject.set(x, "VPCs", value.asInstanceOf[js.Any])
    
    inline def setVPCsUndefined: Self = StObject.set(x, "VPCs", js.undefined)
    
    inline def setVPCsVarargs(value: VPC*): Self = StObject.set(x, "VPCs", js.Array(value*))
  }
}
