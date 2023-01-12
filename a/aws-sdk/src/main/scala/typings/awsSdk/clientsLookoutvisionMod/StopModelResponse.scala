package typings.awsSdk.clientsLookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopModelResponse extends StObject {
  
  /**
    * The status of the model.
    */
  var Status: js.UndefOr[ModelHostingStatus] = js.undefined
}
object StopModelResponse {
  
  inline def apply(): StopModelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopModelResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopModelResponse] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: ModelHostingStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
