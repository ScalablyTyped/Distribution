package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Account extends StObject {
  
  /**
    * The version of the API keys used for the account.
    */
  var apiKeyVersion: js.UndefOr[String] = js.native
  
  /**
    * The ARN of an Amazon CloudWatch role for the current Account. 
    */
  var cloudwatchRoleArn: js.UndefOr[String] = js.native
  
  /**
    * A list of features supported for the account. When usage plans are enabled, the features list will include an entry of "UsagePlans".
    */
  var features: js.UndefOr[ListOfString] = js.native
  
  /**
    * Specifies the API request limits configured for the current Account.
    */
  var throttleSettings: js.UndefOr[ThrottleSettings] = js.native
}
object Account {
  
  @scala.inline
  def apply(): Account = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Account]
  }
  
  @scala.inline
  implicit class AccountMutableBuilder[Self <: Account] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiKeyVersion(value: String): Self = StObject.set(x, "apiKeyVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiKeyVersionUndefined: Self = StObject.set(x, "apiKeyVersion", js.undefined)
    
    @scala.inline
    def setCloudwatchRoleArn(value: String): Self = StObject.set(x, "cloudwatchRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudwatchRoleArnUndefined: Self = StObject.set(x, "cloudwatchRoleArn", js.undefined)
    
    @scala.inline
    def setFeatures(value: ListOfString): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    @scala.inline
    def setFeaturesVarargs(value: String*): Self = StObject.set(x, "features", js.Array(value :_*))
    
    @scala.inline
    def setThrottleSettings(value: ThrottleSettings): Self = StObject.set(x, "throttleSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrottleSettingsUndefined: Self = StObject.set(x, "throttleSettings", js.undefined)
  }
}
