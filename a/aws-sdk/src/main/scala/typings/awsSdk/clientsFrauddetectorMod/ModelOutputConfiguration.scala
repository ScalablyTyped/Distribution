package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelOutputConfiguration extends StObject {
  
  /**
    * A map of CSV index values in the SageMaker response to the Amazon Fraud Detector variables. 
    */
  var csvIndexToVariableMap: js.UndefOr[CsvIndexToVariableMap] = js.undefined
  
  /**
    * The format of the model output configuration.
    */
  var format: ModelOutputDataFormat
  
  /**
    * A map of JSON keys in response from SageMaker to the Amazon Fraud Detector variables. 
    */
  var jsonKeyToVariableMap: js.UndefOr[JsonKeyToVariableMap] = js.undefined
}
object ModelOutputConfiguration {
  
  inline def apply(format: ModelOutputDataFormat): ModelOutputConfiguration = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelOutputConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModelOutputConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCsvIndexToVariableMap(value: CsvIndexToVariableMap): Self = StObject.set(x, "csvIndexToVariableMap", value.asInstanceOf[js.Any])
    
    inline def setCsvIndexToVariableMapUndefined: Self = StObject.set(x, "csvIndexToVariableMap", js.undefined)
    
    inline def setFormat(value: ModelOutputDataFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setJsonKeyToVariableMap(value: JsonKeyToVariableMap): Self = StObject.set(x, "jsonKeyToVariableMap", value.asInstanceOf[js.Any])
    
    inline def setJsonKeyToVariableMapUndefined: Self = StObject.set(x, "jsonKeyToVariableMap", js.undefined)
  }
}
