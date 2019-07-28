package typings.aframe.aframeMod

import typings.std.ArrayLike
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.ImageData
import typings.std.Iterable
import typings.std.WebGLRenderingContext
import typings.three.srcConstantsMod.CompressedPixelFormat
import typings.three.srcConstantsMod.Mapping
import typings.three.srcConstantsMod.PixelFormat
import typings.three.srcConstantsMod.TextureDataType
import typings.three.srcConstantsMod.TextureEncoding
import typings.three.srcConstantsMod.TextureFilter
import typings.three.srcConstantsMod.Wrapping
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcExtrasCoreCurveMod.Curve
import typings.three.srcMaterialsMeshPhysicalMaterialMod.MeshPhysicalMaterialParameters
import typings.three.srcMathVector2Mod.Vector
import typings.three.srcPolyfillsMod.TypedArray
import typings.three.srcRenderersWebGLRendererMod.WebGLRendererParameters
import typings.three.srcRenderersWebglWebGLCapabilitiesMod.WebGLCapabilitiesParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aframe", "THREE")
@js.native
object THREENs extends js.Object {
  @js.native
  /**
  	 * This creates a Ambientlight with a color.
  	 * @param color Numeric value of the RGB component of the color or a Color instance.
  	 */
  class AmbientLight ()
    extends typings.three.threeMod.AmbientLight
  
  @js.native
  class AmbientLightProbe ()
    extends typings.three.threeMod.AmbientLightProbe
  
  @js.native
  class AnimationAction ()
    extends typings.three.threeMod.AnimationAction
  
  @js.native
  class AnimationLoader ()
    extends typings.three.threeMod.AnimationLoader
  
  @js.native
  class AnimationMixer protected ()
    extends typings.three.threeMod.AnimationMixer {
    def this(root: js.Any) = this()
  }
  
  @js.native
  class AnimationObjectGroup protected ()
    extends typings.three.threeMod.AnimationObjectGroup {
    def this(args: js.Any*) = this()
  }
  
  @js.native
  class ArcCurve protected ()
    extends typings.three.threeMod.ArcCurve {
    def this(
      aX: Double,
      aY: Double,
      aRadius: Double,
      aStartAngle: Double,
      aEndAngle: Double,
      aClockwise: Boolean
    ) = this()
  }
  
  @js.native
  class ArrayCamera ()
    extends typings.three.threeMod.ArrayCamera
  
  @js.native
  class ArrowHelper protected ()
    extends typings.three.threeMod.ArrowHelper {
    def this(dir: typings.three.srcMathVector3Mod.Vector3) = this()
  }
  
  @js.native
  class Audio protected ()
    extends typings.three.threeMod.Audio {
    def this(listener: typings.three.srcAudioAudioListenerMod.AudioListener) = this()
  }
  
  @js.native
  class AudioAnalyser protected ()
    extends typings.three.threeMod.AudioAnalyser {
    def this(audio: js.Any, fftSize: Double) = this()
  }
  
  @js.native
  class AudioBuffer protected ()
    extends typings.three.threeMod.AudioBuffer {
    def this(context: js.Any) = this()
  }
  
  @js.native
  class AudioListener ()
    extends typings.three.threeMod.AudioListener
  
  @js.native
  class AudioLoader ()
    extends typings.three.threeMod.AudioLoader
  
  @js.native
  class AxesHelper ()
    extends typings.three.threeMod.AxesHelper
  
  @js.native
  class Bone ()
    extends typings.three.threeMod.Bone
  
  @js.native
  class BooleanKeyframeTrack protected ()
    extends typings.three.threeMod.BooleanKeyframeTrack {
    def this(name: String, times: js.Array[_], values: js.Array[_]) = this()
  }
  
  @js.native
  class Box2 ()
    extends typings.three.threeMod.Box2
  
  @js.native
  class Box3 ()
    extends typings.three.threeMod.Box3
  
  @js.native
  class Box3Helper protected ()
    extends typings.three.threeMod.Box3Helper {
    def this(box: typings.three.srcMathBox3Mod.Box3) = this()
  }
  
  @js.native
  class BoxBufferGeometry protected ()
    extends typings.three.threeMod.BoxBufferGeometry {
    def this(
      width: js.UndefOr[Double],
      height: js.UndefOr[Double],
      depth: js.UndefOr[Double],
      widthSegments: js.UndefOr[Double],
      heightSegments: js.UndefOr[Double],
      depthSegments: js.UndefOr[Double]
    ) = this()
  }
  
  @js.native
  class BoxGeometry protected ()
    extends typings.three.threeMod.BoxGeometry {
    /**
    	 * @param width — Width of the sides on the X axis.
    	 * @param height — Height of the sides on the Y axis.
    	 * @param depth — Depth of the sides on the Z axis.
    	 * @param widthSegments — Number of segmented faces along the width of the sides.
    	 * @param heightSegments — Number of segmented faces along the height of the sides.
    	 * @param depthSegments — Number of segmented faces along the depth of the sides.
    	 */
    def this(
      width: js.UndefOr[Double],
      height: js.UndefOr[Double],
      depth: js.UndefOr[Double],
      widthSegments: js.UndefOr[Double],
      heightSegments: js.UndefOr[Double],
      depthSegments: js.UndefOr[Double]
    ) = this()
  }
  
  @js.native
  class BoxHelper protected ()
    extends typings.three.threeMod.BoxHelper {
    def this(`object`: Object3D) = this()
  }
  
  @js.native
  class BufferAttribute protected ()
    extends typings.three.threeMod.BufferAttribute {
    def this(array: ArrayLike[Double], itemSize: Double) = this()
  }
  
  @js.native
  class BufferGeometryLoader ()
    extends typings.three.threeMod.BufferGeometryLoader
  
  @js.native
  /**
  	 * This constructor sets following properties to the correct type: matrixWorldInverse, projectionMatrix and projectionMatrixInverse.
  	 */
  class Camera ()
    extends typings.three.threeMod.Camera
  
  @js.native
  class CameraHelper protected ()
    extends typings.three.threeMod.CameraHelper {
    def this(camera: typings.three.srcCamerasCameraMod.Camera) = this()
  }
  
