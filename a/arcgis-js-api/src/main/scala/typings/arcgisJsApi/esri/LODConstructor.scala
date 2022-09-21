package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LODConstructor
  extends StObject
     with /**
  * A [TileLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html) has a number of LODs (Levels of Detail).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LOD.html)
  */
Instantiable0[LOD]
     with Instantiable1[/* properties */ LODProperties, LOD] {
  
  def fromJSON(json: Any): LOD = js.native
}
