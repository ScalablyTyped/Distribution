package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileMatrixSetConstructor
  extends StObject
     with /**
  * Contains information about the tiling scheme for [WMTSSublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileMatrixSet.html)
  */
Instantiable0[TileMatrixSet]
     with Instantiable1[/* properties */ TileMatrixSetProperties, TileMatrixSet] {
  
  def fromJSON(json: Any): TileMatrixSet = js.native
}
