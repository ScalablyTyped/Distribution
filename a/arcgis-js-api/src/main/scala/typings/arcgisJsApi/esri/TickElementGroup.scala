package typings.arcgisJsApi.esri

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TickElementGroup extends StObject {
  
  /**
    * The HTMLElement representing the label associated with the tick element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#TickElementGroup)
    */
  var labelElement: js.UndefOr[HTMLElement] = js.undefined
  
  /**
    * The HTMLElement representing a tick.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#TickElementGroup)
    */
  var tickElement: js.UndefOr[HTMLElement] = js.undefined
}
object TickElementGroup {
  
  inline def apply(): TickElementGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TickElementGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TickElementGroup] (val x: Self) extends AnyVal {
    
    inline def setLabelElement(value: HTMLElement): Self = StObject.set(x, "labelElement", value.asInstanceOf[js.Any])
    
    inline def setLabelElementUndefined: Self = StObject.set(x, "labelElement", js.undefined)
    
    inline def setTickElement(value: HTMLElement): Self = StObject.set(x, "tickElement", value.asInstanceOf[js.Any])
    
    inline def setTickElementUndefined: Self = StObject.set(x, "tickElement", js.undefined)
  }
}
