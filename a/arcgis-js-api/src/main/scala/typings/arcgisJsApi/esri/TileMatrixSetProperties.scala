package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileMatrixSetProperties extends StObject {
  
  /**
    * The full extent of the TileMatrixSet.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileMatrixSet.html#fullExtent)
    */
  var fullExtent: js.UndefOr[ExtentProperties] = js.native
  
  /**
    * The unique ID assigned to the TileMatrixSet.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileMatrixSet.html#id)
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The tiling scheme information for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileMatrixSet.html#tileInfo)
    */
  var tileInfo: js.UndefOr[TileInfoProperties] = js.native
}
object TileMatrixSetProperties {
  
  @scala.inline
  def apply(): TileMatrixSetProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileMatrixSetProperties]
  }
  
  @scala.inline
  implicit class TileMatrixSetPropertiesMutableBuilder[Self <: TileMatrixSetProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFullExtent(value: ExtentProperties): Self = StObject.set(x, "fullExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullExtentUndefined: Self = StObject.set(x, "fullExtent", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setTileInfo(value: TileInfoProperties): Self = StObject.set(x, "tileInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileInfoUndefined: Self = StObject.set(x, "tileInfo", js.undefined)
  }
}
