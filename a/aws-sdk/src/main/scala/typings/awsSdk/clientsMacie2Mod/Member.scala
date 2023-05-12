package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Member extends StObject {
  
  /**
    * The Amazon Web Services account ID for the account.
    */
  var accountId: js.UndefOr[string] = js.undefined
  
  /**
    * The Amazon Web Services account ID for the administrator account.
    */
  var administratorAccountId: js.UndefOr[string] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the account.
    */
  var arn: js.UndefOr[string] = js.undefined
  
  /**
    * The email address for the account. This value is null if the account is associated with the administrator account through Organizations.
    */
  var email: js.UndefOr[string] = js.undefined
  
  /**
    * The date and time, in UTC and extended ISO 8601 format, when an Amazon Macie membership invitation was last sent to the account. This value is null if a Macie membership invitation hasn't been sent to the account.
    */
  var invitedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * (Deprecated) The Amazon Web Services account ID for the administrator account. This property has been replaced by the administratorAccountId property and is retained only for backward compatibility.
    */
  var masterAccountId: js.UndefOr[string] = js.undefined
  
  /**
    * The current status of the relationship between the account and the administrator account.
    */
  var relationshipStatus: js.UndefOr[RelationshipStatus] = js.undefined
  
  /**
    * A map of key-value pairs that specifies which tags (keys and values) are associated with the account in Amazon Macie.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The date and time, in UTC and extended ISO 8601 format, of the most recent change to the status of the relationship between the account and the administrator account.
    */
  var updatedAt: js.UndefOr[js.Date] = js.undefined
}
object Member {
  
  inline def apply(): Member = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Member]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Member] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: string): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAdministratorAccountId(value: string): Self = StObject.set(x, "administratorAccountId", value.asInstanceOf[js.Any])
    
    inline def setAdministratorAccountIdUndefined: Self = StObject.set(x, "administratorAccountId", js.undefined)
    
    inline def setArn(value: string): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setEmail(value: string): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setInvitedAt(value: js.Date): Self = StObject.set(x, "invitedAt", value.asInstanceOf[js.Any])
    
    inline def setInvitedAtUndefined: Self = StObject.set(x, "invitedAt", js.undefined)
    
    inline def setMasterAccountId(value: string): Self = StObject.set(x, "masterAccountId", value.asInstanceOf[js.Any])
    
    inline def setMasterAccountIdUndefined: Self = StObject.set(x, "masterAccountId", js.undefined)
    
    inline def setRelationshipStatus(value: RelationshipStatus): Self = StObject.set(x, "relationshipStatus", value.asInstanceOf[js.Any])
    
    inline def setRelationshipStatusUndefined: Self = StObject.set(x, "relationshipStatus", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "updatedAt", js.undefined)
  }
}
