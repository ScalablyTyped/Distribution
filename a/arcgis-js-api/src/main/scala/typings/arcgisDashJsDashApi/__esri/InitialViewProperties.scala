package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitialViewProperties
  extends Accessor
     with corePromise {
  /**
    * The background color of the [WebMap](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-InitialViewProperties.html#background)
    *
    * @default null
    */
  var background: ColorBackground = js.native
  /**
    * The spatial reference of the [WebMap](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html). This indicates the [Projected Coordinate System](https://developers.arcgis.com/rest/services-reference/projected-coordinate-systems.htm) or the [Geographic Coordinate System](https://developers.arcgis.com/rest/services-reference/geographic-coordinate-systems.htm) used to locate geographic features in the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-InitialViewProperties.html#spatialReference)
    */
  var spatialReference: SpatialReference = js.native
  /**
    * The initial viewpoint of the [WebMap](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-InitialViewProperties.html#viewpoint)
    */
  var viewpoint: Viewpoint = js.native
}

@JSGlobal("__esri.InitialViewProperties")
@js.native
object InitialViewProperties extends TopLevel[InitialViewPropertiesConstructor]

