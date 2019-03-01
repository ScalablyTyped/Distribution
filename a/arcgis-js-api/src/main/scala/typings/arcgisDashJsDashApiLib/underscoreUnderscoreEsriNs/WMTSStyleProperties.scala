package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WMTSStyleProperties extends js.Object {
  /**
    * Description for the WMTS style. This defaults to the value of the Abstract property from the WMTS GetCapabilities request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSStyle.html#description)
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The unique ID assigned to the style.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSStyle.html#id)
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The URL to the legend which gets used in [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widget. This defaults to the value of the LegendURL property from the WMTS GetCapabilities request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSStyle.html#legendUrl)
    */
  var legendUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The title of the WMTS style.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSStyle.html#title)
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object WMTSStyleProperties {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    id: java.lang.String = null,
    legendUrl: java.lang.String = null,
    title: java.lang.String = null
  ): WMTSStyleProperties = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    if (legendUrl != null) __obj.updateDynamic("legendUrl")(legendUrl)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[WMTSStyleProperties]
  }
}

