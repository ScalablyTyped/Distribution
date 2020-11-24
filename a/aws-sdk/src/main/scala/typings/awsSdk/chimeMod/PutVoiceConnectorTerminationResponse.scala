package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutVoiceConnectorTerminationResponse extends js.Object {
  
  /**
    * The updated termination setting details.
    */
  var Termination: js.UndefOr[typings.awsSdk.chimeMod.Termination] = js.native
}
object PutVoiceConnectorTerminationResponse {
  
  @scala.inline
  def apply(): PutVoiceConnectorTerminationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutVoiceConnectorTerminationResponse]
  }
  
  @scala.inline
  implicit class PutVoiceConnectorTerminationResponseOps[Self <: PutVoiceConnectorTerminationResponse] (val x: Self) extends AnyVal {
    
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
    def setTermination(value: Termination): Self = this.set("Termination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTermination: Self = this.set("Termination", js.undefined)
  }
}
