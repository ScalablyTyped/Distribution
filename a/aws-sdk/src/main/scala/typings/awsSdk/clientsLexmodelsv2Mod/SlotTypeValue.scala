package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlotTypeValue extends StObject {
  
  /**
    * The value of the slot type entry.
    */
  var sampleValue: js.UndefOr[SampleValue] = js.undefined
  
  /**
    * Additional values related to the slot type entry.
    */
  var synonyms: js.UndefOr[SynonymList] = js.undefined
}
object SlotTypeValue {
  
  inline def apply(): SlotTypeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlotTypeValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlotTypeValue] (val x: Self) extends AnyVal {
    
    inline def setSampleValue(value: SampleValue): Self = StObject.set(x, "sampleValue", value.asInstanceOf[js.Any])
    
    inline def setSampleValueUndefined: Self = StObject.set(x, "sampleValue", js.undefined)
    
    inline def setSynonyms(value: SynonymList): Self = StObject.set(x, "synonyms", value.asInstanceOf[js.Any])
    
    inline def setSynonymsUndefined: Self = StObject.set(x, "synonyms", js.undefined)
    
    inline def setSynonymsVarargs(value: SampleValue*): Self = StObject.set(x, "synonyms", js.Array(value*))
  }
}
