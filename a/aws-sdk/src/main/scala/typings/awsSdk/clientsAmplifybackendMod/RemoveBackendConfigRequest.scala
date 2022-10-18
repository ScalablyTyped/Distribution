package typings.awsSdk.clientsAmplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveBackendConfigRequest extends StObject {
  
  /**
    * The app ID.
    */
  var AppId: string
}
object RemoveBackendConfigRequest {
  
  inline def apply(AppId: string): RemoveBackendConfigRequest = {
    val __obj = js.Dynamic.literal(AppId = AppId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveBackendConfigRequest]
  }
  
  extension [Self <: RemoveBackendConfigRequest](x: Self) {
    
    inline def setAppId(value: string): Self = StObject.set(x, "AppId", value.asInstanceOf[js.Any])
  }
}
