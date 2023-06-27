package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawAction
  extends StObject
     with Accessor
     with Evented {
  
  /**
  		 * Indicates if the [redo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html#redo) method can be called on the action instance.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html#canRedo)
  		 */
  def canRedo(): Boolean = js.native
  
  /**
  		 * Indicates if the [undo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html#undo) method can be called on the action instance.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html#canUndo)
  		 */
  def canUndo(): Boolean = js.native
  
  /**
  		 * Maps the given screen point to a map point.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html#getCoordsAndPointFromScreenPoint)
  		 */
  def getCoordsAndPointFromScreenPoint(screenPoint: DrawActionScreenPoint): FromScreenPointResult | Null = js.native
  
  /**
  		 * Maps the given screen point to a map point.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html#getCoordsFromScreenPoint)
  		 */
  def getCoordsFromScreenPoint(screenPoint: DrawActionScreenPoint): js.Array[Double] | Null = js.native
  
  /**
  		 * Controls whether the created geometry will have z coordinates or not.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html#hasZ)
  		 */
  var hasZ: Boolean = js.native
  
  /**
  		 * Incrementally redo actions recorded in the stack.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html#redo)
  		 */
  def redo(): scala.Unit = js.native
  
  /**
  		 * Maps the given screen point to a map point.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html#screenToMap)
  		 */
  def screenToMap(screenPoint: DrawActionScreenPoint): Point | Null = js.native
  
  /**
  		 * Incrementally undo actions recorded in the stack.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html#undo)
  		 */
  def undo(): scala.Unit = js.native
  
  /**
  		 * Two-dimensional array of numbers representing the coordinates of each vertex comprising the geometry being drawn.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html#vertices)
  		 */
  val vertices: js.Array[js.Array[Double]] = js.native
  
  /**
  		 * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html#view)
  		 */
  var view: MapView = js.native
}
