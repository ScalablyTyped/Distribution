package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteModelInput extends StObject {
  
  /**
    * The name of the model to delete.
    */
  var ModelName: typings.awsSdk.clientsSagemakerMod.ModelName
}
object DeleteModelInput {
  
  inline def apply(ModelName: ModelName): DeleteModelInput = {
    val __obj = js.Dynamic.literal(ModelName = ModelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteModelInput]
  }
  
  extension [Self <: DeleteModelInput](x: Self) {
    
    inline def setModelName(value: ModelName): Self = StObject.set(x, "ModelName", value.asInstanceOf[js.Any])
  }
}
