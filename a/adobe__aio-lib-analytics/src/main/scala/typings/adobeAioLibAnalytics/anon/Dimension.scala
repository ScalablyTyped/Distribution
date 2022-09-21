package typings.adobeAioLibAnalytics.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dimension extends StObject {
  
  var dimension: String
  
  var globalFilters: js.Array[DateRange]
  
  var metricContainer: Metrics
  
  var rsid: String
  
  var settings: Limit
}
object Dimension {
  
  inline def apply(
    dimension: String,
    globalFilters: js.Array[DateRange],
    metricContainer: Metrics,
    rsid: String,
    settings: Limit
  ): Dimension = {
    val __obj = js.Dynamic.literal(dimension = dimension.asInstanceOf[js.Any], globalFilters = globalFilters.asInstanceOf[js.Any], metricContainer = metricContainer.asInstanceOf[js.Any], rsid = rsid.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dimension]
  }
  
  extension [Self <: Dimension](x: Self) {
    
    inline def setDimension(value: String): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
    
    inline def setGlobalFilters(value: js.Array[DateRange]): Self = StObject.set(x, "globalFilters", value.asInstanceOf[js.Any])
    
    inline def setGlobalFiltersVarargs(value: DateRange*): Self = StObject.set(x, "globalFilters", js.Array(value*))
    
    inline def setMetricContainer(value: Metrics): Self = StObject.set(x, "metricContainer", value.asInstanceOf[js.Any])
    
    inline def setRsid(value: String): Self = StObject.set(x, "rsid", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: Limit): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
  }
}
