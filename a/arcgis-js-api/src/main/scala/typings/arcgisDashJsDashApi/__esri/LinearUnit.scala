package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
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
    * Specifies the unit type of the linear distance.  **Possible Values:** feet | kilometers | meters | miles | nautical-miles | yards
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-LinearUnit.html#units)
    */
  var units: String = js.native
}

@JSGlobal("__esri.LinearUnit")
@js.native
object LinearUnit extends TopLevel[LinearUnitConstructor]

