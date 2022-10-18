package typings.awsSdk.clientsFinspaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEnvironmentRequest extends StObject {
  
  /**
    * The identifier of the FinSpace environment.
    */
  var environmentId: IdType
}
object GetEnvironmentRequest {
  
  inline def apply(environmentId: IdType): GetEnvironmentRequest = {
    val __obj = js.Dynamic.literal(environmentId = environmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEnvironmentRequest]
  }
  
  extension [Self <: GetEnvironmentRequest](x: Self) {
    
    inline def setEnvironmentId(value: IdType): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
  }
}
