package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioSelector extends StObject {
  
  /**
    * The name of this AudioSelector. AudioDescriptions will use this name to uniquely identify this Selector.  Selector names should be unique per input.
    */
  var Name: stringMin1
  
  /**
    * The audio selector settings.
    */
  var SelectorSettings: js.UndefOr[AudioSelectorSettings] = js.undefined
}
object AudioSelector {
  
  inline def apply(Name: stringMin1): AudioSelector = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioSelector]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioSelector] (val x: Self) extends AnyVal {
    
    inline def setName(value: stringMin1): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSelectorSettings(value: AudioSelectorSettings): Self = StObject.set(x, "SelectorSettings", value.asInstanceOf[js.Any])
    
    inline def setSelectorSettingsUndefined: Self = StObject.set(x, "SelectorSettings", js.undefined)
  }
}
