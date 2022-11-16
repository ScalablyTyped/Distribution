package typings.arcgisJsApi.esri

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomContentProperties
  extends StObject
     with ContentProperties {
  
  /**
    * The function that is called to create the custom content element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-CustomContent.html#creator)
    */
  var creator: js.UndefOr[PopupTemplateContentCreator] = js.undefined
  
  /**
    * The called function to cleanup custom content when it is no longer necessary.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-CustomContent.html#destroyer)
    */
  var destroyer: js.UndefOr[PopupTemplateContentDestroyer] = js.undefined
  
  /**
    * An array of field names used in the [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-CustomContent.html#outFields)
    */
  var outFields: js.UndefOr[js.Array[String]] = js.undefined
}
object CustomContentProperties {
  
  inline def apply(): CustomContentProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomContentProperties]
  }
  
  extension [Self <: CustomContentProperties](x: Self) {
    
    inline def setCreator(
      value: /* event */ js.UndefOr[PopupTemplateCreatorEvent] => String | HTMLElement | Widget_ | js.Promise[Any]
    ): Self = StObject.set(x, "creator", js.Any.fromFunction1(value))
    
    inline def setCreatorUndefined: Self = StObject.set(x, "creator", js.undefined)
    
    inline def setDestroyer(value: /* event */ js.UndefOr[PopupTemplateCreatorEvent] => scala.Unit): Self = StObject.set(x, "destroyer", js.Any.fromFunction1(value))
    
    inline def setDestroyerUndefined: Self = StObject.set(x, "destroyer", js.undefined)
    
    inline def setOutFields(value: js.Array[String]): Self = StObject.set(x, "outFields", value.asInstanceOf[js.Any])
    
    inline def setOutFieldsUndefined: Self = StObject.set(x, "outFields", js.undefined)
    
    inline def setOutFieldsVarargs(value: String*): Self = StObject.set(x, "outFields", js.Array(value*))
  }
}
