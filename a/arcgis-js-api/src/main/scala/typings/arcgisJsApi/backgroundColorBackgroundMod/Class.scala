package typings.arcgisJsApi.backgroundColorBackgroundMod

import typings.arcgisJsApi.esri.backgroundColorBackground
import typings.arcgisJsApi.esri.backgroundColorBackgroundProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/webscene/background/ColorBackground", JSImport.Namespace)
@js.native
/**
  * This type of [Background](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-background-Background.html) allows to set a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) as the background of a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). The view environment stars and atmosphere will show on top of the background when enabled. To have a clear background color only, make sure to set both the [view.environment.starsEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment) and [view.environment.atmosphereEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment) properties to `false`.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-background-ColorBackground.html)
  */
class Class () extends backgroundColorBackground {
  def this(properties: backgroundColorBackgroundProperties) = this()
}

