package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteActivationRequest extends StObject {
  
  /**
    * The ID of the activation that you want to delete.
    */
  var ActivationId: typings.awsSdk.clientsSsmMod.ActivationId
}
object DeleteActivationRequest {
  
  inline def apply(ActivationId: ActivationId): DeleteActivationRequest = {
    val __obj = js.Dynamic.literal(ActivationId = ActivationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteActivationRequest]
  }
  
  extension [Self <: DeleteActivationRequest](x: Self) {
    
    inline def setActivationId(value: ActivationId): Self = StObject.set(x, "ActivationId", value.asInstanceOf[js.Any])
  }
}
