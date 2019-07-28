package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraProperties extends js.Object {
  /**
    * The field of view of the camera in degrees.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#fov)
    *
    * @default 55
    */
  var fov: js.UndefOr[Double] = js.undefined
  /**
    * The compass heading of the camera in degrees. Heading is zero when north is the top of the screen. It increases as the view rotates clockwise. The angles are always normalized between 0 and 360 degrees.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#heading)
    *
    * @default 0
    */
  var heading: js.UndefOr[Double] = js.undefined
  /**
    * The position of the camera defined by a map point.
    * > **Z-values** defined in a geographic or metric coordinate system are expressed in meters. However, in local scenes that use a projected coordinate system, vertical units are assumed to be the same as the horizontal units specified by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#position)
    */
  var position: js.UndefOr[PointProperties] = js.undefined
  /**
    * The tilt of the camera in degrees with respect to the surface as projected down from the camera position. Tilt is zero when looking straight down at the surface and 90 degrees when the camera is looking parallel to the surface.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#tilt)
    *
    * @default 0
    */
  var tilt: js.UndefOr[Double] = js.undefined
}

object CameraProperties {
  @scala.inline
  def apply(
    fov: Int | Double = null,
    heading: Int | Double = null,
    position: PointProperties = null,
    tilt: Int | Double = null
  ): CameraProperties = {
    val __obj = js.Dynamic.literal()
    if (fov != null) __obj.updateDynamic("fov")(fov.asInstanceOf[js.Any])
    if (heading != null) __obj.updateDynamic("heading")(heading.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    if (tilt != null) __obj.updateDynamic("tilt")(tilt.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraProperties]
  }
}

