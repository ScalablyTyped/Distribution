package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`data-file`
import typings.arcgisJsApi.arcgisJsApiStrings.`feature-record-set-layer`
import typings.arcgisJsApi.arcgisJsApiStrings.`linear-unit`
import typings.arcgisJsApi.arcgisJsApiStrings.`multi-value`
import typings.arcgisJsApi.arcgisJsApiStrings.`raster-data-layer`
import typings.arcgisJsApi.arcgisJsApiStrings.`raster-data`
import typings.arcgisJsApi.arcgisJsApiStrings.`record-set`
import typings.arcgisJsApi.arcgisJsApiStrings.boolean
import typings.arcgisJsApi.arcgisJsApiStrings.date
import typings.arcgisJsApi.arcgisJsApiStrings.double
import typings.arcgisJsApi.arcgisJsApiStrings.field
import typings.arcgisJsApi.arcgisJsApiStrings.long
import typings.arcgisJsApi.arcgisJsApiStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterValueProperties extends js.Object {
  /**
    * Specifies the parameter's data type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ParameterValue.html#dataType)
    */
  var dataType: js.UndefOr[
    boolean | `data-file` | date | double | `feature-record-set-layer` | field | `linear-unit` | long | `raster-data` | `raster-data-layer` | `record-set` | string | `multi-value`
  ] = js.native
  /**
    * The value of the parameter. The data structure of this value depends on the `dataType`.
    *
    * Data Type | JavaScript Type
    * ----------|----------------
    * string | [String](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String)
    * double | [Number (float)](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number)
    * long | [Number (int)](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number)
    * boolean | [Boolean](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Boolean)
    * date | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)
    * linear-unit | [LinearUnit](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-LinearUnit.html)
    * data-file | [DataFile](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataFile.html)
    * raster-data | [RasterData](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RasterData.html)
    * record-set | [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html)
    * raster-data-layer | [RasterData](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RasterData.html)
    * feature-record-set-layer | [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html)
    * field | [Field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html)
    * multi-value | [Object[]](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object)
    *               An array of any of the objects listed above.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ParameterValue.html#value)
    */
  var value: js.UndefOr[js.Any] = js.native
}

object ParameterValueProperties {
  @scala.inline
  def apply(): ParameterValueProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterValueProperties]
  }
  @scala.inline
  implicit class ParameterValuePropertiesOps[Self <: ParameterValueProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataType(
      value: boolean | `data-file` | date | double | `feature-record-set-layer` | field | `linear-unit` | long | `raster-data` | `raster-data-layer` | `record-set` | string | `multi-value`
    ): Self = this.set("dataType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataType: Self = this.set("dataType", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

