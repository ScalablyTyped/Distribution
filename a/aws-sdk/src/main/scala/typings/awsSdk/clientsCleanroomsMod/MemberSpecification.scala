package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberSpecification extends StObject {
  
  /**
    * The identifier used to reference members of the collaboration. Currently only supports AWS Account ID.
    */
  var accountId: AccountId
  
  /**
    * The member's display name.
    */
  var displayName: DisplayName
  
  /**
    * The abilities granted to the collaboration member.
    */
  var memberAbilities: MemberAbilities
}
object MemberSpecification {
  
  inline def apply(accountId: AccountId, displayName: DisplayName, memberAbilities: MemberAbilities): MemberSpecification = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], memberAbilities = memberAbilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MemberSpecification] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: DisplayName): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setMemberAbilities(value: MemberAbilities): Self = StObject.set(x, "memberAbilities", value.asInstanceOf[js.Any])
    
    inline def setMemberAbilitiesVarargs(value: MemberAbility*): Self = StObject.set(x, "memberAbilities", js.Array(value*))
  }
}
