package typings
package aframeLib.aframeMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AFRAME")
@js.native
object AFRAMENs extends js.Object {
  val AComponent: aframeLib.aframeMod.Component[js.Any, aframeLib.aframeMod.System[js.Any]] = js.native
  val AEntity: aframeLib.aframeMod.Entity[
    aframeLib.aframeMod.ObjectMap[aframeLib.aframeMod.Component[js.Any, aframeLib.aframeMod.System[js.Any]]]
  ] = js.native
  val ANode: aframeLib.aframeMod.ANode = js.native
  val AScene: aframeLib.aframeMod.Scene = js.native
  /* Extracted nested Instantiables into classes in THREENs */
  val THREE: aframeLib.aframeMod.ThreeLib = js.native
  /* Extracted nested Instantiables into classes in TWEENNs */
  val TWEEN: aframeLib.aframeMod.TweenLib = js.native
  val components: aframeLib.aframeMod.ObjectMap[
    aframeLib.aframeMod.ComponentDescriptor[aframeLib.aframeMod.Component[js.Any, aframeLib.aframeMod.System[js.Any]]]
  ] = js.native
  val geometries: aframeLib.aframeMod.ObjectMap[aframeLib.aframeMod.GeometryDescriptor[aframeLib.aframeMod.Geometry[js.Any]]] = js.native
  val primitives: aframeLib.Anon_GetMeshMixin = js.native
  val registerComponent: js.Function2[
    /* name */ java.lang.String, 
    /* component */ aframeLib.aframeMod.ComponentDefinition[js.Object], 
    aframeLib.aframeMod.ComponentConstructor[js.Object]
  ] = js.native
  val registerElement: js.Function2[/* name */ java.lang.String, /* element */ js.Object, scala.Unit] = js.native
  val registerGeometry: js.Function2[
    /* name */ java.lang.String, 
    /* geometry */ aframeLib.aframeMod.GeometryDefinition[js.Object, js.Any], 
    aframeLib.aframeMod.GeometryConstructor[js.Object]
  ] = js.native
  val registerPrimitive: js.Function2[
    /* name */ java.lang.String, 
    /* primitive */ aframeLib.aframeMod.PrimitiveDefinition, 
    scala.Unit
  ] = js.native
  val registerShader: js.Function2[
    /* name */ java.lang.String, 
    /* shader */ aframeLib.aframeMod.ShaderDefinition[aframeLib.aframeMod.MinimalShaderDefinition with js.Object], 
    aframeLib.aframeMod.ShaderConstructor[aframeLib.aframeMod.MinimalShaderDefinition with js.Object]
  ] = js.native
  val registerSystem: js.Function2[
    /* name */ java.lang.String, 
    /* definition */ aframeLib.aframeMod.SystemDefinition[js.Object], 
    aframeLib.aframeMod.SystemConstructor[js.Object]
  ] = js.native
  val scenes: js.Array[aframeLib.aframeMod.Scene] = js.native
  val schema: aframeLib.aframeMod.SchemaUtils = js.native
  val shaders: aframeLib.aframeMod.ObjectMap[aframeLib.aframeMod.ShaderDescriptor[aframeLib.aframeMod.Shader]] = js.native
  val systems: aframeLib.aframeMod.ObjectMap[aframeLib.aframeMod.SystemConstructor[js.Object]] = js.native
  val utils: aframeLib.aframeMod.Utils = js.native
  val version: java.lang.String = js.native
  @JSName("THREE")
  @js.native
  object THREENs extends js.Object {
    @js.native
    /**
      * This creates a Ambientlight with a color.
      * @param color Numeric value of the RGB component of the color or a Color instance.
      */
    class AmbientLight ()
      extends threeLib.threeMod.AmbientLight
    
    @js.native
    class AnimationAction ()
      extends threeLib.threeMod.AnimationAction
    
    @js.native
    class AnimationMixer protected ()
      extends threeLib.threeMod.AnimationMixer {
      def this(root: js.Any) = this()
    }
    
    @js.native
    class AnimationObjectGroup protected ()
      extends threeLib.threeMod.AnimationObjectGroup {
      def this(args: js.Any*) = this()
    }
    
    @js.native
    class ArcCurve protected ()
      extends threeLib.threeMod.ArcCurve {
      def this(aX: scala.Double, aY: scala.Double, aRadius: scala.Double, aStartAngle: scala.Double, aEndAngle: scala.Double, aClockwise: scala.Boolean) = this()
    }
    
    @js.native
    class ArrayCamera ()
      extends threeLib.threeMod.ArrayCamera
    
    @js.native
    class ArrowHelper protected ()
      extends threeLib.threeMod.ArrowHelper {
      def this(dir: threeLib.threeDashCoreMod.Vector3) = this()
    }
    
    @js.native
    class Audio protected ()
      extends threeLib.threeMod.Audio {
      def this(listener: threeLib.threeDashCoreMod.AudioListener) = this()
    }
    
    @js.native
    class AudioAnalyser protected ()
      extends threeLib.threeMod.AudioAnalyser {
      def this(audio: js.Any, fftSize: scala.Double) = this()
    }
    
    @js.native
    class AudioBuffer protected ()
      extends threeLib.threeMod.AudioBuffer {
      def this(context: js.Any) = this()
    }
    
    @js.native
    class AudioListener ()
      extends threeLib.threeMod.AudioListener
    
    @js.native
    class AudioLoader ()
      extends threeLib.threeMod.AudioLoader
    
    @js.native
    class AxesHelper ()
      extends threeLib.threeMod.AxesHelper
    
    @js.native
    class BinaryTextureLoader ()
      extends threeLib.threeMod.BinaryTextureLoader
    
    @js.native
    class Bone ()
      extends threeLib.threeMod.Bone
    
    @js.native
    class BooleanKeyframeTrack protected ()
      extends threeLib.threeMod.BooleanKeyframeTrack {
      def this(name: java.lang.String, times: js.Array[_], values: js.Array[_]) = this()
    }
    
    @js.native
    class BoundingBoxHelper ()
      extends threeLib.threeMod.BoundingBoxHelper
    
    @js.native
    class Box2 ()
      extends threeLib.threeMod.Box2
    
    @js.native
    class Box3 ()
      extends threeLib.threeMod.Box3
    
    @js.native
    class BoxBufferGeometry protected ()
      extends threeLib.threeMod.BoxBufferGeometry {
      def this(width: js.UndefOr[scala.Double], height: js.UndefOr[scala.Double], depth: js.UndefOr[scala.Double], widthSegments: js.UndefOr[scala.Double], heightSegments: js.UndefOr[scala.Double], depthSegments: js.UndefOr[scala.Double]) = this()
    }
    
    @js.native
    class BoxGeometry protected ()
      extends threeLib.threeMod.BoxGeometry {
      /**
        * @param width — Width of the sides on the X axis.
        * @param height — Height of the sides on the Y axis.
        * @param depth — Depth of the sides on the Z axis.
        * @param widthSegments — Number of segmented faces along the width of the sides.
        * @param heightSegments — Number of segmented faces along the height of the sides.
        * @param depthSegments — Number of segmented faces along the depth of the sides.
        */
      def this(width: js.UndefOr[scala.Double], height: js.UndefOr[scala.Double], depth: js.UndefOr[scala.Double], widthSegments: js.UndefOr[scala.Double], heightSegments: js.UndefOr[scala.Double], depthSegments: js.UndefOr[scala.Double]) = this()
    }
    
