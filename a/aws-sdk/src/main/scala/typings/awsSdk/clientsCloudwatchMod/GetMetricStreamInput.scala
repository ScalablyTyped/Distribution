package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMetricStreamInput extends StObject {
  
  /**
    * The name of the metric stream to retrieve information about.
    */
  var Name: MetricStreamName
}
object GetMetricStreamInput {
  
  inline def apply(Name: MetricStreamName): GetMetricStreamInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMetricStreamInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMetricStreamInput] (val x: Self) extends AnyVal {
    
    inline def setName(value: MetricStreamName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
