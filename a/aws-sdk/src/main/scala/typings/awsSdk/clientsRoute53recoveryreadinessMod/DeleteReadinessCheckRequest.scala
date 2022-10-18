package typings.awsSdk.clientsRoute53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteReadinessCheckRequest extends StObject {
  
  /**
    * Name of a readiness check.
    */
  var ReadinessCheckName: string
}
object DeleteReadinessCheckRequest {
  
  inline def apply(ReadinessCheckName: string): DeleteReadinessCheckRequest = {
    val __obj = js.Dynamic.literal(ReadinessCheckName = ReadinessCheckName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReadinessCheckRequest]
  }
  
  extension [Self <: DeleteReadinessCheckRequest](x: Self) {
    
    inline def setReadinessCheckName(value: string): Self = StObject.set(x, "ReadinessCheckName", value.asInstanceOf[js.Any])
  }
}
