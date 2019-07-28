package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerFromArcGISServerUrlParams extends Object {
  /**
    * Set any of the layer's properties here for constructing the layer instance (e.g. popupTemplate, renderer, etc.).
    *
    * [Read more...](properties.html)
    */
  var properties: js.UndefOr[js.Any] = js.undefined
  /**
    * The ArcGIS Server URL used to create the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#fromArcGISServerUrl)
    */
  var url: String
}

object LayerFromArcGISServerUrlParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    url: String,
    properties: js.Any = null
  ): LayerFromArcGISServerUrlParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), url = url)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[LayerFromArcGISServerUrlParams]
  }
}

