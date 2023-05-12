package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMetricAttributionResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the metric attribution that you updated.
    */
  var metricAttributionArn: js.UndefOr[Arn] = js.undefined
}
object UpdateMetricAttributionResponse {
  
  inline def apply(): UpdateMetricAttributionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateMetricAttributionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateMetricAttributionResponse] (val x: Self) extends AnyVal {
    
    inline def setMetricAttributionArn(value: Arn): Self = StObject.set(x, "metricAttributionArn", value.asInstanceOf[js.Any])
    
    inline def setMetricAttributionArnUndefined: Self = StObject.set(x, "metricAttributionArn", js.undefined)
  }
}
