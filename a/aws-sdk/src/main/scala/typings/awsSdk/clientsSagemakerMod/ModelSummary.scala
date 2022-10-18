package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelSummary extends StObject {
  
  /**
    * A timestamp that indicates when the model was created.
    */
  var CreationTime: js.Date
  
  /**
    * The Amazon Resource Name (ARN) of the model.
    */
  var ModelArn: typings.awsSdk.clientsSagemakerMod.ModelArn
  
  /**
    * The name of the model that you want a summary for.
    */
  var ModelName: typings.awsSdk.clientsSagemakerMod.ModelName
}
object ModelSummary {
  
  inline def apply(CreationTime: js.Date, ModelArn: ModelArn, ModelName: ModelName): ModelSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], ModelArn = ModelArn.asInstanceOf[js.Any], ModelName = ModelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelSummary]
  }
  
  extension [Self <: ModelSummary](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setModelArn(value: ModelArn): Self = StObject.set(x, "ModelArn", value.asInstanceOf[js.Any])
    
    inline def setModelName(value: ModelName): Self = StObject.set(x, "ModelName", value.asInstanceOf[js.Any])
  }
}
