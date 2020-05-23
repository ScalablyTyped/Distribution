package typings.amapJsSdk.anon

import typings.amapJsSdk.AMap.LngLat
import typings.amapJsSdk.amapJsSdkStrings.EPSG3395
import typings.amapJsSdk.amapJsSdkStrings.EPSG3857
import typings.amapJsSdk.amapJsSdkStrings.EPSG4326
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Center extends js.Object {
  var center: js.UndefOr[LngLat] = js.undefined
  var crs: js.UndefOr[EPSG3857 | EPSG3395 | EPSG4326] = js.undefined
  var rotation: js.UndefOr[Double] = js.undefined
  var zoom: js.UndefOr[Double] = js.undefined
}

object Center {
  @scala.inline
  def apply(
    center: LngLat = null,
    crs: EPSG3857 | EPSG3395 | EPSG4326 = null,
    rotation: js.UndefOr[Double] = js.undefined,
    zoom: js.UndefOr[Double] = js.undefined
  ): Center = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (crs != null) __obj.updateDynamic("crs")(crs.asInstanceOf[js.Any])
    if (!js.isUndefined(rotation)) __obj.updateDynamic("rotation")(rotation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoom)) __obj.updateDynamic("zoom")(zoom.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Center]
  }
}

