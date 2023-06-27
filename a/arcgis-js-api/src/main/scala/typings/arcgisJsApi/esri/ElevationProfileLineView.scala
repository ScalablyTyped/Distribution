package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.view
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElevationProfileLineView
  extends StObject
     with ElevationProfileLine {
  
  /**
  		 * Items which are to be excluded when querying elevation from view.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLineView.html#exclude)
  		 */
  var exclude: (js.Array[IntersectItem | Collection[IntersectItem] | js.Array[IntersectItem] | Ground]) | Collection[IntersectItem] | IntersectItem = js.native
  
  /**
  		 * Items which are to be hit when querying elevation from view.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLineView.html#include)
  		 */
  var include: (js.Array[IntersectItem | Collection[IntersectItem] | js.Array[IntersectItem] | Ground]) | Collection[IntersectItem] | IntersectItem = js.native
  
  /**
  		 * The line type.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLineView.html#type)
  		 */
  @JSName("type")
  val type_ElevationProfileLineView: view = js.native
}
