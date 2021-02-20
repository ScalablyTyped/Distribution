package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KMLLayerConstructor
  extends /**
  * The KMLLayer class is used to create a layer based on a KML file (.kml, .kmz).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-KMLLayer.html)
  */
Instantiable0[KMLLayer]
     with Instantiable1[/* properties */ KMLLayerProperties, KMLLayer] {
  
  def fromJSON(json: js.Any): KMLLayer = js.native
}
