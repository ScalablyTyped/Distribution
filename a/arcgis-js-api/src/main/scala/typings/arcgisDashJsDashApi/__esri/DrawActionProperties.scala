package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawActionProperties extends js.Object {
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.undefined
}

object DrawActionProperties {
  @scala.inline
  def apply(view: MapViewProperties = null): DrawActionProperties = {
    val __obj = js.Dynamic.literal()
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawActionProperties]
  }
}

