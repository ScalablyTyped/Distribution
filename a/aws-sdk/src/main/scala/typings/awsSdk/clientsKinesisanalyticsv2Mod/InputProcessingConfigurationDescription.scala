package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputProcessingConfigurationDescription extends StObject {
  
  /**
    * Provides configuration information about the associated InputLambdaProcessorDescription 
    */
  var InputLambdaProcessorDescription: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.InputLambdaProcessorDescription] = js.undefined
}
object InputProcessingConfigurationDescription {
  
  inline def apply(): InputProcessingConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputProcessingConfigurationDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputProcessingConfigurationDescription] (val x: Self) extends AnyVal {
    
    inline def setInputLambdaProcessorDescription(value: InputLambdaProcessorDescription): Self = StObject.set(x, "InputLambdaProcessorDescription", value.asInstanceOf[js.Any])
    
    inline def setInputLambdaProcessorDescriptionUndefined: Self = StObject.set(x, "InputLambdaProcessorDescription", js.undefined)
  }
}
