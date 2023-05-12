package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeValue extends StObject {
  
  /**
    * For number values, expressed as double.
    */
  var N: js.UndefOr[DoubleObject] = js.undefined
  
  /**
    * For single string values. Maximum string length is 100 characters.
    */
  var S: js.UndefOr[PlayerAttributeString] = js.undefined
  
  /**
    * For a map of up to 10 data type:value pairs. Maximum length for each string value is 100 characters. 
    */
  var SDM: js.UndefOr[PlayerAttributeStringDoubleMap] = js.undefined
  
  /**
    * For a list of up to 100 strings. Maximum length for each string is 100 characters. Duplicate values are not recognized; all occurrences of the repeated value after the first of a repeated value are ignored.
    */
  var SL: js.UndefOr[PlayerAttributeStringList] = js.undefined
}
object AttributeValue {
  
  inline def apply(): AttributeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttributeValue] (val x: Self) extends AnyVal {
    
    inline def setN(value: DoubleObject): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
    
    inline def setNUndefined: Self = StObject.set(x, "N", js.undefined)
    
    inline def setS(value: PlayerAttributeString): Self = StObject.set(x, "S", value.asInstanceOf[js.Any])
    
    inline def setSDM(value: PlayerAttributeStringDoubleMap): Self = StObject.set(x, "SDM", value.asInstanceOf[js.Any])
    
    inline def setSDMUndefined: Self = StObject.set(x, "SDM", js.undefined)
    
    inline def setSL(value: PlayerAttributeStringList): Self = StObject.set(x, "SL", value.asInstanceOf[js.Any])
    
    inline def setSLUndefined: Self = StObject.set(x, "SL", js.undefined)
    
    inline def setSLVarargs(value: PlayerAttributeString*): Self = StObject.set(x, "SL", js.Array(value*))
    
    inline def setSUndefined: Self = StObject.set(x, "S", js.undefined)
  }
}
