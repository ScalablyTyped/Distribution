package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicMapLayer
  extends stdLib.Object {
  /**
    * An optional property for specifying the GDB version.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#DynamicMapLayer)
    */
  var gdbVersion: java.lang.String
  /**
    * The [id](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#id) of the service sublayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#DynamicMapLayer)
    */
  var mapLayerId: scala.Double
  /**
    * This value is always `map-layer` and is inferred when the `mapLayerId` property is set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#DynamicMapLayer)
    */
  var `type`: java.lang.String
}

object DynamicMapLayer {
  @scala.inline
  def apply(
    constructor: js.Function,
    gdbVersion: java.lang.String,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    mapLayerId: scala.Double,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    `type`: java.lang.String
  ): DynamicMapLayer = {
    val __obj = js.Dynamic.literal(constructor = constructor, gdbVersion = gdbVersion, hasOwnProperty = hasOwnProperty, mapLayerId = mapLayerId, propertyIsEnumerable = propertyIsEnumerable)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DynamicMapLayer]
  }
}

