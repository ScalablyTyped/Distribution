package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignalApplicationInstanceNodeInstancesResponse extends StObject {
  
  /**
    * An application instance ID.
    */
  var ApplicationInstanceId: typings.awsSdk.clientsPanoramaMod.ApplicationInstanceId
}
object SignalApplicationInstanceNodeInstancesResponse {
  
  inline def apply(ApplicationInstanceId: ApplicationInstanceId): SignalApplicationInstanceNodeInstancesResponse = {
    val __obj = js.Dynamic.literal(ApplicationInstanceId = ApplicationInstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignalApplicationInstanceNodeInstancesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SignalApplicationInstanceNodeInstancesResponse] (val x: Self) extends AnyVal {
    
    inline def setApplicationInstanceId(value: ApplicationInstanceId): Self = StObject.set(x, "ApplicationInstanceId", value.asInstanceOf[js.Any])
  }
}
