package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`nautical-miles`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.feet
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.kilometers
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.meters
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.miles
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.yards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinearUnit
  extends Accessor
     with JSONSupport {
  /**
    * Specifies the value of the linear distance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-LinearUnit.html#distance)
    *
    * @default 0
    */
  var distance: Double = js.native
  /**
    * Specifies the unit type of the linear distance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-LinearUnit.html#units)
    */
  var units: feet | kilometers | meters | miles | `nautical-miles` | yards = js.native
}

@JSGlobal("__esri.LinearUnit")
@js.native
object LinearUnit extends TopLevel[LinearUnitConstructor]