    @js.native
    class BoxHelper ()
      extends threeLib.threeMod.BoxHelper
    
    @js.native
    class BufferAttribute protected ()
      extends threeLib.threeMod.BufferAttribute {
      def this(array: stdLib.ArrayLike[scala.Double], itemSize: scala.Double) = this()
    }
    
    @js.native
    class BufferGeometryLoader ()
      extends threeLib.threeMod.BufferGeometryLoader
    
    @js.native
    class CSS3DObject protected ()
      extends threeLib.threeMod.CSS3DObject {
      def this(element: js.Any) = this()
    }
    
    @js.native
    class CSS3DRenderer ()
      extends threeLib.threeMod.CSS3DRenderer
    
    @js.native
    class CSS3DSprite protected ()
      extends threeLib.threeMod.CSS3DSprite {
      def this(element: js.Any) = this()
    }
    
    @js.native
    class CTMLoader ()
      extends threeLib.threeMod.CTMLoader
    
    @js.native
    /**
      * This constructor sets following properties to the correct type: matrixWorldInverse, projectionMatrix and projectionMatrixInverse.
      */
    class Camera ()
      extends threeLib.threeMod.Camera
    
    @js.native
    class CameraHelper protected ()
      extends threeLib.threeMod.CameraHelper {
      def this(camera: threeLib.threeDashCoreMod.Camera) = this()
    }
    
    @js.native
    class CanvasRenderer ()
      extends threeLib.threeMod.CanvasRenderer
    
    @js.native
    class CanvasTexture protected ()
      extends threeLib.threeMod.CanvasTexture {
      def this(canvas: stdLib.HTMLImageElement, mapping: js.UndefOr[threeLib.threeDashCoreMod.Mapping], wrapS: js.UndefOr[threeLib.threeDashCoreMod.Wrapping], wrapT: js.UndefOr[threeLib.threeDashCoreMod.Wrapping], magFilter: js.UndefOr[threeLib.threeDashCoreMod.TextureFilter], minFilter: js.UndefOr[threeLib.threeDashCoreMod.TextureFilter], format: js.UndefOr[threeLib.threeDashCoreMod.PixelFormat], `type`: js.UndefOr[threeLib.threeDashCoreMod.TextureDataType], anisotropy: js.UndefOr[scala.Double]) = this()
    }
    
    @js.native
    class CatmullRomCurve3 ()
      extends threeLib.threeMod.CatmullRomCurve3
    
    @js.native
    class CircleBufferGeometry ()
      extends threeLib.threeMod.CircleBufferGeometry
    
    @js.native
    class CircleGeometry ()
      extends threeLib.threeMod.CircleGeometry
    
    @js.native
    class ClearMaskPass ()
      extends threeLib.threeMod.ClearMaskPass
    
    @js.native
    /**
      * @param autoStart Automatically start the clock.
      */
    class Clock ()
      extends threeLib.threeMod.Clock
    
    @js.native
    class ColladaLoader ()
      extends threeLib.threeMod.ColladaLoader
    
    @js.native
    class ColladaModel ()
      extends threeLib.threeMod.ColladaModel
    
    @js.native
    class Color ()
      extends threeLib.threeMod.Color
    
    @js.native
    class ColorKeyframeTrack protected ()
      extends threeLib.threeMod.ColorKeyframeTrack {
      def this(name: java.lang.String, times: js.Array[_], values: js.Array[_]) = this()
    }
    
    @js.native
    class CompressedTexture protected ()
      extends threeLib.threeMod.CompressedTexture {
      def this(mipmaps: js.Array[stdLib.ImageData], width: scala.Double, height: scala.Double, format: js.UndefOr[threeLib.threeDashCoreMod.PixelFormat], `type`: js.UndefOr[threeLib.threeDashCoreMod.TextureDataType], mapping: js.UndefOr[threeLib.threeDashCoreMod.Mapping], wrapS: js.UndefOr[threeLib.threeDashCoreMod.Wrapping], wrapT: js.UndefOr[threeLib.threeDashCoreMod.Wrapping], magFilter: js.UndefOr[threeLib.threeDashCoreMod.TextureFilter], minFilter: js.UndefOr[threeLib.threeDashCoreMod.TextureFilter], anisotropy: js.UndefOr[scala.Double], encoding: js.UndefOr[threeLib.threeDashCoreMod.TextureEncoding]) = this()
    }
    
    @js.native
    class CompressedTextureLoader ()
      extends threeLib.threeMod.CompressedTextureLoader
    
    @js.native
    class ConeBufferGeometry protected ()
      extends threeLib.threeMod.ConeBufferGeometry {
      def this(radius: js.UndefOr[scala.Double], height: js.UndefOr[scala.Double], radialSegment: js.UndefOr[scala.Double], heightSegment: js.UndefOr[scala.Double], openEnded: js.UndefOr[scala.Boolean], thetaStart: js.UndefOr[scala.Double], thetaLength: js.UndefOr[scala.Double]) = this()
    }
    
    @js.native
    class ConeGeometry protected ()
      extends threeLib.threeMod.ConeGeometry {
      def this(radius: js.UndefOr[scala.Double], height: js.UndefOr[scala.Double], radialSegment: js.UndefOr[scala.Double], heightSegment: js.UndefOr[scala.Double], openEnded: js.UndefOr[scala.Boolean], thetaStart: js.UndefOr[scala.Double], thetaLength: js.UndefOr[scala.Double]) = this()
    }
    
    @js.native
    class CubeCamera ()
      extends threeLib.threeMod.CubeCamera
    
    @js.native
    class CubeGeometry ()
      extends threeLib.threeMod.CubeGeometry
    
    @js.native
    class CubeTexture protected ()
      extends threeLib.threeMod.CubeTexture {
      def this( // HTMLImageElement or HTMLCanvasElement
      images: js.UndefOr[js.Array[_]], mapping: js.UndefOr[threeLib.threeDashCoreMod.Mapping], wrapS: js.UndefOr[threeLib.threeDashCoreMod.Wrapping], wrapT: js.UndefOr[threeLib.threeDashCoreMod.Wrapping], magFilter: js.UndefOr[threeLib.threeDashCoreMod.TextureFilter], minFilter: js.UndefOr[threeLib.threeDashCoreMod.TextureFilter], format: js.UndefOr[threeLib.threeDashCoreMod.PixelFormat], `type`: js.UndefOr[threeLib.threeDashCoreMod.TextureDataType], anisotropy: js.UndefOr[scala.Double], encoding: js.UndefOr[threeLib.threeDashCoreMod.TextureEncoding]) = this()
    }
    
    @js.native
    class CubeTextureLoader ()
      extends threeLib.threeMod.CubeTextureLoader
    
    @js.native
    class CubicBezierCurve protected ()
      extends threeLib.threeMod.CubicBezierCurve {
      def this(v0: threeLib.threeDashCoreMod.Vector2, v1: threeLib.threeDashCoreMod.Vector2, v2: threeLib.threeDashCoreMod.Vector2, v3: threeLib.threeDashCoreMod.Vector2) = this()
    }
    
    @js.native
    class CubicBezierCurve3 protected ()
      extends threeLib.threeMod.CubicBezierCurve3 {
      def this(v0: threeLib.threeDashCoreMod.Vector3, v1: threeLib.threeDashCoreMod.Vector3, v2: threeLib.threeDashCoreMod.Vector3, v3: threeLib.threeDashCoreMod.Vector3) = this()
    }
    
