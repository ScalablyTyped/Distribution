package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicLayerFetchImageOptions
  extends stdLib.Object {
  /**
    * The ratio of the resolution in physical pixels of the image to the resolution it will be displayed at.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-DynamicLayer.html#fetchImage)
    */
  var pixelRatio: js.UndefOr[scala.Double] = js.undefined
  /**
    * The rotation in degrees of the exported image. Available since ArcGIS Server 10.3.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-DynamicLayer.html#fetchImage)
    */
  var rotation: js.UndefOr[scala.Double] = js.undefined
}

object DynamicLayerFetchImageOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    pixelRatio: scala.Int | scala.Double = null,
    rotation: scala.Int | scala.Double = null
  ): DynamicLayerFetchImageOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicLayerFetchImageOptions]
  }
}

