package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileLayerConstructor
  extends StObject
     with /**
  * The TileLayer allows you work with a cached [map service](http://server.arcgis.com/en/server/latest/publish-services/windows/what-is-a-map-service.htm) exposed by the ArcGIS Server REST API and add it to a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) as a tile layer.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html)
  */
Instantiable0[TileLayer]
     with Instantiable1[/* properties */ TileLayerProperties, TileLayer] {
  
  def fromJSON(json: js.Any): TileLayer = js.native
}