    @js.native
    class CubicInterpolant protected ()
      extends threeLib.threeMod.CubicInterpolant {
      def this(parameterPositions: js.Any, samplesValues: js.Any, sampleSize: scala.Double) = this()
    }
    
    @js.native
    class CurvePath[T /* <: threeLib.threeDashCoreMod.Vector */] ()
      extends threeLib.threeMod.CurvePath[T]
    
    @js.native
    class CylinderBufferGeometry protected ()
      extends threeLib.threeMod.CylinderBufferGeometry {
      def this(radiusTop: js.UndefOr[scala.Double], radiusBottom: js.UndefOr[scala.Double], height: js.UndefOr[scala.Double], radialSegments: js.UndefOr[scala.Double], heightSegments: js.UndefOr[scala.Double], openEnded: js.UndefOr[scala.Boolean], thetaStart: js.UndefOr[scala.Double], thetaLength: js.UndefOr[scala.Double]) = this()
    }
    
    @js.native
    class CylinderGeometry protected ()
      extends threeLib.threeMod.CylinderGeometry {
      /**
        * @param radiusTop — Radius of the cylinder at the top.
        * @param radiusBottom — Radius of the cylinder at the bottom.
        * @param height — Height of the cylinder.
        * @param radiusSegments — Number of segmented faces around the circumference of the cylinder.
        * @param heightSegments — Number of rows of faces along the height of the cylinder.
        * @param openEnded - A Boolean indicating whether or not to cap the ends of the cylinder.
        */
      def this(radiusTop: js.UndefOr[scala.Double], radiusBottom: js.UndefOr[scala.Double], height: js.UndefOr[scala.Double], radiusSegments: js.UndefOr[scala.Double], heightSegments: js.UndefOr[scala.Double], openEnded: js.UndefOr[scala.Boolean], thetaStart: js.UndefOr[scala.Double], thetaLength: js.UndefOr[scala.Double]) = this()
    }
    
    @js.native
    class Cylindrical ()
      extends threeLib.threeMod.Cylindrical
    
    @js.native
    class DDSLoader ()
      extends threeLib.threeMod.DDSLoader
    
    @js.native
    class DataTexture protected ()
      extends threeLib.threeMod.DataTexture {
      def this(data: stdLib.ArrayBuffer, width: scala.Double, height: scala.Double, format: js.UndefOr[threeLib.threeDashCoreMod.PixelFormat], `type`: js.UndefOr[threeLib.threeDashCoreMod.TextureDataType], mapping: js.UndefOr[threeLib.threeDashCoreMod.Mapping], wrapS: js.UndefOr[threeLib.threeDashCoreMod.Wrapping], wrapT: js.UndefOr[threeLib.threeDashCoreMod.Wrapping], magFilter: js.UndefOr[threeLib.threeDashCoreMod.TextureFilter], minFilter: js.UndefOr[threeLib.threeDashCoreMod.TextureFilter], anisotropy: js.UndefOr[scala.Double], encoding: js.UndefOr[threeLib.threeDashCoreMod.TextureEncoding]) = this()
    }
    
    @js.native
    class DataTextureLoader ()
      extends threeLib.threeMod.DataTextureLoader
    
    @js.native
    class DepthTexture protected ()
      extends threeLib.threeMod.DepthTexture {
      def this(width: scala.Double, heighht: scala.Double, `type`: js.UndefOr[threeLib.threeDashCoreMod.TextureDataType], mapping: js.UndefOr[threeLib.threeDashCoreMod.Mapping], wrapS: js.UndefOr[threeLib.threeDashCoreMod.Wrapping], wrapT: js.UndefOr[threeLib.threeDashCoreMod.Wrapping], magFilter: js.UndefOr[threeLib.threeDashCoreMod.TextureFilter], minFilter: js.UndefOr[threeLib.threeDashCoreMod.TextureFilter], anisotropy: js.UndefOr[scala.Double]) = this()
    }
    
    @js.native
    class DirectGeometry ()
      extends threeLib.threeMod.DirectGeometry
    
    @js.native
    class DirectionalLight ()
      extends threeLib.threeMod.DirectionalLight
    
    @js.native
    class DirectionalLightHelper protected ()
      extends threeLib.threeMod.DirectionalLightHelper {
      def this(light: threeLib.threeDashCoreMod.DirectionalLight) = this()
    }
    
    @js.native
    class DirectionalLightShadow ()
      extends threeLib.threeMod.DirectionalLightShadow
    
    @js.native
    class DiscreteInterpolant protected ()
      extends threeLib.threeMod.DiscreteInterpolant {
      def this(parameterPositions: js.Any, samplesValues: js.Any, sampleSize: scala.Double) = this()
    }
    
    @js.native
    class DodecahedronBufferGeometry ()
      extends threeLib.threeMod.DodecahedronBufferGeometry
    
    @js.native
    class DodecahedronGeometry ()
      extends threeLib.threeMod.DodecahedronGeometry
    
    @js.native
    class DragControls protected ()
      extends threeLib.threeMod.DragControls {
      def this(objects: js.Array[threeLib.threeDashCoreMod.Object3D], camera: threeLib.threeDashCoreMod.Camera) = this()
    }
    
    @js.native
    class DynamicBufferAttribute ()
      extends threeLib.threeMod.DynamicBufferAttribute
    
    @js.native
    class EdgesGeometry protected ()
      extends threeLib.threeMod.EdgesGeometry {
      def this(geometry: threeLib.threeDashCoreMod.BufferGeometry) = this()
    }
    
    @js.native
    class EdgesHelper protected ()
      extends threeLib.threeMod.EdgesHelper {
      def this(`object`: threeLib.threeDashCoreMod.Object3D) = this()
    }
    
    @js.native
    class EditorControls protected ()
      extends threeLib.threeMod.EditorControls {
      def this(`object`: threeLib.threeDashCoreMod.Camera) = this()
    }
    
    @js.native
    class EffectComposer protected ()
      extends threeLib.threeMod.EffectComposer {
      def this(renderer: threeLib.threeDashCoreMod.WebGLRenderer) = this()
    }
    
    @js.native
    class EllipseCurve protected ()
      extends threeLib.threeMod.EllipseCurve {
      def this(aX: scala.Double, aY: scala.Double, xRadius: scala.Double, yRadius: scala.Double, aStartAngle: scala.Double, aEndAngle: scala.Double, aClockwise: scala.Boolean, aRotation: scala.Double) = this()
    }
    
    @js.native
    /**
      * Creates eventDispatcher object. It needs to be call with '.call' to add the functionality to an object.
      */
    class EventDispatcher ()
      extends threeLib.threeMod.EventDispatcher
    
    @js.native
    class FBXLoader ()
      extends threeLib.threeMod.FBXLoader
    
    @js.native
    class Face3 protected ()
      extends threeLib.threeMod.Face3 {
      /**
        * @param a Vertex A index.
        * @param b Vertex B index.
        * @param c Vertex C index.
        * @param normal Face normal or array of vertex normals.
        * @param color Face color or array of vertex colors.
        * @param materialIndex Material index.
        */
      def this(a: scala.Double, b: scala.Double, c: scala.Double) = this()
    }
    
    @js.native
    class Face4 ()
      extends threeLib.threeMod.Face4
    
    @js.native
    class FaceNormalsHelper protected ()
      extends threeLib.threeMod.FaceNormalsHelper {
      def this(`object`: threeLib.threeDashCoreMod.Object3D) = this()
    }
    
    @js.native
    class FileLoader ()
      extends threeLib.threeMod.FileLoader
    
