package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConferenceProvider extends StObject {
  
  /**
    * The ARN of the newly created conference provider.
    */
  var Arn: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.Arn] = js.undefined
  
  /**
    * The IP endpoint and protocol for calling.
    */
  var IPDialIn: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.IPDialIn] = js.undefined
  
  /**
    * The meeting settings for the conference provider.
    */
  var MeetingSetting: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.MeetingSetting] = js.undefined
  
  /**
    * The name of the conference provider.
    */
  var Name: js.UndefOr[ConferenceProviderName] = js.undefined
  
  /**
    * The information for PSTN conferencing.
    */
  var PSTNDialIn: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.PSTNDialIn] = js.undefined
  
  /**
    * The type of conference providers.
    */
  var Type: js.UndefOr[ConferenceProviderType] = js.undefined
}
object ConferenceProvider {
  
  inline def apply(): ConferenceProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConferenceProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConferenceProvider] (val x: Self) extends AnyVal {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setIPDialIn(value: IPDialIn): Self = StObject.set(x, "IPDialIn", value.asInstanceOf[js.Any])
    
    inline def setIPDialInUndefined: Self = StObject.set(x, "IPDialIn", js.undefined)
    
    inline def setMeetingSetting(value: MeetingSetting): Self = StObject.set(x, "MeetingSetting", value.asInstanceOf[js.Any])
    
    inline def setMeetingSettingUndefined: Self = StObject.set(x, "MeetingSetting", js.undefined)
    
    inline def setName(value: ConferenceProviderName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPSTNDialIn(value: PSTNDialIn): Self = StObject.set(x, "PSTNDialIn", value.asInstanceOf[js.Any])
    
    inline def setPSTNDialInUndefined: Self = StObject.set(x, "PSTNDialIn", js.undefined)
    
    inline def setType(value: ConferenceProviderType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
