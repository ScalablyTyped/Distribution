package typings.appleMapkitJs.anon

import typings.appleMapkitJs.mapkit.Overlay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Annotation extends js.Object {
  var annotation: js.UndefOr[typings.appleMapkitJs.mapkit.Annotation] = js.native
  var overlay: js.UndefOr[Overlay] = js.native
}

object Annotation {
  @scala.inline
  def apply(): Annotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Annotation]
  }
  @scala.inline
  implicit class AnnotationOps[Self <: Annotation] (val x: Self) extends AnyVal {
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
    @scala.inline
    def deleteAnnotation: Self = this.set("annotation", js.undefined)
    @scala.inline
    def setOverlay(value: Overlay): Self = this.set("overlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlay: Self = this.set("overlay", js.undefined)
  }
  
}