    @js.native
    class FilmPass ()
      extends threeLib.threeMod.FilmPass
    
    @js.native
    class FirstPersonControls protected ()
      extends threeLib.threeMod.FirstPersonControls {
      def this(`object`: threeLib.threeDashCoreMod.Camera) = this()
    }
    
    @js.native
    class Float32Attribute protected ()
      extends threeLib.threeMod.Float32Attribute {
      def this(array: js.Any, itemSize: scala.Double) = this()
    }
    
    @js.native
    class Float32BufferAttribute protected ()
      extends threeLib.threeMod.Float32BufferAttribute {
      def this(array: stdLib.Iterable[scala.Double], itemSize: scala.Double) = this()
    }
    
    @js.native
    class Float64Attribute protected ()
      extends threeLib.threeMod.Float64Attribute {
      def this(array: js.Any, itemSize: scala.Double) = this()
    }
    
    @js.native
    class Float64BufferAttribute protected ()
      extends threeLib.threeMod.Float64BufferAttribute {
      def this(array: stdLib.Iterable[scala.Double], itemSize: scala.Double) = this()
    }
    
    @js.native
    class Fog protected ()
      extends threeLib.threeMod.Fog {
      def this(hex: scala.Double) = this()
    }
    
    @js.native
    class FogExp2 protected ()
      extends threeLib.threeMod.FogExp2 {
      def this(hex: scala.Double) = this()
    }
    
    @js.native
    class Font protected ()
      extends threeLib.threeMod.Font {
      def this(jsondata: js.Any) = this()
    }
    
    @js.native
    class FontLoader ()
      extends threeLib.threeMod.FontLoader
    
    @js.native
    class Frustum protected ()
      extends threeLib.threeMod.Frustum {
      def this(p0: js.UndefOr[threeLib.threeDashCoreMod.Plane], p1: js.UndefOr[threeLib.threeDashCoreMod.Plane], p2: js.UndefOr[threeLib.threeDashCoreMod.Plane], p3: js.UndefOr[threeLib.threeDashCoreMod.Plane], p4: js.UndefOr[threeLib.threeDashCoreMod.Plane], p5: js.UndefOr[threeLib.threeDashCoreMod.Plane]) = this()
    }
    
    @js.native
    class GLTF ()
      extends threeLib.threeMod.GLTF
    
    @js.native
    class GLTFExporter ()
      extends threeLib.threeMod.GLTFExporter
    
    @js.native
    class GLTFLoader ()
      extends threeLib.threeMod.GLTFLoader
    
    @js.native
    class Geometry ()
      extends threeLib.threeMod.Geometry
    
    @js.native
    class GridHelper protected ()
      extends threeLib.threeMod.GridHelper {
      def this(size: scala.Double, divisions: scala.Double) = this()
    }
    
    @js.native
    class Group ()
      extends threeLib.threeMod.Group
    
    @js.native
    class HemisphereLight ()
      extends threeLib.threeMod.HemisphereLight
    
    @js.native
    class HemisphereLightHelper protected ()
      extends threeLib.threeMod.HemisphereLightHelper {
      def this(light: threeLib.threeDashCoreMod.HemisphereLight, size: scala.Double) = this()
    }
    
    @js.native
    class IcosahedronBufferGeometry ()
      extends threeLib.threeMod.IcosahedronBufferGeometry
    
    @js.native
    class IcosahedronGeometry ()
      extends threeLib.threeMod.IcosahedronGeometry
    
    @js.native
    class ImageLoader ()
      extends threeLib.threeMod.ImageLoader
    
    @js.native
    class ImmediateRenderObject protected ()
      extends threeLib.threeMod.ImmediateRenderObject {
      def this(material: threeLib.threeDashCoreMod.Material) = this()
    }
    
    @js.native
    class InstancedBufferAttribute protected ()
      extends threeLib.threeMod.InstancedBufferAttribute {
      def this(data: stdLib.ArrayLike[scala.Double], itemSize: scala.Double) = this()
    }
    
    @js.native
    class InstancedBufferGeometry ()
      extends threeLib.threeMod.InstancedBufferGeometry
    
    @js.native
    class InstancedInterleavedBuffer protected ()
      extends threeLib.threeMod.InstancedInterleavedBuffer {
      def this(array: stdLib.ArrayLike[scala.Double], stride: scala.Double) = this()
    }
    
    @js.native
    class Int16Attribute protected ()
      extends threeLib.threeMod.Int16Attribute {
      def this(array: js.Any, itemSize: scala.Double) = this()
    }
    
    @js.native
    class Int16BufferAttribute protected ()
      extends threeLib.threeMod.Int16BufferAttribute {
      def this(array: stdLib.Iterable[scala.Double], itemSize: scala.Double) = this()
    }
    
    @js.native
    class Int32Attribute protected ()
      extends threeLib.threeMod.Int32Attribute {
      def this(array: js.Any, itemSize: scala.Double) = this()
    }
    
    @js.native
    class Int32BufferAttribute protected ()
      extends threeLib.threeMod.Int32BufferAttribute {
      def this(array: stdLib.Iterable[scala.Double], itemSize: scala.Double) = this()
    }
    
    @js.native
    class Int8Attribute protected ()
      extends threeLib.threeMod.Int8Attribute {
      def this(array: js.Any, itemSize: scala.Double) = this()
    }
    
    @js.native
    class Int8BufferAttribute protected ()
      extends threeLib.threeMod.Int8BufferAttribute {
      def this(array: stdLib.Iterable[scala.Double], itemSize: scala.Double) = this()
    }
    
    @js.native
    class InterleavedBuffer protected ()
      extends threeLib.threeMod.InterleavedBuffer {
      def this(array: stdLib.ArrayLike[scala.Double], stride: scala.Double) = this()
    }
    
    @js.native
    class InterleavedBufferAttribute protected ()
      extends threeLib.threeMod.InterleavedBufferAttribute {
      def this(interleavedBuffer: threeLib.threeDashCoreMod.InterleavedBuffer, itemSize: scala.Double, offset: scala.Double) = this()
    }
    
    @js.native
    class Interpolant protected ()
      extends threeLib.threeMod.Interpolant {
      def this(parameterPositions: js.Any, samplesValues: js.Any, sampleSize: scala.Double) = this()
    }
    
    @js.native
    class JSONLoader ()
      extends threeLib.threeMod.JSONLoader
    
    @js.native
    class LOD ()
      extends threeLib.threeMod.LOD
    
    @js.native
    class LatheBufferGeometry protected ()
      extends threeLib.threeMod.LatheBufferGeometry {
      def this(points: js.Array[threeLib.threeDashCoreMod.Vector2]) = this()
    }
    
    @js.native
    class LatheGeometry protected ()
      extends threeLib.threeMod.LatheGeometry {
      def this(points: js.Array[threeLib.threeDashCoreMod.Vector2]) = this()
    }
    
    @js.native
    class Layers ()
      extends threeLib.threeMod.Layers
    
    @js.native
    class LensFlare ()
      extends threeLib.threeMod.LensFlare
    
    @js.native
    class Light ()
      extends threeLib.threeMod.Light
    
    @js.native
    class LightShadow protected ()
      extends threeLib.threeMod.LightShadow {
      def this(camera: threeLib.threeDashCoreMod.Camera) = this()
    }
    
    @js.native
    class Line ()
      extends threeLib.threeMod.Line
    
    @js.native
    class Line3 ()
      extends threeLib.threeMod.Line3
    
