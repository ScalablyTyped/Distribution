package typings.appleDashMapkitDashJs

import typings.appleDashMapkitDashJs.mapkitNs.Annotation
import typings.appleDashMapkitDashJs.mapkitNs.Overlay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Annotation extends js.Object {
  var annotation: js.UndefOr[Annotation] = js.undefined
  var overlay: js.UndefOr[Overlay] = js.undefined
}

object Anon_Annotation {
  @scala.inline
  def apply(annotation: Annotation = null, overlay: Overlay = null): Anon_Annotation = {
    val __obj = js.Dynamic.literal()
    if (annotation != null) __obj.updateDynamic("annotation")(annotation)
    if (overlay != null) __obj.updateDynamic("overlay")(overlay)
    __obj.asInstanceOf[Anon_Annotation]
  }
}

