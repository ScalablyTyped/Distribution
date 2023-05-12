package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricStreamFilter extends StObject {
  
  /**
    * The names of the metrics to either include or exclude from the metric stream.  If you omit this parameter, all metrics in the namespace are included or excluded, depending on whether this filter is specified as an exclude filter or an include filter. Each metric name can contain only ASCII printable characters (ASCII range 32 through 126). Each metric name must contain at least one non-whitespace character.
    */
  var MetricNames: js.UndefOr[MetricStreamFilterMetricNames] = js.undefined
  
  /**
    * The name of the metric namespace for this filter. The namespace can contain only ASCII printable characters (ASCII range 32 through 126). It must contain at least one non-whitespace character.
    */
  var Namespace: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.Namespace] = js.undefined
}
object MetricStreamFilter {
  
  inline def apply(): MetricStreamFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricStreamFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetricStreamFilter] (val x: Self) extends AnyVal {
    
    inline def setMetricNames(value: MetricStreamFilterMetricNames): Self = StObject.set(x, "MetricNames", value.asInstanceOf[js.Any])
    
    inline def setMetricNamesUndefined: Self = StObject.set(x, "MetricNames", js.undefined)
    
    inline def setMetricNamesVarargs(value: MetricName*): Self = StObject.set(x, "MetricNames", js.Array(value*))
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "Namespace", js.undefined)
  }
}
