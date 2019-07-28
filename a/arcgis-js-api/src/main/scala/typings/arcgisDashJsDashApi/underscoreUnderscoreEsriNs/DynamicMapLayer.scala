package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicMapLayer extends Object {
  /**
    * An optional property for specifying the GDB version.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#DynamicMapLayer)
    */
  var gdbVersion: String
  /**
    * The [id](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#id) of the service sublayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#DynamicMapLayer)
    */
  var mapLayerId: Double
  /**
    * This value is always `map-layer` and is inferred when the `mapLayerId` property is set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#DynamicMapLayer)
    */
  var `type`: String
}

object DynamicMapLayer {
  @scala.inline
  def apply(
    constructor: js.Function,
    gdbVersion: String,
    hasOwnProperty: PropertyKey => Boolean,
    mapLayerId: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: String
  ): DynamicMapLayer = {
    val __obj = js.Dynamic.literal(constructor = constructor, gdbVersion = gdbVersion, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), mapLayerId = mapLayerId, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DynamicMapLayer]
  }
}

