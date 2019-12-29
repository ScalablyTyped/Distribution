package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineOfSightTarget extends Accessor {
  /**
    * The first [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) intersected by the line of sight. If no graphic is intersected then this property is `null`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight-LineOfSightTarget.html#intersectedGraphic)
    */
  val intersectedGraphic: Graphic = js.native
  /**
    * A [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) representing the location where the line of sight first intersects the ground or 3D objects in the scene. If the target is visible this property is `null`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight-LineOfSightTarget.html#intersectedLocation)
    */
  val intersectedLocation: Point = js.native
  /**
    * A [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) representing the location of the target. Once the location is set, a new line of sight analysis will synchronously calculate the intersection and the visibility.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight-LineOfSightTarget.html#location)
    */
  var location: Point = js.native
  /**
    * Whether the target is visible from the observer or not.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight-LineOfSightTarget.html#visible)
    */
  val visible: Boolean = js.native
}

@JSGlobal("__esri.LineOfSightTarget")
@js.native
object LineOfSightTarget extends TopLevel[LineOfSightTargetConstructor]

