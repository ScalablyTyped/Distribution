package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsWafv2VisibilityConfigDetails extends StObject {
  
  /**
    *  A boolean indicating whether the associated resource sends metrics to Amazon CloudWatch. For the list of available metrics, see WAF metrics and dimensions in the WAF Developer Guide. 
    */
  var CloudWatchMetricsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  A name of the Amazon CloudWatch metric. 
    */
  var MetricName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  A boolean indicating whether WAF should store a sampling of the web requests that match the rules. You can view the sampled requests through the WAF console. 
    */
  var SampledRequestsEnabled: js.UndefOr[Boolean] = js.undefined
}
object AwsWafv2VisibilityConfigDetails {
  
  inline def apply(): AwsWafv2VisibilityConfigDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsWafv2VisibilityConfigDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsWafv2VisibilityConfigDetails] (val x: Self) extends AnyVal {
    
    inline def setCloudWatchMetricsEnabled(value: Boolean): Self = StObject.set(x, "CloudWatchMetricsEnabled", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchMetricsEnabledUndefined: Self = StObject.set(x, "CloudWatchMetricsEnabled", js.undefined)
    
    inline def setMetricName(value: NonEmptyString): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "MetricName", js.undefined)
    
    inline def setSampledRequestsEnabled(value: Boolean): Self = StObject.set(x, "SampledRequestsEnabled", value.asInstanceOf[js.Any])
    
    inline def setSampledRequestsEnabledUndefined: Self = StObject.set(x, "SampledRequestsEnabled", js.undefined)
  }
}
