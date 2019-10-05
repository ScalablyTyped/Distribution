package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KMLSublayerProperties extends js.Object {
  /**
    * Description for the KML sublayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-KMLSublayer.html#description)
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The id for the KML sublayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-KMLSublayer.html#id)
    */
  var id: js.UndefOr[Double] = js.undefined
  /**
    * The [KMLLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-KMLLayer.html) to which the sublayer belongs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-KMLSublayer.html#layer)
    */
  var layer: js.UndefOr[KMLLayerProperties] = js.undefined
  /**
    * Network link info for the current layer. A link info object with properties that describe the network link.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-KMLSublayer.html#networkLink)
    */
  var networkLink: js.UndefOr[js.Any] = js.undefined
  /**
    * A collection of [KMLSublayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-KMLSublayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-KMLSublayer.html#sublayers)
    */
  var sublayers: js.UndefOr[CollectionProperties[KMLSublayerProperties]] = js.undefined
  /**
    * The title of the KML sublayer used to identify it in places such as the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) and [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widgets.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-KMLSublayer.html#title)
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * Indicates if the sublayer is visible in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-KMLSublayer.html#visible)
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object KMLSublayerProperties {
  @scala.inline
  def apply(
    description: String = null,
    id: Int | Double = null,
    layer: KMLLayerProperties = null,
    networkLink: js.Any = null,
    sublayers: CollectionProperties[KMLSublayerProperties] = null,
    title: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): KMLSublayerProperties = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (layer != null) __obj.updateDynamic("layer")(layer)
    if (networkLink != null) __obj.updateDynamic("networkLink")(networkLink)
    if (sublayers != null) __obj.updateDynamic("sublayers")(sublayers.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[KMLSublayerProperties]
  }
}

