package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutInstancePublicPortsResult extends StObject {
  
  /**
    * An array of objects that describe the result of the action, such as the status of the request, the timestamp of the request, and the resources affected by the request.
    */
  var operation: js.UndefOr[Operation] = js.undefined
}
object PutInstancePublicPortsResult {
  
  inline def apply(): PutInstancePublicPortsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutInstancePublicPortsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutInstancePublicPortsResult] (val x: Self) extends AnyVal {
    
    inline def setOperation(value: Operation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
  }
}
