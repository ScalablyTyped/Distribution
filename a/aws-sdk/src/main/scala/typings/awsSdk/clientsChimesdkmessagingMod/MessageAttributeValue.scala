package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageAttributeValue extends StObject {
  
  /**
    * The strings in a message attribute value.
    */
  var StringValues: js.UndefOr[MessageAttributeStringValues] = js.undefined
}
object MessageAttributeValue {
  
  inline def apply(): MessageAttributeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageAttributeValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageAttributeValue] (val x: Self) extends AnyVal {
    
    inline def setStringValues(value: MessageAttributeStringValues): Self = StObject.set(x, "StringValues", value.asInstanceOf[js.Any])
    
    inline def setStringValuesUndefined: Self = StObject.set(x, "StringValues", js.undefined)
    
    inline def setStringValuesVarargs(value: MessageAttributeStringValue*): Self = StObject.set(x, "StringValues", js.Array(value*))
  }
}
