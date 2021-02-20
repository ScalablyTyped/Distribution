package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SipMediaApplicationEndpoint extends StObject {
  
  /**
    * Valid Amazon Resource Name (ARN) of the Lambda function of the same AWS Region where the SIP media application is created.
    */
  var LambdaArn: js.UndefOr[FunctionArn] = js.native
}
object SipMediaApplicationEndpoint {
  
  @scala.inline
  def apply(): SipMediaApplicationEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SipMediaApplicationEndpoint]
  }
  
  @scala.inline
  implicit class SipMediaApplicationEndpointMutableBuilder[Self <: SipMediaApplicationEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLambdaArn(value: FunctionArn): Self = StObject.set(x, "LambdaArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaArnUndefined: Self = StObject.set(x, "LambdaArn", js.undefined)
  }
}
