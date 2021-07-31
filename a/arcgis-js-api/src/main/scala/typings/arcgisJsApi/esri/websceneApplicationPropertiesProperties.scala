package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait websceneApplicationPropertiesProperties extends StObject {
  
  /**
    * View-specific properties of application and UI elements.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-ApplicationProperties.html#viewing)
    */
  var viewing: js.UndefOr[ViewingProperties] = js.undefined
}
object websceneApplicationPropertiesProperties {
  
  @scala.inline
  def apply(): websceneApplicationPropertiesProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[websceneApplicationPropertiesProperties]
  }
  
  @scala.inline
  implicit class websceneApplicationPropertiesPropertiesMutableBuilder[Self <: websceneApplicationPropertiesProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setViewing(value: ViewingProperties): Self = StObject.set(x, "viewing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewingUndefined: Self = StObject.set(x, "viewing", js.undefined)
  }
}
