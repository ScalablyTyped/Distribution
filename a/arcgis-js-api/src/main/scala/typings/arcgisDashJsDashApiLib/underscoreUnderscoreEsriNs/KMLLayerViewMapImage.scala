package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KMLLayerViewMapImage
  extends stdLib.Object {
  /**
    * The [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) of the map image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-KMLLayerView.html#MapImage)
    */
  var Extent: Extent
  /**
    * URL to the map image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-KMLLayerView.html#MapImage)
    */
  var href: java.lang.String
  /**
    * Map image id.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-KMLLayerView.html#MapImage)
    */
  var id: scala.Double
  /**
    * Rotation of the map image about its center, in degrees. Values can be ±180. The default is 0 (north). Rotations are specified in a counterclockwise direction.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-KMLLayerView.html#MapImage)
    */
  var rotation: scala.Double
}

object KMLLayerViewMapImage {
  @scala.inline
  def apply(
    Extent: Extent,
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    href: java.lang.String,
    id: scala.Double,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    rotation: scala.Double
  ): KMLLayerViewMapImage = {
    val __obj = js.Dynamic.literal(Extent = Extent, constructor = constructor, hasOwnProperty = hasOwnProperty, href = href, id = id, propertyIsEnumerable = propertyIsEnumerable, rotation = rotation)
  
    __obj.asInstanceOf[KMLLayerViewMapImage]
  }
}

