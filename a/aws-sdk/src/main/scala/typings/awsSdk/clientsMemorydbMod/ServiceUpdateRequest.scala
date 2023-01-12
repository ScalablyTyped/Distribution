package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceUpdateRequest extends StObject {
  
  /**
    * The unique ID of the service update
    */
  var ServiceUpdateNameToApply: js.UndefOr[String] = js.undefined
}
object ServiceUpdateRequest {
  
  inline def apply(): ServiceUpdateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceUpdateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceUpdateRequest] (val x: Self) extends AnyVal {
    
    inline def setServiceUpdateNameToApply(value: String): Self = StObject.set(x, "ServiceUpdateNameToApply", value.asInstanceOf[js.Any])
    
    inline def setServiceUpdateNameToApplyUndefined: Self = StObject.set(x, "ServiceUpdateNameToApply", js.undefined)
  }
}
