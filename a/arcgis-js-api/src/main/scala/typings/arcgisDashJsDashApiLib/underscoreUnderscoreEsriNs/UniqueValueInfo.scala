package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UniqueValueInfo
  extends Accessor
     with JSONSupport {
  /**
    * Describes the [value](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueInfo.html#value) represented by the [symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueInfo.html#symbol). This label will appear in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widget next to the symbol representing the value. If no label is provided, then the raw [value](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueInfo.html#value) is displayed in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueInfo.html#label)
    */
  var label: java.lang.String = js.native
  /**
    * Defines the symbol used to render features with the provided [value](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueInfo.html#value).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueInfo.html#symbol)
    */
  var symbol: Symbol = js.native
  /**
    * Features with this value will be rendered with the given [symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueInfo.html#symbol).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueInfo.html#value)
    */
  var value: java.lang.String | scala.Double = js.native
}

@JSGlobal("__esri.UniqueValueInfo")
@js.native
/**
  * Defines the symbols to use in a [UniqueValueRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html). Each unique value info defines a [symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueInfo.html#symbol) that should be used to represent features with a specific [value](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueInfo.html#value).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueInfo.html)
  */
class UniqueValueInfoCls () extends UniqueValueInfo {
  def this(properties: UniqueValueInfoProperties) = this()
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

