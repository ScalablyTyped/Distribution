package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Account extends StObject {
  
  /**
    * The version of the API keys used for the account.
    */
  var apiKeyVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of an Amazon CloudWatch role for the current Account. 
    */
  var cloudwatchRoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * A list of features supported for the account. When usage plans are enabled, the features list will include an entry of "UsagePlans".
    */
  var features: js.UndefOr[ListOfString] = js.undefined
  
  /**
    * Specifies the API request limits configured for the current Account.
    */
  var throttleSettings: js.UndefOr[ThrottleSettings] = js.undefined
}
object Account {
  
  inline def apply(): Account = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Account]
  }
  
  extension [Self <: Account](x: Self) {
    
    inline def setApiKeyVersion(value: String): Self = StObject.set(x, "apiKeyVersion", value.asInstanceOf[js.Any])
    
    inline def setApiKeyVersionUndefined: Self = StObject.set(x, "apiKeyVersion", js.undefined)
    
    inline def setCloudwatchRoleArn(value: String): Self = StObject.set(x, "cloudwatchRoleArn", value.asInstanceOf[js.Any])
    
    inline def setCloudwatchRoleArnUndefined: Self = StObject.set(x, "cloudwatchRoleArn", js.undefined)
    
    inline def setFeatures(value: ListOfString): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setFeaturesVarargs(value: String*): Self = StObject.set(x, "features", js.Array(value*))
    
    inline def setThrottleSettings(value: ThrottleSettings): Self = StObject.set(x, "throttleSettings", value.asInstanceOf[js.Any])
    
    inline def setThrottleSettingsUndefined: Self = StObject.set(x, "throttleSettings", js.undefined)
  }
}
