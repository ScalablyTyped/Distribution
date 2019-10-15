package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`data-file`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`feature-record-set-layer`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`linear-unit`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`multi-value`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`raster-data-layer`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`raster-data`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`record-set`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.boolean
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.date
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.double
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.field
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.long
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterValue
  extends Accessor
     with JSONSupport {
  /**
    * Specifies the parameter's data type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ParameterValue.html#dataType)
    */
  var dataType: boolean | `data-file` | date | double | `feature-record-set-layer` | field | `linear-unit` | long | `raster-data` | `raster-data-layer` | `record-set` | string | `multi-value` = js.native
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
  var value: js.Any = js.native
}

@JSGlobal("__esri.ParameterValue")
@js.native
object ParameterValue extends TopLevel[ParameterValueConstructor]

