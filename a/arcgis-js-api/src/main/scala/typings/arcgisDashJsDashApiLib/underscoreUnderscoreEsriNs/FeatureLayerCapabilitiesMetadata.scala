package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureLayerCapabilitiesMetadata
  extends stdLib.Object {
  /**
    * Indicates whether to provide a user-defined field description. See [Describe attribute fields](https://doc.arcgis.com/en/arcgis-online/manage-data/describe-fields.htm) for additional information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsAdvancedFieldProperties: scala.Boolean
}

object FeatureLayerCapabilitiesMetadata {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    supportsAdvancedFieldProperties: scala.Boolean
  ): FeatureLayerCapabilitiesMetadata = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), supportsAdvancedFieldProperties = supportsAdvancedFieldProperties)
  
    __obj.asInstanceOf[FeatureLayerCapabilitiesMetadata]
  }
}

