package typings.arcgisJsApi.esri

import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DOMContainerProperties extends StObject {
  
  /**
  		 * The `id` or node representing the DOM element containing the view.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#container)
  		 */
  var container: js.UndefOr[HTMLDivElement | String] = js.undefined
  
  /**
  		 * Exposes the default widgets available in the view and allows you to toggle them on and off.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#ui)
  		 */
  var ui: js.UndefOr[DefaultUIProperties] = js.undefined
}
object DOMContainerProperties {
  
  inline def apply(): DOMContainerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DOMContainerProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DOMContainerProperties] (val x: Self) extends AnyVal {
    
    inline def setContainer(value: HTMLDivElement | String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setUi(value: DefaultUIProperties): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
    
    inline def setUiUndefined: Self = StObject.set(x, "ui", js.undefined)
  }
}
