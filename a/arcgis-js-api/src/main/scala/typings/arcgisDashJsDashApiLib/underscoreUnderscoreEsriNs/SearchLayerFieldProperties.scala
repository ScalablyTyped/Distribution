package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchLayerFieldProperties extends js.Object {
  /**
    * Whether or not the field is an exact match.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-applicationProperties-SearchLayerField.html#exactMatch)
    */
  var exactMatch: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The name of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-applicationProperties-SearchLayerField.html#name)
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The data type of the field.  **Possible Values:** small-integer | integer | single | double | long | string | date | oid | geometry | blob | raster | guid | global-id | xml
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-applicationProperties-SearchLayerField.html#type)
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object SearchLayerFieldProperties {
  @scala.inline
  def apply(
    exactMatch: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    `type`: java.lang.String = null
  ): SearchLayerFieldProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exactMatch)) __obj.updateDynamic("exactMatch")(exactMatch)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SearchLayerFieldProperties]
  }
}

