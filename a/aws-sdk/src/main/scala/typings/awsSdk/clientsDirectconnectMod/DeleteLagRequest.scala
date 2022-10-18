package typings.awsSdk.clientsDirectconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLagRequest extends StObject {
  
  /**
    * The ID of the LAG.
    */
  var lagId: LagId
}
object DeleteLagRequest {
  
  inline def apply(lagId: LagId): DeleteLagRequest = {
    val __obj = js.Dynamic.literal(lagId = lagId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLagRequest]
  }
  
  extension [Self <: DeleteLagRequest](x: Self) {
    
    inline def setLagId(value: LagId): Self = StObject.set(x, "lagId", value.asInstanceOf[js.Any])
  }
}
