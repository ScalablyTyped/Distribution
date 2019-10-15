package typings.arcgisDashJsDashApi.esriTimeIntervalMod

import typings.arcgisDashJsDashApi.__esri.TimeInterval
import typings.arcgisDashJsDashApi.__esri.TimeIntervalProperties
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.centuries
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.days
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.decades
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.hours
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.milliseconds
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.minutes
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.months
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.seconds
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.weeks
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.years
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/TimeInterval", JSImport.Namespace)
@js.native
class Class () extends TimeInterval {
  def this(properties: TimeIntervalProperties) = this()
  /**
    * Temporal units.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html#unit)
    *
    * @default milliseconds
    */
  /* CompleteClass */
  override var unit: milliseconds | seconds | minutes | hours | days | weeks | months | years | decades | centuries = js.native
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
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/programming-patterns/#using-fromjson) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

