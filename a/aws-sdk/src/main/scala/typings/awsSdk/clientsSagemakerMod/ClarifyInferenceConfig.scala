package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClarifyInferenceConfig extends StObject {
  
  /**
    * A template string used to format a JSON record into an acceptable model container input. For example, a ContentTemplate string '{"myfeatures":$features}' will format a list of features [1,2,3] into the record string '{"myfeatures":[1,2,3]}'. Required only when the model container input is in JSON Lines format.
    */
  var ContentTemplate: js.UndefOr[ClarifyContentTemplate] = js.undefined
  
  /**
    * The names of the features. If provided, these are included in the endpoint response payload to help readability of the InvokeEndpoint output. See the Response section under Invoke the endpoint in the Developer Guide for more information.
    */
  var FeatureHeaders: js.UndefOr[ClarifyFeatureHeaders] = js.undefined
  
  /**
    * A list of data types of the features (optional). Applicable only to NLP explainability. If provided, FeatureTypes must have at least one 'text' string (for example, ['text']). If FeatureTypes is not provided, the explainer infers the feature types based on the baseline data. The feature types are included in the endpoint response payload. For additional information see the response section under Invoke the endpoint in the Developer Guide for more information.
    */
  var FeatureTypes: js.UndefOr[ClarifyFeatureTypes] = js.undefined
  
  /**
    * Provides the JMESPath expression to extract the features from a model container input in JSON Lines format. For example, if FeaturesAttribute is the JMESPath expression 'myfeatures', it extracts a list of features [1,2,3] from request data '{"myfeatures":[1,2,3]}'.
    */
  var FeaturesAttribute: js.UndefOr[ClarifyFeaturesAttribute] = js.undefined
  
  /**
    * A JMESPath expression used to locate the list of label headers in the model container output.  Example: If the model container output of a batch request is '{"labels":["cat","dog","fish"],"probability":[0.6,0.3,0.1]}', then set LabelAttribute to 'labels' to extract the list of label headers ["cat","dog","fish"] 
    */
  var LabelAttribute: js.UndefOr[ClarifyLabelAttribute] = js.undefined
  
  /**
    * For multiclass classification problems, the label headers are the names of the classes. Otherwise, the label header is the name of the predicted label. These are used to help readability for the output of the InvokeEndpoint API. See the response section under Invoke the endpoint in the Developer Guide for more information. If there are no label headers in the model container output, provide them manually using this parameter.
    */
  var LabelHeaders: js.UndefOr[ClarifyLabelHeaders] = js.undefined
  
  /**
    * A zero-based index used to extract a label header or list of label headers from model container output in CSV format.  Example for a multiclass model: If the model container output consists of label headers followed by probabilities: '"[\'cat\',\'dog\',\'fish\']","[0.1,0.6,0.3]"', set LabelIndex to 0 to select the label headers ['cat','dog','fish'].
    */
  var LabelIndex: js.UndefOr[ClarifyLabelIndex] = js.undefined
  
  /**
    * The maximum payload size (MB) allowed of a request from the explainer to the model container. Defaults to 6 MB.
    */
  var MaxPayloadInMB: js.UndefOr[ClarifyMaxPayloadInMB] = js.undefined
  
  /**
    * The maximum number of records in a request that the model container can process when querying the model container for the predictions of a synthetic dataset. A record is a unit of input data that inference can be made on, for example, a single line in CSV data. If MaxRecordCount is 1, the model container expects one record per request. A value of 2 or greater means that the model expects batch requests, which can reduce overhead and speed up the inferencing process. If this parameter is not provided, the explainer will tune the record count per request according to the model container's capacity at runtime.
    */
  var MaxRecordCount: js.UndefOr[ClarifyMaxRecordCount] = js.undefined
  
  /**
    * A JMESPath expression used to extract the probability (or score) from the model container output if the model container is in JSON Lines format.  Example: If the model container output of a single request is '{"predicted_label":1,"probability":0.6}', then set ProbabilityAttribute to 'probability'.
    */
  var ProbabilityAttribute: js.UndefOr[ClarifyProbabilityAttribute] = js.undefined
  
  /**
    * A zero-based index used to extract a probability value (score) or list from model container output in CSV format. If this value is not provided, the entire model container output will be treated as a probability value (score) or list.  Example for a single class model: If the model container output consists of a string-formatted prediction label followed by its probability: '1,0.6', set ProbabilityIndex to 1 to select the probability value 0.6.  Example for a multiclass model: If the model container output consists of a string-formatted prediction label followed by its probability: '"[\'cat\',\'dog\',\'fish\']","[0.1,0.6,0.3]"', set ProbabilityIndex to 1 to select the probability values [0.1,0.6,0.3].
    */
  var ProbabilityIndex: js.UndefOr[ClarifyProbabilityIndex] = js.undefined
}
object ClarifyInferenceConfig {
  
