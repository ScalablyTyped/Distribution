package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyVpcPeeringConnectionOptionsResult extends StObject {
  
  /**
    * Information about the VPC peering connection options for the accepter VPC.
    */
  var AccepterPeeringConnectionOptions: js.UndefOr[PeeringConnectionOptions] = js.undefined
  
  /**
    * Information about the VPC peering connection options for the requester VPC.
    */
  var RequesterPeeringConnectionOptions: js.UndefOr[PeeringConnectionOptions] = js.undefined
}
object ModifyVpcPeeringConnectionOptionsResult {
  
  inline def apply(): ModifyVpcPeeringConnectionOptionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyVpcPeeringConnectionOptionsResult]
  }
  
  extension [Self <: ModifyVpcPeeringConnectionOptionsResult](x: Self) {
    
    inline def setAccepterPeeringConnectionOptions(value: PeeringConnectionOptions): Self = StObject.set(x, "AccepterPeeringConnectionOptions", value.asInstanceOf[js.Any])
    
    inline def setAccepterPeeringConnectionOptionsUndefined: Self = StObject.set(x, "AccepterPeeringConnectionOptions", js.undefined)
    
    inline def setRequesterPeeringConnectionOptions(value: PeeringConnectionOptions): Self = StObject.set(x, "RequesterPeeringConnectionOptions", value.asInstanceOf[js.Any])
    
    inline def setRequesterPeeringConnectionOptionsUndefined: Self = StObject.set(x, "RequesterPeeringConnectionOptions", js.undefined)
  }
}
