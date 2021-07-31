package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefreshableLayerProperties extends StObject {
  
  /**
    * Refresh interval of the layer in minutes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-RefreshableLayer.html#refreshInterval)
    */
  var refreshInterval: js.UndefOr[Double] = js.undefined
}
object RefreshableLayerProperties {
  
  @scala.inline
  def apply(): RefreshableLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshableLayerProperties]
  }
  
  @scala.inline
  implicit class RefreshableLayerPropertiesMutableBuilder[Self <: RefreshableLayerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRefreshInterval(value: Double): Self = StObject.set(x, "refreshInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshIntervalUndefined: Self = StObject.set(x, "refreshInterval", js.undefined)
  }
}
