package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildingSummaryStatisticsProperties
  extends StObject
     with LoadableProperties {
  
  /**
  		 * An array of statistics on all fields in all sublayers.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingSummaryStatistics.html#fields)
  		 */
  var fields: js.UndefOr[js.Array[BuildingFieldStatistics]] = js.undefined
}
object BuildingSummaryStatisticsProperties {
  
  inline def apply(): BuildingSummaryStatisticsProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildingSummaryStatisticsProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuildingSummaryStatisticsProperties] (val x: Self) extends AnyVal {
    
    inline def setFields(value: js.Array[BuildingFieldStatistics]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: BuildingFieldStatistics*): Self = StObject.set(x, "fields", js.Array(value*))
  }
}
