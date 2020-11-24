package typings.awsSdk.braketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateQuantumTaskResponse extends js.Object {
  
  /**
    * The ARN of the task created by the request.
    */
  var quantumTaskArn: QuantumTaskArn = js.native
}
object CreateQuantumTaskResponse {
  
  @scala.inline
  def apply(quantumTaskArn: QuantumTaskArn): CreateQuantumTaskResponse = {
    val __obj = js.Dynamic.literal(quantumTaskArn = quantumTaskArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateQuantumTaskResponse]
  }
  
  @scala.inline
  implicit class CreateQuantumTaskResponseOps[Self <: CreateQuantumTaskResponse] (val x: Self) extends AnyVal {
    
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
    def setQuantumTaskArn(value: QuantumTaskArn): Self = this.set("quantumTaskArn", value.asInstanceOf[js.Any])
  }
}
