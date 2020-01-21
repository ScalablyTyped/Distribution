package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListVoiceConnectorGroupsResponse extends js.Object {
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The details of the Amazon Chime Voice Connector groups.
    */
  var VoiceConnectorGroups: js.UndefOr[VoiceConnectorGroupList] = js.native
}

object ListVoiceConnectorGroupsResponse {
  @scala.inline
  def apply(NextToken: String = null, VoiceConnectorGroups: VoiceConnectorGroupList = null): ListVoiceConnectorGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (VoiceConnectorGroups != null) __obj.updateDynamic("VoiceConnectorGroups")(VoiceConnectorGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVoiceConnectorGroupsResponse]
  }
}

