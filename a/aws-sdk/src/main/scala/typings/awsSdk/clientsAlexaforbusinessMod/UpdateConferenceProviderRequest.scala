package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateConferenceProviderRequest extends StObject {
  
  /**
    * The ARN of the conference provider.
    */
  var ConferenceProviderArn: Arn
  
  /**
    * The type of the conference provider.
    */
  var ConferenceProviderType: typings.awsSdk.clientsAlexaforbusinessMod.ConferenceProviderType
  
  /**
    * The IP endpoint and protocol for calling.
    */
  var IPDialIn: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.IPDialIn] = js.undefined
  
  /**
    * The meeting settings for the conference provider.
    */
  var MeetingSetting: typings.awsSdk.clientsAlexaforbusinessMod.MeetingSetting
  
  /**
    * The information for PSTN conferencing.
    */
  var PSTNDialIn: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.PSTNDialIn] = js.undefined
}
object UpdateConferenceProviderRequest {
  
  inline def apply(
    ConferenceProviderArn: Arn,
    ConferenceProviderType: ConferenceProviderType,
    MeetingSetting: MeetingSetting
  ): UpdateConferenceProviderRequest = {
    val __obj = js.Dynamic.literal(ConferenceProviderArn = ConferenceProviderArn.asInstanceOf[js.Any], ConferenceProviderType = ConferenceProviderType.asInstanceOf[js.Any], MeetingSetting = MeetingSetting.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConferenceProviderRequest]
  }
  
  extension [Self <: UpdateConferenceProviderRequest](x: Self) {
    
    inline def setConferenceProviderArn(value: Arn): Self = StObject.set(x, "ConferenceProviderArn", value.asInstanceOf[js.Any])
    
    inline def setConferenceProviderType(value: ConferenceProviderType): Self = StObject.set(x, "ConferenceProviderType", value.asInstanceOf[js.Any])
    
    inline def setIPDialIn(value: IPDialIn): Self = StObject.set(x, "IPDialIn", value.asInstanceOf[js.Any])
    
    inline def setIPDialInUndefined: Self = StObject.set(x, "IPDialIn", js.undefined)
    
    inline def setMeetingSetting(value: MeetingSetting): Self = StObject.set(x, "MeetingSetting", value.asInstanceOf[js.Any])
    
    inline def setPSTNDialIn(value: PSTNDialIn): Self = StObject.set(x, "PSTNDialIn", value.asInstanceOf[js.Any])
    
    inline def setPSTNDialInUndefined: Self = StObject.set(x, "PSTNDialIn", js.undefined)
  }
}
