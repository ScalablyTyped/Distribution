package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMetricSetResponse extends StObject {
  
  /**
    * The ARN of the dataset.
    */
  var MetricSetArn: js.UndefOr[Arn] = js.undefined
}
object UpdateMetricSetResponse {
  
  inline def apply(): UpdateMetricSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateMetricSetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateMetricSetResponse] (val x: Self) extends AnyVal {
    
    inline def setMetricSetArn(value: Arn): Self = StObject.set(x, "MetricSetArn", value.asInstanceOf[js.Any])
    
    inline def setMetricSetArnUndefined: Self = StObject.set(x, "MetricSetArn", js.undefined)
  }
}
