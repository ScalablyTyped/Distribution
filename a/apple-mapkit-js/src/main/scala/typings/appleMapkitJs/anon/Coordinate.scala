package typings.appleMapkitJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Coordinate extends js.Object {
  var annotation: typings.appleMapkitJs.mapkit.Annotation
  var coordinate: typings.appleMapkitJs.mapkit.Coordinate
}

object Coordinate {
  @scala.inline
  def apply(
    annotation: typings.appleMapkitJs.mapkit.Annotation,
    coordinate: typings.appleMapkitJs.mapkit.Coordinate
  ): Coordinate = {
    val __obj = js.Dynamic.literal(annotation = annotation.asInstanceOf[js.Any], coordinate = coordinate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coordinate]
  }
}

