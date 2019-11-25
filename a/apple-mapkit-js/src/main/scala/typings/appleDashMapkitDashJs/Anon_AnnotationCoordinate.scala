package typings.appleDashMapkitDashJs

import typings.appleDashMapkitDashJs.mapkit.Annotation
import typings.appleDashMapkitDashJs.mapkit.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnnotationCoordinate extends js.Object {
  var annotation: Annotation
  var coordinate: Coordinate
}

object Anon_AnnotationCoordinate {
  @scala.inline
  def apply(annotation: Annotation, coordinate: Coordinate): Anon_AnnotationCoordinate = {
    val __obj = js.Dynamic.literal(annotation = annotation.asInstanceOf[js.Any], coordinate = coordinate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AnnotationCoordinate]
  }
}

