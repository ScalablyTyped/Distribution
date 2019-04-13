package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListVoiceConnectorsResponse extends js.Object {
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * The details of the Amazon Chime Voice Connectors.
    */
  var VoiceConnectors: js.UndefOr[VoiceConnectorList] = js.undefined
}

object ListVoiceConnectorsResponse {
  @scala.inline
  def apply(NextToken: String = null, VoiceConnectors: VoiceConnectorList = null): ListVoiceConnectorsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (VoiceConnectors != null) __obj.updateDynamic("VoiceConnectors")(VoiceConnectors)
    __obj.asInstanceOf[ListVoiceConnectorsResponse]
  }
}

