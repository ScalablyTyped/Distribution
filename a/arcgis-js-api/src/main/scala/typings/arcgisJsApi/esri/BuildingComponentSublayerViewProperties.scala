package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildingComponentSublayerViewProperties extends StObject {
  
  /**
  		 * Applies a client-side [FeatureFilter](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureFilter.html) to the displayed data.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-BuildingComponentSublayerView.html#filter)
  		 */
  var filter: js.UndefOr[FeatureFilterProperties] = js.undefined
}
object BuildingComponentSublayerViewProperties {
  
  inline def apply(): BuildingComponentSublayerViewProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildingComponentSublayerViewProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuildingComponentSublayerViewProperties] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: FeatureFilterProperties): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