  @js.native
  class CanvasTexture protected ()
    extends typings.three.threeMod.CanvasTexture {
    def this(
      canvas: HTMLImageElement,
      mapping: js.UndefOr[Mapping],
      wrapS: js.UndefOr[Wrapping],
      wrapT: js.UndefOr[Wrapping],
      magFilter: js.UndefOr[TextureFilter],
      minFilter: js.UndefOr[TextureFilter],
      format: js.UndefOr[PixelFormat],
      `type`: js.UndefOr[TextureDataType],
      anisotropy: js.UndefOr[Double]
    ) = this()
  }
  
  @js.native
  class CatmullRomCurve3 ()
    extends typings.three.threeMod.CatmullRomCurve3
  
  @js.native
  class CircleBufferGeometry ()
    extends typings.three.threeMod.CircleBufferGeometry
  
  @js.native
  class CircleGeometry ()
    extends typings.three.threeMod.CircleGeometry
  
  @js.native
  /**
  	 * @param autoStart Automatically start the clock.
  	 */
  class Clock ()
    extends typings.three.threeMod.Clock
  
  @js.native
  class Color ()
    extends typings.three.threeMod.Color
  
  @js.native
  class ColorKeyframeTrack protected ()
    extends typings.three.threeMod.ColorKeyframeTrack {
    def this(name: String, times: js.Array[_], values: js.Array[_]) = this()
  }
  
  @js.native
  class CompressedTexture protected ()
    extends typings.three.threeMod.CompressedTexture {
    def this(
      mipmaps: js.Array[ImageData],
      width: Double,
      height: Double,
      format: js.UndefOr[CompressedPixelFormat],
      `type`: js.UndefOr[TextureDataType],
      mapping: js.UndefOr[Mapping],
      wrapS: js.UndefOr[Wrapping],
      wrapT: js.UndefOr[Wrapping],
      magFilter: js.UndefOr[TextureFilter],
      minFilter: js.UndefOr[TextureFilter],
      anisotropy: js.UndefOr[Double],
      encoding: js.UndefOr[TextureEncoding]
    ) = this()
  }
  
  @js.native
  class CompressedTextureLoader ()
    extends typings.three.threeMod.CompressedTextureLoader
  
  @js.native
  class ConeBufferGeometry protected ()
    extends typings.three.threeMod.ConeBufferGeometry {
    def this(
      radius: js.UndefOr[Double],
      height: js.UndefOr[Double],
      radialSegment: js.UndefOr[Double],
      heightSegment: js.UndefOr[Double],
      openEnded: js.UndefOr[Boolean],
      thetaStart: js.UndefOr[Double],
      thetaLength: js.UndefOr[Double]
    ) = this()
  }
  
  @js.native
  class ConeGeometry protected ()
    extends typings.three.threeMod.ConeGeometry {
    def this(
      radius: js.UndefOr[Double],
      height: js.UndefOr[Double],
      radialSegment: js.UndefOr[Double],
      heightSegment: js.UndefOr[Double],
      openEnded: js.UndefOr[Boolean],
      thetaStart: js.UndefOr[Double],
      thetaLength: js.UndefOr[Double]
    ) = this()
  }
  
  @js.native
  class CubeCamera ()
    extends typings.three.threeMod.CubeCamera
  
  @js.native
  class CubeTexture protected ()
    extends typings.three.threeMod.CubeTexture {
    def this(
       // HTMLImageElement or HTMLCanvasElement
    images: js.UndefOr[js.Array[_]],
      mapping: js.UndefOr[Mapping],
      wrapS: js.UndefOr[Wrapping],
      wrapT: js.UndefOr[Wrapping],
      magFilter: js.UndefOr[TextureFilter],
      minFilter: js.UndefOr[TextureFilter],
      format: js.UndefOr[PixelFormat],
      `type`: js.UndefOr[TextureDataType],
      anisotropy: js.UndefOr[Double],
      encoding: js.UndefOr[TextureEncoding]
    ) = this()
  }
  
  @js.native
  class CubeTextureLoader ()
    extends typings.three.threeMod.CubeTextureLoader
  
  @js.native
  class CubicBezierCurve protected ()
    extends typings.three.threeMod.CubicBezierCurve {
    def this(
      v0: typings.three.srcMathVector2Mod.Vector2,
      v1: typings.three.srcMathVector2Mod.Vector2,
      v2: typings.three.srcMathVector2Mod.Vector2,
      v3: typings.three.srcMathVector2Mod.Vector2
    ) = this()
  }
  
  @js.native
  class CubicBezierCurve3 protected ()
    extends typings.three.threeMod.CubicBezierCurve3 {
    def this(
      v0: typings.three.srcMathVector3Mod.Vector3,
      v1: typings.three.srcMathVector3Mod.Vector3,
      v2: typings.three.srcMathVector3Mod.Vector3,
      v3: typings.three.srcMathVector3Mod.Vector3
    ) = this()
  }
  
  @js.native
  class CubicInterpolant protected ()
    extends typings.three.threeMod.CubicInterpolant {
    def this(parameterPositions: js.Any, samplesValues: js.Any, sampleSize: Double) = this()
  }
  
  @js.native
  class CurvePath[T /* <: Vector */] ()
    extends typings.three.threeMod.CurvePath[T]
  
  @js.native
  class CylinderBufferGeometry protected ()
    extends typings.three.threeMod.CylinderBufferGeometry {
    def this(
      radiusTop: js.UndefOr[Double],
      radiusBottom: js.UndefOr[Double],
      height: js.UndefOr[Double],
      radialSegments: js.UndefOr[Double],
      heightSegments: js.UndefOr[Double],
      openEnded: js.UndefOr[Boolean],
      thetaStart: js.UndefOr[Double],
      thetaLength: js.UndefOr[Double]
    ) = this()
  }
  
  @js.native
  class CylinderGeometry protected ()
    extends typings.three.threeMod.CylinderGeometry {
    /**
    	 * @param radiusTop — Radius of the cylinder at the top.
    	 * @param radiusBottom — Radius of the cylinder at the bottom.
    	 * @param height — Height of the cylinder.
    	 * @param radiusSegments — Number of segmented faces around the circumference of the cylinder.
    	 * @param heightSegments — Number of rows of faces along the height of the cylinder.
    	 * @param openEnded - A Boolean indicating whether or not to cap the ends of the cylinder.
    	 */
    def this(
      radiusTop: js.UndefOr[Double],
      radiusBottom: js.UndefOr[Double],
      height: js.UndefOr[Double],
      radiusSegments: js.UndefOr[Double],
      heightSegments: js.UndefOr[Double],
      openEnded: js.UndefOr[Boolean],
      thetaStart: js.UndefOr[Double],
      thetaLength: js.UndefOr[Double]
    ) = this()
  }
  
