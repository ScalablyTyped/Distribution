package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalSourceSetting extends StObject {
  
  /**
    * Settings required for a slot type based on a grammar that you provide.
    */
  var grammarSlotTypeSetting: js.UndefOr[GrammarSlotTypeSetting] = js.undefined
}
object ExternalSourceSetting {
  
  inline def apply(): ExternalSourceSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalSourceSetting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExternalSourceSetting] (val x: Self) extends AnyVal {
    
    inline def setGrammarSlotTypeSetting(value: GrammarSlotTypeSetting): Self = StObject.set(x, "grammarSlotTypeSetting", value.asInstanceOf[js.Any])
    
    inline def setGrammarSlotTypeSettingUndefined: Self = StObject.set(x, "grammarSlotTypeSetting", js.undefined)
  }
}
