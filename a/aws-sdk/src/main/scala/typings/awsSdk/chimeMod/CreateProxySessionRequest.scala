package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateProxySessionRequest extends js.Object {
  
  /**
    * The proxy session capabilities.
    */
  var Capabilities: CapabilityList = js.native
  
  /**
    * The number of minutes allowed for the proxy session.
    */
  var ExpiryMinutes: js.UndefOr[PositiveInteger] = js.native
  
  /**
    * The preference for matching the country or area code of the proxy phone number with that of the first participant.
    */
  var GeoMatchLevel: js.UndefOr[typings.awsSdk.chimeMod.GeoMatchLevel] = js.native
  
  /**
    * The country and area code for the proxy phone number.
    */
  var GeoMatchParams: js.UndefOr[typings.awsSdk.chimeMod.GeoMatchParams] = js.native
  
  /**
    * The name of the proxy session.
    */
  var Name: js.UndefOr[ProxySessionNameString] = js.native
  
  /**
    * The preference for proxy phone number reuse, or stickiness, between the same participants across sessions.
    */
  var NumberSelectionBehavior: js.UndefOr[typings.awsSdk.chimeMod.NumberSelectionBehavior] = js.native
  
  /**
    * The participant phone numbers.
    */
  var ParticipantPhoneNumbers: ParticipantPhoneNumberList = js.native
  
  /**
    * The Amazon Chime voice connector ID.
    */
  var VoiceConnectorId: NonEmptyString128 = js.native
}
object CreateProxySessionRequest {
  
  @scala.inline
  def apply(
    Capabilities: CapabilityList,
    ParticipantPhoneNumbers: ParticipantPhoneNumberList,
    VoiceConnectorId: NonEmptyString128
  ): CreateProxySessionRequest = {
    val __obj = js.Dynamic.literal(Capabilities = Capabilities.asInstanceOf[js.Any], ParticipantPhoneNumbers = ParticipantPhoneNumbers.asInstanceOf[js.Any], VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProxySessionRequest]
  }
  
  @scala.inline
  implicit class CreateProxySessionRequestOps[Self <: CreateProxySessionRequest] (val x: Self) extends AnyVal {
    
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
    def setCapabilitiesVarargs(value: Capability*): Self = this.set("Capabilities", js.Array(value :_*))
    
    @scala.inline
    def setCapabilities(value: CapabilityList): Self = this.set("Capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantPhoneNumbersVarargs(value: E164PhoneNumber*): Self = this.set("ParticipantPhoneNumbers", js.Array(value :_*))
    
    @scala.inline
    def setParticipantPhoneNumbers(value: ParticipantPhoneNumberList): Self = this.set("ParticipantPhoneNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceConnectorId(value: NonEmptyString128): Self = this.set("VoiceConnectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiryMinutes(value: PositiveInteger): Self = this.set("ExpiryMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiryMinutes: Self = this.set("ExpiryMinutes", js.undefined)
    
    @scala.inline
    def setGeoMatchLevel(value: GeoMatchLevel): Self = this.set("GeoMatchLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeoMatchLevel: Self = this.set("GeoMatchLevel", js.undefined)
    
    @scala.inline
    def setGeoMatchParams(value: GeoMatchParams): Self = this.set("GeoMatchParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeoMatchParams: Self = this.set("GeoMatchParams", js.undefined)
    
    @scala.inline
    def setName(value: ProxySessionNameString): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setNumberSelectionBehavior(value: NumberSelectionBehavior): Self = this.set("NumberSelectionBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberSelectionBehavior: Self = this.set("NumberSelectionBehavior", js.undefined)
  }
}
