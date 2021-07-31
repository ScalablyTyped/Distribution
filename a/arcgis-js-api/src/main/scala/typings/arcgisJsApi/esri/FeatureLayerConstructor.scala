package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureLayerConstructor
  extends StObject
     with /**
  * A FeatureLayer is a single layer that can be created from a [Map Service](http://server.arcgis.com/en/server/latest/publish-services/windows/what-is-a-map-service.htm) or [Feature Service](http://server.arcgis.com/en/server/latest/publish-services/windows/what-is-a-feature-service-.htm); ArcGIS Online or ArcGIS Enterprise portal items; or from an array of client-side features.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html)
  */
Instantiable0[FeatureLayer]
     with Instantiable1[/* properties */ FeatureLayerProperties, FeatureLayer] {
  
  def fromJSON(json: js.Any): FeatureLayer = js.native
}
