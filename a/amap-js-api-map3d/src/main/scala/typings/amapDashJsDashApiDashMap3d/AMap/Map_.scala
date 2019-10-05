package typings.amapDashJsDashApiDashMap3d.AMap

import typings.amapDashJsDashApi.AMap.Layer
import typings.amapDashJsDashApi.AMap.Pixel
import typings.amapDashJsDashApiDashMap3d.AMap.Map.Object3DResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("Map")
@js.native
trait Map_ extends js.Object {
  var AmbientLight: js.UndefOr[typings.amapDashJsDashApiDashMap3d.AMap.Lights.AmbientLight] = js.native
  var DirectionLight: js.UndefOr[typings.amapDashJsDashApiDashMap3d.AMap.Lights.DirectionLight] = js.native
  def getObject3DByContainerPos(pixel: Pixel): Object3DResult | Null = js.native
  def getObject3DByContainerPos(pixel: Pixel, layers: js.Array[Layer]): Object3DResult | Null = js.native
  def getObject3DByContainerPos(pixel: Pixel, layers: js.Array[Layer], all: Boolean): Object3DResult | Null = js.native
}

