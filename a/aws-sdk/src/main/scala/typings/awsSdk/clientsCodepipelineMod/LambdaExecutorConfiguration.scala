package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaExecutorConfiguration extends StObject {
  
  /**
    * The ARN of the Lambda function used by the action engine.
    */
  var lambdaFunctionArn: LambdaFunctionArn
}
object LambdaExecutorConfiguration {
  
  inline def apply(lambdaFunctionArn: LambdaFunctionArn): LambdaExecutorConfiguration = {
    val __obj = js.Dynamic.literal(lambdaFunctionArn = lambdaFunctionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaExecutorConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LambdaExecutorConfiguration] (val x: Self) extends AnyVal {
    
    inline def setLambdaFunctionArn(value: LambdaFunctionArn): Self = StObject.set(x, "lambdaFunctionArn", value.asInstanceOf[js.Any])
  }
}
