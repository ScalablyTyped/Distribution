package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMetricAttributionRequest extends StObject {
  
  /**
    * The metric attribution's Amazon Resource Name (ARN).
    */
  var metricAttributionArn: Arn
}
object DescribeMetricAttributionRequest {
  
  inline def apply(metricAttributionArn: Arn): DescribeMetricAttributionRequest = {
    val __obj = js.Dynamic.literal(metricAttributionArn = metricAttributionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMetricAttributionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeMetricAttributionRequest] (val x: Self) extends AnyVal {
    
    inline def setMetricAttributionArn(value: Arn): Self = StObject.set(x, "metricAttributionArn", value.asInstanceOf[js.Any])
  }
}
