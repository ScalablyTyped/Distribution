package typings.arcgisDashJsDashApi.__esri

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
class FieldInfoFormatCls () extends FieldInfoFormat {
  def this(properties: FieldInfoFormatProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/programming-patterns/#using-fromjson) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

