package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCollaborationInput extends StObject {
  
  /**
    * The display name of the collaboration creator.
    */
  var creatorDisplayName: DisplayName
  
  /**
    * The abilities granted to the collaboration creator.
    */
  var creatorMemberAbilities: MemberAbilities
  
  /**
    * The settings for client-side encryption with Cryptographic Computing for Clean Rooms.
    */
  var dataEncryptionMetadata: js.UndefOr[DataEncryptionMetadata] = js.undefined
  
  /**
    * A description of the collaboration provided by the collaboration owner.
    */
  var description: CollaborationDescription
  
  /**
    * A list of initial members, not including the creator. This list is immutable.
    */
  var members: MemberList
  
  /**
    * The display name for a collaboration.
    */
  var name: CollaborationName
  
  /**
    * An indicator as to whether query logging has been enabled or disabled for the collaboration.
    */
  var queryLogStatus: CollaborationQueryLogStatus
  
  /**
    * An optional label that you can assign to a resource when you create it. Each tag consists of a key and an optional value, both of which you define. When you use tagging, you can also use tag-based access control in IAM policies to control access to this resource.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateCollaborationInput {
  
  inline def apply(
    creatorDisplayName: DisplayName,
    creatorMemberAbilities: MemberAbilities,
    description: CollaborationDescription,
    members: MemberList,
    name: CollaborationName,
    queryLogStatus: CollaborationQueryLogStatus
  ): CreateCollaborationInput = {
    val __obj = js.Dynamic.literal(creatorDisplayName = creatorDisplayName.asInstanceOf[js.Any], creatorMemberAbilities = creatorMemberAbilities.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], queryLogStatus = queryLogStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCollaborationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateCollaborationInput] (val x: Self) extends AnyVal {
    
    inline def setCreatorDisplayName(value: DisplayName): Self = StObject.set(x, "creatorDisplayName", value.asInstanceOf[js.Any])
    
    inline def setCreatorMemberAbilities(value: MemberAbilities): Self = StObject.set(x, "creatorMemberAbilities", value.asInstanceOf[js.Any])
    
    inline def setCreatorMemberAbilitiesVarargs(value: MemberAbility*): Self = StObject.set(x, "creatorMemberAbilities", js.Array(value*))
    
    inline def setDataEncryptionMetadata(value: DataEncryptionMetadata): Self = StObject.set(x, "dataEncryptionMetadata", value.asInstanceOf[js.Any])
    
    inline def setDataEncryptionMetadataUndefined: Self = StObject.set(x, "dataEncryptionMetadata", js.undefined)
    
    inline def setDescription(value: CollaborationDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setMembers(value: MemberList): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: MemberSpecification*): Self = StObject.set(x, "members", js.Array(value*))
    
    inline def setName(value: CollaborationName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setQueryLogStatus(value: CollaborationQueryLogStatus): Self = StObject.set(x, "queryLogStatus", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
