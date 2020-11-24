package typings.awsLambda.connectContactFlowMod

import typings.awsLambda.awsLambdaStrings.TELEPHONE_NUMBER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectContactFlowEndpoint extends js.Object {
  
  var Address: String = js.native
  
  var Type: TELEPHONE_NUMBER = js.native
}
object ConnectContactFlowEndpoint {
  
  @scala.inline
  def apply(Address: String, Type: TELEPHONE_NUMBER): ConnectContactFlowEndpoint = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectContactFlowEndpoint]
  }
  
  @scala.inline
  implicit class ConnectContactFlowEndpointOps[Self <: ConnectContactFlowEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddress(value: String): Self = this.set("Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TELEPHONE_NUMBER): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
}
