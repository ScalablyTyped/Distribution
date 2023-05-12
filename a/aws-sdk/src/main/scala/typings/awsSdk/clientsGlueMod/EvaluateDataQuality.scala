package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluateDataQuality extends StObject {
  
  /**
    * The inputs of your data quality evaluation.
    */
  var Inputs: OneInput
  
  /**
    * The name of the data quality evaluation.
    */
  var Name: NodeName
  
  /**
    * The output of your data quality evaluation.
    */
  var Output: js.UndefOr[DQTransformOutput] = js.undefined
  
  /**
    * Options to configure how your results are published.
    */
  var PublishingOptions: js.UndefOr[DQResultsPublishingOptions] = js.undefined
  
  /**
    * The ruleset for your data quality evaluation.
    */
  var Ruleset: DQDLString
  
  /**
    * Options to configure how your job will stop if your data quality evaluation fails.
    */
  var StopJobOnFailureOptions: js.UndefOr[DQStopJobOnFailureOptions] = js.undefined
}
object EvaluateDataQuality {
  
  inline def apply(Inputs: OneInput, Name: NodeName, Ruleset: DQDLString): EvaluateDataQuality = {
    val __obj = js.Dynamic.literal(Inputs = Inputs.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Ruleset = Ruleset.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluateDataQuality]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvaluateDataQuality] (val x: Self) extends AnyVal {
    
    inline def setInputs(value: OneInput): Self = StObject.set(x, "Inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: NodeId*): Self = StObject.set(x, "Inputs", js.Array(value*))
    
    inline def setName(value: NodeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOutput(value: DQTransformOutput): Self = StObject.set(x, "Output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "Output", js.undefined)
    
    inline def setPublishingOptions(value: DQResultsPublishingOptions): Self = StObject.set(x, "PublishingOptions", value.asInstanceOf[js.Any])
    
    inline def setPublishingOptionsUndefined: Self = StObject.set(x, "PublishingOptions", js.undefined)
    
    inline def setRuleset(value: DQDLString): Self = StObject.set(x, "Ruleset", value.asInstanceOf[js.Any])
    
    inline def setStopJobOnFailureOptions(value: DQStopJobOnFailureOptions): Self = StObject.set(x, "StopJobOnFailureOptions", value.asInstanceOf[js.Any])
    
    inline def setStopJobOnFailureOptionsUndefined: Self = StObject.set(x, "StopJobOnFailureOptions", js.undefined)
  }
}
