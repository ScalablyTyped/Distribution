package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`global-id`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`small-integer`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.blob
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.date
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.double
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.guid
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.integer
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.long
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.oid
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.raster
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.single
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.string
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.xml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchLayerFieldProperties extends js.Object {
  /**
    * Whether or not the field is an exact match.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-SearchLayerField.html#exactMatch)
    */
  var exactMatch: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-SearchLayerField.html#name)
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The data type of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-SearchLayerField.html#type)
    */
  var `type`: js.UndefOr[
    `small-integer` | integer | single | double | long | string | date | oid | typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.geometry | blob | raster | guid | `global-id` | xml
  ] = js.undefined
}

object SearchLayerFieldProperties {
  @scala.inline
  def apply(
    exactMatch: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    `type`: `small-integer` | integer | single | double | long | string | date | oid | typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.geometry | blob | raster | guid | `global-id` | xml = null
  ): SearchLayerFieldProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exactMatch)) __obj.updateDynamic("exactMatch")(exactMatch)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchLayerFieldProperties]
  }
}

