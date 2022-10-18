package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConformancePackInputParameter extends StObject {
  
  /**
    * One part of a key-value pair.
    */
  var ParameterName: typings.awsSdk.clientsConfigserviceMod.ParameterName
  
  /**
    * Another part of the key-value pair. 
    */
  var ParameterValue: typings.awsSdk.clientsConfigserviceMod.ParameterValue
}
object ConformancePackInputParameter {
  
  inline def apply(ParameterName: ParameterName, ParameterValue: ParameterValue): ConformancePackInputParameter = {
    val __obj = js.Dynamic.literal(ParameterName = ParameterName.asInstanceOf[js.Any], ParameterValue = ParameterValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConformancePackInputParameter]
  }
  
  extension [Self <: ConformancePackInputParameter](x: Self) {
    
    inline def setParameterName(value: ParameterName): Self = StObject.set(x, "ParameterName", value.asInstanceOf[js.Any])
    
    inline def setParameterValue(value: ParameterValue): Self = StObject.set(x, "ParameterValue", value.asInstanceOf[js.Any])
  }
}
