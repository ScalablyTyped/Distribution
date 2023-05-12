package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollaborationSummary extends StObject {
  
  /**
    * The ARN of the collaboration.
    */
  var arn: CollaborationArn
  
  /**
    * The time when the collaboration was created.
    */
  var createTime: js.Date
  
  /**
    * The identifier used to reference members of the collaboration. Currently only supports AWS Account ID.
    */
  var creatorAccountId: AccountId
  
  /**
    * The display name of the collaboration creator.
    */
  var creatorDisplayName: DisplayName
  
  /**
    * The identifier for the collaboration.
    */
  var id: UUID
  
  /**
    * The status of a member in a collaboration.
    */
  var memberStatus: MemberStatus
  
  /**
    * The ARN of a member in a collaboration.
    */
  var membershipArn: js.UndefOr[MembershipArn] = js.undefined
  
  /**
    * The identifier of a member in a collaboration.
    */
  var membershipId: js.UndefOr[UUID] = js.undefined
  
  /**
    * A human-readable identifier provided by the collaboration owner. Display names are not unique.
    */
  var name: CollaborationName
  
  /**
    * The time the collaboration metadata was last updated.
    */
  var updateTime: js.Date
}
object CollaborationSummary {
  
  inline def apply(
    arn: CollaborationArn,
    createTime: js.Date,
    creatorAccountId: AccountId,
    creatorDisplayName: DisplayName,
    id: UUID,
    memberStatus: MemberStatus,
    name: CollaborationName,
    updateTime: js.Date
  ): CollaborationSummary = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createTime = createTime.asInstanceOf[js.Any], creatorAccountId = creatorAccountId.asInstanceOf[js.Any], creatorDisplayName = creatorDisplayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], memberStatus = memberStatus.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], updateTime = updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollaborationSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CollaborationSummary] (val x: Self) extends AnyVal {
    
    inline def setArn(value: CollaborationArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreatorAccountId(value: AccountId): Self = StObject.set(x, "creatorAccountId", value.asInstanceOf[js.Any])
    
    inline def setCreatorDisplayName(value: DisplayName): Self = StObject.set(x, "creatorDisplayName", value.asInstanceOf[js.Any])
    
    inline def setId(value: UUID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMemberStatus(value: MemberStatus): Self = StObject.set(x, "memberStatus", value.asInstanceOf[js.Any])
    
    inline def setMembershipArn(value: MembershipArn): Self = StObject.set(x, "membershipArn", value.asInstanceOf[js.Any])
    
    inline def setMembershipArnUndefined: Self = StObject.set(x, "membershipArn", js.undefined)
    
    inline def setMembershipId(value: UUID): Self = StObject.set(x, "membershipId", value.asInstanceOf[js.Any])
    
    inline def setMembershipIdUndefined: Self = StObject.set(x, "membershipId", js.undefined)
    
    inline def setName(value: CollaborationName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
  }
}