    @js.native
    class LineBasicMaterial ()
      extends threeLib.threeMod.LineBasicMaterial
    
    @js.native
    class LineCurve protected ()
      extends threeLib.threeMod.LineCurve {
      def this(v1: threeLib.threeDashCoreMod.Vector2, v2: threeLib.threeDashCoreMod.Vector2) = this()
    }
    
    @js.native
    class LineCurve3 protected ()
      extends threeLib.threeMod.LineCurve3 {
      def this(v1: threeLib.threeDashCoreMod.Vector3, v2: threeLib.threeDashCoreMod.Vector3) = this()
    }
    
    @js.native
    class LineDashedMaterial ()
      extends threeLib.threeMod.LineDashedMaterial
    
    @js.native
    class LineLoop ()
      extends threeLib.threeMod.LineLoop
    
    @js.native
    class LineSegments ()
      extends threeLib.threeMod.LineSegments
    
    @js.native
    class LinearInterpolant protected ()
      extends threeLib.threeMod.LinearInterpolant {
      def this(parameterPositions: js.Any, samplesValues: js.Any, sampleSize: scala.Double) = this()
    }
    
    @js.native
    class LoadingManager ()
      extends threeLib.threeMod.LoadingManager
    
    @js.native
    class MTLLoader ()
      extends threeLib.threeMod.MTLLoader
    
    @js.native
    class MapControls protected ()
      extends threeLib.threeMod.MapControls {
      def this(`object`: threeLib.threeDashCoreMod.Camera) = this()
    }
    
    @js.native
    class MaskPass protected ()
      extends threeLib.threeMod.MaskPass {
      def this(scene: threeLib.threeDashCoreMod.Scene, camera: threeLib.threeDashCoreMod.Camera) = this()
    }
    
    @js.native
    class Material ()
      extends threeLib.threeMod.Material
    
    @js.native
    class MaterialCreator ()
      extends threeLib.threeMod.MaterialCreator
    
    @js.native
    class MaterialLoader ()
      extends threeLib.threeMod.MaterialLoader
    
    @js.native
    /**
      * Creates an identity matrix.
      */
    class Matrix3 ()
      extends threeLib.threeMod.Matrix3
    
    @js.native
    class Matrix4 ()
      extends threeLib.threeMod.Matrix4
    
    @js.native
    class Mesh ()
      extends threeLib.threeMod.Mesh
    
    @js.native
    class MeshBasicMaterial ()
      extends threeLib.threeMod.MeshBasicMaterial
    
    @js.native
    class MeshDepthMaterial ()
      extends threeLib.threeMod.MeshDepthMaterial
    
    @js.native
    class MeshFaceMaterial ()
      extends threeLib.threeMod.MeshFaceMaterial
    
    @js.native
    class MeshLambertMaterial ()
      extends threeLib.threeMod.MeshLambertMaterial
    
    @js.native
    class MeshNormalMaterial ()
      extends threeLib.threeMod.MeshNormalMaterial
    
    @js.native
    class MeshPhongMaterial ()
      extends threeLib.threeMod.MeshPhongMaterial
    
    @js.native
    class MeshPhysicalMaterial protected ()
      extends threeLib.threeMod.MeshPhysicalMaterial {
      def this(parameters: threeLib.threeDashCoreMod.MeshPhysicalMaterialParameters) = this()
    }
    
    @js.native
    class MeshStandardMaterial ()
      extends threeLib.threeMod.MeshStandardMaterial
    
    @js.native
    class MorphBlendMesh protected ()
      extends threeLib.threeMod.MorphBlendMesh {
      def this(geometry: threeLib.threeDashCoreMod.Geometry, material: threeLib.threeDashCoreMod.Material) = this()
    }
    
    @js.native
    class MultiMaterial ()
      extends threeLib.threeMod.MultiMaterial
    
    @js.native
    class NumberKeyframeTrack protected ()
      extends threeLib.threeMod.NumberKeyframeTrack {
      def this(name: java.lang.String, times: js.Array[_], values: js.Array[_]) = this()
    }
    
    @js.native
    class OBJLoader ()
      extends threeLib.threeMod.OBJLoader
    
    @js.native
    class ObjectLoader ()
      extends threeLib.threeMod.ObjectLoader
    
    @js.native
    class OctahedronBufferGeometry ()
      extends threeLib.threeMod.OctahedronBufferGeometry
    
    @js.native
    class OctahedronGeometry ()
      extends threeLib.threeMod.OctahedronGeometry
    
    @js.native
    class Octree ()
      extends threeLib.threeMod.Octree
    
    @js.native
    class OrbitControls protected ()
      extends threeLib.threeMod.OrbitControls {
      def this(`object`: threeLib.threeDashCoreMod.Camera) = this()
    }
    
    @js.native
    class OrthographicCamera protected ()
      extends threeLib.threeMod.OrthographicCamera {
      /**
        * @param left Camera frustum left plane.
        * @param right Camera frustum right plane.
        * @param top Camera frustum top plane.
        * @param bottom Camera frustum bottom plane.
        * @param near Camera frustum near plane.
        * @param far Camera frustum far plane.
        */
      def this(left: scala.Double, right: scala.Double, top: scala.Double, bottom: scala.Double) = this()
    }
    
    @js.native
    class OrthographicTrackballControls protected ()
      extends threeLib.threeMod.OrthographicTrackballControls {
      def this(`object`: threeLib.threeDashCoreMod.Camera) = this()
    }
    
    @js.native
    class ParametricBufferGeometry protected ()
      extends threeLib.threeMod.ParametricBufferGeometry {
      def this(func: js.Function3[
              /* u */ scala.Double, 
              /* v */ scala.Double, 
              /* dest */ threeLib.threeDashCoreMod.Vector3, 
              scala.Unit
            ], slices: scala.Double, stacks: scala.Double) = this()
    }
    
    @js.native
    class ParametricGeometry protected ()
      extends threeLib.threeMod.ParametricGeometry {
      def this(func: js.Function3[
              /* u */ scala.Double, 
              /* v */ scala.Double, 
              /* dest */ threeLib.threeDashCoreMod.Vector3, 
              scala.Unit
            ], slices: scala.Double, stacks: scala.Double) = this()
    }
    
    @js.native
    class Particle ()
      extends threeLib.threeMod.Particle
    
    @js.native
    class ParticleBasicMaterial ()
      extends threeLib.threeMod.ParticleBasicMaterial
    
    @js.native
    class ParticleSystem ()
      extends threeLib.threeMod.ParticleSystem
    
    @js.native
    class ParticleSystemMaterial ()
      extends threeLib.threeMod.ParticleSystemMaterial
    
    @js.native
    class Pass ()
      extends threeLib.threeMod.Pass
    
    @js.native
    class Path ()
      extends threeLib.threeMod.Path
    
    @js.native
    /**
      * @param fov Camera frustum vertical field of view. Default value is 50.
      * @param aspect Camera frustum aspect ratio. Default value is 1.
      * @param near Camera frustum near plane. Default value is 0.1.
      * @param far Camera frustum far plane. Default value is 2000.
      */
    class PerspectiveCamera ()
      extends threeLib.threeMod.PerspectiveCamera
    
    @js.native
    class Plane ()
      extends threeLib.threeMod.Plane
    
    @js.native
    class PlaneBufferGeometry ()
      extends threeLib.threeMod.PlaneBufferGeometry
    
    @js.native
    class PlaneGeometry ()
      extends threeLib.threeMod.PlaneGeometry
    
