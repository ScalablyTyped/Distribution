package typings.awsSdk.ampMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlertManagerDefinitionStatus extends StObject {
  
  /**
    * Status code of this definition.
    */
  var statusCode: AlertManagerDefinitionStatusCode
  
  /**
    * The reason for failure if any.
    */
  var statusReason: js.UndefOr[String] = js.undefined
}
object AlertManagerDefinitionStatus {
  
  inline def apply(statusCode: AlertManagerDefinitionStatusCode): AlertManagerDefinitionStatus = {
    val __obj = js.Dynamic.literal(statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertManagerDefinitionStatus]
  }
  
  extension [Self <: AlertManagerDefinitionStatus](x: Self) {
    
    inline def setStatusCode(value: AlertManagerDefinitionStatusCode): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: String): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
  }
}
