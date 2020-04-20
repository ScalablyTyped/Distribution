package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureLayerCapabilitiesMetadata extends Object {
  /**
    * Indicates whether to provide a user-defined field description. See [Describe attribute fields](https://doc.arcgis.com/en/arcgis-online/manage-data/describe-fields.htm) for additional information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsAdvancedFieldProperties: Boolean
}

object FeatureLayerCapabilitiesMetadata {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    supportsAdvancedFieldProperties: Boolean
  ): FeatureLayerCapabilitiesMetadata = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), supportsAdvancedFieldProperties = supportsAdvancedFieldProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureLayerCapabilitiesMetadata]
  }
}