    @js.native
    class PlaneHelper protected ()
      extends threeLib.threeMod.PlaneHelper {
      def this(plane: threeLib.threeDashCoreMod.Plane) = this()
    }
    
    @js.native
    class PointCloud ()
      extends threeLib.threeMod.PointCloud
    
    @js.native
    class PointCloudMaterial ()
      extends threeLib.threeMod.PointCloudMaterial
    
    @js.native
    class PointLight ()
      extends threeLib.threeMod.PointLight
    
    @js.native
    class PointLightHelper protected ()
      extends threeLib.threeMod.PointLightHelper {
      def this(light: threeLib.threeDashCoreMod.PointLight) = this()
    }
    
    @js.native
    class PointLightShadow ()
      extends threeLib.threeMod.PointLightShadow
    
    @js.native
    /**
      * @param geometry An instance of Geometry or BufferGeometry.
      * @param material An instance of Material (optional).
      */
    class Points ()
      extends threeLib.threeMod.Points
    
    @js.native
    class PointsMaterial ()
      extends threeLib.threeMod.PointsMaterial
    
    @js.native
    class PolyhedronBufferGeometry protected ()
      extends threeLib.threeMod.PolyhedronBufferGeometry {
      def this(vertices: js.Array[scala.Double], indices: js.Array[scala.Double]) = this()
    }
    
    @js.native
    class PolyhedronGeometry protected ()
      extends threeLib.threeMod.PolyhedronGeometry {
      def this(vertices: js.Array[scala.Double], indices: js.Array[scala.Double]) = this()
    }
    
    @js.native
    class PositionalAudio protected ()
      extends threeLib.threeMod.PositionalAudio {
      def this(listener: threeLib.threeDashCoreMod.AudioListener) = this()
    }
    
    @js.native
    class Projector ()
      extends threeLib.threeMod.Projector
    
    @js.native
    class PropertyMixer protected ()
      extends threeLib.threeMod.PropertyMixer {
      def this(binding: js.Any, typeName: java.lang.String, valueSize: scala.Double) = this()
    }
    
    @js.native
    class QuadraticBezierCurve protected ()
      extends threeLib.threeMod.QuadraticBezierCurve {
      def this(v0: threeLib.threeDashCoreMod.Vector2, v1: threeLib.threeDashCoreMod.Vector2, v2: threeLib.threeDashCoreMod.Vector2) = this()
    }
    
    @js.native
    class QuadraticBezierCurve3 protected ()
      extends threeLib.threeMod.QuadraticBezierCurve3 {
      def this(v0: threeLib.threeDashCoreMod.Vector3, v1: threeLib.threeDashCoreMod.Vector3, v2: threeLib.threeDashCoreMod.Vector3) = this()
    }
    
    @js.native
    class QuaternionKeyframeTrack protected ()
      extends threeLib.threeMod.QuaternionKeyframeTrack {
      def this(name: java.lang.String, times: js.Array[_], values: js.Array[_]) = this()
    }
    
    @js.native
    class QuaternionLinearInterpolant protected ()
      extends threeLib.threeMod.QuaternionLinearInterpolant {
      def this(parameterPositions: js.Any, samplesValues: js.Any, sampleSize: scala.Double) = this()
    }
    
    @js.native
    class RawShaderMaterial ()
      extends threeLib.threeMod.RawShaderMaterial
    
    @js.native
    class Ray ()
      extends threeLib.threeMod.Ray
    
    @js.native
    /**
      * This creates a new raycaster object.
      * @param origin The origin vector where the ray casts from.
      * @param direction The direction vector that gives direction to the ray. Should be normalized.
      * @param near All results returned are further away than near. Near can't be negative. Default value is 0.
      * @param far All results returned are closer then far. Far can't be lower then near . Default value is Infinity.
      */
    class Raycaster ()
      extends threeLib.threeMod.Raycaster
    
    @js.native
    class RenderPass protected ()
      extends threeLib.threeMod.RenderPass {
      def this(scene: threeLib.threeDashCoreMod.Scene, camera: threeLib.threeDashCoreMod.Camera) = this()
    }
    
    @js.native
    class RenderableFace ()
      extends threeLib.threeMod.RenderableFace
    
    @js.native
    class RenderableLine ()
      extends threeLib.threeMod.RenderableLine
    
    @js.native
    class RenderableObject ()
      extends threeLib.threeMod.RenderableObject
    
    @js.native
    class RenderableSprite ()
      extends threeLib.threeMod.RenderableSprite
    
    @js.native
    class RenderableVertex ()
      extends threeLib.threeMod.RenderableVertex
    
    @js.native
    class RingBufferGeometry protected ()
      extends threeLib.threeMod.RingBufferGeometry {
      def this(innerRadius: js.UndefOr[scala.Double], outerRadius: js.UndefOr[scala.Double], thetaSegments: js.UndefOr[scala.Double], phiSegments: js.UndefOr[scala.Double], thetaStart: js.UndefOr[scala.Double], thetaLength: js.UndefOr[scala.Double]) = this()
    }
    
    @js.native
    class RingGeometry protected ()
      extends threeLib.threeMod.RingGeometry {
      def this(innerRadius: js.UndefOr[scala.Double], outerRadius: js.UndefOr[scala.Double], thetaSegments: js.UndefOr[scala.Double], phiSegments: js.UndefOr[scala.Double], thetaStart: js.UndefOr[scala.Double], thetaLength: js.UndefOr[scala.Double]) = this()
    }
    
    @js.native
    class SMAAPass protected ()
      extends threeLib.threeMod.SMAAPass {
      def this(width: scala.Double, height: scala.Double) = this()
    }
    
    @js.native
    class Scene ()
      extends threeLib.threeMod.Scene
    
    @js.native
    class ShaderMaterial ()
      extends threeLib.threeMod.ShaderMaterial
    
    @js.native
    class ShaderPass protected ()
      extends threeLib.threeMod.ShaderPass {
      def this(shader: threeLib.threeDashCoreMod.Shader) = this()
    }
    
    @js.native
    class ShadowMaterial ()
      extends threeLib.threeMod.ShadowMaterial
    
    @js.native
    class Shape ()
      extends threeLib.threeMod.Shape
    
    @js.native
    class ShapeBufferGeometry protected ()
      extends threeLib.threeMod.ShapeBufferGeometry {
      def this(shapes: threeLib.threeDashCoreMod.Shape) = this()
    }
    
    @js.native
    class ShapeGeometry protected ()
      extends threeLib.threeMod.ShapeGeometry {
      def this(shapes: threeLib.threeDashCoreMod.Shape) = this()
    }
    
    @js.native
    class ShapePath ()
      extends threeLib.threeMod.ShapePath
    
    @js.native
    class Skeleton protected ()
      extends threeLib.threeMod.Skeleton {
      def this(bones: js.Array[threeLib.threeDashCoreMod.Bone]) = this()
    }
    
    @js.native
    class SkeletonHelper protected ()
      extends threeLib.threeMod.SkeletonHelper {
      def this(bone: threeLib.threeDashCoreMod.Object3D) = this()
    }
    
    @js.native
    class SkinnedMesh ()
      extends threeLib.threeMod.SkinnedMesh
    
    @js.native
    class Sphere ()
      extends threeLib.threeMod.Sphere
    
    @js.native
    class SphereBufferGeometry protected ()
      extends threeLib.threeMod.SphereBufferGeometry {
      def this(radius: js.UndefOr[scala.Double], widthSegments: js.UndefOr[scala.Double], heightSegments: js.UndefOr[scala.Double], phiStart: js.UndefOr[scala.Double], phiLength: js.UndefOr[scala.Double], thetaStart: js.UndefOr[scala.Double], thetaLength: js.UndefOr[scala.Double]) = this()
    }
    
