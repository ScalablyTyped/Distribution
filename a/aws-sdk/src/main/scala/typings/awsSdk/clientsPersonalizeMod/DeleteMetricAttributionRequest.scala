package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMetricAttributionRequest extends StObject {
  
  /**
    * The metric attribution's Amazon Resource Name (ARN).
    */
  var metricAttributionArn: Arn
}
object DeleteMetricAttributionRequest {
  
  inline def apply(metricAttributionArn: Arn): DeleteMetricAttributionRequest = {
    val __obj = js.Dynamic.literal(metricAttributionArn = metricAttributionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMetricAttributionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteMetricAttributionRequest] (val x: Self) extends AnyVal {
    
    inline def setMetricAttributionArn(value: Arn): Self = StObject.set(x, "metricAttributionArn", value.asInstanceOf[js.Any])
  }
}
