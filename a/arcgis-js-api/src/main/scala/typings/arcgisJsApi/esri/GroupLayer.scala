package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.exclusive
import typings.arcgisJsApi.arcgisJsApiStrings.group
import typings.arcgisJsApi.arcgisJsApiStrings.independent
import typings.arcgisJsApi.arcgisJsApiStrings.inherited
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupLayer
  extends StObject
     with Layer
     with LayersMixin
     with TablesMixin
     with PortalLayer
     with BlendLayer {
  
  /**
  		 * A flattened collection of all [layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) in the group layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html#allLayers)
  		 */
  val allLayers: Collection[Layer] = js.native
  
  /**
  		 * A flattened collection of tables anywhere in the group layer's hierarchy.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html#allTables)
  		 */
  val allTables: Collection[Layer] = js.native
  
  /**
  		 * Loads all the externally loadable resources associated with the group layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html#loadAll)
  		 */
  def loadAll(): js.Promise[GroupLayer] = js.native
  
  /**
  		 * The maximum scale (most zoomed in) at which the layer is visible in the view.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html#maxScale)
  		 */
  var maxScale: Double = js.native
  
  /**
  		 * The minimum scale (most zoomed out) at which the layer is visible in the view.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html#minScale)
  		 */
  var minScale: Double = js.native
  
  @JSName("type")
  val type_GroupLayer: group = js.native
  
  /**
  		 * Indicates how to manage the visibility of the children layers.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html#visibilityMode)
  		 */
  var visibilityMode: independent | inherited | exclusive = js.native
}
