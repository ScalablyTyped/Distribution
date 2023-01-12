package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectMetricSetConfigResponse extends StObject {
  
  /**
    * The inferred dataset configuration for the datasource.
    */
  var DetectedMetricSetConfig: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.DetectedMetricSetConfig] = js.undefined
}
object DetectMetricSetConfigResponse {
  
  inline def apply(): DetectMetricSetConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectMetricSetConfigResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetectMetricSetConfigResponse] (val x: Self) extends AnyVal {
    
    inline def setDetectedMetricSetConfig(value: DetectedMetricSetConfig): Self = StObject.set(x, "DetectedMetricSetConfig", value.asInstanceOf[js.Any])
    
    inline def setDetectedMetricSetConfigUndefined: Self = StObject.set(x, "DetectedMetricSetConfig", js.undefined)
  }
}
