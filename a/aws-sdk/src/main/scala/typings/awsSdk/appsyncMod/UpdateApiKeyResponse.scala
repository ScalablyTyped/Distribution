package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateApiKeyResponse extends StObject {
  
  /**
    * The API key.
    */
  var apiKey: js.UndefOr[ApiKey] = js.native
}
object UpdateApiKeyResponse {
  
  @scala.inline
  def apply(): UpdateApiKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateApiKeyResponse]
  }
  
  @scala.inline
  implicit class UpdateApiKeyResponseMutableBuilder[Self <: UpdateApiKeyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiKey(value: ApiKey): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
  }
}
