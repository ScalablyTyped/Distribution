package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputProcessingConfigurationUpdate extends StObject {
  
  /**
    * Provides update information for an InputLambdaProcessor.
    */
  var InputLambdaProcessorUpdate: typings.awsSdk.clientsKinesisanalyticsv2Mod.InputLambdaProcessorUpdate
}
object InputProcessingConfigurationUpdate {
  
  inline def apply(InputLambdaProcessorUpdate: InputLambdaProcessorUpdate): InputProcessingConfigurationUpdate = {
    val __obj = js.Dynamic.literal(InputLambdaProcessorUpdate = InputLambdaProcessorUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputProcessingConfigurationUpdate]
  }
  
  extension [Self <: InputProcessingConfigurationUpdate](x: Self) {
    
    inline def setInputLambdaProcessorUpdate(value: InputLambdaProcessorUpdate): Self = StObject.set(x, "InputLambdaProcessorUpdate", value.asInstanceOf[js.Any])
  }
}
