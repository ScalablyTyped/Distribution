package typings.awsSdk.amplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTokenRequest extends StObject {
  
  /**
    * The app ID.
    */
  var AppId: string
}
object CreateTokenRequest {
  
  inline def apply(AppId: string): CreateTokenRequest = {
    val __obj = js.Dynamic.literal(AppId = AppId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTokenRequest]
  }
  
  extension [Self <: CreateTokenRequest](x: Self) {
    
    inline def setAppId(value: string): Self = StObject.set(x, "AppId", value.asInstanceOf[js.Any])
  }
}
