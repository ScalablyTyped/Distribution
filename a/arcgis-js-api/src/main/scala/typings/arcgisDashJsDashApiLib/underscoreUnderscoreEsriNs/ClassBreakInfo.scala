package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassBreakInfo
  extends Accessor
     with JSONSupport {
  /**
    * Describes the data represented by the class break. This label will appear in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widget next to the symbol representing the break. If no label is provided, then a default label is derived using the [minValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ClassBreakInfo.html#minValue) and [maxValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ClassBreakInfo.html#maxValue).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ClassBreakInfo.html#label)
    */
  var label: java.lang.String = js.native
  /**
    * Sets the maximum value for the class break. Features with this value or smaller as small as the provided [minValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ClassBreakInfo.html#minValue) will be rendered with the given [symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ClassBreakInfo.html#symbol).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ClassBreakInfo.html#maxValue)
    */
  var maxValue: scala.Double = js.native
  /**
    * Sets the minimum value for the class break. Features with this value or greater up to the provided [maxValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ClassBreakInfo.html#maxValue) will be rendered with the given [symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ClassBreakInfo.html#symbol).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ClassBreakInfo.html#minValue)
    */
  var minValue: scala.Double = js.native
  /**
    * Defines the symbol used to render features with data values that are within the bounds defined for the class break. This value may be autocast by specifying the symbol `type`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ClassBreakInfo.html#symbol)
    */
  var symbol: Symbol = js.native
}

@JSGlobal("__esri.ClassBreakInfo")
@js.native
class ClassBreakInfoCls () extends ClassBreakInfo {
  def this(properties: ClassBreakInfoProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

