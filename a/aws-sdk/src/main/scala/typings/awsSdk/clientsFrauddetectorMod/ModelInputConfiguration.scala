package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelInputConfiguration extends StObject {
  
  /**
    *  Template for constructing the CSV input-data sent to SageMaker. At event-evaluation, the placeholders for variable-names in the template will be replaced with the variable values before being sent to SageMaker. 
    */
  var csvInputTemplate: js.UndefOr[modelInputTemplate] = js.undefined
  
  /**
    * The event type name.
    */
  var eventTypeName: js.UndefOr[identifier] = js.undefined
  
  /**
    *  The format of the model input configuration. The format differs depending on if it is passed through to SageMaker or constructed by Amazon Fraud Detector.
    */
  var format: js.UndefOr[ModelInputDataFormat] = js.undefined
  
  /**
    *  Template for constructing the JSON input-data sent to SageMaker. At event-evaluation, the placeholders for variable names in the template will be replaced with the variable values before being sent to SageMaker. 
    */
  var jsonInputTemplate: js.UndefOr[modelInputTemplate] = js.undefined
  
  /**
    * The event variables.
    */
  var useEventVariables: UseEventVariables
}
object ModelInputConfiguration {
  
  inline def apply(useEventVariables: UseEventVariables): ModelInputConfiguration = {
    val __obj = js.Dynamic.literal(useEventVariables = useEventVariables.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelInputConfiguration]
  }
  
  extension [Self <: ModelInputConfiguration](x: Self) {
    
    inline def setCsvInputTemplate(value: modelInputTemplate): Self = StObject.set(x, "csvInputTemplate", value.asInstanceOf[js.Any])
    
    inline def setCsvInputTemplateUndefined: Self = StObject.set(x, "csvInputTemplate", js.undefined)
    
    inline def setEventTypeName(value: identifier): Self = StObject.set(x, "eventTypeName", value.asInstanceOf[js.Any])
    
    inline def setEventTypeNameUndefined: Self = StObject.set(x, "eventTypeName", js.undefined)
    
    inline def setFormat(value: ModelInputDataFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setJsonInputTemplate(value: modelInputTemplate): Self = StObject.set(x, "jsonInputTemplate", value.asInstanceOf[js.Any])
    
    inline def setJsonInputTemplateUndefined: Self = StObject.set(x, "jsonInputTemplate", js.undefined)
    
    inline def setUseEventVariables(value: UseEventVariables): Self = StObject.set(x, "useEventVariables", value.asInstanceOf[js.Any])
  }
}
