package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartFlywheelIterationRequest extends StObject {
  
  /**
    * A unique identifier for the request. If you don't set the client request token, Amazon Comprehend generates one.
    */
  var ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined
  
  /**
    * The ARN of the flywheel.
    */
  var FlywheelArn: ComprehendFlywheelArn
}
object StartFlywheelIterationRequest {
  
  inline def apply(FlywheelArn: ComprehendFlywheelArn): StartFlywheelIterationRequest = {
    val __obj = js.Dynamic.literal(FlywheelArn = FlywheelArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartFlywheelIterationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartFlywheelIterationRequest] (val x: Self) extends AnyVal {
    
    inline def setClientRequestToken(value: ClientRequestTokenString): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setFlywheelArn(value: ComprehendFlywheelArn): Self = StObject.set(x, "FlywheelArn", value.asInstanceOf[js.Any])
  }
}
