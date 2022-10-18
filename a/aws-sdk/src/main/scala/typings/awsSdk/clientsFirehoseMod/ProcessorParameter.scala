package typings.awsSdk.clientsFirehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessorParameter extends StObject {
  
  /**
    * The name of the parameter.
    */
  var ParameterName: ProcessorParameterName
  
  /**
    * The parameter value.
    */
  var ParameterValue: ProcessorParameterValue
}
object ProcessorParameter {
  
  inline def apply(ParameterName: ProcessorParameterName, ParameterValue: ProcessorParameterValue): ProcessorParameter = {
    val __obj = js.Dynamic.literal(ParameterName = ParameterName.asInstanceOf[js.Any], ParameterValue = ParameterValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessorParameter]
  }
  
  extension [Self <: ProcessorParameter](x: Self) {
    
    inline def setParameterName(value: ProcessorParameterName): Self = StObject.set(x, "ParameterName", value.asInstanceOf[js.Any])
    
    inline def setParameterValue(value: ProcessorParameterValue): Self = StObject.set(x, "ParameterValue", value.asInstanceOf[js.Any])
  }
}
