package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricGranularityType extends StObject {
  
  /**
    * The granularity. The only valid value is 1Minute.
    */
  var Granularity: js.UndefOr[XmlStringMaxLen255] = js.undefined
}
object MetricGranularityType {
  
  inline def apply(): MetricGranularityType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricGranularityType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetricGranularityType] (val x: Self) extends AnyVal {
    
    inline def setGranularity(value: XmlStringMaxLen255): Self = StObject.set(x, "Granularity", value.asInstanceOf[js.Any])
    
    inline def setGranularityUndefined: Self = StObject.set(x, "Granularity", js.undefined)
  }
}
