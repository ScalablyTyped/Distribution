package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateBotRequest extends StObject {
  
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString = js.native
  
  /**
    * The bot display name.
    */
  var DisplayName: SensitiveString = js.native
  
  /**
    * The domain of the Amazon Chime Enterprise account.
    */
  var Domain: js.UndefOr[NonEmptyString] = js.native
}
object CreateBotRequest {
  
  @scala.inline
  def apply(AccountId: NonEmptyString, DisplayName: SensitiveString): CreateBotRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBotRequest]
  }
  
  @scala.inline
  implicit class CreateBotRequestMutableBuilder[Self <: CreateBotRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: NonEmptyString): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: SensitiveString): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomain(value: NonEmptyString): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
  }
}
