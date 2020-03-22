package typings.appleMapkitJs

import typings.appleMapkitJs.mapkit.Annotation
import typings.appleMapkitJs.mapkit.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCoordinate extends js.Object {
  var annotation: Annotation
  var coordinate: Coordinate
}

object AnonCoordinate {
  @scala.inline
  def apply(annotation: Annotation, coordinate: Coordinate): AnonCoordinate = {
    val __obj = js.Dynamic.literal(annotation = annotation.asInstanceOf[js.Any], coordinate = coordinate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCoordinate]
  }
}

