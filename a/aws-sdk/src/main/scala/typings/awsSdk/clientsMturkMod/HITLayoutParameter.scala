package typings.awsSdk.clientsMturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HITLayoutParameter extends StObject {
  
  /**
    *  The name of the parameter in the HITLayout. 
    */
  var Name: String
  
  /**
    * The value substituted for the parameter referenced in the HITLayout. 
    */
  var Value: String
}
object HITLayoutParameter {
  
  inline def apply(Name: String, Value: String): HITLayoutParameter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HITLayoutParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HITLayoutParameter] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
