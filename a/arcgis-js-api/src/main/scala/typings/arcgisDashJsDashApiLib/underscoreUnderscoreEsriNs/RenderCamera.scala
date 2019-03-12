package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderCamera
  extends stdLib.Object {
  /**
    * The camera target ("look at") position in the internal Cartesian rendering coordinate system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderCamera)
    */
  var center: stdLib.ArrayLike[scala.Double]
  /**
    * The position of the camera in the internal Cartesian rendering coordinate system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderCamera)
    */
  var eye: stdLib.ArrayLike[scala.Double]
  /**
    * The distance to the far plane.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderCamera)
    */
  var far: scala.Double
  /**
    * The horizontal field of view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderCamera)
    */
  var fovX: scala.Double
  /**
    * The vertical field of view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderCamera)
    */
  var fovY: scala.Double
  /**
    * The distance to the near plane.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderCamera)
    */
  var near: scala.Double
  /**
    * A 4x4 matrix that defines the perspective projection transformation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderCamera)
    */
  var projectionMatrix: stdLib.ArrayLike[scala.Double]
  /**
    * The camera up vector.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderCamera)
    */
  var up: stdLib.ArrayLike[scala.Double]
  /**
    * The inverse transpose of `viewMatrix`, used to transform normals from world space to camera space.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderCamera)
    */
  var viewInverseTransposeMatrix: stdLib.ArrayLike[scala.Double]
  /**
    * A 4x4 matrix that transforms coordinates from world space to camera space.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderCamera)
    */
  var viewMatrix: stdLib.ArrayLike[scala.Double]
}

object RenderCamera {
  @scala.inline
  def apply(
    center: stdLib.ArrayLike[scala.Double],
    constructor: js.Function,
    eye: stdLib.ArrayLike[scala.Double],
    far: scala.Double,
    fovX: scala.Double,
    fovY: scala.Double,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    near: scala.Double,
    projectionMatrix: stdLib.ArrayLike[scala.Double],
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    up: stdLib.ArrayLike[scala.Double],
    viewInverseTransposeMatrix: stdLib.ArrayLike[scala.Double],
    viewMatrix: stdLib.ArrayLike[scala.Double]
  ): RenderCamera = {
    val __obj = js.Dynamic.literal(center = center, constructor = constructor, eye = eye, far = far, fovX = fovX, fovY = fovY, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), near = near, projectionMatrix = projectionMatrix, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), up = up, viewInverseTransposeMatrix = viewInverseTransposeMatrix, viewMatrix = viewMatrix)
  
    __obj.asInstanceOf[RenderCamera]
  }
}

