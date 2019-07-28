package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.ArrayLike
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderCamera extends Object {
  /**
    * The camera target ("look at") position in the internal Cartesian rendering coordinate system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderCamera)
    */
  var center: ArrayLike[Double]
  /**
    * The position of the camera in the internal Cartesian rendering coordinate system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderCamera)
    */
  var eye: ArrayLike[Double]
  /**
    * The distance to the far plane.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderCamera)
    */
  var far: Double
  /**
    * The horizontal field of view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderCamera)
    */
  var fovX: Double
  /**
    * The vertical field of view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderCamera)
    */
  var fovY: Double
  /**
    * The distance to the near plane.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderCamera)
    */
  var near: Double
  /**
    * A 4x4 matrix that defines the perspective projection transformation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderCamera)
    */
  var projectionMatrix: ArrayLike[Double]
  /**
    * The camera up vector.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderCamera)
    */
  var up: ArrayLike[Double]
  /**
    * The inverse transpose of `viewMatrix`, used to transform normals from world space to camera space.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderCamera)
    */
  var viewInverseTransposeMatrix: ArrayLike[Double]
  /**
    * A 4x4 matrix that transforms coordinates from world space to camera space.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderCamera)
    */
  var viewMatrix: ArrayLike[Double]
}

object RenderCamera {
  @scala.inline
  def apply(
    center: ArrayLike[Double],
    constructor: js.Function,
    eye: ArrayLike[Double],
    far: Double,
    fovX: Double,
    fovY: Double,
    hasOwnProperty: PropertyKey => Boolean,
    near: Double,
    projectionMatrix: ArrayLike[Double],
    propertyIsEnumerable: PropertyKey => Boolean,
    up: ArrayLike[Double],
    viewInverseTransposeMatrix: ArrayLike[Double],
    viewMatrix: ArrayLike[Double]
  ): RenderCamera = {
    val __obj = js.Dynamic.literal(center = center, constructor = constructor, eye = eye, far = far, fovX = fovX, fovY = fovY, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), near = near, projectionMatrix = projectionMatrix, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), up = up, viewInverseTransposeMatrix = viewInverseTransposeMatrix, viewMatrix = viewMatrix)
  
    __obj.asInstanceOf[RenderCamera]
  }
}