    @js.native
    class SphereGeometry protected ()
      extends threeLib.threeMod.SphereGeometry {
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
      def this(radius: js.UndefOr[scala.Double], widthSegments: js.UndefOr[scala.Double], heightSegments: js.UndefOr[scala.Double], phiStart: js.UndefOr[scala.Double], phiLength: js.UndefOr[scala.Double], thetaStart: js.UndefOr[scala.Double], thetaLength: js.UndefOr[scala.Double]) = this()
    }
    
    @js.native
    class Spherical ()
      extends threeLib.threeMod.Spherical
    
    @js.native
    class SplineCurve ()
      extends threeLib.threeMod.SplineCurve
    
    @js.native
    class SpotLight protected ()
      extends threeLib.threeMod.SpotLight {
      def this(color: js.UndefOr[threeLib.threeDashCoreMod.Color], intensity: js.UndefOr[scala.Double], distance: js.UndefOr[scala.Double], angle: js.UndefOr[scala.Double], exponent: js.UndefOr[scala.Double], decay: js.UndefOr[scala.Double]) = this()
    }
    
    @js.native
    class SpotLightHelper protected ()
      extends threeLib.threeMod.SpotLightHelper {
      def this(light: threeLib.threeDashCoreMod.Light) = this()
    }
    
    @js.native
    class SpotLightShadow ()
      extends threeLib.threeMod.SpotLightShadow
    
    @js.native
    class Sprite ()
      extends threeLib.threeMod.Sprite
    
    @js.native
    class SpriteCanvasMaterial ()
      extends threeLib.threeMod.SpriteCanvasMaterial
    
    @js.native
    class SpriteMaterial ()
      extends threeLib.threeMod.SpriteMaterial
    
    @js.native
    class SpritePlugin protected ()
      extends threeLib.threeMod.SpritePlugin {
      def this(renderer: threeLib.threeDashCoreMod.WebGLRenderer, sprites: js.Array[_]) = this()
    }
    
    @js.native
    class StereoCamera ()
      extends threeLib.threeMod.StereoCamera
    
    @js.native
    class StringKeyframeTrack protected ()
      extends threeLib.threeMod.StringKeyframeTrack {
      def this(name: java.lang.String, times: js.Array[_], values: js.Array[_]) = this()
    }
    
    @js.native
    class TDSLoader protected ()
      extends threeLib.threeMod.TDSLoader {
      def this(three: threeLib.Anon_AAClockwise) = this()
    }
    
    @js.native
    class TGALoader ()
      extends threeLib.threeMod.TGALoader
    
    @js.native
    class TetrahedronBufferGeometry ()
      extends threeLib.threeMod.TetrahedronBufferGeometry
    
    @js.native
    class TetrahedronGeometry ()
      extends threeLib.threeMod.TetrahedronGeometry
    
    @js.native
    class TextBufferGeometry protected ()
      extends threeLib.threeMod.TextBufferGeometry {
      def this(text: java.lang.String) = this()
    }
    
    @js.native
    class TextGeometry protected ()
      extends threeLib.threeMod.TextGeometry {
      def this(text: java.lang.String) = this()
    }
    
    @js.native
    class TextureLoader ()
      extends threeLib.threeMod.TextureLoader
    
    @js.native
    class TorusBufferGeometry ()
      extends threeLib.threeMod.TorusBufferGeometry
    
    @js.native
    class TorusGeometry ()
      extends threeLib.threeMod.TorusGeometry
    
    @js.native
    class TorusKnotBufferGeometry protected ()
      extends threeLib.threeMod.TorusKnotBufferGeometry {
      def this(radius: js.UndefOr[scala.Double], tube: js.UndefOr[scala.Double], tubularSegments: js.UndefOr[scala.Double], radialSegments: js.UndefOr[scala.Double], p: js.UndefOr[scala.Double], q: js.UndefOr[scala.Double]) = this()
    }
    
    @js.native
    class TorusKnotGeometry protected ()
      extends threeLib.threeMod.TorusKnotGeometry {
      def this(radius: js.UndefOr[scala.Double], tube: js.UndefOr[scala.Double], tubularSegments: js.UndefOr[scala.Double], radialSegments: js.UndefOr[scala.Double], p: js.UndefOr[scala.Double], q: js.UndefOr[scala.Double]) = this()
    }
    
    @js.native
    class TrackballControls protected ()
      extends threeLib.threeMod.TrackballControls {
      def this(`object`: threeLib.threeDashCoreMod.Camera) = this()
    }
    
    @js.native
    class TransformControls protected ()
      extends threeLib.threeMod.TransformControls {
      def this(`object`: threeLib.threeDashCoreMod.Camera) = this()
    }
    
    @js.native
    class TubeBufferGeometry protected ()
      extends threeLib.threeMod.TubeBufferGeometry {
      def this(path: threeLib.threeDashCoreMod.Curve[threeLib.threeDashCoreMod.Vector3]) = this()
    }
    
    @js.native
    class TubeGeometry protected ()
      extends threeLib.threeMod.TubeGeometry {
      def this(path: threeLib.threeDashCoreMod.Curve[threeLib.threeDashCoreMod.Vector3]) = this()
    }
    
    @js.native
    class Uint16Attribute protected ()
      extends threeLib.threeMod.Uint16Attribute {
      def this(array: js.Any, itemSize: scala.Double) = this()
    }
    
    @js.native
    class Uint16BufferAttribute protected ()
      extends threeLib.threeMod.Uint16BufferAttribute {
      def this(array: stdLib.Iterable[scala.Double], itemSize: scala.Double) = this()
    }
    
    @js.native
    class Uint32Attribute protected ()
      extends threeLib.threeMod.Uint32Attribute {
      def this(array: js.Any, itemSize: scala.Double) = this()
    }
    
    @js.native
    class Uint32BufferAttribute protected ()
      extends threeLib.threeMod.Uint32BufferAttribute {
      def this(array: stdLib.Iterable[scala.Double], itemSize: scala.Double) = this()
    }
    
    @js.native
    class Uint8Attribute protected ()
      extends threeLib.threeMod.Uint8Attribute {
      def this(array: js.Any, itemSize: scala.Double) = this()
    }
    
    @js.native
    class Uint8BufferAttribute protected ()
      extends threeLib.threeMod.Uint8BufferAttribute {
      def this(array: stdLib.Iterable[scala.Double], itemSize: scala.Double) = this()
    }
    
    @js.native
    class Uint8ClampedAttribute protected ()
      extends threeLib.threeMod.Uint8ClampedAttribute {
      def this(array: js.Any, itemSize: scala.Double) = this()
    }
    
    @js.native
    class Uint8ClampedBufferAttribute protected ()
      extends threeLib.threeMod.Uint8ClampedBufferAttribute {
      def this(array: stdLib.Iterable[scala.Double], itemSize: scala.Double) = this()
    }
    
    @js.native
    class Uniform protected ()
      extends threeLib.threeMod.Uniform {
      def this(value: js.Any) = this()
    }
    
    @js.native
    class VRControls protected ()
      extends threeLib.threeMod.VRControls {
      def this(camera: threeLib.threeDashCoreMod.Camera) = this()
    }
    
    @js.native
    class VREffect protected ()
      extends threeLib.threeMod.VREffect {
      def this(renderer: threeLib.threeDashCoreMod.Renderer) = this()
    }
    
