package typings.awsSdk.clientsChimesdkmeetingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeetingFeaturesConfiguration extends StObject {
  
  /**
    * The configuration settings for the audio features available to a meeting.
    */
  var Audio: js.UndefOr[AudioFeatures] = js.undefined
}
object MeetingFeaturesConfiguration {
  
  inline def apply(): MeetingFeaturesConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeetingFeaturesConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MeetingFeaturesConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAudio(value: AudioFeatures): Self = StObject.set(x, "Audio", value.asInstanceOf[js.Any])
    
    inline def setAudioUndefined: Self = StObject.set(x, "Audio", js.undefined)
  }
}
