package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopupTemplateCreatorEvent extends StObject {
  
  /**
  		 * The [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) used to represent the feature.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-CustomContent.html#PopupTemplateCreatorEvent)
  		 */
  var graphic: Graphic
}
object PopupTemplateCreatorEvent {
  
  inline def apply(graphic: Graphic): PopupTemplateCreatorEvent = {
    val __obj = js.Dynamic.literal(graphic = graphic.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupTemplateCreatorEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PopupTemplateCreatorEvent] (val x: Self) extends AnyVal {
    
    inline def setGraphic(value: Graphic): Self = StObject.set(x, "graphic", value.asInstanceOf[js.Any])
  }
}
