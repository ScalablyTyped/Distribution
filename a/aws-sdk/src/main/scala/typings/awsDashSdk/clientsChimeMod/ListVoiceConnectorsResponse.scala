package typings.awsDashSdk.clientsChimeMod

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
  def apply(NextToken: String = null, VoiceConnectors: VoiceConnectorList = null): ListVoiceConnectorsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (VoiceConnectors != null) __obj.updateDynamic("VoiceConnectors")(VoiceConnectors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVoiceConnectorsResponse]
  }
}