  @js.native
  class Cylindrical ()
    extends typings.three.threeMod.Cylindrical
  
  @js.native
  class DataTexture protected ()
    extends typings.three.threeMod.DataTexture {
    def this(
      data: TypedArray,
      width: Double,
      height: Double,
      format: js.UndefOr[PixelFormat],
      `type`: js.UndefOr[TextureDataType],
      mapping: js.UndefOr[Mapping],
      wrapS: js.UndefOr[Wrapping],
      wrapT: js.UndefOr[Wrapping],
      magFilter: js.UndefOr[TextureFilter],
      minFilter: js.UndefOr[TextureFilter],
      anisotropy: js.UndefOr[Double],
      encoding: js.UndefOr[TextureEncoding]
    ) = this()
  }
  
  @js.native
  class DataTexture3D protected ()
    extends typings.three.threeMod.DataTexture3D {
    def this(data: TypedArray, width: Double, height: Double, depth: Double) = this()
  }
  
  @js.native
  class DataTextureLoader ()
    extends typings.three.threeMod.DataTextureLoader
  
  @js.native
  class DepthTexture protected ()
    extends typings.three.threeMod.DepthTexture {
    def this(
      width: Double,
      heighht: Double,
      `type`: js.UndefOr[TextureDataType],
      mapping: js.UndefOr[Mapping],
      wrapS: js.UndefOr[Wrapping],
      wrapT: js.UndefOr[Wrapping],
      magFilter: js.UndefOr[TextureFilter],
      minFilter: js.UndefOr[TextureFilter],
      anisotropy: js.UndefOr[Double]
    ) = this()
  }
  
  @js.native
  class DirectGeometry ()
    extends typings.three.threeMod.DirectGeometry
  
  @js.native
  class DirectionalLight ()
    extends typings.three.threeMod.DirectionalLight
  
  @js.native
  class DirectionalLightHelper protected ()
    extends typings.three.threeMod.DirectionalLightHelper {
    def this(light: typings.three.srcLightsDirectionalLightMod.DirectionalLight) = this()
  }
  
  @js.native
  class DirectionalLightShadow ()
    extends typings.three.threeMod.DirectionalLightShadow
  
  @js.native
  class DiscreteInterpolant protected ()
    extends typings.three.threeMod.DiscreteInterpolant {
    def this(parameterPositions: js.Any, samplesValues: js.Any, sampleSize: Double) = this()
  }
  
  @js.native
  class DodecahedronBufferGeometry ()
    extends typings.three.threeMod.DodecahedronBufferGeometry
  
  @js.native
  class DodecahedronGeometry ()
    extends typings.three.threeMod.DodecahedronGeometry
  
  @js.native
  class EdgesGeometry protected ()
    extends typings.three.threeMod.EdgesGeometry {
    def this(geometry: BufferGeometry) = this()
  }
  
  @js.native
  class EllipseCurve protected ()
    extends typings.three.threeMod.EllipseCurve {
    def this(
      aX: Double,
      aY: Double,
      xRadius: Double,
      yRadius: Double,
      aStartAngle: Double,
      aEndAngle: Double,
      aClockwise: Boolean,
      aRotation: Double
    ) = this()
  }
  
  @js.native
  /**
  	 * Creates eventDispatcher object. It needs to be call with '.call' to add the functionality to an object.
  	 */
  class EventDispatcher ()
    extends typings.three.threeMod.EventDispatcher
  
  @js.native
  class Face3 protected ()
    extends typings.three.threeMod.Face3 {
    /**
    	 * @param a Vertex A index.
    	 * @param b Vertex B index.
    	 * @param c Vertex C index.
    	 * @param normal Face normal or array of vertex normals.
    	 * @param color Face color or array of vertex colors.
    	 * @param materialIndex Material index.
    	 */
    def this(a: Double, b: Double, c: Double) = this()
  }
  
  @js.native
  class FaceNormalsHelper protected ()
    extends typings.three.threeMod.FaceNormalsHelper {
    def this(`object`: Object3D) = this()
  }
  
  @js.native
  class FileLoader ()
    extends typings.three.threeMod.FileLoader
  
  @js.native
  class Float32Attribute protected ()
    extends typings.three.threeMod.Float32Attribute {
    def this(array: js.Any, itemSize: Double) = this()
  }
  
  @js.native
  class Float32BufferAttribute protected ()
    extends typings.three.threeMod.Float32BufferAttribute {
    def this(array: Iterable[Double], itemSize: Double) = this()
  }
  
  @js.native
  class Float64Attribute protected ()
    extends typings.three.threeMod.Float64Attribute {
    def this(array: js.Any, itemSize: Double) = this()
  }
  
  @js.native
  class Float64BufferAttribute protected ()
    extends typings.three.threeMod.Float64BufferAttribute {
    def this(array: Iterable[Double], itemSize: Double) = this()
  }
  
  @js.native
  class Fog protected ()
    extends typings.three.threeMod.Fog {
    def this(hex: Double) = this()
  }
  
  @js.native
  class FogExp2 protected ()
    extends typings.three.threeMod.FogExp2 {
    def this(hex: Double) = this()
  }
  
  @js.native
  class Font protected ()
    extends typings.three.threeMod.Font {
    def this(jsondata: js.Any) = this()
  }
  
  @js.native
  class FontLoader ()
    extends typings.three.threeMod.FontLoader
  
  @js.native
  class Frustum protected ()
    extends typings.three.threeMod.Frustum {
    def this(
      p0: js.UndefOr[typings.three.srcMathPlaneMod.Plane],
      p1: js.UndefOr[typings.three.srcMathPlaneMod.Plane],
      p2: js.UndefOr[typings.three.srcMathPlaneMod.Plane],
      p3: js.UndefOr[typings.three.srcMathPlaneMod.Plane],
      p4: js.UndefOr[typings.three.srcMathPlaneMod.Plane],
      p5: js.UndefOr[typings.three.srcMathPlaneMod.Plane]
    ) = this()
  }
  
  @js.native
  class Geometry ()
    extends typings.three.threeMod.Geometry
  
