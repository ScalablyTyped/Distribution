package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateConferenceProviderRequest extends js.Object {
  
  /**
    * The request token of the client.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.ClientRequestToken] = js.native
  
  /**
    * The name of the conference provider.
    */
  var ConferenceProviderName: typings.awsSdk.alexaforbusinessMod.ConferenceProviderName = js.native
  
  /**
    * Represents a type within a list of predefined types.
    */
  var ConferenceProviderType: typings.awsSdk.alexaforbusinessMod.ConferenceProviderType = js.native
  
  /**
    * The IP endpoint and protocol for calling.
    */
  var IPDialIn: js.UndefOr[typings.awsSdk.alexaforbusinessMod.IPDialIn] = js.native
  
  /**
    * The meeting settings for the conference provider.
    */
  var MeetingSetting: typings.awsSdk.alexaforbusinessMod.MeetingSetting = js.native
  
  /**
    * The information for PSTN conferencing.
    */
  var PSTNDialIn: js.UndefOr[typings.awsSdk.alexaforbusinessMod.PSTNDialIn] = js.native
}
object CreateConferenceProviderRequest {
  
  @scala.inline
  def apply(
    ConferenceProviderName: ConferenceProviderName,
    ConferenceProviderType: ConferenceProviderType,
    MeetingSetting: MeetingSetting
  ): CreateConferenceProviderRequest = {
    val __obj = js.Dynamic.literal(ConferenceProviderName = ConferenceProviderName.asInstanceOf[js.Any], ConferenceProviderType = ConferenceProviderType.asInstanceOf[js.Any], MeetingSetting = MeetingSetting.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConferenceProviderRequest]
  }
  
  @scala.inline
  implicit class CreateConferenceProviderRequestOps[Self <: CreateConferenceProviderRequest] (val x: Self) extends AnyVal {
    
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
    def setConferenceProviderName(value: ConferenceProviderName): Self = this.set("ConferenceProviderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConferenceProviderType(value: ConferenceProviderType): Self = this.set("ConferenceProviderType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeetingSetting(value: MeetingSetting): Self = this.set("MeetingSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = this.set("ClientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientRequestToken: Self = this.set("ClientRequestToken", js.undefined)
    
    @scala.inline
    def setIPDialIn(value: IPDialIn): Self = this.set("IPDialIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIPDialIn: Self = this.set("IPDialIn", js.undefined)
    
    @scala.inline
    def setPSTNDialIn(value: PSTNDialIn): Self = this.set("PSTNDialIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePSTNDialIn: Self = this.set("PSTNDialIn", js.undefined)
  }
}
