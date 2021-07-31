package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateApiKeyResponse extends StObject {
  
  /**
    * The API key.
    */
  var apiKey: js.UndefOr[ApiKey] = js.undefined
}
object CreateApiKeyResponse {
  
  @scala.inline
  def apply(): CreateApiKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateApiKeyResponse]
  }
  
  @scala.inline
  implicit class CreateApiKeyResponseMutableBuilder[Self <: CreateApiKeyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiKey(value: ApiKey): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
  }
}
