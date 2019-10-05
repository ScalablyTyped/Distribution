package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterValue
  extends Accessor
     with JSONSupport {
  /**
    * Specifies the parameter's data type.  **Possible Values:** string | double | long | boolean | date | linear-unit | data-file | raster-data | record-set | raster-data-layer | feature-record-set-layer | multi-value
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ParameterValue.html#dataType)
    */
  var dataType: String = js.native
  /**
    * The value of the parameter. The data structure of this value depends on the `dataType`.
    *
    * Data Type | JavaScript Type
    * ----------|----------------
    * string | [String](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String)
    * double | [Number (float)](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number)
    * long | [Number (int)](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number)
    * boolean | [Boolean](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Boolean)
    * date | [Date](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Date.html)
    * linear-unit | [LinearUnit](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-LinearUnit.html)
    * data-file | [DataFile](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataFile.html)
    * raster-data | [RasterData](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RasterData.html)
    * record-set | [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html)
    * raster-data-layer | [RasterData](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RasterData.html)
    * feature-record-set-layer | [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html)
    * multi-value | [String[]](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String)
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ParameterValue.html#value)
    */
  var value: js.Any = js.native
}

@JSGlobal("__esri.ParameterValue")
@js.native
object ParameterValue extends TopLevel[ParameterValueConstructor]

