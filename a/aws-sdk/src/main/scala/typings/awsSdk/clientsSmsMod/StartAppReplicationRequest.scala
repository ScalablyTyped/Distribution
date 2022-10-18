package typings.awsSdk.clientsSmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartAppReplicationRequest extends StObject {
  
  /**
    * The ID of the application.
    */
  var appId: js.UndefOr[AppId] = js.undefined
}
object StartAppReplicationRequest {
  
  inline def apply(): StartAppReplicationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartAppReplicationRequest]
  }
  
  extension [Self <: StartAppReplicationRequest](x: Self) {
    
    inline def setAppId(value: AppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
  }
}
