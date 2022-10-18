package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputParameter extends StObject {
  
  /**
    * The name of the output parameter.
    */
  var Name: String256
  
  /**
    * The value of the output parameter.
    */
  var Value: String1024
}
object OutputParameter {
  
  inline def apply(Name: String256, Value: String1024): OutputParameter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputParameter]
  }
  
  extension [Self <: OutputParameter](x: Self) {
    
    inline def setName(value: String256): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String1024): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
