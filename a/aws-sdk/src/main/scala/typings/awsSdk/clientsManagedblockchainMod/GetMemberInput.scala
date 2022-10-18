package typings.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMemberInput extends StObject {
  
  /**
    * The unique identifier of the member.
    */
  var MemberId: ResourceIdString
  
  /**
    * The unique identifier of the network to which the member belongs.
    */
  var NetworkId: ResourceIdString
}
object GetMemberInput {
  
  inline def apply(MemberId: ResourceIdString, NetworkId: ResourceIdString): GetMemberInput = {
    val __obj = js.Dynamic.literal(MemberId = MemberId.asInstanceOf[js.Any], NetworkId = NetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMemberInput]
  }
  
  extension [Self <: GetMemberInput](x: Self) {
    
    inline def setMemberId(value: ResourceIdString): Self = StObject.set(x, "MemberId", value.asInstanceOf[js.Any])
    
    inline def setNetworkId(value: ResourceIdString): Self = StObject.set(x, "NetworkId", value.asInstanceOf[js.Any])
  }
}
