package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FloorFilter
  extends StObject
     with Widget_ {
  
  /**
    * The currently selected facility.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FloorFilter.html#facility)
    */
  var facility: String = js.native
  
  /**
    * Indicates the heading level to use for the headings separating floors in buildings.
    *
    * @default 2
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FloorFilter.html#headingLevel)
    */
  var headingLevel: Double = js.native
  
  /**
    * The currently selected floor level.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FloorFilter.html#level)
    */
  var level: String = js.native
  
  /**
    * Determines if the widget is expanded or collapsed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FloorFilter.html#longNames)
    */
  var longNames: Boolean = js.native
  
  /**
    * The currently selected site.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FloorFilter.html#site)
    */
  var site: String = js.native
  
  /**
    * Updates the [floorFilter](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#FloorFilter) widget definition in the provided [WebMap](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FloorFilter.html#updateWebDocument)
    */
  def updateWebDocument(webmap: WebMap): scala.Unit = js.native
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FloorFilter.html#view)
    */
  var view: MapView | SceneView = js.native
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FloorFilter.html#viewModel)
    */
  var viewModel: FloorFilterViewModel = js.native
}