  @js.native
  class GridHelper protected ()
    extends typings.three.threeMod.GridHelper {
    def this(size: Double, divisions: Double) = this()
  }
  
  @js.native
  class Group ()
    extends typings.three.threeMod.Group
  
  @js.native
  class HemisphereLight ()
    extends typings.three.threeMod.HemisphereLight
  
  @js.native
  class HemisphereLightHelper protected ()
    extends typings.three.threeMod.HemisphereLightHelper {
    def this(light: typings.three.srcLightsHemisphereLightMod.HemisphereLight, size: Double) = this()
  }
  
  @js.native
  class HemisphereLightProbe ()
    extends typings.three.threeMod.HemisphereLightProbe
  
  @js.native
  class IcosahedronBufferGeometry ()
    extends typings.three.threeMod.IcosahedronBufferGeometry
  
  @js.native
  class IcosahedronGeometry ()
    extends typings.three.threeMod.IcosahedronGeometry
  
  @js.native
  class ImageBitmapLoader ()
    extends typings.three.threeMod.ImageBitmapLoader
  
  @js.native
  class ImageLoader ()
    extends typings.three.threeMod.ImageLoader
  
  @js.native
  class ImmediateRenderObject protected ()
    extends typings.three.threeMod.ImmediateRenderObject {
    def this(material: typings.three.srcMaterialsMaterialMod.Material) = this()
  }
  
  @js.native
  class InstancedBufferAttribute protected ()
    extends typings.three.threeMod.InstancedBufferAttribute {
    def this(array: ArrayLike[Double], itemSize: Double) = this()
  }
  
  @js.native
  class InstancedBufferGeometry ()
    extends typings.three.threeMod.InstancedBufferGeometry
  
  @js.native
  class InstancedInterleavedBuffer protected ()
    extends typings.three.threeMod.InstancedInterleavedBuffer {
    def this(array: ArrayLike[Double], stride: Double) = this()
  }
  
  @js.native
  class Int16Attribute protected ()
    extends typings.three.threeMod.Int16Attribute {
    def this(array: js.Any, itemSize: Double) = this()
  }
  
  @js.native
  class Int16BufferAttribute protected ()
    extends typings.three.threeMod.Int16BufferAttribute {
    def this(array: Iterable[Double], itemSize: Double) = this()
  }
  
  @js.native
  class Int32Attribute protected ()
    extends typings.three.threeMod.Int32Attribute {
    def this(array: js.Any, itemSize: Double) = this()
  }
  
  @js.native
  class Int32BufferAttribute protected ()
    extends typings.three.threeMod.Int32BufferAttribute {
    def this(array: Iterable[Double], itemSize: Double) = this()
  }
  
  @js.native
  class Int8Attribute protected ()
    extends typings.three.threeMod.Int8Attribute {
    def this(array: js.Any, itemSize: Double) = this()
  }
  
  @js.native
  class Int8BufferAttribute protected ()
    extends typings.three.threeMod.Int8BufferAttribute {
    def this(array: Iterable[Double], itemSize: Double) = this()
  }
  
  @js.native
  class InterleavedBuffer protected ()
    extends typings.three.threeMod.InterleavedBuffer {
    def this(array: ArrayLike[Double], stride: Double) = this()
  }
  
  @js.native
  class InterleavedBufferAttribute protected ()
    extends typings.three.threeMod.InterleavedBufferAttribute {
    def this(
      interleavedBuffer: typings.three.srcCoreInterleavedBufferMod.InterleavedBuffer,
      itemSize: Double,
      offset: Double
    ) = this()
  }
  
  @js.native
  class Interpolant protected ()
    extends typings.three.threeMod.Interpolant {
    def this(parameterPositions: js.Any, samplesValues: js.Any, sampleSize: Double) = this()
  }
  
  @js.native
  class JSONLoader ()
    extends typings.three.threeMod.JSONLoader
  
  @js.native
  class LOD ()
    extends typings.three.threeMod.LOD
  
  @js.native
  class LatheBufferGeometry protected ()
    extends typings.three.threeMod.LatheBufferGeometry {
    def this(points: js.Array[typings.three.srcMathVector2Mod.Vector2]) = this()
  }
  
  @js.native
  class LatheGeometry protected ()
    extends typings.three.threeMod.LatheGeometry {
    def this(points: js.Array[typings.three.srcMathVector2Mod.Vector2]) = this()
  }
  
  @js.native
  class Layers ()
    extends typings.three.threeMod.Layers
  
  @js.native
  class Light ()
    extends typings.three.threeMod.Light
  
  @js.native
  class LightProbe ()
    extends typings.three.threeMod.LightProbe
  
  @js.native
  class LightShadow protected ()
    extends typings.three.threeMod.LightShadow {
    def this(camera: typings.three.srcCamerasCameraMod.Camera) = this()
  }
  
  @js.native
  class Line ()
    extends typings.three.threeMod.Line
  
  @js.native
  class Line3 ()
    extends typings.three.threeMod.Line3
  
  @js.native
  class LineBasicMaterial ()
    extends typings.three.threeMod.LineBasicMaterial
  
  @js.native
  class LineCurve protected ()
    extends typings.three.threeMod.LineCurve {
    def this(v1: typings.three.srcMathVector2Mod.Vector2, v2: typings.three.srcMathVector2Mod.Vector2) = this()
  }
  
  @js.native
  class LineCurve3 protected ()
    extends typings.three.threeMod.LineCurve3 {
    def this(v1: typings.three.srcMathVector3Mod.Vector3, v2: typings.three.srcMathVector3Mod.Vector3) = this()
  }
  
  @js.native
  class LineDashedMaterial ()
    extends typings.three.threeMod.LineDashedMaterial
  
  @js.native
  class LineLoop ()
    extends typings.three.threeMod.LineLoop
  
  @js.native
  class LineSegments ()
    extends typings.three.threeMod.LineSegments
  
  @js.native
  class LinearInterpolant protected ()
    extends typings.three.threeMod.LinearInterpolant {
    def this(parameterPositions: js.Any, samplesValues: js.Any, sampleSize: Double) = this()
  }
  
  @js.native
  class LoadingManager ()
    extends typings.three.threeMod.LoadingManager
  
  @js.native
  class Material ()
    extends typings.three.threeMod.Material
  
  @js.native
  class MaterialLoader ()
    extends typings.three.threeMod.MaterialLoader
  
