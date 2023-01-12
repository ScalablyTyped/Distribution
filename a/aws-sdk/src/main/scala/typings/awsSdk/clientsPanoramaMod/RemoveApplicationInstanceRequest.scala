package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveApplicationInstanceRequest extends StObject {
  
  /**
    * An application instance ID.
    */
  var ApplicationInstanceId: typings.awsSdk.clientsPanoramaMod.ApplicationInstanceId
}
object RemoveApplicationInstanceRequest {
  
  inline def apply(ApplicationInstanceId: ApplicationInstanceId): RemoveApplicationInstanceRequest = {
    val __obj = js.Dynamic.literal(ApplicationInstanceId = ApplicationInstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveApplicationInstanceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveApplicationInstanceRequest] (val x: Self) extends AnyVal {
    
    inline def setApplicationInstanceId(value: ApplicationInstanceId): Self = StObject.set(x, "ApplicationInstanceId", value.asInstanceOf[js.Any])
  }
}
