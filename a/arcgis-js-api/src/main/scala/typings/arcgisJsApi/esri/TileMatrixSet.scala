package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileMatrixSet
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * The full extent of the TileMatrixSet.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileMatrixSet.html#fullExtent)
  		 */
  var fullExtent: Extent = js.native
  
  /**
  		 * The unique ID assigned to the TileMatrixSet.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileMatrixSet.html#id)
  		 */
  var id: String = js.native
  
  /**
  		 * The tiling scheme information for the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileMatrixSet.html#tileInfo)
  		 */
  var tileInfo: TileInfo = js.native
}
