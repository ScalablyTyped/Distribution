package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterTransitGatewayMulticastGroupMembersResult extends StObject {
  
  /**
    * Information about the registered transit gateway multicast group members.
    */
  var RegisteredMulticastGroupMembers: js.UndefOr[TransitGatewayMulticastRegisteredGroupMembers] = js.undefined
}
object RegisterTransitGatewayMulticastGroupMembersResult {
  
  inline def apply(): RegisterTransitGatewayMulticastGroupMembersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterTransitGatewayMulticastGroupMembersResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegisterTransitGatewayMulticastGroupMembersResult] (val x: Self) extends AnyVal {
    
    inline def setRegisteredMulticastGroupMembers(value: TransitGatewayMulticastRegisteredGroupMembers): Self = StObject.set(x, "RegisteredMulticastGroupMembers", value.asInstanceOf[js.Any])
    
    inline def setRegisteredMulticastGroupMembersUndefined: Self = StObject.set(x, "RegisteredMulticastGroupMembers", js.undefined)
  }
}