    @js.native
    class Vector2 ()
      extends threeLib.threeMod.Vector2
    
    @js.native
    class Vector3 ()
      extends threeLib.threeMod.Vector3
    
    @js.native
    class Vector4 ()
      extends threeLib.threeMod.Vector4
    
    @js.native
    class VectorKeyframeTrack protected ()
      extends threeLib.threeMod.VectorKeyframeTrack {
      def this(name: java.lang.String, times: js.Array[_], values: js.Array[_]) = this()
    }
    
    @js.native
    class Vertex ()
      extends threeLib.threeMod.Vertex
    
    @js.native
    class VertexNormalsHelper protected ()
      extends threeLib.threeMod.VertexNormalsHelper {
      def this(`object`: threeLib.threeDashCoreMod.Object3D) = this()
    }
    
    @js.native
    class VideoTexture protected ()
      extends threeLib.threeMod.VideoTexture {
      def this(video: stdLib.HTMLVideoElement, mapping: js.UndefOr[threeLib.threeDashCoreMod.Mapping], wrapS: js.UndefOr[threeLib.threeDashCoreMod.Wrapping], wrapT: js.UndefOr[threeLib.threeDashCoreMod.Wrapping], magFilter: js.UndefOr[threeLib.threeDashCoreMod.TextureFilter], minFilter: js.UndefOr[threeLib.threeDashCoreMod.TextureFilter], format: js.UndefOr[threeLib.threeDashCoreMod.PixelFormat], `type`: js.UndefOr[threeLib.threeDashCoreMod.TextureDataType], anisotropy: js.UndefOr[scala.Double]) = this()
    }
    
    @js.native
    class WebGLBufferRenderer protected ()
      extends threeLib.threeMod.WebGLBufferRenderer {
      def this(_gl: stdLib.WebGLRenderingContext, extensions: js.Any, _infoRender: js.Any) = this()
    }
    
    @js.native
    class WebGLCapabilities protected ()
      extends threeLib.threeMod.WebGLCapabilities {
      def this(gl: stdLib.WebGLRenderingContext, extensions: js.Any, parameters: threeLib.threeDashCoreMod.WebGLCapabilitiesParameters) = this()
    }
    
    @js.native
    class WebGLClipping ()
      extends threeLib.threeMod.WebGLClipping
    
    @js.native
    class WebGLColorBuffer protected ()
      extends threeLib.threeMod.WebGLColorBuffer {
      def this(gl: js.Any, state: js.Any) = this()
    }
    
    @js.native
    class WebGLDepthBuffer protected ()
      extends threeLib.threeMod.WebGLDepthBuffer {
      def this(gl: js.Any, state: js.Any) = this()
    }
    
    @js.native
    class WebGLExtensions protected ()
      extends threeLib.threeMod.WebGLExtensions {
      def this(gl: stdLib.WebGLRenderingContext) = this()
    }
    
    @js.native
    class WebGLGeometries protected ()
      extends threeLib.threeMod.WebGLGeometries {
      def this(gl: stdLib.WebGLRenderingContext, extensions: js.Any, _infoRender: js.Any) = this()
    }
    
    @js.native
    class WebGLIndexedBufferRenderer protected ()
      extends threeLib.threeMod.WebGLIndexedBufferRenderer {
      def this(gl: stdLib.WebGLRenderingContext, properties: js.Any, info: js.Any) = this()
    }
    
    @js.native
    class WebGLInfo ()
      extends threeLib.threeMod.WebGLInfo
    
    @js.native
    class WebGLLights protected ()
      extends threeLib.threeMod.WebGLLights {
      def this(gl: stdLib.WebGLRenderingContext, properties: js.Any, info: js.Any) = this()
    }
    
    @js.native
    class WebGLObjects protected ()
      extends threeLib.threeMod.WebGLObjects {
      def this(gl: stdLib.WebGLRenderingContext, properties: js.Any, info: js.Any) = this()
    }
    
    @js.native
    class WebGLProgram protected ()
      extends threeLib.threeMod.WebGLProgram {
      def this(renderer: threeLib.threeDashCoreMod.WebGLRenderer, code: java.lang.String, material: threeLib.threeDashCoreMod.ShaderMaterial, parameters: threeLib.threeDashCoreMod.WebGLRendererParameters) = this()
    }
    
    @js.native
    class WebGLPrograms protected ()
      extends threeLib.threeMod.WebGLPrograms {
      def this(renderer: threeLib.threeDashCoreMod.WebGLRenderer, capabilities: js.Any) = this()
    }
    
    @js.native
    class WebGLProperties ()
      extends threeLib.threeMod.WebGLProperties
    
    @js.native
    class WebGLRenderList ()
      extends threeLib.threeMod.WebGLRenderList
    
    @js.native
    class WebGLRenderLists ()
      extends threeLib.threeMod.WebGLRenderLists
    
    @js.native
    class WebGLRenderTarget protected ()
      extends threeLib.threeMod.WebGLRenderTarget {
      def this(width: scala.Double, height: scala.Double) = this()
    }
    
    @js.native
    class WebGLRenderTargetCube protected ()
      extends threeLib.threeMod.WebGLRenderTargetCube {
      def this(width: scala.Double, height: scala.Double) = this()
    }
    
    @js.native
    /**
      * parameters is an optional object with properties defining the renderer's behaviour. The constructor also accepts no parameters at all. In all cases, it will assume sane defaults when parameters are missing.
      */
    class WebGLRenderer ()
      extends threeLib.threeMod.WebGLRenderer
    
    @js.native
    class WebGLShader protected ()
      extends threeLib.threeMod.WebGLShader {
      def this(gl: js.Any, `type`: java.lang.String, string: java.lang.String) = this()
    }
    
    @js.native
    class WebGLShadowMap protected ()
      extends threeLib.threeMod.WebGLShadowMap {
      def this(_renderer: threeLib.threeDashCoreMod.Renderer, _lights: js.Array[_], _objects: js.Array[_], capabilities: js.Any) = this()
    }
    
    @js.native
    class WebGLState protected ()
      extends threeLib.threeMod.WebGLState {
      def this(gl: js.Any, extensions: js.Any, paramThreeToGL: js.Function) = this()
    }
    
    @js.native
    class WebGLStencilBuffer protected ()
      extends threeLib.threeMod.WebGLStencilBuffer {
      def this(gl: js.Any, state: js.Any) = this()
    }
    
    @js.native
    class WebGLTextures protected ()
      extends threeLib.threeMod.WebGLTextures {
      def this(gl: js.Any, extensions: js.Any, state: js.Any, properties: js.Any, capabilities: js.Any, paramThreeToGL: js.Function, info: js.Any) = this()
    }
    
    @js.native
    class WireframeGeometry protected ()
      extends threeLib.threeMod.WireframeGeometry {
      def this(geometry: threeLib.threeDashCoreMod.Geometry) = this()
    }
    
    @js.native
    class WireframeHelper protected ()
      extends threeLib.threeMod.WireframeHelper {
      def this(`object`: threeLib.threeDashCoreMod.Object3D) = this()
    }
    
  }
  
  @JSName("TWEEN")
  @js.native
  object TWEENNs extends js.Object {
    @js.native
    class Group ()
      extends tweenDotJsLib.atTweenjsTweenDotJsMod.Group
    
    @js.native
    class Tween ()
      extends tweenDotJsLib.atTweenjsTweenDotJsMod.Tween
    
  }
  
}

