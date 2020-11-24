package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): ListVoiceConnectorGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVoiceConnectorGroupsResponse]
  }
  
  @scala.inline
  implicit class ListVoiceConnectorGroupsResponseOps[Self <: ListVoiceConnectorGroupsResponse] (val x: Self) extends AnyVal {
    
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
    def setVoiceConnectorGroupsVarargs(value: VoiceConnectorGroup*): Self = this.set("VoiceConnectorGroups", js.Array(value :_*))
    
    @scala.inline
    def setVoiceConnectorGroups(value: VoiceConnectorGroupList): Self = this.set("VoiceConnectorGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVoiceConnectorGroups: Self = this.set("VoiceConnectorGroups", js.undefined)
  }
}
