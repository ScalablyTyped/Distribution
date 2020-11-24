package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SipMediaApplicationEndpoint extends js.Object {
  
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
  implicit class SipMediaApplicationEndpointOps[Self <: SipMediaApplicationEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLambdaArn(value: FunctionArn): Self = this.set("LambdaArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLambdaArn: Self = this.set("LambdaArn", js.undefined)
  }
}
