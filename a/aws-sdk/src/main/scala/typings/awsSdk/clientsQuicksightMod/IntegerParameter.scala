package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntegerParameter extends StObject {
  
  /**
    * The name of the integer parameter.
    */
  var Name: NonEmptyString
  
  /**
    * The values for the integer parameter.
    */
  var Values: SensitiveLongList
}
object IntegerParameter {
  
  inline def apply(Name: NonEmptyString, Values: SensitiveLongList): IntegerParameter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegerParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IntegerParameter] (val x: Self) extends AnyVal {
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValues(value: SensitiveLongList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: SensitiveLong*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
