package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`150-kilometers`
import typings.arcgisJsApi.arcgisJsApiStrings.`50-kilometers`
import typings.arcgisJsApi.arcgisJsApiStrings.`benoit-1895-b-chains`
import typings.arcgisJsApi.arcgisJsApiStrings.`clarke-feet`
import typings.arcgisJsApi.arcgisJsApiStrings.`clarke-links`
import typings.arcgisJsApi.arcgisJsApiStrings.`clarke-yards`
import typings.arcgisJsApi.arcgisJsApiStrings.`gold-coast-feet`
import typings.arcgisJsApi.arcgisJsApiStrings.`gravity-related-height`
import typings.arcgisJsApi.arcgisJsApiStrings.`indian-1937-yards`
import typings.arcgisJsApi.arcgisJsApiStrings.`indian-yards`
import typings.arcgisJsApi.arcgisJsApiStrings.`sears-1922-truncated-chains`
import typings.arcgisJsApi.arcgisJsApiStrings.`sears-chains`
import typings.arcgisJsApi.arcgisJsApiStrings.`sears-feet`
import typings.arcgisJsApi.arcgisJsApiStrings.`sears-yards`
import typings.arcgisJsApi.arcgisJsApiStrings.`us-feet`
import typings.arcgisJsApi.arcgisJsApiStrings.ellipsoidal
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
import typings.arcgisJsApi.arcgisJsApiStrings.meters_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeightModelInfoProperties extends js.Object {
  /**
    * The surface type or height model of the vertical coordinate system (VCS). A [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) will only render layers containing data that is compatible with the HeightModelInfo of the scene.
    *
    * Value | Description
    * ------|------------
    * gravity-related-height | A gravity-related VCS may set its zero point through a local mean sea level or a benchmark, and is compatible with other gravity-related VCS for the purposes of rendering.
    * ellipsoidal | An ellipsoidal VCS defines heights that are referenced to an ellipsoid of a geographic coordinate system.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-HeightModelInfo.html#heightModel)
    *
    * @default "gravity-related-height"
    */
  var heightModel: js.UndefOr[`gravity-related-height` | ellipsoidal] = js.undefined
  /**
    * The unit of the vertical coordinate system. A [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) will use this property to check that the vertical data of layers that define a HeightModelInfo is compatible with the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-HeightModelInfo.html#heightUnit)
    *
    * @default "meters"
    */
  var heightUnit: js.UndefOr[
    meters_ | feet_ | `us-feet` | `clarke-feet` | `clarke-yards` | `clarke-links` | `sears-yards` | `sears-feet` | `sears-chains` | `benoit-1895-b-chains` | `indian-yards` | `indian-1937-yards` | `gold-coast-feet` | `sears-1922-truncated-chains` | `50-kilometers` | `150-kilometers`
  ] = js.undefined
  /**
    * The datum realization of the vertical coordinate system. A [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) will only render layers that define a HeightModelInfo with an identical `vertCRS` to that of the scene, when using an `ellipsoidal` height model.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-HeightModelInfo.html#vertCRS)
    */
  var vertCRS: js.UndefOr[String] = js.undefined
}

object HeightModelInfoProperties {
  @scala.inline
  def apply(
    heightModel: `gravity-related-height` | ellipsoidal = null,
    heightUnit: meters_ | feet_ | `us-feet` | `clarke-feet` | `clarke-yards` | `clarke-links` | `sears-yards` | `sears-feet` | `sears-chains` | `benoit-1895-b-chains` | `indian-yards` | `indian-1937-yards` | `gold-coast-feet` | `sears-1922-truncated-chains` | `50-kilometers` | `150-kilometers` = null,
    vertCRS: String = null
  ): HeightModelInfoProperties = {
    val __obj = js.Dynamic.literal()
    if (heightModel != null) __obj.updateDynamic("heightModel")(heightModel.asInstanceOf[js.Any])
    if (heightUnit != null) __obj.updateDynamic("heightUnit")(heightUnit.asInstanceOf[js.Any])
    if (vertCRS != null) __obj.updateDynamic("vertCRS")(vertCRS.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeightModelInfoProperties]
  }
}

