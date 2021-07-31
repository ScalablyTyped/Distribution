package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConferenceProviderRequest extends StObject {
  
  /**
    * The request token of the client.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.ClientRequestToken] = js.undefined
  
  /**
    * The name of the conference provider.
    */
  var ConferenceProviderName: typings.awsSdk.alexaforbusinessMod.ConferenceProviderName
  
  /**
    * Represents a type within a list of predefined types.
    */
  var ConferenceProviderType: typings.awsSdk.alexaforbusinessMod.ConferenceProviderType
  
  /**
    * The IP endpoint and protocol for calling.
    */
  var IPDialIn: js.UndefOr[typings.awsSdk.alexaforbusinessMod.IPDialIn] = js.undefined
  
  /**
    * The meeting settings for the conference provider.
    */
  var MeetingSetting: typings.awsSdk.alexaforbusinessMod.MeetingSetting
  
  /**
    * The information for PSTN conferencing.
    */
  var PSTNDialIn: js.UndefOr[typings.awsSdk.alexaforbusinessMod.PSTNDialIn] = js.undefined
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
  implicit class CreateConferenceProviderRequestMutableBuilder[Self <: CreateConferenceProviderRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    @scala.inline
    def setConferenceProviderName(value: ConferenceProviderName): Self = StObject.set(x, "ConferenceProviderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConferenceProviderType(value: ConferenceProviderType): Self = StObject.set(x, "ConferenceProviderType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPDialIn(value: IPDialIn): Self = StObject.set(x, "IPDialIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPDialInUndefined: Self = StObject.set(x, "IPDialIn", js.undefined)
    
    @scala.inline
    def setMeetingSetting(value: MeetingSetting): Self = StObject.set(x, "MeetingSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPSTNDialIn(value: PSTNDialIn): Self = StObject.set(x, "PSTNDialIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPSTNDialInUndefined: Self = StObject.set(x, "PSTNDialIn", js.undefined)
  }
}
