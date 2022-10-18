package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetApplicationComponentDetailsRequest extends StObject {
  
  /**
    *  The ID of the application component. The ID is unique within an AWS account.
    */
  var applicationComponentId: ApplicationComponentId
}
object GetApplicationComponentDetailsRequest {
  
  inline def apply(applicationComponentId: ApplicationComponentId): GetApplicationComponentDetailsRequest = {
    val __obj = js.Dynamic.literal(applicationComponentId = applicationComponentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApplicationComponentDetailsRequest]
  }
  
  extension [Self <: GetApplicationComponentDetailsRequest](x: Self) {
    
    inline def setApplicationComponentId(value: ApplicationComponentId): Self = StObject.set(x, "applicationComponentId", value.asInstanceOf[js.Any])
  }
}
