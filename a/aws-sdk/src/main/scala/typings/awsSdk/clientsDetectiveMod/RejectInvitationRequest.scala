package typings.awsSdk.clientsDetectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RejectInvitationRequest extends StObject {
  
  /**
    * The ARN of the behavior graph to reject the invitation to. The member account's current member status in the behavior graph must be INVITED.
    */
  var GraphArn: typings.awsSdk.clientsDetectiveMod.GraphArn
}
object RejectInvitationRequest {
  
  inline def apply(GraphArn: GraphArn): RejectInvitationRequest = {
    val __obj = js.Dynamic.literal(GraphArn = GraphArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectInvitationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RejectInvitationRequest] (val x: Self) extends AnyVal {
    
    inline def setGraphArn(value: GraphArn): Self = StObject.set(x, "GraphArn", value.asInstanceOf[js.Any])
  }
}