  @js.native
  /**
  	 * Creates an identity matrix.
  	 */
  class Matrix3 ()
    extends typings.three.threeMod.Matrix3
  
  @js.native
  class Matrix4 ()
    extends typings.three.threeMod.Matrix4
  
  @js.native
  class Mesh ()
    extends typings.three.threeMod.Mesh
  
  @js.native
  class MeshBasicMaterial ()
    extends typings.three.threeMod.MeshBasicMaterial
  
  @js.native
  class MeshDepthMaterial ()
    extends typings.three.threeMod.MeshDepthMaterial
  
  @js.native
  class MeshDistanceMaterial ()
    extends typings.three.threeMod.MeshDistanceMaterial
  
  @js.native
  class MeshLambertMaterial ()
    extends typings.three.threeMod.MeshLambertMaterial
  
  @js.native
  class MeshMatcapMaterial ()
    extends typings.three.threeMod.MeshMatcapMaterial
  
  @js.native
  class MeshNormalMaterial ()
    extends typings.three.threeMod.MeshNormalMaterial
  
  @js.native
  class MeshPhongMaterial ()
    extends typings.three.threeMod.MeshPhongMaterial
  
  @js.native
  class MeshPhysicalMaterial protected ()
    extends typings.three.threeMod.MeshPhysicalMaterial {
    def this(parameters: MeshPhysicalMaterialParameters) = this()
  }
  
  @js.native
  class MeshStandardMaterial ()
    extends typings.three.threeMod.MeshStandardMaterial
  
  @js.native
  class MeshToonMaterial ()
    extends typings.three.threeMod.MeshToonMaterial
  
  @js.native
  class MultiMaterial ()
    extends typings.three.threeMod.MultiMaterial
  
  @js.native
  class NumberKeyframeTrack protected ()
    extends typings.three.threeMod.NumberKeyframeTrack {
    def this(name: String, times: js.Array[_], values: js.Array[_]) = this()
  }
  
  @js.native
  class ObjectLoader ()
    extends typings.three.threeMod.ObjectLoader
  
  @js.native
  class OctahedronBufferGeometry ()
    extends typings.three.threeMod.OctahedronBufferGeometry
  
  @js.native
  class OctahedronGeometry ()
    extends typings.three.threeMod.OctahedronGeometry
  
  @js.native
  class OrthographicCamera protected ()
    extends typings.three.threeMod.OrthographicCamera {
    /**
    	 * @param left Camera frustum left plane.
    	 * @param right Camera frustum right plane.
    	 * @param top Camera frustum top plane.
    	 * @param bottom Camera frustum bottom plane.
    	 * @param near Camera frustum near plane.
    	 * @param far Camera frustum far plane.
    	 */
    def this(left: Double, right: Double, top: Double, bottom: Double) = this()
  }
  
  @js.native
  class ParametricBufferGeometry protected ()
    extends typings.three.threeMod.ParametricBufferGeometry {
    def this(
      func: js.Function3[
            /* u */ Double, 
            /* v */ Double, 
            /* dest */ typings.three.srcMathVector3Mod.Vector3, 
            Unit
          ],
      slices: Double,
      stacks: Double
    ) = this()
  }
  
  @js.native
  class ParametricGeometry protected ()
    extends typings.three.threeMod.ParametricGeometry {
    def this(
      func: js.Function3[
            /* u */ Double, 
            /* v */ Double, 
            /* dest */ typings.three.srcMathVector3Mod.Vector3, 
            Unit
          ],
      slices: Double,
      stacks: Double
    ) = this()
  }
  
  @js.native
  class Path ()
    extends typings.three.threeMod.Path
  
  @js.native
  /**
  	 * @param fov Camera frustum vertical field of view. Default value is 50.
  	 * @param aspect Camera frustum aspect ratio. Default value is 1.
  	 * @param near Camera frustum near plane. Default value is 0.1.
  	 * @param far Camera frustum far plane. Default value is 2000.
  	 */
  class PerspectiveCamera ()
    extends typings.three.threeMod.PerspectiveCamera
  
  @js.native
  class Plane ()
    extends typings.three.threeMod.Plane
  
  @js.native
  class PlaneBufferGeometry ()
    extends typings.three.threeMod.PlaneBufferGeometry
  
  @js.native
  class PlaneGeometry ()
    extends typings.three.threeMod.PlaneGeometry
  
  @js.native
  class PlaneHelper protected ()
    extends typings.three.threeMod.PlaneHelper {
    def this(plane: typings.three.srcMathPlaneMod.Plane) = this()
  }
  
  @js.native
  class PointLight ()
    extends typings.three.threeMod.PointLight
  
  @js.native
  class PointLightHelper protected ()
    extends typings.three.threeMod.PointLightHelper {
    def this(light: typings.three.srcLightsPointLightMod.PointLight) = this()
  }
  
  @js.native
  class PointLightShadow ()
    extends typings.three.threeMod.PointLightShadow
  
  @js.native
  /**
  	 * @param geometry An instance of Geometry or BufferGeometry.
  	 * @param material An instance of Material (optional).
  	 */
  class Points ()
    extends typings.three.threeMod.Points
  
  @js.native
  class PointsMaterial ()
    extends typings.three.threeMod.PointsMaterial
  
  @js.native
  class PolarGridHelper protected ()
    extends typings.three.threeMod.PolarGridHelper {
    def this(
      radius: Double,
      radials: Double,
      circles: Double,
      divisions: Double,
      color1: typings.three.srcMathColorMod.Color,
      color2: typings.three.srcMathColorMod.Color
    ) = this()
  }
  
  @js.native
  class PolyhedronBufferGeometry protected ()
    extends typings.three.threeMod.PolyhedronBufferGeometry {
    def this(vertices: js.Array[Double], indices: js.Array[Double]) = this()
  }
  
  @js.native
  class PolyhedronGeometry protected ()
    extends typings.three.threeMod.PolyhedronGeometry {
    def this(vertices: js.Array[Double], indices: js.Array[Double]) = this()
  }
  
  @js.native
  class PositionalAudio protected ()
    extends typings.three.threeMod.PositionalAudio {
    def this(listener: typings.three.srcAudioAudioListenerMod.AudioListener) = this()
  }
  
  @js.native
  class PositionalAudioHelper protected ()
    extends typings.three.threeMod.PositionalAudioHelper {
    def this(audio: typings.three.srcAudioPositionalAudioMod.PositionalAudio) = this()
  }
  
