package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenStreetMapLayerConstructor
  extends StObject
     with /**
  * Allows you to use [basemaps](http://wiki.openstreetmap.org/wiki/List_of_OSM-based_services) from [OpenStreetMap](http://www.openstreetmap.org/).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OpenStreetMapLayer.html)
  */
Instantiable0[OpenStreetMapLayer]
     with Instantiable1[/* properties */ OpenStreetMapLayerProperties, OpenStreetMapLayer] {
  
  def fromJSON(json: Any): OpenStreetMapLayer = js.native
}
