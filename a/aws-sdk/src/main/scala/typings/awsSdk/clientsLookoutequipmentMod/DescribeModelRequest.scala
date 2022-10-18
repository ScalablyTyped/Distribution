package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeModelRequest extends StObject {
  
  /**
    * The name of the ML model to be described. 
    */
  var ModelName: typings.awsSdk.clientsLookoutequipmentMod.ModelName
}
object DescribeModelRequest {
  
  inline def apply(ModelName: ModelName): DescribeModelRequest = {
    val __obj = js.Dynamic.literal(ModelName = ModelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeModelRequest]
  }
  
  extension [Self <: DescribeModelRequest](x: Self) {
    
    inline def setModelName(value: ModelName): Self = StObject.set(x, "ModelName", value.asInstanceOf[js.Any])
  }
}
