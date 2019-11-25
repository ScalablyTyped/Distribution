package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewpointProperties extends js.Object {
  /**
    * The viewpoint camera (3D only).
    * > **Z-values** defined in a geographic or metric coordinate system are expressed in meters. However, in local scenes that use a projected coordinate system, vertical units are assumed to be the same as the horizontal units specified by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html#camera)
    */
  var camera: js.UndefOr[CameraProperties] = js.undefined
  /**
    * The rotation of due north in relation to the top of the view in degrees.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html#rotation)
    *
    * @default 0
    */
  var rotation: js.UndefOr[Double] = js.undefined
  /**
    * The scale of the viewpoint.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html#scale)
    */
  var scale: js.UndefOr[Double] = js.undefined
  /**
    * The target geometry framed by the viewpoint.
    * > **Z-values** defined in a geographic or metric coordinate system are expressed in meters. However, in local scenes that use a projected coordinate system, vertical units are assumed to be the same as the horizontal units specified by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html#targetGeometry)
    */
  var targetGeometry: js.UndefOr[GeometryProperties] = js.undefined
}

object ViewpointProperties {
  @scala.inline
  def apply(
    camera: CameraProperties = null,
    rotation: Int | Double = null,
    scale: Int | Double = null,
    targetGeometry: GeometryProperties = null
  ): ViewpointProperties = {
    val __obj = js.Dynamic.literal()
    if (camera != null) __obj.updateDynamic("camera")(camera.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (targetGeometry != null) __obj.updateDynamic("targetGeometry")(targetGeometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewpointProperties]
  }
}

