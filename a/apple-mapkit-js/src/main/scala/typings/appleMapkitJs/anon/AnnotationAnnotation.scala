package typings.appleMapkitJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotationAnnotation extends js.Object {
  var annotation: typings.appleMapkitJs.mapkit.Annotation = js.native
}

object AnnotationAnnotation {
  @scala.inline
  def apply(annotation: typings.appleMapkitJs.mapkit.Annotation): AnnotationAnnotation = {
    val __obj = js.Dynamic.literal(annotation = annotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationAnnotation]
  }
  @scala.inline
  implicit class AnnotationAnnotationOps[Self <: AnnotationAnnotation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnnotation(value: typings.appleMapkitJs.mapkit.Annotation): Self = this.set("annotation", value.asInstanceOf[js.Any])
  }
  
}

