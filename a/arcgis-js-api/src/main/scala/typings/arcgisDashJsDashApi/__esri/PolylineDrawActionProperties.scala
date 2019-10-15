package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.click
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.freehand
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.hybrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolylineDrawActionProperties extends DrawActionProperties {
  /**
    * The drawing mode. It is only relevant when the action is first created. Its value cannot be changed during the action lifecycle.  **Possible Values:**
    *
    * Value | Description |
    * ----- | ----------- |
    * hybrid | Vertices are added while the pointer is clicked or dragged.
    * freehand | Vertices are added while the pointer is dragged.
    * click | Vertices are added when the pointer is clicked.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-PolylineDrawAction.html#mode)
    *
    * @default hybrid
    */
  var mode: js.UndefOr[hybrid | freehand | click] = js.undefined
}

object PolylineDrawActionProperties {
  @scala.inline
  def apply(mode: hybrid | freehand | click = null, view: MapViewProperties = null): PolylineDrawActionProperties = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[PolylineDrawActionProperties]
  }
}

