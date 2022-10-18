package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeValue extends StObject {
  
  /**
    * A binary value.
    */
  var B: js.UndefOr[BinaryAttributeValue] = js.undefined
  
  /**
    * A list of binary values.
    */
  var BS: js.UndefOr[BinaryListAttributeValue] = js.undefined
  
  /**
    * A number.
    */
  var N: js.UndefOr[NumberAttributeValue] = js.undefined
  
  /**
    * A list of numbers.
    */
  var NS: js.UndefOr[NumberListAttributeValue] = js.undefined
  
  /**
    * A string.
    */
  var S: js.UndefOr[StringAttributeValue] = js.undefined
  
  /**
    * A list of strings.
    */
  var SS: js.UndefOr[StringListAttributeValue] = js.undefined
}
object AttributeValue {
  
  inline def apply(): AttributeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeValue]
  }
  
  extension [Self <: AttributeValue](x: Self) {
    
    inline def setB(value: BinaryAttributeValue): Self = StObject.set(x, "B", value.asInstanceOf[js.Any])
    
    inline def setBS(value: BinaryListAttributeValue): Self = StObject.set(x, "BS", value.asInstanceOf[js.Any])
    
    inline def setBSUndefined: Self = StObject.set(x, "BS", js.undefined)
    
    inline def setBSVarargs(value: BinaryAttributeValue*): Self = StObject.set(x, "BS", js.Array(value*))
    
    inline def setBUndefined: Self = StObject.set(x, "B", js.undefined)
    
    inline def setN(value: NumberAttributeValue): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
    
    inline def setNS(value: NumberListAttributeValue): Self = StObject.set(x, "NS", value.asInstanceOf[js.Any])
    
    inline def setNSUndefined: Self = StObject.set(x, "NS", js.undefined)
    
    inline def setNSVarargs(value: NumberAttributeValue*): Self = StObject.set(x, "NS", js.Array(value*))
    
    inline def setNUndefined: Self = StObject.set(x, "N", js.undefined)
    
    inline def setS(value: StringAttributeValue): Self = StObject.set(x, "S", value.asInstanceOf[js.Any])
    
    inline def setSS(value: StringListAttributeValue): Self = StObject.set(x, "SS", value.asInstanceOf[js.Any])
    
    inline def setSSUndefined: Self = StObject.set(x, "SS", js.undefined)
    
    inline def setSSVarargs(value: StringAttributeValue*): Self = StObject.set(x, "SS", js.Array(value*))
    
    inline def setSUndefined: Self = StObject.set(x, "S", js.undefined)
  }
}
