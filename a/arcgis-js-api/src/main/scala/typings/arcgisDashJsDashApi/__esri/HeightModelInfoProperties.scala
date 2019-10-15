package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`150-kilometers`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`50-kilometers`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`benoit-1895-b-chains`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`clarke-feet`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`clarke-links`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`clarke-yards`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`gold-coast-feet`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`indian-1937-yards`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`indian-yards`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`sears-1922-truncated-chains`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`sears-chains`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`sears-feet`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`sears-yards`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`us-feet`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.feet
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.meters
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
  var heightModel: js.UndefOr[String] = js.undefined
  /**
    * The unit of the vertical coordinate system. A [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) will use this property to check that the vertical data of layers that define a HeightModelInfo is compatible with the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-HeightModelInfo.html#heightUnit)
    *
    * @default "meters"
    */
  var heightUnit: js.UndefOr[
    meters | feet | `us-feet` | `clarke-feet` | `clarke-yards` | `clarke-links` | `sears-yards` | `sears-feet` | `sears-chains` | `benoit-1895-b-chains` | `indian-yards` | `indian-1937-yards` | `gold-coast-feet` | `sears-1922-truncated-chains` | `50-kilometers` | `150-kilometers`
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
    heightModel: String = null,
    heightUnit: meters | feet | `us-feet` | `clarke-feet` | `clarke-yards` | `clarke-links` | `sears-yards` | `sears-feet` | `sears-chains` | `benoit-1895-b-chains` | `indian-yards` | `indian-1937-yards` | `gold-coast-feet` | `sears-1922-truncated-chains` | `50-kilometers` | `150-kilometers` = null,
    vertCRS: String = null
  ): HeightModelInfoProperties = {
    val __obj = js.Dynamic.literal()
    if (heightModel != null) __obj.updateDynamic("heightModel")(heightModel)
    if (heightUnit != null) __obj.updateDynamic("heightUnit")(heightUnit.asInstanceOf[js.Any])
    if (vertCRS != null) __obj.updateDynamic("vertCRS")(vertCRS)
    __obj.asInstanceOf[HeightModelInfoProperties]
  }
}

