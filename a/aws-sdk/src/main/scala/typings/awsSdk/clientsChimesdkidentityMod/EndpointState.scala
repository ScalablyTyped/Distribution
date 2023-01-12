package typings.awsSdk.clientsChimesdkidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndpointState extends StObject {
  
  /**
    * Enum that indicates the Status of an AppInstanceUserEndpoint.
    */
  var Status: EndpointStatus
  
  /**
    * The reason for the EndpointStatus.
    */
  var StatusReason: js.UndefOr[EndpointStatusReason] = js.undefined
}
object EndpointState {
  
  inline def apply(Status: EndpointStatus): EndpointState = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndpointState] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: EndpointStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: EndpointStatusReason): Self = StObject.set(x, "StatusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "StatusReason", js.undefined)
  }
}
