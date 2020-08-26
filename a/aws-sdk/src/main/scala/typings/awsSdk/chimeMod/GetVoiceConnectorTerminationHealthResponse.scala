package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVoiceConnectorTerminationHealthResponse extends js.Object {
  /**
    * The termination health details.
    */
  var TerminationHealth: js.UndefOr[typings.awsSdk.chimeMod.TerminationHealth] = js.native
}

object GetVoiceConnectorTerminationHealthResponse {
  @scala.inline
  def apply(): GetVoiceConnectorTerminationHealthResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVoiceConnectorTerminationHealthResponse]
  }
  @scala.inline
  implicit class GetVoiceConnectorTerminationHealthResponseOps[Self <: GetVoiceConnectorTerminationHealthResponse] (val x: Self) extends AnyVal {
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
    def setTerminationHealth(value: TerminationHealth): Self = this.set("TerminationHealth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerminationHealth: Self = this.set("TerminationHealth", js.undefined)
  }
  
}

