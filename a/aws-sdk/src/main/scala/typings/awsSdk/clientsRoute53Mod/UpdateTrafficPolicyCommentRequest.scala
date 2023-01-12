package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTrafficPolicyCommentRequest extends StObject {
  
  /**
    * The new comment for the specified traffic policy and version.
    */
  var Comment: TrafficPolicyComment
  
  /**
    * The value of Id for the traffic policy that you want to update the comment for.
    */
  var Id: TrafficPolicyId
  
  /**
    * The value of Version for the traffic policy that you want to update the comment for.
    */
  var Version: TrafficPolicyVersion
}
object UpdateTrafficPolicyCommentRequest {
  
  inline def apply(Comment: TrafficPolicyComment, Id: TrafficPolicyId, Version: TrafficPolicyVersion): UpdateTrafficPolicyCommentRequest = {
    val __obj = js.Dynamic.literal(Comment = Comment.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTrafficPolicyCommentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateTrafficPolicyCommentRequest] (val x: Self) extends AnyVal {
    
    inline def setComment(value: TrafficPolicyComment): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    inline def setId(value: TrafficPolicyId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: TrafficPolicyVersion): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
