package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`non-metric`
import typings.arcgisJsApi.arcgisJsApiStrings.dual
import typings.arcgisJsApi.arcgisJsApiStrings.imperial
import typings.arcgisJsApi.arcgisJsApiStrings.line
import typings.arcgisJsApi.arcgisJsApiStrings.metric
import typings.arcgisJsApi.arcgisJsApiStrings.ruler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScaleBar
  extends StObject
     with Widget_ {
  
  /**
  		 * The style for the scale bar.
  		 *
  		 * @default "line"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleBar.html#style)
  		 */
  var style: ruler | line = js.native
  
  /**
  		 * Units to use for the scale bar.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleBar.html#unit)
  		 */
  var unit: metric | imperial | dual | `non-metric` = js.native
  
  /**
  		 * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleBar.html#view)
  		 */
  var view: MapView = js.native
  
  /**
  		 * The view model for this widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleBar.html#viewModel)
  		 */
  var viewModel: ScaleBarViewModel = js.native
}
