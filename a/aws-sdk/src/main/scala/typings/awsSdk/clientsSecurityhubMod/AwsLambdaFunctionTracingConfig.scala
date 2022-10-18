package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsLambdaFunctionTracingConfig extends StObject {
  
  /**
    * The tracing mode.
    */
  var Mode: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsLambdaFunctionTracingConfig {
  
  inline def apply(): AwsLambdaFunctionTracingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsLambdaFunctionTracingConfig]
  }
  
  extension [Self <: AwsLambdaFunctionTracingConfig](x: Self) {
    
    inline def setMode(value: NonEmptyString): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
  }
}
