package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Collaboration extends StObject {
  
  /**
    * The unique ARN for the collaboration.
    */
  var arn: CollaborationArn
  
  /**
    * The time when the collaboration was created.
    */
  var createTime: js.Date
  
  /**
    * The identifier used to reference members of the collaboration. Currently only supports AWS account ID.
    */
  var creatorAccountId: AccountId
  
  /**
    * A display name of the collaboration creator.
    */
  var creatorDisplayName: DisplayName
  
  /**
    * The settings for client-side encryption for cryptographic computing.
    */
  var dataEncryptionMetadata: js.UndefOr[DataEncryptionMetadata] = js.undefined
  
  /**
    * A description of the collaboration provided by the collaboration owner.
    */
  var description: js.UndefOr[CollaborationDescription] = js.undefined
  
  /**
    * The unique ID for the collaboration.
    */
  var id: UUID
  
  /**
    * The status of a member in a collaboration.
    */
  var memberStatus: MemberStatus
  
  /**
    * The unique ARN for your membership within the collaboration.
    */
  var membershipArn: js.UndefOr[MembershipArn] = js.undefined
  
  /**
    * The unique ID for your membership within the collaboration.
    */
  var membershipId: js.UndefOr[UUID] = js.undefined
  
  /**
    * A human-readable identifier provided by the collaboration owner. Display names are not unique.
    */
  var name: CollaborationName
  
  /**
    * An indicator as to whether query logging has been enabled or disabled for the collaboration.
    */
  var queryLogStatus: CollaborationQueryLogStatus
  
  /**
    * The time the collaboration metadata was last updated.
    */
  var updateTime: js.Date
}
object Collaboration {
  
  inline def apply(
    arn: CollaborationArn,
    createTime: js.Date,
    creatorAccountId: AccountId,
    creatorDisplayName: DisplayName,
    id: UUID,
    memberStatus: MemberStatus,
    name: CollaborationName,
    queryLogStatus: CollaborationQueryLogStatus,
    updateTime: js.Date
  ): Collaboration = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createTime = createTime.asInstanceOf[js.Any], creatorAccountId = creatorAccountId.asInstanceOf[js.Any], creatorDisplayName = creatorDisplayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], memberStatus = memberStatus.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], queryLogStatus = queryLogStatus.asInstanceOf[js.Any], updateTime = updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collaboration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Collaboration] (val x: Self) extends AnyVal {
    
    inline def setArn(value: CollaborationArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreatorAccountId(value: AccountId): Self = StObject.set(x, "creatorAccountId", value.asInstanceOf[js.Any])
    
    inline def setCreatorDisplayName(value: DisplayName): Self = StObject.set(x, "creatorDisplayName", value.asInstanceOf[js.Any])
    
    inline def setDataEncryptionMetadata(value: DataEncryptionMetadata): Self = StObject.set(x, "dataEncryptionMetadata", value.asInstanceOf[js.Any])
    
    inline def setDataEncryptionMetadataUndefined: Self = StObject.set(x, "dataEncryptionMetadata", js.undefined)
    
    inline def setDescription(value: CollaborationDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: UUID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMemberStatus(value: MemberStatus): Self = StObject.set(x, "memberStatus", value.asInstanceOf[js.Any])
    
    inline def setMembershipArn(value: MembershipArn): Self = StObject.set(x, "membershipArn", value.asInstanceOf[js.Any])
    
    inline def setMembershipArnUndefined: Self = StObject.set(x, "membershipArn", js.undefined)
    
    inline def setMembershipId(value: UUID): Self = StObject.set(x, "membershipId", value.asInstanceOf[js.Any])
    
    inline def setMembershipIdUndefined: Self = StObject.set(x, "membershipId", js.undefined)
    
    inline def setName(value: CollaborationName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setQueryLogStatus(value: CollaborationQueryLogStatus): Self = StObject.set(x, "queryLogStatus", value.asInstanceOf[js.Any])
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
  }
}
