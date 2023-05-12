package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MembershipSummary extends StObject {
  
  /**
    * The unique ARN for the membership.
    */
  var arn: MembershipArn
  
  /**
    * The unique ARN for the membership's associated collaboration.
    */
  var collaborationArn: CollaborationArn
  
  /**
    * The identifier of the AWS principal that created the collaboration. Currently only supports AWS account ID.
    */
  var collaborationCreatorAccountId: AccountId
  
  /**
    * The display name of the collaboration creator.
    */
  var collaborationCreatorDisplayName: DisplayName
  
  /**
    * The unique ID for the membership's collaboration.
    */
  var collaborationId: CollaborationIdentifier
  
  /**
    * The name for the membership's collaboration.
    */
  var collaborationName: CollaborationName
  
  /**
    * The time when the membership was created.
    */
  var createTime: js.Date
  
  /**
    * The unique ID for the membership's collaboration.
    */
  var id: UUID
  
  /**
    * The abilities granted to the collaboration member.
    */
  var memberAbilities: MemberAbilities
  
  /**
    * The status of the membership. Valid values are `ACTIVE`, `REMOVED`, and `COLLABORATION_DELETED`.
    */
  var status: MembershipStatus
  
  /**
    * The time the membership metadata was last updated.
    */
  var updateTime: js.Date
}
object MembershipSummary {
  
  inline def apply(
    arn: MembershipArn,
    collaborationArn: CollaborationArn,
    collaborationCreatorAccountId: AccountId,
    collaborationCreatorDisplayName: DisplayName,
    collaborationId: CollaborationIdentifier,
    collaborationName: CollaborationName,
    createTime: js.Date,
    id: UUID,
    memberAbilities: MemberAbilities,
    status: MembershipStatus,
    updateTime: js.Date
  ): MembershipSummary = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], collaborationArn = collaborationArn.asInstanceOf[js.Any], collaborationCreatorAccountId = collaborationCreatorAccountId.asInstanceOf[js.Any], collaborationCreatorDisplayName = collaborationCreatorDisplayName.asInstanceOf[js.Any], collaborationId = collaborationId.asInstanceOf[js.Any], collaborationName = collaborationName.asInstanceOf[js.Any], createTime = createTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], memberAbilities = memberAbilities.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], updateTime = updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[MembershipSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MembershipSummary] (val x: Self) extends AnyVal {
    
    inline def setArn(value: MembershipArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCollaborationArn(value: CollaborationArn): Self = StObject.set(x, "collaborationArn", value.asInstanceOf[js.Any])
    
    inline def setCollaborationCreatorAccountId(value: AccountId): Self = StObject.set(x, "collaborationCreatorAccountId", value.asInstanceOf[js.Any])
    
    inline def setCollaborationCreatorDisplayName(value: DisplayName): Self = StObject.set(x, "collaborationCreatorDisplayName", value.asInstanceOf[js.Any])
    
    inline def setCollaborationId(value: CollaborationIdentifier): Self = StObject.set(x, "collaborationId", value.asInstanceOf[js.Any])
    
    inline def setCollaborationName(value: CollaborationName): Self = StObject.set(x, "collaborationName", value.asInstanceOf[js.Any])
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setId(value: UUID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMemberAbilities(value: MemberAbilities): Self = StObject.set(x, "memberAbilities", value.asInstanceOf[js.Any])
    
    inline def setMemberAbilitiesVarargs(value: MemberAbility*): Self = StObject.set(x, "memberAbilities", js.Array(value*))
    
    inline def setStatus(value: MembershipStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
  }
}
