package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentDrawActionProperties extends DrawActionProperties {
  /**
    * The drawing mode. It is only relevant when the action is first created. Its value cannot be changed during the action lifecycle.  **Possible Values:**
    *
    * Value | Description |
    * ----- | ----------- |
    * freehand | Vertices are added while the pointer is dragged.
    * click | Vertices are added when the pointer is clicked. SegmentDrawActions are created from 2 vertices.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-SegmentDrawAction.html#mode)
    *
    * @default freehand
    */
  var mode: js.UndefOr[String] = js.undefined
}

object SegmentDrawActionProperties {
  @scala.inline
  def apply(mode: String = null, view: MapViewProperties = null): SegmentDrawActionProperties = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[SegmentDrawActionProperties]
  }
}

