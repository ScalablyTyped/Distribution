package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameter extends StObject {
  
  /**
    * The name of the parameter to assign a value to. This parameter name must match a named parameter in the pipeline definition.
    */
  var Name: PipelineParameterName
  
  /**
    * The literal value for the parameter.
    */
  var Value: String1024
}
object Parameter {
  
  inline def apply(Name: PipelineParameterName, Value: String1024): Parameter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameter] (val x: Self) extends AnyVal {
    
    inline def setName(value: PipelineParameterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String1024): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
