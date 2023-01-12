package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.ImageElementPropertiestyp
import typings.arcgisJsApi.anon.VideoElementPropertiestyp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalMediaElementSourceProperties extends StObject {
  
  /**
    * [Image](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageElement.html) and [video](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-VideoElement.html) elements referenced in the [MediaLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MediaLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LocalMediaElementSource.html#elements)
    */
  var elements: js.UndefOr[CollectionProperties[ImageElementPropertiestyp | VideoElementPropertiestyp]] = js.undefined
}
object LocalMediaElementSourceProperties {
  
  inline def apply(): LocalMediaElementSourceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalMediaElementSourceProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocalMediaElementSourceProperties] (val x: Self) extends AnyVal {
    
    inline def setElements(value: CollectionProperties[ImageElementPropertiestyp | VideoElementPropertiestyp]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
    
    inline def setElementsVarargs(value: (ImageElementPropertiestyp | VideoElementPropertiestyp)*): Self = StObject.set(x, "elements", js.Array(value*))
  }
}
