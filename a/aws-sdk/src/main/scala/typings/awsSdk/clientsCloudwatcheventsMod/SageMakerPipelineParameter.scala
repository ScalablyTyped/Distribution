package typings.awsSdk.clientsCloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SageMakerPipelineParameter extends StObject {
  
  /**
    * Name of parameter to start execution of a SageMaker Model Building Pipeline.
    */
  var Name: SageMakerPipelineParameterName
  
  /**
    * Value of parameter to start execution of a SageMaker Model Building Pipeline.
    */
  var Value: SageMakerPipelineParameterValue
}
object SageMakerPipelineParameter {
  
  inline def apply(Name: SageMakerPipelineParameterName, Value: SageMakerPipelineParameterValue): SageMakerPipelineParameter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SageMakerPipelineParameter]
  }
  
  extension [Self <: SageMakerPipelineParameter](x: Self) {
    
    inline def setName(value: SageMakerPipelineParameterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: SageMakerPipelineParameterValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
