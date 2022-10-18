package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentParameter extends StObject {
  
  /**
    * The name of the component parameter to set.
    */
  var name: ComponentParameterName
  
  /**
    * Sets the value for the named component parameter.
    */
  var value: ComponentParameterValueList
}
object ComponentParameter {
  
  inline def apply(name: ComponentParameterName, value: ComponentParameterValueList): ComponentParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentParameter]
  }
  
  extension [Self <: ComponentParameter](x: Self) {
    
    inline def setName(value: ComponentParameterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: ComponentParameterValueList): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: ComponentParameterValue*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
