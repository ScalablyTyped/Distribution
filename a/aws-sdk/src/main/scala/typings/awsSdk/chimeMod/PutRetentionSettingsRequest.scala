package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutRetentionSettingsRequest extends StObject {
  
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString = js.native
  
  /**
    * The retention settings.
    */
  var RetentionSettings: typings.awsSdk.chimeMod.RetentionSettings = js.native
}
object PutRetentionSettingsRequest {
  
  @scala.inline
  def apply(AccountId: NonEmptyString, RetentionSettings: RetentionSettings): PutRetentionSettingsRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], RetentionSettings = RetentionSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRetentionSettingsRequest]
  }
  
  @scala.inline
  implicit class PutRetentionSettingsRequestMutableBuilder[Self <: PutRetentionSettingsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: NonEmptyString): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionSettings(value: RetentionSettings): Self = StObject.set(x, "RetentionSettings", value.asInstanceOf[js.Any])
  }
}
