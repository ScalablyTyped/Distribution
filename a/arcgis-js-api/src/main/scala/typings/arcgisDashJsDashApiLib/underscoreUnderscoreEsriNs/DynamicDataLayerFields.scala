package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicDataLayerFields
  extends stdLib.Object {
  /**
    * The alias of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#DynamicDataLayer)
    */
  var alias: java.lang.String
  /**
    * The name of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#DynamicDataLayer)
    */
  var name: java.lang.String
}

object DynamicDataLayerFields {
  @scala.inline
  def apply(
    alias: java.lang.String,
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    name: java.lang.String,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean]
  ): DynamicDataLayerFields = {
    val __obj = js.Dynamic.literal(alias = alias, constructor = constructor, hasOwnProperty = hasOwnProperty, name = name, propertyIsEnumerable = propertyIsEnumerable)
  
    __obj.asInstanceOf[DynamicDataLayerFields]
  }
}

