package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListVoiceConnectorsResponse extends js.Object {
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The details of the Amazon Chime Voice Connectors.
    */
  var VoiceConnectors: js.UndefOr[VoiceConnectorList] = js.native
}

object ListVoiceConnectorsResponse {
  @scala.inline
  def apply(): ListVoiceConnectorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVoiceConnectorsResponse]
  }
  @scala.inline
  implicit class ListVoiceConnectorsResponseOps[Self <: ListVoiceConnectorsResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setVoiceConnectorsVarargs(value: VoiceConnector*): Self = this.set("VoiceConnectors", js.Array(value :_*))
    @scala.inline
    def setVoiceConnectors(value: VoiceConnectorList): Self = this.set("VoiceConnectors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVoiceConnectors: Self = this.set("VoiceConnectors", js.undefined)
  }
  
}

