package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawProperties extends js.Object {
  /**
    * A reference to the active [draw action](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html). An instance of the draw action is created when [create()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-Draw.html#create) method is called.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-Draw.html#activeAction)
    */
  var activeAction: js.UndefOr[DrawActionProperties] = js.undefined
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). Set this to link the draw to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-Draw.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.undefined
}

object DrawProperties {
  @scala.inline
  def apply(activeAction: DrawActionProperties = null, view: MapViewProperties = null): DrawProperties = {
    val __obj = js.Dynamic.literal()
    if (activeAction != null) __obj.updateDynamic("activeAction")(activeAction.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawProperties]
  }
}

