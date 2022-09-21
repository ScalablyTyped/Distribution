package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OGCFeatureLayerConstructor
  extends StObject
     with /**
  * The OGCFeatureLayer class is used to create a layer based on individual collections from a [OGC API Features](https://www.opengeospatial.org/standards/ogcapi-features) service.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html)
  */
Instantiable0[OGCFeatureLayer]
     with Instantiable1[/* properties */ OGCFeatureLayerProperties, OGCFeatureLayer] {
  
  def fromJSON(json: Any): OGCFeatureLayer = js.native
}
