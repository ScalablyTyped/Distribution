package typings.appleMapkitJs

import typings.appleMapkitJs.mapkit.Annotation
import typings.appleMapkitJs.mapkit.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnnotationCoordinate extends js.Object {
  var annotation: Annotation
  var coordinate: Coordinate
}

object AnonAnnotationCoordinate {
  @scala.inline
  def apply(annotation: Annotation, coordinate: Coordinate): AnonAnnotationCoordinate = {
    val __obj = js.Dynamic.literal(annotation = annotation.asInstanceOf[js.Any], coordinate = coordinate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAnnotationCoordinate]
  }
}

