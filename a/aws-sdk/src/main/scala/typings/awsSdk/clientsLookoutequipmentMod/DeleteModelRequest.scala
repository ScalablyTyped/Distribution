package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteModelRequest extends StObject {
  
  /**
    * The name of the ML model to be deleted. 
    */
  var ModelName: typings.awsSdk.clientsLookoutequipmentMod.ModelName
}
object DeleteModelRequest {
  
  inline def apply(ModelName: ModelName): DeleteModelRequest = {
    val __obj = js.Dynamic.literal(ModelName = ModelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteModelRequest]
  }
  
  extension [Self <: DeleteModelRequest](x: Self) {
    
    inline def setModelName(value: ModelName): Self = StObject.set(x, "ModelName", value.asInstanceOf[js.Any])
  }
}
