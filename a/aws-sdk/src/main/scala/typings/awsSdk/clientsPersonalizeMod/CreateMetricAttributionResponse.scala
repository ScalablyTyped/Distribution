package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMetricAttributionResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the new metric attribution.
    */
  var metricAttributionArn: js.UndefOr[Arn] = js.undefined
}
object CreateMetricAttributionResponse {
  
  inline def apply(): CreateMetricAttributionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMetricAttributionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateMetricAttributionResponse] (val x: Self) extends AnyVal {
    
    inline def setMetricAttributionArn(value: Arn): Self = StObject.set(x, "metricAttributionArn", value.asInstanceOf[js.Any])
    
    inline def setMetricAttributionArnUndefined: Self = StObject.set(x, "metricAttributionArn", js.undefined)
  }
}
