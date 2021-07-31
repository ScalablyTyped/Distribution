package typings.arcgisJsApi.esri

import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DOMContainer extends StObject {
  
  /**
    * The `id` or node representing the DOM element containing the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#container)
    */
  var container: HTMLDivElement
  
  /**
    * Indicates if the browser focus is on the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#focused)
    */
  val focused: Boolean
  
  /**
    * The height of the view in pixels read from the view container element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#height)
    */
  val height: Double
  
  /**
    * A Popup object that displays general content or attributes from [layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#layers) in the [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#map).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#popup)
    */
  var popup: Popup
  
  /**
    * Indicates if the view is being resized.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#resizing)
    */
  val resizing: Boolean
  
  /**
    * An array containing the width and height of the view in pixels, e.g.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#size)
    */
  val size: js.Array[Double]
  
  /**
    * Indicates if the view is visible on the page.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#suspended)
    */
  val suspended: Boolean
  
  /**
    * Exposes the default widgets available in the view and allows you to toggle them on and off.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#ui)
    */
  var ui: DefaultUI
  
  /**
    * The width of the view in pixels read from the view container element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#width)
    */
  val width: Double
}
object DOMContainer {
  
  @scala.inline
  def apply(
    container: HTMLDivElement,
    focused: Boolean,
    height: Double,
    popup: Popup,
    resizing: Boolean,
    size: js.Array[Double],
    suspended: Boolean,
    ui: DefaultUI,
    width: Double
  ): DOMContainer = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], resizing = resizing.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], suspended = suspended.asInstanceOf[js.Any], ui = ui.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMContainer]
  }
  
  @scala.inline
  implicit class DOMContainerMutableBuilder[Self <: DOMContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainer(value: HTMLDivElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopup(value: Popup): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizing(value: Boolean): Self = StObject.set(x, "resizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: js.Array[Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeVarargs(value: Double*): Self = StObject.set(x, "size", js.Array(value :_*))
    
    @scala.inline
    def setSuspended(value: Boolean): Self = StObject.set(x, "suspended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUi(value: DefaultUI): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
