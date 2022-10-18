package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptVpcPeeringConnectionResult extends StObject {
  
  /**
    * Information about the VPC peering connection.
    */
  var VpcPeeringConnection: js.UndefOr[typings.awsSdk.clientsEc2Mod.VpcPeeringConnection] = js.undefined
}
object AcceptVpcPeeringConnectionResult {
  
  inline def apply(): AcceptVpcPeeringConnectionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptVpcPeeringConnectionResult]
  }
  
  extension [Self <: AcceptVpcPeeringConnectionResult](x: Self) {
    
    inline def setVpcPeeringConnection(value: VpcPeeringConnection): Self = StObject.set(x, "VpcPeeringConnection", value.asInstanceOf[js.Any])
    
    inline def setVpcPeeringConnectionUndefined: Self = StObject.set(x, "VpcPeeringConnection", js.undefined)
  }
}
