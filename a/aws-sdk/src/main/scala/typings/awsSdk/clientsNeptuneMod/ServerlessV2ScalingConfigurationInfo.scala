package typings.awsSdk.clientsNeptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerlessV2ScalingConfigurationInfo extends StObject {
  
  /**
    * The maximum number of Neptune capacity units (NCUs) for a DB instance in a Neptune Serverless cluster. You can specify NCU values in half-step increments, such as 40, 40.5, 41, and so on.
    */
  var MaxCapacity: js.UndefOr[DoubleOptional] = js.undefined
  
  /**
    * The minimum number of Neptune capacity units (NCUs) for a DB instance in a Neptune Serverless cluster. You can specify NCU values in half-step increments, such as 8, 8.5, 9, and so on.
    */
  var MinCapacity: js.UndefOr[DoubleOptional] = js.undefined
}
object ServerlessV2ScalingConfigurationInfo {
  
  inline def apply(): ServerlessV2ScalingConfigurationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerlessV2ScalingConfigurationInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServerlessV2ScalingConfigurationInfo] (val x: Self) extends AnyVal {
    
    inline def setMaxCapacity(value: DoubleOptional): Self = StObject.set(x, "MaxCapacity", value.asInstanceOf[js.Any])
    
    inline def setMaxCapacityUndefined: Self = StObject.set(x, "MaxCapacity", js.undefined)
    
    inline def setMinCapacity(value: DoubleOptional): Self = StObject.set(x, "MinCapacity", value.asInstanceOf[js.Any])
    
    inline def setMinCapacityUndefined: Self = StObject.set(x, "MinCapacity", js.undefined)
  }
}
