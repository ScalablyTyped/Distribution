package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMembershipInput extends StObject {
  
  /**
    * The unique ID for the associated collaboration.
    */
  var collaborationIdentifier: CollaborationIdentifier
  
  /**
    * An indicator as to whether query logging has been enabled or disabled for the collaboration.
    */
  var queryLogStatus: MembershipQueryLogStatus
  
  /**
    * An optional label that you can assign to a resource when you create it. Each tag consists of a key and an optional value, both of which you define. When you use tagging, you can also use tag-based access control in IAM policies to control access to this resource.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateMembershipInput {
  
  inline def apply(collaborationIdentifier: CollaborationIdentifier, queryLogStatus: MembershipQueryLogStatus): CreateMembershipInput = {
    val __obj = js.Dynamic.literal(collaborationIdentifier = collaborationIdentifier.asInstanceOf[js.Any], queryLogStatus = queryLogStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMembershipInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateMembershipInput] (val x: Self) extends AnyVal {
    
    inline def setCollaborationIdentifier(value: CollaborationIdentifier): Self = StObject.set(x, "collaborationIdentifier", value.asInstanceOf[js.Any])
    
    inline def setQueryLogStatus(value: MembershipQueryLogStatus): Self = StObject.set(x, "queryLogStatus", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
