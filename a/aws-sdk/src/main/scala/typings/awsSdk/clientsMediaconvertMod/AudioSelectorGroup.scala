package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioSelectorGroup extends StObject {
  
  /**
    * Name of an Audio Selector within the same input to include in the group.  Audio selector names are standardized, based on their order within the input (e.g., "Audio Selector 1"). The audio selector name parameter can be repeated to add any number of audio selectors to the group.
    */
  var AudioSelectorNames: js.UndefOr[listOfStringMin1] = js.undefined
}
object AudioSelectorGroup {
  
  inline def apply(): AudioSelectorGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioSelectorGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioSelectorGroup] (val x: Self) extends AnyVal {
    
    inline def setAudioSelectorNames(value: listOfStringMin1): Self = StObject.set(x, "AudioSelectorNames", value.asInstanceOf[js.Any])
    
    inline def setAudioSelectorNamesUndefined: Self = StObject.set(x, "AudioSelectorNames", js.undefined)
    
    inline def setAudioSelectorNamesVarargs(value: stringMin1*): Self = StObject.set(x, "AudioSelectorNames", js.Array(value*))
  }
}
