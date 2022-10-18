package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetApplicationComponentStrategiesRequest extends StObject {
  
  /**
    *  The ID of the application component. The ID is unique within an AWS account.
    */
  var applicationComponentId: ApplicationComponentId
}
object GetApplicationComponentStrategiesRequest {
  
  inline def apply(applicationComponentId: ApplicationComponentId): GetApplicationComponentStrategiesRequest = {
    val __obj = js.Dynamic.literal(applicationComponentId = applicationComponentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApplicationComponentStrategiesRequest]
  }
  
  extension [Self <: GetApplicationComponentStrategiesRequest](x: Self) {
    
    inline def setApplicationComponentId(value: ApplicationComponentId): Self = StObject.set(x, "applicationComponentId", value.asInstanceOf[js.Any])
  }
}
