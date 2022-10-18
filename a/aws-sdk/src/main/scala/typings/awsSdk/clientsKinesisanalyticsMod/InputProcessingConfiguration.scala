package typings.awsSdk.clientsKinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputProcessingConfiguration extends StObject {
  
  /**
    * The InputLambdaProcessor that is used to preprocess the records in the stream before being processed by your application code.
    */
  var InputLambdaProcessor: typings.awsSdk.clientsKinesisanalyticsMod.InputLambdaProcessor
}
object InputProcessingConfiguration {
  
  inline def apply(InputLambdaProcessor: InputLambdaProcessor): InputProcessingConfiguration = {
    val __obj = js.Dynamic.literal(InputLambdaProcessor = InputLambdaProcessor.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputProcessingConfiguration]
  }
  
  extension [Self <: InputProcessingConfiguration](x: Self) {
    
    inline def setInputLambdaProcessor(value: InputLambdaProcessor): Self = StObject.set(x, "InputLambdaProcessor", value.asInstanceOf[js.Any])
  }
}
