package typings.arcgisDashJsDashApi.esriWidgetsCompassMod

import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.Compass
import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.CompassProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/widgets/Compass", JSImport.Namespace)
@js.native
/**
  * The Compass widget indicates where north is in relation to the current view [rotation](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#rotation) or [camera heading](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#heading). Clicking the Compass widget rotates the view to face north (heading = 0). This widget is added to a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) by default. The icon for the Compass widget is determined based upon the view's [spatial reference](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#spatialReference). If the view's [spatial reference](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#spatialReference) is not Web Mercator or WGS84 a dial icon will be used, however when the spatial reference is Web Mercator or WGS84 the icon will be a north arrow.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Compass.html)
  */
class Class () extends Compass {
  def this(properties: CompassProperties) = this()
}

