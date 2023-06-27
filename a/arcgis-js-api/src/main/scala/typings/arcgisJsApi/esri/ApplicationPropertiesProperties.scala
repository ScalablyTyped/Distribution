package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationPropertiesProperties extends StObject {
  
  /**
  		 * View-specific properties of application and UI elements for the web map.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-ApplicationProperties.html#viewing)
  		 */
  var viewing: js.UndefOr[ViewingProperties] = js.undefined
}
object ApplicationPropertiesProperties {
  
  inline def apply(): ApplicationPropertiesProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationPropertiesProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationPropertiesProperties] (val x: Self) extends AnyVal {
    
    inline def setViewing(value: ViewingProperties): Self = StObject.set(x, "viewing", value.asInstanceOf[js.Any])
    
    inline def setViewingUndefined: Self = StObject.set(x, "viewing", js.undefined)
  }
}
