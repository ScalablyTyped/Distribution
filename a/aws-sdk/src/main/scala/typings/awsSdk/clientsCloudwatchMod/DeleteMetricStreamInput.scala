package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMetricStreamInput extends StObject {
  
  /**
    * The name of the metric stream to delete.
    */
  var Name: MetricStreamName
}
object DeleteMetricStreamInput {
  
  inline def apply(Name: MetricStreamName): DeleteMetricStreamInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMetricStreamInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteMetricStreamInput] (val x: Self) extends AnyVal {
    
    inline def setName(value: MetricStreamName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
