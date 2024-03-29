package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringParameter extends StObject {
  
  /**
    * A display name for a string parameter.
    */
  var Name: NonEmptyString
  
  /**
    * The values of a string parameter.
    */
  var Values: SensitiveStringList
}
object StringParameter {
  
  inline def apply(Name: NonEmptyString, Values: SensitiveStringList): StringParameter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StringParameter] (val x: Self) extends AnyVal {
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValues(value: SensitiveStringList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: SensitiveString*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
