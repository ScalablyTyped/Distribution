package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRetentionSettingsRequest extends StObject {
  
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString
}
object GetRetentionSettingsRequest {
  
  @scala.inline
  def apply(AccountId: NonEmptyString): GetRetentionSettingsRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRetentionSettingsRequest]
  }
  
  @scala.inline
  implicit class GetRetentionSettingsRequestMutableBuilder[Self <: GetRetentionSettingsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: NonEmptyString): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
  }
}
