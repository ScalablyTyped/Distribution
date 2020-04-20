package typings.appleMapkitJs

import typings.appleMapkitJs.mapkit.Annotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnnotationAnnotation extends js.Object {
  var annotation: Annotation
}

object AnonAnnotationAnnotation {
  @scala.inline
  def apply(annotation: Annotation): AnonAnnotationAnnotation = {
    val __obj = js.Dynamic.literal(annotation = annotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnnotationAnnotation]
  }
}

