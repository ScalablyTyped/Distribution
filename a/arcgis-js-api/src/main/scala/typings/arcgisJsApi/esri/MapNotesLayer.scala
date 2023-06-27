package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`map-notes`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapNotesLayer
  extends StObject
     with Layer
     with PortalLayer
     with ScaleRangeLayer
     with BlendLayer {
  
  /**
  		 * Describes the layer's supported capabilities.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapNotesLayer.html#capabilities)
  		 */
  val capabilities: MapNotesLayerCapabilities = js.native
  
  /**
  		 * A layer containing a collection of graphics with multipoint geometry.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapNotesLayer.html#multipointLayer)
  		 */
  val multipointLayer: GraphicsLayer = js.native
  
  /**
  		 * A layer containing a collection of graphics with point geometry.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapNotesLayer.html#pointLayer)
  		 */
  val pointLayer: GraphicsLayer = js.native
  
  /**
  		 * A layer containing a collection of graphics with polygon geometry.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapNotesLayer.html#polygonLayer)
  		 */
  val polygonLayer: GraphicsLayer = js.native
  
  /**
  		 * A layer containing a collection of graphics with polyline geometry.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapNotesLayer.html#polylineLayer)
  		 */
  val polylineLayer: GraphicsLayer = js.native
  
  /**
  		 * A layer containing a collection of text graphics with point geometry.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapNotesLayer.html#textLayer)
  		 */
  val textLayer: GraphicsLayer = js.native
  
  @JSName("type")
  val type_MapNotesLayer: `map-notes` = js.native
}
