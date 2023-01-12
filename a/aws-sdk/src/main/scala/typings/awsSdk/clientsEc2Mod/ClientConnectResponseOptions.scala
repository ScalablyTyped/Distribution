package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientConnectResponseOptions extends StObject {
  
  /**
    * Indicates whether client connect options are enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Lambda function used for connection authorization.
    */
  var LambdaFunctionArn: js.UndefOr[String] = js.undefined
  
  /**
    * The status of any updates to the client connect options.
    */
  var Status: js.UndefOr[ClientVpnEndpointAttributeStatus] = js.undefined
}
object ClientConnectResponseOptions {
  
  inline def apply(): ClientConnectResponseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientConnectResponseOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientConnectResponseOptions] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setLambdaFunctionArn(value: String): Self = StObject.set(x, "LambdaFunctionArn", value.asInstanceOf[js.Any])
    
    inline def setLambdaFunctionArnUndefined: Self = StObject.set(x, "LambdaFunctionArn", js.undefined)
    
    inline def setStatus(value: ClientVpnEndpointAttributeStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
