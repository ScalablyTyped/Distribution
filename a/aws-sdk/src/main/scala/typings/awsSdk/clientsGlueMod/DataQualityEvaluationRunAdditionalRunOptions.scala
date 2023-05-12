package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataQualityEvaluationRunAdditionalRunOptions extends StObject {
  
  /**
    * Whether or not to enable CloudWatch metrics.
    */
  var CloudWatchMetricsEnabled: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * Prefix for Amazon S3 to store results.
    */
  var ResultsS3Prefix: js.UndefOr[UriString] = js.undefined
}
object DataQualityEvaluationRunAdditionalRunOptions {
  
  inline def apply(): DataQualityEvaluationRunAdditionalRunOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataQualityEvaluationRunAdditionalRunOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataQualityEvaluationRunAdditionalRunOptions] (val x: Self) extends AnyVal {
    
    inline def setCloudWatchMetricsEnabled(value: NullableBoolean): Self = StObject.set(x, "CloudWatchMetricsEnabled", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchMetricsEnabledUndefined: Self = StObject.set(x, "CloudWatchMetricsEnabled", js.undefined)
    
    inline def setResultsS3Prefix(value: UriString): Self = StObject.set(x, "ResultsS3Prefix", value.asInstanceOf[js.Any])
    
    inline def setResultsS3PrefixUndefined: Self = StObject.set(x, "ResultsS3Prefix", js.undefined)
  }
}
