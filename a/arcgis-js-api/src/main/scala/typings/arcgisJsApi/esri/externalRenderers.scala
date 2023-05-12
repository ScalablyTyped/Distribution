package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * map/scene on screen.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html)
  */
@js.native
trait externalRenderers extends StObject {
  
  /**
    * Adds an external renderer to the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#add)
    */
  def add(view: SceneView, renderer: ExternalRenderer): scala.Unit = js.native
  
  /**
    * Requests the SceneView to use a specific WebGL version for rendering.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#forceWebGLContext)
    */
  def forceWebGLContext(version: Double): scala.Unit = js.native
  
  /**
    * Transforms positions from the internal rendering coordinate system to the output spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#fromRenderCoordinates)
    */
  def fromRenderCoordinates(
    view: SceneView,
    srcCoordinates: js.Array[Double],
    srcStart: Double,
    destCoordinates: js.Array[Double],
    destStart: Double,
    destSpatialReference: SpatialReference,
    count: Double
  ): js.Array[Double] | js.typedarray.Float32Array = js.native
  def fromRenderCoordinates(
    view: SceneView,
    srcCoordinates: js.Array[Double],
    srcStart: Double,
    destCoordinates: js.typedarray.Float32Array,
    destStart: Double,
    destSpatialReference: SpatialReference,
    count: Double
  ): js.Array[Double] | js.typedarray.Float32Array = js.native
  def fromRenderCoordinates(
    view: SceneView,
    srcCoordinates: js.typedarray.Float32Array,
    srcStart: Double,
    destCoordinates: js.Array[Double],
    destStart: Double,
    destSpatialReference: SpatialReference,
    count: Double
  ): js.Array[Double] | js.typedarray.Float32Array = js.native
  def fromRenderCoordinates(
    view: SceneView,
    srcCoordinates: js.typedarray.Float32Array,
    srcStart: Double,
    destCoordinates: js.typedarray.Float32Array,
    destStart: Double,
    destSpatialReference: SpatialReference,
    count: Double
  ): js.Array[Double] | js.typedarray.Float32Array = js.native
  
  /**
    * Get the render representation of the current camera of a view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#getRenderCamera)
    */
  def getRenderCamera(view: SceneView): RenderCamera = js.native
  
  /**
    * Removes an external renderer from the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#remove)
    */
  def remove(view: SceneView, renderer: ExternalRenderer): scala.Unit = js.native
  
  /**
    * Computes a 4x4 affine transformation matrix that constitutes a linear coordinate transformation from a local Cartesian coordinate system to the virtual world coordinate system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#renderCoordinateTransformAt)
    */
  def renderCoordinateTransformAt(view: SceneView, origin: js.Array[Double]): js.Array[Double] | js.typedarray.Float32Array = js.native
  def renderCoordinateTransformAt(view: SceneView, origin: js.Array[Double], srcSpatialReference: scala.Unit, dest: js.Array[Double]): js.Array[Double] | js.typedarray.Float32Array = js.native
  def renderCoordinateTransformAt(
    view: SceneView,
    origin: js.Array[Double],
    srcSpatialReference: scala.Unit,
    dest: js.typedarray.Float32Array
  ): js.Array[Double] | js.typedarray.Float32Array = js.native
  def renderCoordinateTransformAt(view: SceneView, origin: js.Array[Double], srcSpatialReference: SpatialReference): js.Array[Double] | js.typedarray.Float32Array = js.native
  def renderCoordinateTransformAt(
    view: SceneView,
    origin: js.Array[Double],
    srcSpatialReference: SpatialReference,
    dest: js.Array[Double]
  ): js.Array[Double] | js.typedarray.Float32Array = js.native
  def renderCoordinateTransformAt(
    view: SceneView,
    origin: js.Array[Double],
    srcSpatialReference: SpatialReference,
    dest: js.typedarray.Float32Array
  ): js.Array[Double] | js.typedarray.Float32Array = js.native
  def renderCoordinateTransformAt(view: SceneView, origin: js.typedarray.Float32Array): js.Array[Double] | js.typedarray.Float32Array = js.native
  def renderCoordinateTransformAt(
    view: SceneView,
    origin: js.typedarray.Float32Array,
    srcSpatialReference: scala.Unit,
    dest: js.Array[Double]
  ): js.Array[Double] | js.typedarray.Float32Array = js.native
  def renderCoordinateTransformAt(
    view: SceneView,
    origin: js.typedarray.Float32Array,
    srcSpatialReference: scala.Unit,
    dest: js.typedarray.Float32Array
  ): js.Array[Double] | js.typedarray.Float32Array = js.native
  def renderCoordinateTransformAt(view: SceneView, origin: js.typedarray.Float32Array, srcSpatialReference: SpatialReference): js.Array[Double] | js.typedarray.Float32Array = js.native
  def renderCoordinateTransformAt(
    view: SceneView,
    origin: js.typedarray.Float32Array,
    srcSpatialReference: SpatialReference,
    dest: js.Array[Double]
  ): js.Array[Double] | js.typedarray.Float32Array = js.native
  def renderCoordinateTransformAt(
    view: SceneView,
    origin: js.typedarray.Float32Array,
    srcSpatialReference: SpatialReference,
    dest: js.typedarray.Float32Array
  ): js.Array[Double] | js.typedarray.Float32Array = js.native
  
  /**
    * Requests the view to be redrawn.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#requestRender)
    */
  def requestRender(view: SceneView): scala.Unit = js.native
  
  /**
    * Transforms positions from the given spatial reference to the internal rendering coordinate system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#toRenderCoordinates)
    */
  def toRenderCoordinates(
    view: SceneView,
    srcCoordinates: js.Array[Double],
    srcStart: Double,
    srcSpatialReference: SpatialReference,
    destCoordinates: js.Array[Double],
    destStart: Double,
    count: Double
  ): js.Array[Double] | js.typedarray.Float32Array = js.native
  def toRenderCoordinates(
    view: SceneView,
    srcCoordinates: js.Array[Double],
    srcStart: Double,
    srcSpatialReference: SpatialReference,
    destCoordinates: js.typedarray.Float32Array,
    destStart: Double,
    count: Double
  ): js.Array[Double] | js.typedarray.Float32Array = js.native
  def toRenderCoordinates(
    view: SceneView,
    srcCoordinates: js.typedarray.Float32Array,
    srcStart: Double,
    srcSpatialReference: SpatialReference,
    destCoordinates: js.Array[Double],
    destStart: Double,
    count: Double
  ): js.Array[Double] | js.typedarray.Float32Array = js.native
  def toRenderCoordinates(
    view: SceneView,
    srcCoordinates: js.typedarray.Float32Array,
    srcStart: Double,
    srcSpatialReference: SpatialReference,
    destCoordinates: js.typedarray.Float32Array,
    destStart: Double,
    count: Double
  ): js.Array[Double] | js.typedarray.Float32Array = js.native
}
