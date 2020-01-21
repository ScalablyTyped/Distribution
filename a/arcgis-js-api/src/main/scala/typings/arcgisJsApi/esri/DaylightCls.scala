package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.Daylight")
@js.native
/**
  * The daylight widget can be used to manipulate the time and date and to toggle shadows in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). When changing the time and date, the position of the sun and the stars gets updated accordingly, changing the lighting and the shadows in the scene. This widget modifies the `date` and `directShadowsEnabled` properties of [SceneView.environment.lighting](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html)
  */
class DaylightCls () extends Daylight {
  def this(properties: DaylightProperties) = this()
}

