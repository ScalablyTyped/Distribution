package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasemapGallery
  extends StObject
     with Widget_ {
  
  /**
  		 * The map's [basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery.html#activeBasemap)
  		 */
  var activeBasemap: Basemap = js.native
  
  /**
  		 * When `true`, sets the widget to a disabled state so the user cannot interact with it.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery.html#disabled)
  		 */
  var disabled: Boolean = js.native
  
  /**
  		 * Indicates the heading level to use for the message "No basemaps available" when no basemaps are available in the BasemapGallery.
  		 *
  		 * @default 2
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery.html#headingLevel)
  		 */
  var headingLevel: Double = js.native
  
  /**
  		 * The widget's default CSS icon class.
  		 *
  		 * @deprecated since 4.27. Use {@link module:esri/widgets/BasemapGallery#icon icon} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery.html#iconClass)
  		 */
  var iconClass: String = js.native
  
  /**
  		 * The source for basemaps that the widget will display.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery.html#source)
  		 */
  var source: LocalBasemapsSource | PortalBasemapsSource = js.native
  
  /**
  		 * The view from which the widget will operate.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery.html#view)
  		 */
  var view: MapView | SceneView = js.native
  
  /**
  		 * The view model for this widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery.html#viewModel)
  		 */
  var viewModel: BasemapGalleryViewModel = js.native
}
