package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointCloudLayerView
  extends StObject
     with LayerView {
  
  /**
  		 * A list of attribute fields fetched for each feature including fields required for layer [rendering](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#renderer) and additional fields defined on the [SceneLayer.outFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#outFields).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-PointCloudLayerView.html#availableFields)
  		 */
  val availableFields: js.Array[String] = js.native
  
  /**
  		 * Highlights the given point(s).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-PointCloudLayerView.html#highlight)
  		 */
  def highlight(): Handle = js.native
  def highlight(target: js.Array[Graphic]): Handle = js.native
  def highlight(target: Graphic): Handle = js.native
}
