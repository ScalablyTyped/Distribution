package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KMLLayerViewMapImage extends Object {
  /**
    * The [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) of the map image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-KMLLayerView.html#MapImage)
    */
  var Extent: typings.arcgisDashJsDashApi.__esri.Extent
  /**
    * URL to the map image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-KMLLayerView.html#MapImage)
    */
  var href: String
  /**
    * Map image id.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-KMLLayerView.html#MapImage)
    */
  var id: Double
  /**
    * Rotation of the map image about its center, in degrees. Values can be ±180. The default is 0 (north). Rotations are specified in a counterclockwise direction.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-KMLLayerView.html#MapImage)
    */
  var rotation: Double
}

object KMLLayerViewMapImage {
  @scala.inline
  def apply(
    Extent: Extent,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    href: String,
    id: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    rotation: Double
  ): KMLLayerViewMapImage = {
    val __obj = js.Dynamic.literal(Extent = Extent, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), href = href, id = id, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), rotation = rotation)
  
    __obj.asInstanceOf[KMLLayerViewMapImage]
  }
}

