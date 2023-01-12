package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioLanguageSelection extends StObject {
  
  /**
    * Selects a specific three-letter language code from within an audio source.
    */
  var LanguageCode: string
  
  /**
    * When set to "strict", the transport stream demux strictly identifies audio streams by their language descriptor. If a PMT update occurs such that an audio stream matching the initially selected language is no longer present then mute will be encoded until the language returns. If "loose", then on a PMT update the demux will choose another audio stream in the program with the same stream type if it can't find one with the same language.
    */
  var LanguageSelectionPolicy: js.UndefOr[AudioLanguageSelectionPolicy] = js.undefined
}
object AudioLanguageSelection {
  
  inline def apply(LanguageCode: string): AudioLanguageSelection = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioLanguageSelection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioLanguageSelection] (val x: Self) extends AnyVal {
    
    inline def setLanguageCode(value: string): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageSelectionPolicy(value: AudioLanguageSelectionPolicy): Self = StObject.set(x, "LanguageSelectionPolicy", value.asInstanceOf[js.Any])
    
    inline def setLanguageSelectionPolicyUndefined: Self = StObject.set(x, "LanguageSelectionPolicy", js.undefined)
  }
}
