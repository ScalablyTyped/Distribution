package typings.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An overlay made up of one or more points, forming a closed shape.
  */
@js.native
trait PolygonOverlay extends Overlay {
  /**
    * One or more arrays of coordinates that define the polygon overlay shape.
    */
  var points: js.Array[Coordinate] = js.native
}

