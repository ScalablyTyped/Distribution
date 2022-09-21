package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefreshableLayerProperties extends StObject {
  
  /**
    * Refresh interval of the layer in minutes.
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-RefreshableLayer.html#refreshInterval)
    */
  var refreshInterval: js.UndefOr[Double] = js.undefined
}
object RefreshableLayerProperties {
  
  inline def apply(): RefreshableLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshableLayerProperties]
  }
  
  extension [Self <: RefreshableLayerProperties](x: Self) {
    
    inline def setRefreshInterval(value: Double): Self = StObject.set(x, "refreshInterval", value.asInstanceOf[js.Any])
    
    inline def setRefreshIntervalUndefined: Self = StObject.set(x, "refreshInterval", js.undefined)
  }
}
