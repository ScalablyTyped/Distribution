package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ViewProperties
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.View")
@js.native
/**
		 * A view provides the means of viewing and interacting with the components of a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html).
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html)
		 */
open class View ()
  extends StObject
     with typings.arcgisJsApi.esri.View {
  def this(properties: ViewProperties) = this()
  
  /**
  		 * The `id` or node representing the DOM element containing the view.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#container)
  		 */
  /* CompleteClass */
  var container: HTMLDivElement = js.native
  
  /**
  		 * Indicates if the browser focus is on the view.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#focused)
  		 */
  /* CompleteClass */
  override val focused: Boolean = js.native
  
  /**
  		 * The height of the view in pixels read from the view container element.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#height)
  		 */
  /* CompleteClass */
  override val height: Double = js.native
  
  /**
  		 * Indicates if the view is being resized.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#resizing)
  		 */
  /* CompleteClass */
  override val resizing: Boolean = js.native
  
  /**
  		 * An array containing the width and height of the view in pixels, e.g.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#size)
  		 */
  /* CompleteClass */
  override val size: js.Array[Double] = js.native
  
  /**
  		 * Indicates if the view is visible on the page.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#suspended)
  		 */
  /* CompleteClass */
  override val suspended: Boolean = js.native
  
  /**
  		 * Exposes the default widgets available in the view and allows you to toggle them on and off.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#ui)
  		 */
  /* CompleteClass */
  var ui: typings.arcgisJsApi.esri.DefaultUI = js.native
  
  /**
  		 * The width of the view in pixels read from the view container element.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#width)
  		 */
  /* CompleteClass */
  override val width: Double = js.native
}
/* static members */
object View {
  
  /**
  		 * Contains the collection of active views on the page.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#views)
  		 */
  @JSGlobal("__esri.View.views")
  @js.native
  val views: typings.arcgisJsApi.esri.Collection[typings.arcgisJsApi.esri.View] = js.native
}
