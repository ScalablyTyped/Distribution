package typings.awsSdk.ampMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutAlertManagerDefinitionResponse extends StObject {
  
  /**
    * The status of alert manager definition.
    */
  var status: AlertManagerDefinitionStatus
}
object PutAlertManagerDefinitionResponse {
  
  inline def apply(status: AlertManagerDefinitionStatus): PutAlertManagerDefinitionResponse = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAlertManagerDefinitionResponse]
  }
  
  extension [Self <: PutAlertManagerDefinitionResponse](x: Self) {
    
    inline def setStatus(value: AlertManagerDefinitionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
