package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FloorFilterViewModel
  extends StObject
     with Accessor
     with GoTo {
  
  /**
    * The currently selected facility.
    *
    * @default undefined
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FloorFilter-FloorFilterViewModel.html#facility)
    */
  var facility: String = js.native
  
  /**
    * The currently selected level.
    *
    * @default undefined
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FloorFilter-FloorFilterViewModel.html#level)
    */
  var level: String = js.native
  
  /**
    * Determines if the widget is expanded or collapsed.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FloorFilter-FloorFilterViewModel.html#longNames)
    */
  var longNames: Boolean = js.native
  
  /**
    * The currently selected site.
    *
    * @default undefined
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FloorFilter-FloorFilterViewModel.html#site)
    */
  var site: String = js.native
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FloorFilter-FloorFilterViewModel.html#view)
    */
  var view: MapView | SceneView = js.native
}
