package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetParameterValueConfiguration extends StObject {
  
  /**
    * The destination parameter name of the SetParameterValueConfiguration.
    */
  var DestinationParameterName: ParameterName
  
  var Value: DestinationParameterValueConfiguration
}
object SetParameterValueConfiguration {
  
  inline def apply(DestinationParameterName: ParameterName, Value: DestinationParameterValueConfiguration): SetParameterValueConfiguration = {
    val __obj = js.Dynamic.literal(DestinationParameterName = DestinationParameterName.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetParameterValueConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetParameterValueConfiguration] (val x: Self) extends AnyVal {
    
    inline def setDestinationParameterName(value: ParameterName): Self = StObject.set(x, "DestinationParameterName", value.asInstanceOf[js.Any])
    
    inline def setValue(value: DestinationParameterValueConfiguration): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
