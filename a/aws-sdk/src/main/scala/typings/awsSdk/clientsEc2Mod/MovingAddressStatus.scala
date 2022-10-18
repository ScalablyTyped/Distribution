package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MovingAddressStatus extends StObject {
  
  /**
    * The status of the Elastic IP address that's being moved to the EC2-VPC platform, or restored to the EC2-Classic platform.
    */
  var MoveStatus: js.UndefOr[typings.awsSdk.clientsEc2Mod.MoveStatus] = js.undefined
  
  /**
    * The Elastic IP address.
    */
  var PublicIp: js.UndefOr[String] = js.undefined
}
object MovingAddressStatus {
  
  inline def apply(): MovingAddressStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MovingAddressStatus]
  }
  
  extension [Self <: MovingAddressStatus](x: Self) {
    
    inline def setMoveStatus(value: MoveStatus): Self = StObject.set(x, "MoveStatus", value.asInstanceOf[js.Any])
    
    inline def setMoveStatusUndefined: Self = StObject.set(x, "MoveStatus", js.undefined)
    
    inline def setPublicIp(value: String): Self = StObject.set(x, "PublicIp", value.asInstanceOf[js.Any])
    
    inline def setPublicIpUndefined: Self = StObject.set(x, "PublicIp", js.undefined)
  }
}
