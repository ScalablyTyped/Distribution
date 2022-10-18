package typings.awsSdk.clientsAmpMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAlertManagerDefinitionResponse extends StObject {
  
  /**
    * The status of alert manager definition.
    */
  var status: AlertManagerDefinitionStatus
}
object CreateAlertManagerDefinitionResponse {
  
  inline def apply(status: AlertManagerDefinitionStatus): CreateAlertManagerDefinitionResponse = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAlertManagerDefinitionResponse]
  }
  
  extension [Self <: CreateAlertManagerDefinitionResponse](x: Self) {
    
    inline def setStatus(value: AlertManagerDefinitionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
