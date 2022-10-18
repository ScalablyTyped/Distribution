package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaiduChannelRequest extends StObject {
  
  /**
    * The API key that you received from the Baidu Cloud Push service to communicate with the service.
    */
  var ApiKey: string
  
  /**
    * Specifies whether to enable the Baidu channel for the application.
    */
  var Enabled: js.UndefOr[boolean] = js.undefined
  
  /**
    * The secret key that you received from the Baidu Cloud Push service to communicate with the service.
    */
  var SecretKey: string
}
object BaiduChannelRequest {
  
  inline def apply(ApiKey: string, SecretKey: string): BaiduChannelRequest = {
    val __obj = js.Dynamic.literal(ApiKey = ApiKey.asInstanceOf[js.Any], SecretKey = SecretKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaiduChannelRequest]
  }
  
  extension [Self <: BaiduChannelRequest](x: Self) {
    
    inline def setApiKey(value: string): Self = StObject.set(x, "ApiKey", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setSecretKey(value: string): Self = StObject.set(x, "SecretKey", value.asInstanceOf[js.Any])
  }
}
