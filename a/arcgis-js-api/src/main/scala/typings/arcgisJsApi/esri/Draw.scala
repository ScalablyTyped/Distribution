package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.circle
import typings.arcgisJsApi.arcgisJsApiStrings.ellipse
import typings.arcgisJsApi.arcgisJsApiStrings.multipoint
import typings.arcgisJsApi.arcgisJsApiStrings.point
import typings.arcgisJsApi.arcgisJsApiStrings.polygon
import typings.arcgisJsApi.arcgisJsApiStrings.polyline
import typings.arcgisJsApi.arcgisJsApiStrings.rectangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Draw
  extends StObject
     with Accessor {
  
  /**
  		 * A reference to the active [draw action](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-Draw.html#activeAction)
  		 */
  var activeAction: DrawAction = js.native
  
  /**
  		 * Complete the current active drawing.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-Draw.html#complete)
  		 */
  def complete(): scala.Unit = js.native
  
  /**
  		 * Creates an instance of the requested draw action.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-Draw.html#create)
  		 */
  def create(drawAction: point | multipoint | polyline | polygon | rectangle | circle | ellipse): DrawAction = js.native
  def create(
    drawAction: point | multipoint | polyline | polygon | rectangle | circle | ellipse,
    drawOptions: DrawCreateDrawOptions
  ): DrawAction = js.native
  
  /**
  		 * Resets the drawing by clearing the active action.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-Draw.html#reset)
  		 */
  def reset(): scala.Unit = js.native
  
  /**
  		 * The view in which geometries will be drawn by the user.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-Draw.html#view)
  		 */
  var view: MapView | SceneView = js.native
}
