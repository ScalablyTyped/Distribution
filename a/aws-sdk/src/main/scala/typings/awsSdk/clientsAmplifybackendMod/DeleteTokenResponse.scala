package typings.awsSdk.clientsAmplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTokenResponse extends StObject {
  
  /**
    * Indicates whether the request succeeded or failed.
    */
  var IsSuccess: js.UndefOr[boolean] = js.undefined
}
object DeleteTokenResponse {
  
  inline def apply(): DeleteTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTokenResponse]
  }
  
  extension [Self <: DeleteTokenResponse](x: Self) {
    
    inline def setIsSuccess(value: boolean): Self = StObject.set(x, "IsSuccess", value.asInstanceOf[js.Any])
    
    inline def setIsSuccessUndefined: Self = StObject.set(x, "IsSuccess", js.undefined)
  }
}
