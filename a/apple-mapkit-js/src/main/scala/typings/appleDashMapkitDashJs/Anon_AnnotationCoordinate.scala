package typings.appleDashMapkitDashJs

import typings.appleDashMapkitDashJs.mapkitNs.Annotation
import typings.appleDashMapkitDashJs.mapkitNs.Coordinate
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
    val __obj = js.Dynamic.literal(annotation = annotation, coordinate = coordinate)
  
    __obj.asInstanceOf[Anon_AnnotationCoordinate]
  }
}

