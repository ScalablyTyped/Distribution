package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalBasemapsSourceProperties extends StObject {
  
  /**
    * A collection of [Basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html)s.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-support-LocalBasemapsSource.html#basemaps)
    */
  var basemaps: js.UndefOr[CollectionProperties[BasemapProperties]] = js.undefined
}
object LocalBasemapsSourceProperties {
  
  @scala.inline
  def apply(): LocalBasemapsSourceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalBasemapsSourceProperties]
  }
  
  @scala.inline
  implicit class LocalBasemapsSourcePropertiesMutableBuilder[Self <: LocalBasemapsSourceProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasemaps(value: CollectionProperties[BasemapProperties]): Self = StObject.set(x, "basemaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasemapsUndefined: Self = StObject.set(x, "basemaps", js.undefined)
    
    @scala.inline
    def setBasemapsVarargs(value: BasemapProperties*): Self = StObject.set(x, "basemaps", js.Array(value :_*))
  }
}
