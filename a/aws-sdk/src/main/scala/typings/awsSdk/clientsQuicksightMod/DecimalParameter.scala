package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecimalParameter extends StObject {
  
  /**
    * A display name for the decimal parameter.
    */
  var Name: NonEmptyString
  
  /**
    * The values for the decimal parameter.
    */
  var Values: SensitiveDoubleList
}
object DecimalParameter {
  
  inline def apply(Name: NonEmptyString, Values: SensitiveDoubleList): DecimalParameter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecimalParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DecimalParameter] (val x: Self) extends AnyVal {
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValues(value: SensitiveDoubleList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: SensitiveDouble*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
