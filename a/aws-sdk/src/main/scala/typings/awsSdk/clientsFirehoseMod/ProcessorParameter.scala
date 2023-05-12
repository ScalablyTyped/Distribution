package typings.awsSdk.clientsFirehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessorParameter extends StObject {
  
  /**
    * The name of the parameter. Currently the following default values are supported: 3 for NumberOfRetries and 60 for the BufferIntervalInSeconds. The BufferSizeInMBs ranges between 0.2 MB and up to 3MB. The default buffering hint is 1MB for all destinations, except Splunk. For Splunk, the default buffering hint is 256 KB. 
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProcessorParameter] (val x: Self) extends AnyVal {
    
    inline def setParameterName(value: ProcessorParameterName): Self = StObject.set(x, "ParameterName", value.asInstanceOf[js.Any])
    
    inline def setParameterValue(value: ProcessorParameterValue): Self = StObject.set(x, "ParameterValue", value.asInstanceOf[js.Any])
  }
}