  @js.native
  class PropertyMixer protected ()
    extends typings.three.threeMod.PropertyMixer {
    def this(binding: js.Any, typeName: String, valueSize: Double) = this()
  }
  
  @js.native
  class QuadraticBezierCurve protected ()
    extends typings.three.threeMod.QuadraticBezierCurve {
    def this(
      v0: typings.three.srcMathVector2Mod.Vector2,
      v1: typings.three.srcMathVector2Mod.Vector2,
      v2: typings.three.srcMathVector2Mod.Vector2
    ) = this()
  }
  
  @js.native
  class QuadraticBezierCurve3 protected ()
    extends typings.three.threeMod.QuadraticBezierCurve3 {
    def this(
      v0: typings.three.srcMathVector3Mod.Vector3,
      v1: typings.three.srcMathVector3Mod.Vector3,
      v2: typings.three.srcMathVector3Mod.Vector3
    ) = this()
  }
  
  @js.native
  class QuaternionKeyframeTrack protected ()
    extends typings.three.threeMod.QuaternionKeyframeTrack {
    def this(name: String, times: js.Array[_], values: js.Array[_]) = this()
  }
  
  @js.native
  class QuaternionLinearInterpolant protected ()
    extends typings.three.threeMod.QuaternionLinearInterpolant {
    def this(parameterPositions: js.Any, samplesValues: js.Any, sampleSize: Double) = this()
  }
  
  @js.native
  class RawShaderMaterial ()
    extends typings.three.threeMod.RawShaderMaterial
  
  @js.native
  class Ray ()
    extends typings.three.threeMod.Ray
  
  @js.native
  /**
  	 * This creates a new raycaster object.
  	 * @param origin The origin vector where the ray casts from.
  	 * @param direction The direction vector that gives direction to the ray. Should be normalized.
  	 * @param near All results returned are further away than near. Near can't be negative. Default value is 0.
  	 * @param far All results returned are closer then far. Far can't be lower then near . Default value is Infinity.
  	 */
  class Raycaster ()
    extends typings.three.threeMod.Raycaster
  
  @js.native
  class RectAreaLight ()
    extends typings.three.threeMod.RectAreaLight
  
  @js.native
  class RectAreaLightHelper protected ()
    extends typings.three.threeMod.RectAreaLightHelper {
    def this(light: typings.three.srcLightsRectAreaLightMod.RectAreaLight) = this()
  }
  
  @js.native
  class RingBufferGeometry protected ()
    extends typings.three.threeMod.RingBufferGeometry {
    def this(
      innerRadius: js.UndefOr[Double],
      outerRadius: js.UndefOr[Double],
      thetaSegments: js.UndefOr[Double],
      phiSegments: js.UndefOr[Double],
      thetaStart: js.UndefOr[Double],
      thetaLength: js.UndefOr[Double]
    ) = this()
  }
  
  @js.native
  class RingGeometry protected ()
    extends typings.three.threeMod.RingGeometry {
    def this(
      innerRadius: js.UndefOr[Double],
      outerRadius: js.UndefOr[Double],
      thetaSegments: js.UndefOr[Double],
      phiSegments: js.UndefOr[Double],
      thetaStart: js.UndefOr[Double],
      thetaLength: js.UndefOr[Double]
    ) = this()
  }
  
  @js.native
  class Scene ()
    extends typings.three.threeMod.Scene
  
  @js.native
  class ShaderMaterial ()
    extends typings.three.threeMod.ShaderMaterial
  
  @js.native
  class ShadowMaterial ()
    extends typings.three.threeMod.ShadowMaterial
  
  @js.native
  class Shape ()
    extends typings.three.threeMod.Shape
  
  @js.native
  class ShapeBufferGeometry protected ()
    extends typings.three.threeMod.ShapeBufferGeometry {
    def this(shapes: typings.three.srcExtrasCoreShapeMod.Shape) = this()
  }
  
  @js.native
  class ShapeGeometry protected ()
    extends typings.three.threeMod.ShapeGeometry {
    def this(shapes: typings.three.srcExtrasCoreShapeMod.Shape) = this()
  }
  
  @js.native
  class ShapePath ()
    extends typings.three.threeMod.ShapePath
  
  @js.native
  class Skeleton protected ()
    extends typings.three.threeMod.Skeleton {
    def this(bones: js.Array[typings.three.srcObjectsBoneMod.Bone]) = this()
  }
  
  @js.native
  class SkeletonHelper protected ()
    extends typings.three.threeMod.SkeletonHelper {
    def this(bone: Object3D) = this()
  }
  
  @js.native
  class SkinnedMesh ()
    extends typings.three.threeMod.SkinnedMesh
  
  @js.native
  class Sphere ()
    extends typings.three.threeMod.Sphere
  
  @js.native
  class SphereBufferGeometry protected ()
    extends typings.three.threeMod.SphereBufferGeometry {
    def this(
      radius: js.UndefOr[Double],
      widthSegments: js.UndefOr[Double],
      heightSegments: js.UndefOr[Double],
      phiStart: js.UndefOr[Double],
      phiLength: js.UndefOr[Double],
      thetaStart: js.UndefOr[Double],
      thetaLength: js.UndefOr[Double]
    ) = this()
  }
  
  @js.native
  class SphereGeometry protected ()
    extends typings.three.threeMod.SphereGeometry {
    /**
    	 * The geometry is created by sweeping and calculating vertexes around the Y axis (horizontal sweep) and the Z axis (vertical sweep). Thus, incomplete spheres (akin to 'sphere slices') can be created through the use of different values of phiStart, phiLength, thetaStart and thetaLength, in order to define the points in which we start (or end) calculating those vertices.
    	 *
    	 * @param radius — sphere radius. Default is 50.
    	 * @param widthSegments — number of horizontal segments. Minimum value is 3, and the default is 8.
    	 * @param heightSegments — number of vertical segments. Minimum value is 2, and the default is 6.
    	 * @param phiStart — specify horizontal starting angle. Default is 0.
    	 * @param phiLength — specify horizontal sweep angle size. Default is Math.PI * 2.
    	 * @param thetaStart — specify vertical starting angle. Default is 0.
    	 * @param thetaLength — specify vertical sweep angle size. Default is Math.PI.
    	 */
    def this(
      radius: js.UndefOr[Double],
      widthSegments: js.UndefOr[Double],
      heightSegments: js.UndefOr[Double],
      phiStart: js.UndefOr[Double],
      phiLength: js.UndefOr[Double],
      thetaStart: js.UndefOr[Double],
      thetaLength: js.UndefOr[Double]
    ) = this()
  }
  
