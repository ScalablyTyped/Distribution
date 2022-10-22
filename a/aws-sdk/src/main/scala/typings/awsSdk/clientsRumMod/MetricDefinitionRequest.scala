package typings.awsSdk.clientsRumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricDefinitionRequest extends StObject {
  
  /**
    * Use this field only if you are sending the metric to CloudWatch. This field is a map of field paths to dimension names. It defines the dimensions to associate with this metric in CloudWatch. Valid values for the entries in this field are the following:    "metadata.pageId": "PageId"     "metadata.browserName": "BrowserName"     "metadata.deviceType": "DeviceType"     "metadata.osName": "OSName"     "metadata.countryCode": "CountryCode"     "event_details.fileType": "FileType"     &lt;p&gt; All dimensions listed in this field must also be included in &lt;code&gt;EventPattern&lt;/code&gt;.&lt;/p&gt; 
    */
  var DimensionKeys: js.UndefOr[DimensionKeysMap] = js.undefined
  
  /**
    * The pattern that defines the metric, specified as a JSON object. RUM checks events that happen in a user's session against the pattern, and events that match the pattern are sent to the metric destination. When you define extended metrics, the metric definition is not valid if EventPattern is omitted. Example event patterns:    '{ "event_type": ["com.amazon.rum.js_error_event"], "metadata": { "browserName": [ "Chrome", "Safari" ], } }'     '{ "event_type": ["com.amazon.rum.performance_navigation_event"], "metadata": { "browserName": [ "Chrome", "Firefox" ] }, "event_details": { "duration": [{ "numeric": [ "&lt;", 2000 ] }] } }'     '{ "event_type": ["com.amazon.rum.performance_navigation_event"], "metadata": { "browserName": [ "Chrome", "Safari" ], "countryCode": [ "US" ] }, "event_details": { "duration": [{ "numeric": [ "&gt;=", 2000, "&lt;", 8000 ] }] } }'    If the metrics destination' is CloudWatch and the event also matches a value in DimensionKeys, then the metric is published with the specified dimensions. 
    */
  var EventPattern: js.UndefOr[typings.awsSdk.clientsRumMod.EventPattern] = js.undefined
  
  /**
    * The name for the metric that is defined in this structure. Valid values are the following:    PerformanceNavigationDuration     PerformanceResourceDuration      NavigationSatisfiedTransaction     NavigationToleratedTransaction     NavigationFrustratedTransaction     WebVitalsCumulativeLayoutShift     WebVitalsFirstInputDelay     WebVitalsLargestContentfulPaint     JsErrorCount     HttpErrorCount     SessionCount   
    */
  var Name: MetricName
  
  /**
    * The CloudWatch metric unit to use for this metric. If you omit this field, the metric is recorded with no unit.
    */
  var UnitLabel: js.UndefOr[typings.awsSdk.clientsRumMod.UnitLabel] = js.undefined
  
  /**
    * The field within the event object that the metric value is sourced from. If you omit this field, a hardcoded value of 1 is pushed as the metric value. This is useful if you just want to count the number of events that the filter catches.  If this metric is sent to CloudWatch Evidently, this field will be passed to Evidently raw and Evidently will handle data extraction from the event.
    */
  var ValueKey: js.UndefOr[typings.awsSdk.clientsRumMod.ValueKey] = js.undefined
}
object MetricDefinitionRequest {
  
  inline def apply(Name: MetricName): MetricDefinitionRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricDefinitionRequest]
  }
  
  extension [Self <: MetricDefinitionRequest](x: Self) {
    
    inline def setDimensionKeys(value: DimensionKeysMap): Self = StObject.set(x, "DimensionKeys", value.asInstanceOf[js.Any])
    
    inline def setDimensionKeysUndefined: Self = StObject.set(x, "DimensionKeys", js.undefined)
    
    inline def setEventPattern(value: EventPattern): Self = StObject.set(x, "EventPattern", value.asInstanceOf[js.Any])
    
    inline def setEventPatternUndefined: Self = StObject.set(x, "EventPattern", js.undefined)
    
    inline def setName(value: MetricName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setUnitLabel(value: UnitLabel): Self = StObject.set(x, "UnitLabel", value.asInstanceOf[js.Any])
    
    inline def setUnitLabelUndefined: Self = StObject.set(x, "UnitLabel", js.undefined)
    
    inline def setValueKey(value: ValueKey): Self = StObject.set(x, "ValueKey", value.asInstanceOf[js.Any])
    
    inline def setValueKeyUndefined: Self = StObject.set(x, "ValueKey", js.undefined)
  }
}
