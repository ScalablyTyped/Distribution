package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RasterDataConstructor
  extends StObject
     with /**
  * A geoprocessing data object containing a raster data source.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RasterData.html)
  */
Instantiable0[RasterData]
     with Instantiable1[/* properties */ RasterDataProperties, RasterData] {
  
  def fromJSON(json: Any): RasterData = js.native
}
