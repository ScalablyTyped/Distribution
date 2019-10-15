package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
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

@js.native
trait SearchLayerField extends Accessor {
  /**
    * Whether or not the field is an exact match.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-SearchLayerField.html#exactMatch)
    */
  var exactMatch: Boolean = js.native
  /**
    * The name of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-SearchLayerField.html#name)
    */
  var name: String = js.native
  /**
    * The data type of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-SearchLayerField.html#type)
    */
  var `type`: `small-integer` | integer | single | double | long | string | date | oid | typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.geometry | blob | raster | guid | `global-id` | xml = js.native
}

@JSGlobal("__esri.SearchLayerField")
@js.native
object SearchLayerField extends TopLevel[SearchLayerFieldConstructor]

