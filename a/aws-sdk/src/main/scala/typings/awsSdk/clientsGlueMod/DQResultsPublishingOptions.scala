package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DQResultsPublishingOptions extends StObject {
  
  /**
    * Enable metrics for your data quality results.
    */
  var CloudWatchMetricsEnabled: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * The context of the evaluation.
    */
  var EvaluationContext: js.UndefOr[GenericLimitedString] = js.undefined
  
  /**
    * Enable publishing for your data quality results.
    */
  var ResultsPublishingEnabled: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * The Amazon S3 prefix prepended to the results.
    */
  var ResultsS3Prefix: js.UndefOr[EnclosedInStringProperty] = js.undefined
}
object DQResultsPublishingOptions {
  
  inline def apply(): DQResultsPublishingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DQResultsPublishingOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DQResultsPublishingOptions] (val x: Self) extends AnyVal {
    
    inline def setCloudWatchMetricsEnabled(value: BoxedBoolean): Self = StObject.set(x, "CloudWatchMetricsEnabled", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchMetricsEnabledUndefined: Self = StObject.set(x, "CloudWatchMetricsEnabled", js.undefined)
    
    inline def setEvaluationContext(value: GenericLimitedString): Self = StObject.set(x, "EvaluationContext", value.asInstanceOf[js.Any])
    
    inline def setEvaluationContextUndefined: Self = StObject.set(x, "EvaluationContext", js.undefined)
    
    inline def setResultsPublishingEnabled(value: BoxedBoolean): Self = StObject.set(x, "ResultsPublishingEnabled", value.asInstanceOf[js.Any])
    
    inline def setResultsPublishingEnabledUndefined: Self = StObject.set(x, "ResultsPublishingEnabled", js.undefined)
    
    inline def setResultsS3Prefix(value: EnclosedInStringProperty): Self = StObject.set(x, "ResultsS3Prefix", value.asInstanceOf[js.Any])
    
    inline def setResultsS3PrefixUndefined: Self = StObject.set(x, "ResultsS3Prefix", js.undefined)
  }
}
