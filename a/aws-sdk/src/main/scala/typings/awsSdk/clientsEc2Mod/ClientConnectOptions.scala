package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientConnectOptions extends StObject {
  
  /**
    * Indicates whether client connect options are enabled. The default is false (not enabled).
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Lambda function used for connection authorization.
    */
  var LambdaFunctionArn: js.UndefOr[String] = js.undefined
}
object ClientConnectOptions {
  
  inline def apply(): ClientConnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientConnectOptions]
  }
  
  extension [Self <: ClientConnectOptions](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setLambdaFunctionArn(value: String): Self = StObject.set(x, "LambdaFunctionArn", value.asInstanceOf[js.Any])
    
    inline def setLambdaFunctionArnUndefined: Self = StObject.set(x, "LambdaFunctionArn", js.undefined)
  }
}