  @js.native
  class Spherical ()
    extends typings.three.threeMod.Spherical
  
  @js.native
  class SplineCurve ()
    extends typings.three.threeMod.SplineCurve
  
  @js.native
  class SpotLight protected ()
    extends typings.three.threeMod.SpotLight {
    def this(
      color: js.UndefOr[typings.three.srcMathColorMod.Color],
      intensity: js.UndefOr[Double],
      distance: js.UndefOr[Double],
      angle: js.UndefOr[Double],
      exponent: js.UndefOr[Double],
      decay: js.UndefOr[Double]
    ) = this()
  }
  
  @js.native
  class SpotLightHelper protected ()
    extends typings.three.threeMod.SpotLightHelper {
    def this(light: typings.three.srcLightsLightMod.Light) = this()
  }
  
  @js.native
  class SpotLightShadow ()
    extends typings.three.threeMod.SpotLightShadow
  
  @js.native
  class Sprite ()
    extends typings.three.threeMod.Sprite
  
  @js.native
  class SpriteMaterial ()
    extends typings.three.threeMod.SpriteMaterial
  
  @js.native
  class StereoCamera ()
    extends typings.three.threeMod.StereoCamera
  
  @js.native
  class StringKeyframeTrack protected ()
    extends typings.three.threeMod.StringKeyframeTrack {
    def this(name: String, times: js.Array[_], values: js.Array[_]) = this()
  }
  
  @js.native
  class TetrahedronBufferGeometry ()
    extends typings.three.threeMod.TetrahedronBufferGeometry
  
  @js.native
  class TetrahedronGeometry ()
    extends typings.three.threeMod.TetrahedronGeometry
  
  @js.native
  class TextBufferGeometry protected ()
    extends typings.three.threeMod.TextBufferGeometry {
    def this(text: String) = this()
  }
  
  @js.native
  class TextGeometry protected ()
    extends typings.three.threeMod.TextGeometry {
    def this(text: String) = this()
  }
  
  @js.native
  class TextureLoader ()
    extends typings.three.threeMod.TextureLoader
  
  @js.native
  class TorusBufferGeometry ()
    extends typings.three.threeMod.TorusBufferGeometry
  
  @js.native
  class TorusGeometry ()
    extends typings.three.threeMod.TorusGeometry
  
  @js.native
  class TorusKnotBufferGeometry protected ()
    extends typings.three.threeMod.TorusKnotBufferGeometry {
    def this(
      radius: js.UndefOr[Double],
      tube: js.UndefOr[Double],
      tubularSegments: js.UndefOr[Double],
      radialSegments: js.UndefOr[Double],
      p: js.UndefOr[Double],
      q: js.UndefOr[Double]
    ) = this()
  }
  
  @js.native
  class TorusKnotGeometry protected ()
    extends typings.three.threeMod.TorusKnotGeometry {
    def this(
      radius: js.UndefOr[Double],
      tube: js.UndefOr[Double],
      tubularSegments: js.UndefOr[Double],
      radialSegments: js.UndefOr[Double],
      p: js.UndefOr[Double],
      q: js.UndefOr[Double]
    ) = this()
  }
  
  @js.native
  class TubeBufferGeometry protected ()
    extends typings.three.threeMod.TubeBufferGeometry {
    def this(path: Curve[typings.three.srcMathVector3Mod.Vector3]) = this()
  }
  
  @js.native
  class TubeGeometry protected ()
    extends typings.three.threeMod.TubeGeometry {
    def this(path: Curve[typings.three.srcMathVector3Mod.Vector3]) = this()
  }
  
  @js.native
  class Uint16Attribute protected ()
    extends typings.three.threeMod.Uint16Attribute {
    def this(array: js.Any, itemSize: Double) = this()
  }
  
  @js.native
  class Uint16BufferAttribute protected ()
    extends typings.three.threeMod.Uint16BufferAttribute {
    def this(array: Iterable[Double], itemSize: Double) = this()
  }
  
  @js.native
  class Uint32Attribute protected ()
    extends typings.three.threeMod.Uint32Attribute {
    def this(array: js.Any, itemSize: Double) = this()
  }
  
  @js.native
  class Uint32BufferAttribute protected ()
    extends typings.three.threeMod.Uint32BufferAttribute {
    def this(array: Iterable[Double], itemSize: Double) = this()
  }
  
  @js.native
  class Uint8Attribute protected ()
    extends typings.three.threeMod.Uint8Attribute {
    def this(array: js.Any, itemSize: Double) = this()
  }
  
  @js.native
  class Uint8BufferAttribute protected ()
    extends typings.three.threeMod.Uint8BufferAttribute {
    def this(array: Iterable[Double], itemSize: Double) = this()
  }
  
  @js.native
  class Uint8ClampedAttribute protected ()
    extends typings.three.threeMod.Uint8ClampedAttribute {
    def this(array: js.Any, itemSize: Double) = this()
  }
  
  @js.native
  class Uint8ClampedBufferAttribute protected ()
    extends typings.three.threeMod.Uint8ClampedBufferAttribute {
    def this(array: Iterable[Double], itemSize: Double) = this()
  }
  
  @js.native
  class Uniform protected ()
    extends typings.three.threeMod.Uniform {
    def this(value: js.Any) = this()
  }
  
  @js.native
  class Vector2 ()
    extends typings.three.threeMod.Vector2
  
  @js.native
  class Vector3 ()
    extends typings.three.threeMod.Vector3
  
  @js.native
  class Vector4 ()
    extends typings.three.threeMod.Vector4
  
  @js.native
  class VectorKeyframeTrack protected ()
    extends typings.three.threeMod.VectorKeyframeTrack {
    def this(name: String, times: js.Array[_], values: js.Array[_]) = this()
  }
  
  @js.native
  class VertexNormalsHelper protected ()
    extends typings.three.threeMod.VertexNormalsHelper {
    def this(`object`: Object3D) = this()
  }
  
