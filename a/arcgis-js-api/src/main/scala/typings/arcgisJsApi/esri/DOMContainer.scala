package typings.arcgisJsApi.esri

import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMContainer extends js.Object {
  
  /**
    * The `id` or node representing the DOM element containing the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#container)
    */
  var container: HTMLDivElement = js.native
  
  /**
    * Indicates if the browser focus is on the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#focused)
    */
  val focused: Boolean = js.native
  
  /**
    * The height of the view in pixels read from the view container element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#height)
    */
  val height: Double = js.native
  
  /**
    * A Popup object that displays general content or attributes from [layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#layers) in the [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#map).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#popup)
    */
  var popup: Popup = js.native
  
  /**
    * Indicates if the view is being resized.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#resizing)
    */
  val resizing: Boolean = js.native
  
  /**
    * An array containing the width and height of the view in pixels, e.g.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#size)
    */
  val size: js.Array[Double] = js.native
  
  /**
    * Indicates if the view is visible on the page.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#suspended)
    */
  val suspended: Boolean = js.native
  
  /**
    * Exposes the default widgets available in the view and allows you to toggle them on and off.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#ui)
    */
  var ui: DefaultUI = js.native
  
  /**
    * The width of the view in pixels read from the view container element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#width)
    */
  val width: Double = js.native
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
  implicit class DOMContainerOps[Self <: DOMContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContainer(value: HTMLDivElement): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocused(value: Boolean): Self = this.set("focused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopup(value: Popup): Self = this.set("popup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizing(value: Boolean): Self = this.set("resizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeVarargs(value: Double*): Self = this.set("size", js.Array(value :_*))
    
    @scala.inline
    def setSize(value: js.Array[Double]): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuspended(value: Boolean): Self = this.set("suspended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUi(value: DefaultUI): Self = this.set("ui", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
