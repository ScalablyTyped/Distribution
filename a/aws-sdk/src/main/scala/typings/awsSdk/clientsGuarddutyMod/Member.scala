package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Member extends StObject {
  
  /**
    * The ID of the member account.
    */
  var AccountId: typings.awsSdk.clientsGuarddutyMod.AccountId
  
  /**
    * The administrator account ID.
    */
  var AdministratorId: js.UndefOr[String] = js.undefined
  
  /**
    * The detector ID of the member account.
    */
  var DetectorId: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.DetectorId] = js.undefined
  
  /**
    * The email address of the member account.
    */
  var Email: typings.awsSdk.clientsGuarddutyMod.Email
  
  /**
    * The timestamp when the invitation was sent.
    */
  var InvitedAt: js.UndefOr[String] = js.undefined
  
  /**
    * The administrator account ID.
    */
  var MasterId: String
  
  /**
    * The status of the relationship between the member and the administrator.
    */
  var RelationshipStatus: String
  
  /**
    * The last-updated timestamp of the member.
    */
  var UpdatedAt: String
}
object Member {
  
  inline def apply(
    AccountId: AccountId,
    Email: Email,
    MasterId: String,
    RelationshipStatus: String,
    UpdatedAt: String
  ): Member = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], MasterId = MasterId.asInstanceOf[js.Any], RelationshipStatus = RelationshipStatus.asInstanceOf[js.Any], UpdatedAt = UpdatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Member]
  }
  
  extension [Self <: Member](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAdministratorId(value: String): Self = StObject.set(x, "AdministratorId", value.asInstanceOf[js.Any])
    
    inline def setAdministratorIdUndefined: Self = StObject.set(x, "AdministratorId", js.undefined)
    
    inline def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
    
    inline def setDetectorIdUndefined: Self = StObject.set(x, "DetectorId", js.undefined)
    
    inline def setEmail(value: Email): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    inline def setInvitedAt(value: String): Self = StObject.set(x, "InvitedAt", value.asInstanceOf[js.Any])
    
    inline def setInvitedAtUndefined: Self = StObject.set(x, "InvitedAt", js.undefined)
    
    inline def setMasterId(value: String): Self = StObject.set(x, "MasterId", value.asInstanceOf[js.Any])
    
    inline def setRelationshipStatus(value: String): Self = StObject.set(x, "RelationshipStatus", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAt(value: String): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
  }
}
