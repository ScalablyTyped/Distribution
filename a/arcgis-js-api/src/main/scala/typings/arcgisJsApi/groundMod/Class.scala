package typings.arcgisJsApi.groundMod

import typings.arcgisJsApi.esri.Ground
import typings.arcgisJsApi.esri.GroundProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/Ground", JSImport.Namespace)
@js.native
/**
  * The Ground class contains properties that specify how the ground surface is displayed in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). It contains a [layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#layers) property, which is a collection of [ElevationLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html) that defines the elevation or terrain of the map's surface.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html)
  */
class Class () extends Ground {
  def this(properties: GroundProperties) = this()
}

