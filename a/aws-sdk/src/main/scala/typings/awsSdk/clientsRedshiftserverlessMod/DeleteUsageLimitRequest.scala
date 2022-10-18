package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteUsageLimitRequest extends StObject {
  
  /**
    * The unique identifier of the usage limit to delete.
    */
  var usageLimitId: String
}
object DeleteUsageLimitRequest {
  
  inline def apply(usageLimitId: String): DeleteUsageLimitRequest = {
    val __obj = js.Dynamic.literal(usageLimitId = usageLimitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUsageLimitRequest]
  }
  
  extension [Self <: DeleteUsageLimitRequest](x: Self) {
    
    inline def setUsageLimitId(value: String): Self = StObject.set(x, "usageLimitId", value.asInstanceOf[js.Any])
  }
}
