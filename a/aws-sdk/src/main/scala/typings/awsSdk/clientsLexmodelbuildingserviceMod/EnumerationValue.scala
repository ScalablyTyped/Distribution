package typings.awsSdk.clientsLexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumerationValue extends StObject {
  
  /**
    * Additional values related to the slot type value.
    */
  var synonyms: js.UndefOr[SynonymList] = js.undefined
  
  /**
    * The value of the slot type.
    */
  var value: Value
}
object EnumerationValue {
  
  inline def apply(value: Value): EnumerationValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumerationValue]
  }
  
  extension [Self <: EnumerationValue](x: Self) {
    
    inline def setSynonyms(value: SynonymList): Self = StObject.set(x, "synonyms", value.asInstanceOf[js.Any])
    
    inline def setSynonymsUndefined: Self = StObject.set(x, "synonyms", js.undefined)
    
    inline def setSynonymsVarargs(value: Value*): Self = StObject.set(x, "synonyms", js.Array(value*))
    
    inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
