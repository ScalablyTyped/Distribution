package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberSummary extends StObject {
  
  /**
    * The abilities granted to the collaboration member.
    */
  var abilities: MemberAbilities
  
  /**
    * The identifier used to reference members of the collaboration. Currently only supports AWS Account ID.
    */
  var accountId: AccountId
  
  /**
    * The time when the member was created.
    */
  var createTime: js.Date
  
  /**
    * The member's display name.
    */
  var displayName: DisplayName
  
  /**
    * The unique ARN for the member's associated membership, if present.
    */
  var membershipArn: js.UndefOr[MembershipArn] = js.undefined
  
  /**
    * The unique ID for the member's associated membership, if present.
    */
  var membershipId: js.UndefOr[UUID] = js.undefined
  
  /**
    * The status of the member. Valid values are `INVITED`, `ACTIVE`, `LEFT`, and `REMOVED`.
    */
  var status: MemberStatus
  
  /**
    * The time the member metadata was last updated.
    */
  var updateTime: js.Date
}
object MemberSummary {
  
  inline def apply(
    abilities: MemberAbilities,
    accountId: AccountId,
    createTime: js.Date,
    displayName: DisplayName,
    status: MemberStatus,
    updateTime: js.Date
  ): MemberSummary = {
    val __obj = js.Dynamic.literal(abilities = abilities.asInstanceOf[js.Any], accountId = accountId.asInstanceOf[js.Any], createTime = createTime.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], updateTime = updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MemberSummary] (val x: Self) extends AnyVal {
    
    inline def setAbilities(value: MemberAbilities): Self = StObject.set(x, "abilities", value.asInstanceOf[js.Any])
    
    inline def setAbilitiesVarargs(value: MemberAbility*): Self = StObject.set(x, "abilities", js.Array(value*))
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: DisplayName): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setMembershipArn(value: MembershipArn): Self = StObject.set(x, "membershipArn", value.asInstanceOf[js.Any])
    
    inline def setMembershipArnUndefined: Self = StObject.set(x, "membershipArn", js.undefined)
    
    inline def setMembershipId(value: UUID): Self = StObject.set(x, "membershipId", value.asInstanceOf[js.Any])
    
    inline def setMembershipIdUndefined: Self = StObject.set(x, "membershipId", js.undefined)
    
    inline def setStatus(value: MemberStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
  }
}
