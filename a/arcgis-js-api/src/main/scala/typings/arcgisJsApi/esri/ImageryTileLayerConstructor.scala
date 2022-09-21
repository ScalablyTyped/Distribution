package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageryTileLayerConstructor
  extends StObject
     with /**
  * ImageryTileLayer presents raster data from a tiled image service.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html)
  */
Instantiable0[ImageryTileLayer]
     with Instantiable1[/* properties */ ImageryTileLayerProperties, ImageryTileLayer] {
  
  def fromJSON(json: Any): ImageryTileLayer = js.native
}
