package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
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

trait TimeInterval extends JSONSupport {
  /**
    * Temporal units.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html#unit)
    *
    * @default milliseconds
    */
  var unit: milliseconds | seconds | minutes | hours | days | weeks | months | years | decades | centuries
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
object TimeInterval extends TopLevel[TimeIntervalConstructor]

