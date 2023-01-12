package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricStreamFilter extends StObject {
  
  /**
    * The name of the metric namespace in the filter.
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
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "Namespace", js.undefined)
  }
}
