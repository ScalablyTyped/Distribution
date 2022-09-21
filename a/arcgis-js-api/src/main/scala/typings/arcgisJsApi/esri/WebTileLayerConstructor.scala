package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebTileLayerConstructor
  extends StObject
     with /**
  * WebTileLayer provides a simple way to add non-ArcGIS Server map tiles as a layer to a map.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html)
  */
Instantiable0[WebTileLayer]
     with Instantiable1[/* properties */ WebTileLayerProperties, WebTileLayer] {
  
  def fromJSON(json: Any): WebTileLayer = js.native
}
