package typings.awsSdk.clientsAmplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBackendConfigRequest extends StObject {
  
  /**
    * The app ID.
    */
  var AppId: string
  
  /**
    * The app ID for the backend manager.
    */
  var BackendManagerAppId: js.UndefOr[string] = js.undefined
}
object CreateBackendConfigRequest {
  
  inline def apply(AppId: string): CreateBackendConfigRequest = {
    val __obj = js.Dynamic.literal(AppId = AppId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBackendConfigRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateBackendConfigRequest] (val x: Self) extends AnyVal {
    
    inline def setAppId(value: string): Self = StObject.set(x, "AppId", value.asInstanceOf[js.Any])
    
    inline def setBackendManagerAppId(value: string): Self = StObject.set(x, "BackendManagerAppId", value.asInstanceOf[js.Any])
    
    inline def setBackendManagerAppIdUndefined: Self = StObject.set(x, "BackendManagerAppId", js.undefined)
  }
}
