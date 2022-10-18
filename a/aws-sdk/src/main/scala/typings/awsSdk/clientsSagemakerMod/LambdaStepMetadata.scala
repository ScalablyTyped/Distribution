package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaStepMetadata extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Lambda function that was run by this step execution.
    */
  var Arn: js.UndefOr[String256] = js.undefined
  
  /**
    * A list of the output parameters of the Lambda step.
    */
  var OutputParameters: js.UndefOr[OutputParameterList] = js.undefined
}
object LambdaStepMetadata {
  
  inline def apply(): LambdaStepMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LambdaStepMetadata]
  }
  
  extension [Self <: LambdaStepMetadata](x: Self) {
    
    inline def setArn(value: String256): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setOutputParameters(value: OutputParameterList): Self = StObject.set(x, "OutputParameters", value.asInstanceOf[js.Any])
    
    inline def setOutputParametersUndefined: Self = StObject.set(x, "OutputParameters", js.undefined)
    
    inline def setOutputParametersVarargs(value: OutputParameter*): Self = StObject.set(x, "OutputParameters", js.Array(value*))
  }
}
