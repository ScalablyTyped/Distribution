package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArcGISMapServiceProperties extends js.Object {
  /**
    * The copyright text as defined by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#copyright)
    */
  var copyright: js.UndefOr[String] = js.undefined
  /**
    * The full extent of the layer as defined by the map service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#fullExtent)
    */
  var fullExtent: js.UndefOr[ExtentProperties] = js.undefined
  /**
    * Indicates whether the layer will be included in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#legendEnabled)
    *
    * @default true
    */
  var legendEnabled: js.UndefOr[Boolean] = js.undefined
}

object ArcGISMapServiceProperties {
  @scala.inline
  def apply(
    copyright: String = null,
    fullExtent: ExtentProperties = null,
    legendEnabled: js.UndefOr[Boolean] = js.undefined
  ): ArcGISMapServiceProperties = {
    val __obj = js.Dynamic.literal()
    if (copyright != null) __obj.updateDynamic("copyright")(copyright)
    if (fullExtent != null) __obj.updateDynamic("fullExtent")(fullExtent)
    if (!js.isUndefined(legendEnabled)) __obj.updateDynamic("legendEnabled")(legendEnabled)
    __obj.asInstanceOf[ArcGISMapServiceProperties]
  }
}

