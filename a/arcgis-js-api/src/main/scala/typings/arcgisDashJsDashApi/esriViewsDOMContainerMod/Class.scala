package typings.arcgisDashJsDashApi.esriViewsDOMContainerMod

import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.DOMContainer
import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.DefaultUI
import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.Popup
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/views/DOMContainer", JSImport.Namespace)
@js.native
class Class () extends DOMContainer {
  /**
    * The `id` or node representing the DOM element containing the view. This is typically set in the view's constructor.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#container)
    */
  /* CompleteClass */
  override var container: HTMLDivElement = js.native
  /**
    * Indicates if the browser focus is on the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#focused)
    */
  /* CompleteClass */
  override val focused: Boolean = js.native
  /**
    * The height of the view in pixels read from the view container element.  The view container needs to have a height greater than 0 to be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#height)
    *
    * @default 0
    */
  /* CompleteClass */
  override val height: Double = js.native
  /**
    * A Popup object that displays general content or attributes from [layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#layers) in the [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#map).  The view has a default instance of [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) with predefined styles and a template for defining content. The content in this default instance may be modified directly in the [popup's content](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#content) or in a layer's [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).  You may create a new [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) instance and set it to this property to customize the style, positioning, and content of the popup in favor of using the default popup instance on the view.  In addition, if wanting to prevent any popups from opening, use the syntax below:
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#popup)
    */
  /* CompleteClass */
  override var popup: Popup = js.native
  /**
    * Indicates if the view is being resized.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#resizing)
    *
    * @default false
    */
  /* CompleteClass */
  override val resizing: Boolean = js.native
  /**
    * An array containing the width and height of the view in pixels, e.g. `[width, height]`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#size)
    */
  /* CompleteClass */
  override val size: js.Array[Double] = js.native
  /**
    * Indicates if the view is visible on the page. Is `true` if the view has no [container](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#container), a [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#height) or [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#width) equal to 0, or the CSS `visibility` is `hidden`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#suspended)
    *
    * @default true
    */
  /* CompleteClass */
  override val suspended: Boolean = js.native
  /**
    * Exposes the default widgets available in the view and allows you to toggle them on and off. See [DefaultUI](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-DefaultUI.html) for more details.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#ui)
    */
  /* CompleteClass */
  override var ui: DefaultUI = js.native
  /**
    * The width of the view in pixels read from the view container element.  The view container needs to have a width greater than 0 to be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#width)
    *
    * @default 0
    */
  /* CompleteClass */
  override val width: Double = js.native
}

