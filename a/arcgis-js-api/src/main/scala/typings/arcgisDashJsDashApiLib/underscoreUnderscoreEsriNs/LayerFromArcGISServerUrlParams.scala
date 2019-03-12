package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerFromArcGISServerUrlParams
  extends stdLib.Object {
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
  var url: java.lang.String
}

object LayerFromArcGISServerUrlParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    url: java.lang.String,
    properties: js.Any = null
  ): LayerFromArcGISServerUrlParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), url = url)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[LayerFromArcGISServerUrlParams]
  }
}