  inline def apply(): ClarifyInferenceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClarifyInferenceConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClarifyInferenceConfig] (val x: Self) extends AnyVal {
    
    inline def setContentTemplate(value: ClarifyContentTemplate): Self = StObject.set(x, "ContentTemplate", value.asInstanceOf[js.Any])
    
    inline def setContentTemplateUndefined: Self = StObject.set(x, "ContentTemplate", js.undefined)
    
    inline def setFeatureHeaders(value: ClarifyFeatureHeaders): Self = StObject.set(x, "FeatureHeaders", value.asInstanceOf[js.Any])
    
    inline def setFeatureHeadersUndefined: Self = StObject.set(x, "FeatureHeaders", js.undefined)
    
    inline def setFeatureHeadersVarargs(value: ClarifyHeader*): Self = StObject.set(x, "FeatureHeaders", js.Array(value*))
    
    inline def setFeatureTypes(value: ClarifyFeatureTypes): Self = StObject.set(x, "FeatureTypes", value.asInstanceOf[js.Any])
    
    inline def setFeatureTypesUndefined: Self = StObject.set(x, "FeatureTypes", js.undefined)
    
    inline def setFeatureTypesVarargs(value: ClarifyFeatureType*): Self = StObject.set(x, "FeatureTypes", js.Array(value*))
    
    inline def setFeaturesAttribute(value: ClarifyFeaturesAttribute): Self = StObject.set(x, "FeaturesAttribute", value.asInstanceOf[js.Any])
    
    inline def setFeaturesAttributeUndefined: Self = StObject.set(x, "FeaturesAttribute", js.undefined)
    
    inline def setLabelAttribute(value: ClarifyLabelAttribute): Self = StObject.set(x, "LabelAttribute", value.asInstanceOf[js.Any])
    
    inline def setLabelAttributeUndefined: Self = StObject.set(x, "LabelAttribute", js.undefined)
    
    inline def setLabelHeaders(value: ClarifyLabelHeaders): Self = StObject.set(x, "LabelHeaders", value.asInstanceOf[js.Any])
    
    inline def setLabelHeadersUndefined: Self = StObject.set(x, "LabelHeaders", js.undefined)
    
    inline def setLabelHeadersVarargs(value: ClarifyHeader*): Self = StObject.set(x, "LabelHeaders", js.Array(value*))
    
    inline def setLabelIndex(value: ClarifyLabelIndex): Self = StObject.set(x, "LabelIndex", value.asInstanceOf[js.Any])
    
    inline def setLabelIndexUndefined: Self = StObject.set(x, "LabelIndex", js.undefined)
    
    inline def setMaxPayloadInMB(value: ClarifyMaxPayloadInMB): Self = StObject.set(x, "MaxPayloadInMB", value.asInstanceOf[js.Any])
    
    inline def setMaxPayloadInMBUndefined: Self = StObject.set(x, "MaxPayloadInMB", js.undefined)
    
    inline def setMaxRecordCount(value: ClarifyMaxRecordCount): Self = StObject.set(x, "MaxRecordCount", value.asInstanceOf[js.Any])
    
    inline def setMaxRecordCountUndefined: Self = StObject.set(x, "MaxRecordCount", js.undefined)
    
    inline def setProbabilityAttribute(value: ClarifyProbabilityAttribute): Self = StObject.set(x, "ProbabilityAttribute", value.asInstanceOf[js.Any])
    
    inline def setProbabilityAttributeUndefined: Self = StObject.set(x, "ProbabilityAttribute", js.undefined)
    
    inline def setProbabilityIndex(value: ClarifyProbabilityIndex): Self = StObject.set(x, "ProbabilityIndex", value.asInstanceOf[js.Any])
    
    inline def setProbabilityIndexUndefined: Self = StObject.set(x, "ProbabilityIndex", js.undefined)
  }
}
