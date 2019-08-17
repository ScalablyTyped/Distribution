package typings.amapDashJsDashApiDashMap3d.AMapNs

import typings.amapDashJsDashApi.AMapNs.Layer
import typings.amapDashJsDashApi.AMapNs.Pixel
import typings.amapDashJsDashApiDashMap3d.AMapNs.MapNs.Object3DResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Map extends js.Object {
  var AmbientLight: js.UndefOr[typings.amapDashJsDashApiDashMap3d.AMapNs.LightsNs.AmbientLight] = js.native
  var DirectionLight: js.UndefOr[typings.amapDashJsDashApiDashMap3d.AMapNs.LightsNs.DirectionLight] = js.native
  def getObject3DByContainerPos(pixel: Pixel): Object3DResult | Null = js.native
  def getObject3DByContainerPos(pixel: Pixel, layers: js.Array[Layer]): Object3DResult | Null = js.native
  def getObject3DByContainerPos(pixel: Pixel, layers: js.Array[Layer], all: Boolean): Object3DResult | Null = js.native
}

