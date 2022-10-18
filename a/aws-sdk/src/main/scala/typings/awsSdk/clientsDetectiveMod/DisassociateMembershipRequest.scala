package typings.awsSdk.clientsDetectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateMembershipRequest extends StObject {
  
  /**
    * The ARN of the behavior graph to remove the member account from. The member account's member status in the behavior graph must be ENABLED.
    */
  var GraphArn: typings.awsSdk.clientsDetectiveMod.GraphArn
}
object DisassociateMembershipRequest {
  
  inline def apply(GraphArn: GraphArn): DisassociateMembershipRequest = {
    val __obj = js.Dynamic.literal(GraphArn = GraphArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateMembershipRequest]
  }
  
  extension [Self <: DisassociateMembershipRequest](x: Self) {
    
    inline def setGraphArn(value: GraphArn): Self = StObject.set(x, "GraphArn", value.asInstanceOf[js.Any])
  }
}
