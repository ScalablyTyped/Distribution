package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuntimeVersionConfig extends StObject {
  
  /**
    * Error response when Lambda is unable to retrieve the runtime version for a function.
    */
  var Error: js.UndefOr[RuntimeVersionError] = js.undefined
  
  /**
    * The ARN of the runtime version you want the function to use.
    */
  var RuntimeVersionArn: js.UndefOr[typings.awsSdk.clientsLambdaMod.RuntimeVersionArn] = js.undefined
}
object RuntimeVersionConfig {
  
  inline def apply(): RuntimeVersionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuntimeVersionConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuntimeVersionConfig] (val x: Self) extends AnyVal {
    
    inline def setError(value: RuntimeVersionError): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
    
    inline def setRuntimeVersionArn(value: RuntimeVersionArn): Self = StObject.set(x, "RuntimeVersionArn", value.asInstanceOf[js.Any])
    
    inline def setRuntimeVersionArnUndefined: Self = StObject.set(x, "RuntimeVersionArn", js.undefined)
  }
}
