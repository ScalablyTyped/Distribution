package typings.awsSdk.clientsMturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendBonusRequest extends StObject {
  
  /**
    * The ID of the assignment for which this bonus is paid.
    */
  var AssignmentId: EntityId
  
  /**
    *  The Bonus amount is a US Dollar amount specified using a string (for example, "5" represents $5.00 USD and "101.42" represents $101.42 USD). Do not include currency symbols or currency codes. 
    */
  var BonusAmount: CurrencyAmount
  
  /**
    * A message that explains the reason for the bonus payment. The Worker receiving the bonus can see this message.
    */
  var Reason: String
  
  /**
    * A unique identifier for this request, which allows you to retry the call on error without granting multiple bonuses. This is useful in cases such as network timeouts where it is unclear whether or not the call succeeded on the server. If the bonus already exists in the system from a previous call using the same UniqueRequestToken, subsequent calls will return an error with a message containing the request ID.
    */
  var UniqueRequestToken: js.UndefOr[IdempotencyToken] = js.undefined
  
  /**
    * The ID of the Worker being paid the bonus.
    */
  var WorkerId: CustomerId
}
object SendBonusRequest {
  
  inline def apply(AssignmentId: EntityId, BonusAmount: CurrencyAmount, Reason: String, WorkerId: CustomerId): SendBonusRequest = {
    val __obj = js.Dynamic.literal(AssignmentId = AssignmentId.asInstanceOf[js.Any], BonusAmount = BonusAmount.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any], WorkerId = WorkerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendBonusRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SendBonusRequest] (val x: Self) extends AnyVal {
    
    inline def setAssignmentId(value: EntityId): Self = StObject.set(x, "AssignmentId", value.asInstanceOf[js.Any])
    
    inline def setBonusAmount(value: CurrencyAmount): Self = StObject.set(x, "BonusAmount", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
    
    inline def setUniqueRequestToken(value: IdempotencyToken): Self = StObject.set(x, "UniqueRequestToken", value.asInstanceOf[js.Any])
    
    inline def setUniqueRequestTokenUndefined: Self = StObject.set(x, "UniqueRequestToken", js.undefined)
    
    inline def setWorkerId(value: CustomerId): Self = StObject.set(x, "WorkerId", value.asInstanceOf[js.Any])
  }
}
