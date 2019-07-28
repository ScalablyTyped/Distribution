package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolygonDrawActionProperties extends DrawActionProperties {
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
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-PolygonDrawAction.html#mode)
    *
    * @default hybrid
    */
  var mode: js.UndefOr[String] = js.undefined
}

object PolygonDrawActionProperties {
  @scala.inline
  def apply(mode: String = null, view: MapViewProperties = null): PolygonDrawActionProperties = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[PolygonDrawActionProperties]
  }
}

