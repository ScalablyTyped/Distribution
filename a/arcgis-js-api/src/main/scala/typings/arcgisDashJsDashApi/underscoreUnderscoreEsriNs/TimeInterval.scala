package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeInterval extends JSONSupport {
  /**
    * Temporal units.  **Possible Values:** milliseconds | seconds | minutes | hours | days | weeks | months | years | decades | centuries
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html#unit)
    *
    * @default milliseconds
    */
  var unit: String
  /**
    * The numerical value of the time extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html#value)
    *
    * @default 0
    */
  var value: Double
}

@JSGlobal("__esri.TimeInterval")
@js.native
class TimeIntervalCls () extends TimeInterval {
  def this(properties: TimeIntervalProperties) = this()
  /**
    * Temporal units.  **Possible Values:** milliseconds | seconds | minutes | hours | days | weeks | months | years | decades | centuries
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html#unit)
    *
    * @default milliseconds
    */
  /* CompleteClass */
  override var unit: String = js.native
  /**
    * The numerical value of the time extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html#value)
    *
    * @default 0
    */
  /* CompleteClass */
  override var value: Double = js.native
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

object TimeInterval {
  @scala.inline
  def apply(clone: () => TimeInterval, toJSON: () => js.Any, unit: String, value: Double): TimeInterval = {
    val __obj = js.Dynamic.literal(clone = js.Any.fromFunction0(clone), toJSON = js.Any.fromFunction0(toJSON), unit = unit, value = value)
  
    __obj.asInstanceOf[TimeInterval]
  }
}

