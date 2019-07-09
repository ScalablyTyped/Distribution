package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchLayerProperties extends js.Object {
  /**
    * The field to use for search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-SearchLayer.html#field)
    */
  var field: js.UndefOr[SearchLayerFieldProperties] = js.undefined
  /**
    * The id of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-SearchLayer.html#id)
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The sub layer index.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-SearchLayer.html#subLayer)
    */
  var subLayer: js.UndefOr[scala.Double] = js.undefined
}

object SearchLayerProperties {
  @scala.inline
  def apply(
    field: SearchLayerFieldProperties = null,
    id: java.lang.String = null,
    subLayer: scala.Int | scala.Double = null
  ): SearchLayerProperties = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field)
    if (id != null) __obj.updateDynamic("id")(id)
    if (subLayer != null) __obj.updateDynamic("subLayer")(subLayer.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchLayerProperties]
  }
}

