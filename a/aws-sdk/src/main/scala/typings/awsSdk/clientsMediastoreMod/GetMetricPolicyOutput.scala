package typings.awsSdk.clientsMediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMetricPolicyOutput extends StObject {
  
  /**
    * The metric policy that is associated with the specific container.
    */
  var MetricPolicy: typings.awsSdk.clientsMediastoreMod.MetricPolicy
}
object GetMetricPolicyOutput {
  
  inline def apply(MetricPolicy: MetricPolicy): GetMetricPolicyOutput = {
    val __obj = js.Dynamic.literal(MetricPolicy = MetricPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMetricPolicyOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMetricPolicyOutput] (val x: Self) extends AnyVal {
    
    inline def setMetricPolicy(value: MetricPolicy): Self = StObject.set(x, "MetricPolicy", value.asInstanceOf[js.Any])
  }
}
