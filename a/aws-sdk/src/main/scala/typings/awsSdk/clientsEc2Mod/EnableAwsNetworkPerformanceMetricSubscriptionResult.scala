package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableAwsNetworkPerformanceMetricSubscriptionResult extends StObject {
  
  /**
    * Indicates whether the subscribe action was successful.
    */
  var Output: js.UndefOr[Boolean] = js.undefined
}
object EnableAwsNetworkPerformanceMetricSubscriptionResult {
  
  inline def apply(): EnableAwsNetworkPerformanceMetricSubscriptionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableAwsNetworkPerformanceMetricSubscriptionResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnableAwsNetworkPerformanceMetricSubscriptionResult] (val x: Self) extends AnyVal {
    
    inline def setOutput(value: Boolean): Self = StObject.set(x, "Output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "Output", js.undefined)
  }
}