  @js.native
  class VideoTexture protected ()
    extends typings.three.threeMod.VideoTexture {
    def this(
      video: HTMLVideoElement,
      mapping: js.UndefOr[Mapping],
      wrapS: js.UndefOr[Wrapping],
      wrapT: js.UndefOr[Wrapping],
      magFilter: js.UndefOr[TextureFilter],
      minFilter: js.UndefOr[TextureFilter],
      format: js.UndefOr[PixelFormat],
      `type`: js.UndefOr[TextureDataType],
      anisotropy: js.UndefOr[Double]
    ) = this()
  }
  
  @js.native
  class WebGLBufferRenderer protected ()
    extends typings.three.threeMod.WebGLBufferRenderer {
    def this(_gl: WebGLRenderingContext, extensions: js.Any, _infoRender: js.Any) = this()
  }
  
  @js.native
  class WebGLCapabilities protected ()
    extends typings.three.threeMod.WebGLCapabilities {
    def this(gl: WebGLRenderingContext, extensions: js.Any, parameters: WebGLCapabilitiesParameters) = this()
  }
  
  @js.native
  class WebGLClipping ()
    extends typings.three.threeMod.WebGLClipping
  
  @js.native
  class WebGLColorBuffer ()
    extends typings.three.threeMod.WebGLColorBuffer
  
  @js.native
  class WebGLDepthBuffer ()
    extends typings.three.threeMod.WebGLDepthBuffer
  
  @js.native
  class WebGLExtensions protected ()
    extends typings.three.threeMod.WebGLExtensions {
    def this(gl: WebGLRenderingContext) = this()
  }
  
  @js.native
  class WebGLGeometries protected ()
    extends typings.three.threeMod.WebGLGeometries {
    def this(gl: WebGLRenderingContext, extensions: js.Any, _infoRender: js.Any) = this()
  }
  
  @js.native
  class WebGLIndexedBufferRenderer protected ()
    extends typings.three.threeMod.WebGLIndexedBufferRenderer {
    def this(gl: WebGLRenderingContext, properties: js.Any, info: js.Any) = this()
  }
  
  @js.native
  class WebGLInfo ()
    extends typings.three.threeMod.WebGLInfo
  
  @js.native
  class WebGLLights protected ()
    extends typings.three.threeMod.WebGLLights {
    def this(gl: WebGLRenderingContext, properties: js.Any, info: js.Any) = this()
  }
  
  @js.native
  class WebGLMultisampleRenderTarget protected ()
    extends typings.three.threeMod.WebGLMultisampleRenderTarget {
    def this(width: Double, height: Double) = this()
  }
  
  @js.native
  class WebGLObjects protected ()
    extends typings.three.threeMod.WebGLObjects {
    def this(gl: WebGLRenderingContext, properties: js.Any, info: js.Any) = this()
  }
  
  @js.native
  class WebGLProgram protected ()
    extends typings.three.threeMod.WebGLProgram {
    def this(
      renderer: typings.three.srcRenderersWebGLRendererMod.WebGLRenderer,
      extensions: typings.three.srcRenderersWebglWebGLExtensionsMod.WebGLExtensions,
      code: String,
      material: typings.three.srcMaterialsShaderMaterialMod.ShaderMaterial,
      shader: typings.three.srcRenderersWebglWebGLShaderMod.WebGLShader,
      parameters: WebGLRendererParameters,
      capabilities: typings.three.srcRenderersWebglWebGLCapabilitiesMod.WebGLCapabilities
    ) = this()
  }
  
  @js.native
  class WebGLPrograms protected ()
    extends typings.three.threeMod.WebGLPrograms {
    def this(
      renderer: typings.three.srcRenderersWebGLRendererMod.WebGLRenderer,
      extensions: typings.three.srcRenderersWebglWebGLExtensionsMod.WebGLExtensions,
      capabilities: typings.three.srcRenderersWebglWebGLCapabilitiesMod.WebGLCapabilities
    ) = this()
  }
  
  @js.native
  class WebGLProperties ()
    extends typings.three.threeMod.WebGLProperties
  
  @js.native
  class WebGLRenderList ()
    extends typings.three.threeMod.WebGLRenderList
  
  @js.native
  class WebGLRenderLists ()
    extends typings.three.threeMod.WebGLRenderLists
  
  @js.native
  class WebGLRenderTarget protected ()
    extends typings.three.threeMod.WebGLRenderTarget {
    def this(width: Double, height: Double) = this()
  }
  
  @js.native
  class WebGLRenderTargetCube protected ()
    extends typings.three.threeMod.WebGLRenderTargetCube {
    def this(width: Double, height: Double) = this()
  }
  
  @js.native
  /**
  	 * parameters is an optional object with properties defining the renderer's behaviour. The constructor also accepts no parameters at all. In all cases, it will assume sane defaults when parameters are missing.
  	 */
  class WebGLRenderer ()
    extends typings.three.threeMod.WebGLRenderer
  
  @js.native
  class WebGLShader protected ()
    extends typings.three.threeMod.WebGLShader {
    def this(gl: js.Any, `type`: String, string: String) = this()
  }
  
  @js.native
  class WebGLShadowMap protected ()
    extends typings.three.threeMod.WebGLShadowMap {
    def this(
      _renderer: typings.three.srcRenderersWebGLRendererMod.WebGLRenderer,
      _lights: js.Array[_],
      _objects: js.Array[_],
      capabilities: js.Any
    ) = this()
  }
  
  @js.native
  class WebGLState protected ()
    extends typings.three.threeMod.WebGLState {
    def this(
      gl: WebGLRenderingContext,
      extensions: typings.three.srcRenderersWebglWebGLExtensionsMod.WebGLExtensions,
      utils: js.Any,
      capabilities: typings.three.srcRenderersWebglWebGLCapabilitiesMod.WebGLCapabilities
    ) = this()
  }
  
  @js.native
  class WebGLStencilBuffer ()
    extends typings.three.threeMod.WebGLStencilBuffer
  
  @js.native
  class WebGLTextures protected ()
    extends typings.three.threeMod.WebGLTextures {
    def this(
      gl: js.Any,
      extensions: js.Any,
      state: js.Any,
      properties: js.Any,
      capabilities: js.Any,
      paramThreeToGL: js.Function,
      info: js.Any
    ) = this()
  }
  
  @js.native
  class WireframeGeometry protected ()
    extends typings.three.threeMod.WireframeGeometry {
    def this(geometry: typings.three.srcCoreGeometryMod.Geometry) = this()
  }
  
}

