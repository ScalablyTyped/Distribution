package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * map/scene on screen. The ArcGIS API for JavaScript offers a low-level interface to access the SceneView's WebGL context, and thus enables creating custom visualizations that interact with the scene the same way as built-in layers. Developers can either write WebGL code directly, or integrate with third-party WebGL libraries.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html)
  */
@js.native
trait externalRenderers extends js.Object {
  /**
    * Adds an external renderer to the view. The external renderer is defined by an object that contains certain methods and properties, as defined by [ExternalRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#ExternalRenderer).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#add)
    *
    * @param view The view to which to attach the external renderer.
    * @param renderer The external renderer.
    *
    */
  def add(view: SceneView, renderer: ExternalRenderer): Unit = js.native
  /**
    * Transforms positions from the internal rendering coordinate system to the output spatial reference. The allowable output spatial reference is limited and depends on the [viewingMode](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#viewingMode):
    *   * In `global` mode, it can either be Web Mercator or WGS84.
    *   * In `local` mode, it has to match [view.spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#spatialReference), and the call to this function simply copies the coordinates from `srcCoordinates` to `destCoordinates`.
    *
    *
    * If these conditions are not met, nothing is written to `destCoordinates` and the function returns `null`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#fromRenderCoordinates)
    *
    * @param view The view related to the input coordinates.
    * @param srcCoordinates A linear array of one or more vectors that are interpreted as XYZ coordinates. For example, two position vectors would be represented as `[x1, y1, z1, x2, y2, z2]`. This must contain at least `srcStart + 3 * count` elements.
    * @param srcStart An index in `srcCoordinates` from which the coordinates will start being read.
    * @param destCoordinates A reference to an array in which the results will be written.
    * @param destStart An index in `destCoordinates` in which the coordinates will start to be written.
    * @param destSpatialReference The spatial reference of the output coordinates. When `null`, `view.spatialReference` is used instead.
    * @param count The number of vertices to be transformed.
    *
    */
  def fromRenderCoordinates(
    view: SceneView,
    srcCoordinates: js.Array[Double],
    srcStart: Double,
    destCoordinates: js.Array[Double],
    destStart: Double,
    destSpatialReference: SpatialReference,
    count: Double
  ): js.Array[Double] | Float32Array = js.native
  def fromRenderCoordinates(
    view: SceneView,
    srcCoordinates: js.Array[Double],
    srcStart: Double,
    destCoordinates: Float32Array,
    destStart: Double,
    destSpatialReference: SpatialReference,
    count: Double
  ): js.Array[Double] | Float32Array = js.native
  def fromRenderCoordinates(
    view: SceneView,
    srcCoordinates: Float32Array,
    srcStart: Double,
    destCoordinates: js.Array[Double],
    destStart: Double,
    destSpatialReference: SpatialReference,
    count: Double
  ): js.Array[Double] | Float32Array = js.native
  def fromRenderCoordinates(
    view: SceneView,
    srcCoordinates: Float32Array,
    srcStart: Double,
    destCoordinates: Float32Array,
    destStart: Double,
    destSpatialReference: SpatialReference,
    count: Double
  ): js.Array[Double] | Float32Array = js.native
  /**
    * Removes an external renderer from the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#remove)
    *
    * @param view The view from which to remove the external renderer.
    * @param renderer The external renderer.
    *
    */
  def remove(view: SceneView, renderer: ExternalRenderer): Unit = js.native
  /**
    * Computes a 4x4 affine transformation matrix that constitutes a linear coordinate transformation from a local Cartesian coordinate system to the virtual world coordinate system. For example, this matrix can be used to transform the vertices of a 3D model to the rendering coordinate system.  The local Cartesian system is defined by its origin and the following axis definition:
    *   * X: Easting
    *   * Y: Northing
    *   * Z: Elevation
    *
    *
    * ![externalRenderers-renderCoordinateTransformAt](https://developers.arcgis.com/javascript/assets/img/apiref/views/3d/externalRenderers-renderCoordinateTransformAt.png)  When [view.viewingMode](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#viewingMode) is `global`, a linear transformation does not take the curvature of the globe or other non-linear projection aspects into account. Thus, the resulting coordinates will only appear correct within a small region around the origin of the local Cartesian system.  The allowable spatial reference of `origin` depends on the [viewingMode](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#viewingMode):
    *   * In `global` mode, it can either be Web Mercator or WGS84.
    *   * In `local` mode, it has to match [view.spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#spatialReference).
    *
    *
    * If these conditions are not met, nothing will be written to `dest` and the function will return `null`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#renderCoordinateTransformAt)
    *
    * @param view The view for which the transformation will be used.
    * @param origin The global coordinates of the origin in the local Cartesian coordinate system.
    * @param srcSpatialReference The spatial reference of the origin coordinates. If undefined, `view.spatialReference` is used instead.
    * @param dest A reference to an array where the 16 matrix elements will be stored. The resulting matrix follows OpenGL conventions where the translation components occupy the 13th, 14th and 15th elements. If undefined, a newly created matrix returned.
    *
    */
  def renderCoordinateTransformAt(view: SceneView, origin: js.Array[Double]): js.Array[Double] | Float32Array = js.native
  def renderCoordinateTransformAt(view: SceneView, origin: js.Array[Double], srcSpatialReference: SpatialReference): js.Array[Double] | Float32Array = js.native
  def renderCoordinateTransformAt(
    view: SceneView,
    origin: js.Array[Double],
    srcSpatialReference: SpatialReference,
    dest: js.Array[Double]
  ): js.Array[Double] | Float32Array = js.native
  def renderCoordinateTransformAt(
    view: SceneView,
    origin: js.Array[Double],
    srcSpatialReference: SpatialReference,
    dest: Float32Array
  ): js.Array[Double] | Float32Array = js.native
  def renderCoordinateTransformAt(view: SceneView, origin: Float32Array): js.Array[Double] | Float32Array = js.native
  def renderCoordinateTransformAt(view: SceneView, origin: Float32Array, srcSpatialReference: SpatialReference): js.Array[Double] | Float32Array = js.native
  def renderCoordinateTransformAt(
    view: SceneView,
    origin: Float32Array,
    srcSpatialReference: SpatialReference,
    dest: js.Array[Double]
  ): js.Array[Double] | Float32Array = js.native
  def renderCoordinateTransformAt(view: SceneView, origin: Float32Array, srcSpatialReference: SpatialReference, dest: Float32Array): js.Array[Double] | Float32Array = js.native
  /**
    * Requests the view to be redrawn.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#requestRender)
    *
    * @param view The view to which the external renderer is attached.
    *
    */
  def requestRender(view: SceneView): Unit = js.native
  /**
    * Transforms positions from the given spatial reference to the internal rendering coordinate system. The allowable input spatial reference is limited and depends on the [viewingMode](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#viewingMode):
    *   * In `global` mode, it can either be Web Mercator or WGS84.
    *   * In `local` mode, it has to match [view.spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#spatialReference); the call to this function simply copies the coordinates from `srcCoordinates` to `destCoordinates`.
    *
    *
    * If these conditions are not met, nothing is written to `destCoordinates` and the function returns `null`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#toRenderCoordinates)
    *
    * @param view The view in which the coordinates will be used.
    * @param srcCoordinates A linear array of one or more vectors which are interpreted as XYZ coordinates. For example, two position vectors would be represented as `[x1, y1, z1, x2, y2, z2]`. This must contain at least `srcStart + 3 * count` elements.
    * @param srcStart An index in `srcCoordinates` from which the coordinates start to be read.
    * @param srcSpatialReference The spatial reference of the input coordinates. When `null`, `view.spatialReference` is used instead.
    * @param destCoordinates A reference to an array where the results will be written.
    * @param destStart An index in `destCoordinates` to which the coordinates will start to be written.
    * @param count The number of vertices to be transformed.
    *
    */
  def toRenderCoordinates(
    view: SceneView,
    srcCoordinates: js.Array[Double],
    srcStart: Double,
    srcSpatialReference: SpatialReference,
    destCoordinates: js.Array[Double],
    destStart: Double,
    count: Double
  ): js.Array[Double] | Float32Array = js.native
  def toRenderCoordinates(
    view: SceneView,
    srcCoordinates: js.Array[Double],
    srcStart: Double,
    srcSpatialReference: SpatialReference,
    destCoordinates: Float32Array,
    destStart: Double,
    count: Double
  ): js.Array[Double] | Float32Array = js.native
  def toRenderCoordinates(
    view: SceneView,
    srcCoordinates: Float32Array,
    srcStart: Double,
    srcSpatialReference: SpatialReference,
    destCoordinates: js.Array[Double],
    destStart: Double,
    count: Double
  ): js.Array[Double] | Float32Array = js.native
  def toRenderCoordinates(
    view: SceneView,
    srcCoordinates: Float32Array,
    srcStart: Double,
    srcSpatialReference: SpatialReference,
    destCoordinates: Float32Array,
    destStart: Double,
    count: Double
  ): js.Array[Double] | Float32Array = js.native
}

