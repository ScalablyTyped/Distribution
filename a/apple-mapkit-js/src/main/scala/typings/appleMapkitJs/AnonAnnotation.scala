package typings.appleMapkitJs

import typings.appleMapkitJs.mapkit.Annotation
import typings.appleMapkitJs.mapkit.Overlay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnnotation extends js.Object {
  var annotation: js.UndefOr[Annotation] = js.undefined
  var overlay: js.UndefOr[Overlay] = js.undefined
}

object AnonAnnotation {
  @scala.inline
  def apply(annotation: Annotation = null, overlay: Overlay = null): AnonAnnotation = {
    val __obj = js.Dynamic.literal()
    if (annotation != null) __obj.updateDynamic("annotation")(annotation.asInstanceOf[js.Any])
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnnotation]
  }
}

