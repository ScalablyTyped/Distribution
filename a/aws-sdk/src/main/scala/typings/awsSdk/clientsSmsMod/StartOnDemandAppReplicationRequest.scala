package typings.awsSdk.clientsSmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartOnDemandAppReplicationRequest extends StObject {
  
  /**
    * The ID of the application.
    */
  var appId: AppId
  
  /**
    * The description of the replication run.
    */
  var description: js.UndefOr[Description] = js.undefined
}
object StartOnDemandAppReplicationRequest {
  
  inline def apply(appId: AppId): StartOnDemandAppReplicationRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartOnDemandAppReplicationRequest]
  }
  
  extension [Self <: StartOnDemandAppReplicationRequest](x: Self) {
    
    inline def setAppId(value: AppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
