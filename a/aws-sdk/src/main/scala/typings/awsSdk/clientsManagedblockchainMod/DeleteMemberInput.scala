package typings.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMemberInput extends StObject {
  
  /**
    * The unique identifier of the member to remove.
    */
  var MemberId: ResourceIdString
  
  /**
    * The unique identifier of the network from which the member is removed.
    */
  var NetworkId: ResourceIdString
}
object DeleteMemberInput {
  
  inline def apply(MemberId: ResourceIdString, NetworkId: ResourceIdString): DeleteMemberInput = {
    val __obj = js.Dynamic.literal(MemberId = MemberId.asInstanceOf[js.Any], NetworkId = NetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMemberInput]
  }
  
  extension [Self <: DeleteMemberInput](x: Self) {
    
    inline def setMemberId(value: ResourceIdString): Self = StObject.set(x, "MemberId", value.asInstanceOf[js.Any])
    
    inline def setNetworkId(value: ResourceIdString): Self = StObject.set(x, "NetworkId", value.asInstanceOf[js.Any])
  }
}
