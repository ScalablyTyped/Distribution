package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Membership extends StObject {
  
  /**
    * The unique ARN for the membership.
    */
  var arn: MembershipArn
  
  /**
    * The unique ARN for the membership's associated collaboration.
    */
  var collaborationArn: CollaborationArn
  
  /**
    * The identifier used to reference members of the collaboration. Currently only supports AWS account ID.
    */
  var collaborationCreatorAccountId: AccountId
  
  /**
    * The display name of the collaboration creator.
    */
  var collaborationCreatorDisplayName: DisplayName
  
  /**
    * The unique ID for the membership's collaboration.
    */
  var collaborationId: UUID
  
  /**
    * The name of the membership's collaboration.
    */
  var collaborationName: CollaborationName
  
  /**
    * The time when the membership was created.
    */
  var createTime: js.Date
  
  /**
    * The unique ID of the membership.
    */
  var id: UUID
  
  /**
    * The abilities granted to the collaboration member.
    */
  var memberAbilities: MemberAbilities
  
  /**
    * An indicator as to whether query logging has been enabled or disabled for the collaboration.
    */
  var queryLogStatus: MembershipQueryLogStatus
  
  /**
    * The status of the membership. Valid values are `ACTIVE`, `REMOVED`, and `COLLABORATION_DELETED`.
    */
  var status: MembershipStatus
  
  /**
    * The time the membership metadata was last updated.
    */
  var updateTime: js.Date
}
object Membership {
  
  inline def apply(
    arn: MembershipArn,
    collaborationArn: CollaborationArn,
    collaborationCreatorAccountId: AccountId,
    collaborationCreatorDisplayName: DisplayName,
    collaborationId: UUID,
    collaborationName: CollaborationName,
    createTime: js.Date,
    id: UUID,
    memberAbilities: MemberAbilities,
    queryLogStatus: MembershipQueryLogStatus,
    status: MembershipStatus,
    updateTime: js.Date
  ): Membership = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], collaborationArn = collaborationArn.asInstanceOf[js.Any], collaborationCreatorAccountId = collaborationCreatorAccountId.asInstanceOf[js.Any], collaborationCreatorDisplayName = collaborationCreatorDisplayName.asInstanceOf[js.Any], collaborationId = collaborationId.asInstanceOf[js.Any], collaborationName = collaborationName.asInstanceOf[js.Any], createTime = createTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], memberAbilities = memberAbilities.asInstanceOf[js.Any], queryLogStatus = queryLogStatus.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], updateTime = updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Membership]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Membership] (val x: Self) extends AnyVal {
    
    inline def setArn(value: MembershipArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCollaborationArn(value: CollaborationArn): Self = StObject.set(x, "collaborationArn", value.asInstanceOf[js.Any])
    
    inline def setCollaborationCreatorAccountId(value: AccountId): Self = StObject.set(x, "collaborationCreatorAccountId", value.asInstanceOf[js.Any])
    
    inline def setCollaborationCreatorDisplayName(value: DisplayName): Self = StObject.set(x, "collaborationCreatorDisplayName", value.asInstanceOf[js.Any])
    
    inline def setCollaborationId(value: UUID): Self = StObject.set(x, "collaborationId", value.asInstanceOf[js.Any])
    
    inline def setCollaborationName(value: CollaborationName): Self = StObject.set(x, "collaborationName", value.asInstanceOf[js.Any])
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setId(value: UUID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMemberAbilities(value: MemberAbilities): Self = StObject.set(x, "memberAbilities", value.asInstanceOf[js.Any])
    
    inline def setMemberAbilitiesVarargs(value: MemberAbility*): Self = StObject.set(x, "memberAbilities", js.Array(value*))
    
    inline def setQueryLogStatus(value: MembershipQueryLogStatus): Self = StObject.set(x, "queryLogStatus", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: MembershipStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
  }
}
