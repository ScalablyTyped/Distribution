package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileInfoCreateOptions extends StObject {
  
  /**
    * Total number of LODs to create.
    *
    * @default 24
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#create)
    */
  var numLODs: js.UndefOr[Double] = js.undefined
  
  /**
    * An array of scale values to use for the TileInfo.
    *
    * @default The scales provided by ArcGIS Online basemaps
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#create)
    */
  var scales: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * The size of each tile in pixels.
    *
    * @default 256
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#create)
    */
  var size: js.UndefOr[Double] = js.undefined
  
  /**
    * The spatial reference for the new TileInfo instance.
    *
    * @default WebMercator
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#create)
    */
  var spatialReference: js.UndefOr[SpatialReference] = js.undefined
}
object TileInfoCreateOptions {
  
  inline def apply(): TileInfoCreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileInfoCreateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TileInfoCreateOptions] (val x: Self) extends AnyVal {
    
    inline def setNumLODs(value: Double): Self = StObject.set(x, "numLODs", value.asInstanceOf[js.Any])
    
    inline def setNumLODsUndefined: Self = StObject.set(x, "numLODs", js.undefined)
    
    inline def setScales(value: js.Array[Double]): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
    
    inline def setScalesUndefined: Self = StObject.set(x, "scales", js.undefined)
    
    inline def setScalesVarargs(value: Double*): Self = StObject.set(x, "scales", js.Array(value*))
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSpatialReference(value: SpatialReference): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    inline def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
  }
}
