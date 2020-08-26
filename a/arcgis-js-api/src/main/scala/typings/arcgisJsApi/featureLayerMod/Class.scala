package typings.arcgisJsApi.featureLayerMod

import typings.arcgisJsApi.esri.FeatureLayer
import typings.arcgisJsApi.esri.FeatureLayerProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/layers/FeatureLayer", JSImport.Namespace)
@js.native
/**
  * A FeatureLayer is a single layer that can be created from a [Map Service](http://server.arcgis.com/en/server/latest/publish-services/windows/what-is-a-map-service.htm) or [Feature Service](http://server.arcgis.com/en/server/latest/publish-services/windows/what-is-a-feature-service-.htm); ArcGIS Online or ArcGIS Enterprise portal items; or from an array of client-side features. The layer can be either a spatial (has geographic features) or non-spatial (table).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html)
  */
class Class () extends FeatureLayer {
  def this(properties: FeatureLayerProperties) = this()
}

