package typings.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNetworkOutput extends StObject {
  
  /**
    * The unique identifier for the first member within the network.
    */
  var MemberId: js.UndefOr[ResourceIdString] = js.undefined
  
  /**
    * The unique identifier for the network.
    */
  var NetworkId: js.UndefOr[ResourceIdString] = js.undefined
}
object CreateNetworkOutput {
  
  inline def apply(): CreateNetworkOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNetworkOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateNetworkOutput] (val x: Self) extends AnyVal {
    
    inline def setMemberId(value: ResourceIdString): Self = StObject.set(x, "MemberId", value.asInstanceOf[js.Any])
    
    inline def setMemberIdUndefined: Self = StObject.set(x, "MemberId", js.undefined)
    
    inline def setNetworkId(value: ResourceIdString): Self = StObject.set(x, "NetworkId", value.asInstanceOf[js.Any])
    
    inline def setNetworkIdUndefined: Self = StObject.set(x, "NetworkId", js.undefined)
  }
}
