package typings.arcgisJsApi.esri

import typings.arcgisJsApi.HashMap
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlideVisibleLayers extends AnonymousAccessor {
  /**
    * The ID of a [layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#id) in the [WebScene](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#layers) or [Ground](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#layers) that is made `visible` in the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) when the slide is applied to the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#visibleLayers)
    */
  var id: String = js.native
  /**
    * The service ids of the visible sublayers on the layer specified by the layer id. If this is not present, the visibilities of the sublayers are not changed when applying the slide.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#visibleLayers)
    */
  var sublayerIds: js.Array[Double] = js.native
}

object SlideVisibleLayers {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    id: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    set: (js.UndefOr[js.Function2[/* propertyName */ String, /* value */ js.Any, SlideVisibleLayers]]) with (js.UndefOr[js.Function1[/* props */ HashMap[_], SlideVisibleLayers]]),
    sublayerIds: js.Array[Double]
  ): SlideVisibleLayers = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), id = id.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), set = set.asInstanceOf[js.Any], sublayerIds = sublayerIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideVisibleLayers]
  }
  @scala.inline
  implicit class SlideVisibleLayersOps[Self <: SlideVisibleLayers] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setSublayerIdsVarargs(value: Double*): Self = this.set("sublayerIds", js.Array(value :_*))
    @scala.inline
    def setSublayerIds(value: js.Array[Double]): Self = this.set("sublayerIds", value.asInstanceOf[js.Any])
  }
  
}

