package typings.angular.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILocaleNumberFormatDescriptor extends StObject {
  
  var CURRENCY_SYM: String
  
  var DECIMAL_SEP: String
  
  var GROUP_SEP: String
  
  var PATTERNS: js.Array[ILocaleNumberPatternDescriptor]
}
object ILocaleNumberFormatDescriptor {
  
  inline def apply(
    CURRENCY_SYM: String,
    DECIMAL_SEP: String,
    GROUP_SEP: String,
    PATTERNS: js.Array[ILocaleNumberPatternDescriptor]
  ): ILocaleNumberFormatDescriptor = {
    val __obj = js.Dynamic.literal(CURRENCY_SYM = CURRENCY_SYM.asInstanceOf[js.Any], DECIMAL_SEP = DECIMAL_SEP.asInstanceOf[js.Any], GROUP_SEP = GROUP_SEP.asInstanceOf[js.Any], PATTERNS = PATTERNS.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILocaleNumberFormatDescriptor]
  }
  
  extension [Self <: ILocaleNumberFormatDescriptor](x: Self) {
    
    inline def setCURRENCY_SYM(value: String): Self = StObject.set(x, "CURRENCY_SYM", value.asInstanceOf[js.Any])
    
    inline def setDECIMAL_SEP(value: String): Self = StObject.set(x, "DECIMAL_SEP", value.asInstanceOf[js.Any])
    
    inline def setGROUP_SEP(value: String): Self = StObject.set(x, "GROUP_SEP", value.asInstanceOf[js.Any])
    
    inline def setPATTERNS(value: js.Array[ILocaleNumberPatternDescriptor]): Self = StObject.set(x, "PATTERNS", value.asInstanceOf[js.Any])
    
    inline def setPATTERNSVarargs(value: ILocaleNumberPatternDescriptor*): Self = StObject.set(x, "PATTERNS", js.Array(value :_*))
  }
}
