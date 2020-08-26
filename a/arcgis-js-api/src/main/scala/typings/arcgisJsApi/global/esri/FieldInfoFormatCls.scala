package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.FieldInfoFormatProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.FieldInfoFormat")
@js.native
/**
  * The `FieldInfoFormat` class is used with numerical or date fields to provide more detail about how the value should be displayed in a popup. Use this class in place of the legacy formatting functions: `DateString`, `DateFormat`, and/or `NumberFormat`.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-support-FieldInfoFormat.html)
  */
class FieldInfoFormatCls ()
  extends typings.arcgisJsApi.esri.FieldInfoFormat {
  def this(properties: FieldInfoFormatProperties) = this()
}

