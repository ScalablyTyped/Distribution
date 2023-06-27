package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait binLevelBinLevelParams extends StObject {
  
  /**
  		 * The [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) where the layer will be rendered.
  		 *
  		 * [Read more...](global.html)
  		 */
  var view: MapView
}
object binLevelBinLevelParams {
  
  inline def apply(view: MapView): binLevelBinLevelParams = {
    val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[binLevelBinLevelParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: binLevelBinLevelParams] (val x: Self) extends AnyVal {
    
    inline def setView(value: MapView): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
