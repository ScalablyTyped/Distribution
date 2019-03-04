package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlideVisibleLayers extends AnonymousAccessor {
  /**
    * The ID of a [layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#id) in the [WebScene](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#layers) or [Ground](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#layers) that is made `visible` in the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) when the slide is applied to the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#visibleLayers)
    */
  var id: java.lang.String
  /**
    * The service ids of the visible sublayers on the layer specified by the layer id. If this is not present, the visibilities of the sublayers are not changed when applying the slide.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#visibleLayers)
    */
  var sublayerIds: js.Array[scala.Double]
}

object SlideVisibleLayers {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    id: java.lang.String,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    sublayerIds: js.Array[scala.Double],
    get: js.Function1[/* propertyName */ java.lang.String, _] = null,
    set: (js.Function2[/* propertyName */ java.lang.String, /* value */ js.Any, SlideVisibleLayers]) with (js.Function1[/* props */ arcgisDashJsDashApiLib.HashMap[_], SlideVisibleLayers]) = null,
    watch: js.Function3[
      /* path */ java.lang.String | js.Array[java.lang.String], 
      /* callback */ WatchCallback, 
      /* sync */ js.UndefOr[scala.Boolean], 
      WatchHandle
    ] = null
  ): SlideVisibleLayers = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, id = id, propertyIsEnumerable = propertyIsEnumerable, sublayerIds = sublayerIds)
    if (get != null) __obj.updateDynamic("get")(get)
    if (set != null) __obj.updateDynamic("set")(set)
    if (watch != null) __obj.updateDynamic("watch")(watch)
    __obj.asInstanceOf[SlideVisibleLayers]
  }
}

