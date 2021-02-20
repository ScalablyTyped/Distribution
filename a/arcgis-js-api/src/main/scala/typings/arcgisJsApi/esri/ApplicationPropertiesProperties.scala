package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationPropertiesProperties extends StObject {
  
  /**
    * View-specific properties of application and UI elements for the web map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-ApplicationProperties.html#viewing)
    */
  var viewing: js.UndefOr[ViewingProperties] = js.native
}
object ApplicationPropertiesProperties {
  
  @scala.inline
  def apply(): ApplicationPropertiesProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationPropertiesProperties]
  }
  
  @scala.inline
  implicit class ApplicationPropertiesPropertiesMutableBuilder[Self <: ApplicationPropertiesProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setViewing(value: ViewingProperties): Self = StObject.set(x, "viewing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewingUndefined: Self = StObject.set(x, "viewing", js.undefined)
  }
}
