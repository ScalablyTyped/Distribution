package typings.aframe.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable10
import org.scalablytyped.runtime.Instantiable12
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable6
import org.scalablytyped.runtime.Instantiable7
import org.scalablytyped.runtime.Instantiable8
import org.scalablytyped.runtime.Instantiable9
import typings.aframe.AnonAlphamapfragment
import typings.aframe.AnonAomap
import typings.aframe.AnonBackground
import typings.aframe.TypeofAnimationUtils
import typings.aframe.TypeofBufferGeometryUtils
import typings.aframe.TypeofCache
import typings.aframe.TypeofClassAnimationClip
import typings.aframe.TypeofClassBufferGeometry
import typings.aframe.TypeofClassCurve
import typings.aframe.TypeofClassEuler
import typings.aframe.TypeofClassExtrudeBufferGeometry
import typings.aframe.TypeofClassExtrudeGeometry
import typings.aframe.TypeofClassKeyframeTrack
import typings.aframe.TypeofClassLoaderUtils
import typings.aframe.TypeofClassObject3D
import typings.aframe.TypeofClassPropertyBinding
import typings.aframe.TypeofClassQuaternion
import typings.aframe.TypeofClassSphericalHarmonics3
import typings.aframe.TypeofClassTexture
import typings.aframe.TypeofClassTriangle
import typings.aframe.TypeofClassWebGLUniforms
import typings.aframe.TypeofCurveUtils
import typings.aframe.TypeofGeometryUtils
import typings.aframe.TypeofImageUtils
import typings.aframe.TypeofMath
import typings.aframe.TypeofPropertyBinding
import typings.aframe.TypeofSceneUtils
import typings.aframe.TypeofShapeUtils
import typings.std.ArrayLike
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.ImageData
import typings.std.Iterable
import typings.std.WebGLRenderingContext
import typings.three.audioListenerMod.AudioListener
import typings.three.boneMod.Bone
import typings.three.box3Mod.Box3
import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.cameraMod.Camera
import typings.three.colorMod.Color
import typings.three.constantsMod.AnimationActionLoopStyles
import typings.three.constantsMod.Blending
import typings.three.constantsMod.BlendingDstFactor
import typings.three.constantsMod.BlendingEquation
import typings.three.constantsMod.BlendingSrcFactor
import typings.three.constantsMod.Colors
import typings.three.constantsMod.Combine
import typings.three.constantsMod.CompressedPixelFormat
import typings.three.constantsMod.CullFace
import typings.three.constantsMod.DepthModes
import typings.three.constantsMod.DepthPackingStrategies
import typings.three.constantsMod.FrontFaceDirection
import typings.three.constantsMod.InterpolationEndingModes
import typings.three.constantsMod.InterpolationModes
import typings.three.constantsMod.Mapping
import typings.three.constantsMod.NormalMapTypes
import typings.three.constantsMod.PixelFormat
import typings.three.constantsMod.PixelType
import typings.three.constantsMod.Shading
import typings.three.constantsMod.ShadowMapType
import typings.three.constantsMod.Side
import typings.three.constantsMod.StencilFunc
import typings.three.constantsMod.StencilOp
import typings.three.constantsMod.TextureDataType
import typings.three.constantsMod.TextureEncoding
import typings.three.constantsMod.TextureFilter
import typings.three.constantsMod.ToneMapping
import typings.three.constantsMod.TrianglesDrawModes
import typings.three.constantsMod.Wrapping
import typings.three.curveMod.Curve
import typings.three.directionalLightMod.DirectionalLight
import typings.three.hemisphereLightMod.HemisphereLight
import typings.three.interleavedBufferMod.InterleavedBuffer
import typings.three.lightMod.Light
import typings.three.loadingManagerMod.LoadingManager
import typings.three.materialMod.Material
import typings.three.meshPhysicalMaterialMod.MeshPhysicalMaterialParameters
import typings.three.object3DMod.Object3D
import typings.three.planeMod.Plane
import typings.three.pointLightMod.PointLight
import typings.three.polyfillsMod.TypedArray
import typings.three.positionalAudioMod.PositionalAudio
import typings.three.rectAreaLightMod.RectAreaLight
import typings.three.shaderMaterialMod.ShaderMaterial
import typings.three.shapeMod.Shape
import typings.three.vector2Mod.Vector
import typings.three.vector2Mod.Vector2
import typings.three.vector3Mod.Vector3
import typings.three.webGLCapabilitiesMod.WebGLCapabilities
import typings.three.webGLCapabilitiesMod.WebGLCapabilitiesParameters
import typings.three.webGLExtensionsMod.WebGLExtensions
import typings.three.webGLRendererMod.WebGLRenderer
import typings.three.webGLRendererMod.WebGLRendererParameters
import typings.three.webGLShaderMod.WebGLShader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreeLib extends js.Object {
  val AddEquation: BlendingEquation = js.native
  val AddOperation: Combine = js.native
  val AdditiveBlending: Blending = js.native
  val AlphaFormat: PixelFormat = js.native
  val AlwaysDepth: DepthModes = js.native
  val AlwaysStencilFunc: StencilFunc = js.native
  var AmbientLight: Instantiable0[typings.three.mod.AmbientLight] = js.native
  var AmbientLightProbe: Instantiable0[typings.three.mod.AmbientLightProbe] = js.native
  var AnimationAction: Instantiable0[typings.three.mod.AnimationAction] = js.native
  var AnimationClip: TypeofClassAnimationClip = js.native
  var AnimationLoader: Instantiable0[typings.three.mod.AnimationLoader] = js.native
  var AnimationMixer: Instantiable1[/* root */ js.Any, typings.three.mod.AnimationMixer] = js.native
  var AnimationObjectGroup: Instantiable1[/* args (repeated) */ js.Any, typings.three.mod.AnimationObjectGroup] = js.native
  val AnimationUtils: TypeofAnimationUtils = js.native
  var ArcCurve: Instantiable6[
    /* aX */ Double, 
    /* aY */ Double, 
    /* aRadius */ Double, 
    /* aStartAngle */ Double, 
    /* aEndAngle */ Double, 
    /* aClockwise */ Boolean, 
    typings.three.mod.ArcCurve
  ] = js.native
  var ArrayCamera: Instantiable0[typings.three.mod.ArrayCamera] = js.native
  var ArrowHelper: Instantiable1[/* dir */ Vector3, typings.three.mod.ArrowHelper] = js.native
  var Audio: Instantiable1[/* listener */ AudioListener, typings.three.mod.Audio] = js.native
  var AudioAnalyser: Instantiable2[/* audio */ js.Any, /* fftSize */ Double, typings.three.mod.AudioAnalyser] = js.native
  var AudioBuffer: Instantiable1[/* context */ js.Any, typings.three.mod.AudioBuffer] = js.native
  val AudioContext: typings.std.AudioContext = js.native
  var AudioListener: Instantiable0[typings.three.mod.AudioListener] = js.native
  var AudioLoader: Instantiable0[typings.three.mod.AudioLoader] = js.native
  var AxesHelper: Instantiable0[typings.three.mod.AxesHelper] = js.native
  val BackSide: Side = js.native
  val BasicDepthPacking: DepthPackingStrategies = js.native
  val BasicShadowMap: ShadowMapType = js.native
  var Bone: Instantiable0[typings.three.mod.Bone] = js.native
  var BooleanKeyframeTrack: Instantiable3[
    /* name */ String, 
    /* times */ js.Array[js.Any], 
    /* values */ js.Array[js.Any], 
    typings.three.mod.BooleanKeyframeTrack
  ] = js.native
  var Box2: Instantiable0[typings.three.mod.Box2] = js.native
  var Box3: Instantiable0[typings.three.mod.Box3] = js.native
  var Box3Helper: Instantiable1[/* box */ Box3, typings.three.mod.Box3Helper] = js.native
  var BoxBufferGeometry: Instantiable6[
    js.UndefOr[/* width */ Double], 
    js.UndefOr[/* height */ Double], 
    js.UndefOr[/* depth */ Double], 
    js.UndefOr[/* widthSegments */ Double], 
    js.UndefOr[/* heightSegments */ Double], 
    js.UndefOr[/* depthSegments */ Double], 
    typings.three.mod.BoxBufferGeometry
  ] = js.native
  var BoxGeometry: Instantiable6[
    js.UndefOr[/* width */ Double], 
    js.UndefOr[/* height */ Double], 
    js.UndefOr[/* depth */ Double], 
    js.UndefOr[/* widthSegments */ Double], 
    js.UndefOr[/* heightSegments */ Double], 
    js.UndefOr[/* depthSegments */ Double], 
    typings.three.mod.BoxGeometry
  ] = js.native
  var BoxHelper: Instantiable1[/* object */ Object3D, typings.three.mod.BoxHelper] = js.native
  var BufferAttribute: Instantiable2[
    /* array */ ArrayLike[Double], 
    /* itemSize */ Double, 
    typings.three.mod.BufferAttribute
  ] = js.native
  var BufferGeometry: TypeofClassBufferGeometry = js.native
  var BufferGeometryLoader: Instantiable0[typings.three.mod.BufferGeometryLoader] = js.native
  val BufferGeometryUtils: TypeofBufferGeometryUtils = js.native
  val ByteType: TextureDataType = js.native
  val Cache: TypeofCache = js.native
  var Camera: Instantiable0[typings.three.mod.Camera] = js.native
  var CameraHelper: Instantiable1[/* camera */ Camera, typings.three.mod.CameraHelper] = js.native
  var CanvasTexture: Instantiable9[
    /* canvas */ HTMLImageElement, 
    js.UndefOr[/* mapping */ Mapping], 
    js.UndefOr[/* wrapS */ Wrapping], 
    js.UndefOr[/* wrapT */ Wrapping], 
    js.UndefOr[/* magFilter */ TextureFilter], 
    js.UndefOr[/* minFilter */ TextureFilter], 
    js.UndefOr[/* format */ PixelFormat], 
    js.UndefOr[/* type */ TextureDataType], 
    js.UndefOr[/* anisotropy */ Double], 
    typings.three.mod.CanvasTexture
  ] = js.native
  var CatmullRomCurve3: Instantiable0[typings.three.mod.CatmullRomCurve3] = js.native
  val CineonToneMapping: ToneMapping = js.native
  var CircleBufferGeometry: Instantiable0[typings.three.mod.CircleBufferGeometry] = js.native
  var CircleGeometry: Instantiable0[typings.three.mod.CircleGeometry] = js.native
  val ClampToEdgeWrapping: Wrapping = js.native
  var Clock: Instantiable0[typings.three.mod.Clock] = js.native
  var Color: Instantiable0[typings.three.mod.Color] = js.native
  var ColorKeyframeTrack: Instantiable3[
    /* name */ String, 
    /* times */ js.Array[js.Any], 
    /* values */ js.Array[js.Any], 
    typings.three.mod.ColorKeyframeTrack
  ] = js.native
  var CompressedTexture: Instantiable12[
    /* mipmaps */ js.Array[ImageData], 
    /* width */ Double, 
    /* height */ Double, 
    js.UndefOr[/* format */ CompressedPixelFormat], 
    js.UndefOr[/* type */ TextureDataType], 
    js.UndefOr[/* mapping */ Mapping], 
    js.UndefOr[/* wrapS */ Wrapping], 
    js.UndefOr[/* wrapT */ Wrapping], 
    js.UndefOr[/* magFilter */ TextureFilter], 
    js.UndefOr[/* minFilter */ TextureFilter], 
    js.UndefOr[/* anisotropy */ Double], 
    js.UndefOr[/* encoding */ TextureEncoding], 
    typings.three.mod.CompressedTexture
  ] = js.native
  var CompressedTextureLoader: Instantiable0[typings.three.mod.CompressedTextureLoader] = js.native
  var ConeBufferGeometry: Instantiable7[
    js.UndefOr[/* radius */ Double], 
    js.UndefOr[/* height */ Double], 
    js.UndefOr[/* radialSegment */ Double], 
    js.UndefOr[/* heightSegment */ Double], 
    js.UndefOr[/* openEnded */ Boolean], 
    js.UndefOr[/* thetaStart */ Double], 
    js.UndefOr[/* thetaLength */ Double], 
    typings.three.mod.ConeBufferGeometry
  ] = js.native
  var ConeGeometry: Instantiable7[
    js.UndefOr[/* radius */ Double], 
    js.UndefOr[/* height */ Double], 
    js.UndefOr[/* radialSegment */ Double], 
    js.UndefOr[/* heightSegment */ Double], 
    js.UndefOr[/* openEnded */ Boolean], 
    js.UndefOr[/* thetaStart */ Double], 
    js.UndefOr[/* thetaLength */ Double], 
    typings.three.mod.ConeGeometry
  ] = js.native
  var CubeCamera: Instantiable0[typings.three.mod.CubeCamera] = js.native
  val CubeReflectionMapping: Mapping = js.native
  val CubeRefractionMapping: Mapping = js.native
  var CubeTexture: Instantiable10[
    js.UndefOr[/* images */ js.Array[js.Any]], 
    js.UndefOr[/* mapping */ Mapping], 
    js.UndefOr[/* wrapS */ Wrapping], 
    js.UndefOr[/* wrapT */ Wrapping], 
    js.UndefOr[/* magFilter */ TextureFilter], 
    js.UndefOr[/* minFilter */ TextureFilter], 
    js.UndefOr[/* format */ PixelFormat], 
    js.UndefOr[/* type */ TextureDataType], 
    js.UndefOr[/* anisotropy */ Double], 
    js.UndefOr[/* encoding */ TextureEncoding], 
    typings.three.mod.CubeTexture
  ] = js.native
  var CubeTextureLoader: Instantiable0[typings.three.mod.CubeTextureLoader] = js.native
  val CubeUVReflectionMapping: Mapping = js.native
  val CubeUVRefractionMapping: Mapping = js.native
  var CubicBezierCurve: Instantiable4[
    /* v0 */ Vector2, 
    /* v1 */ Vector2, 
    /* v2 */ Vector2, 
    /* v3 */ Vector2, 
    typings.three.mod.CubicBezierCurve
  ] = js.native
  var CubicBezierCurve3: Instantiable4[
    /* v0 */ Vector3, 
    /* v1 */ Vector3, 
    /* v2 */ Vector3, 
    /* v3 */ Vector3, 
    typings.three.mod.CubicBezierCurve3
  ] = js.native
  var CubicInterpolant: Instantiable3[
    /* parameterPositions */ js.Any, 
    /* samplesValues */ js.Any, 
    /* sampleSize */ Double, 
    typings.three.mod.CubicInterpolant
  ] = js.native
  val CullFaceBack: CullFace = js.native
  val CullFaceFront: CullFace = js.native
  val CullFaceFrontBack: CullFace = js.native
  val CullFaceNone: CullFace = js.native
  var Curve: TypeofClassCurve = js.native
  var CurvePath: Instantiable0[typings.three.mod.CurvePath[Vector]] = js.native
  val CurveUtils: TypeofCurveUtils = js.native
  val CustomBlending: Blending = js.native
  var CylinderBufferGeometry: Instantiable8[
    js.UndefOr[/* radiusTop */ Double], 
    js.UndefOr[/* radiusBottom */ Double], 
    js.UndefOr[/* height */ Double], 
    js.UndefOr[/* radialSegments */ Double], 
    js.UndefOr[/* heightSegments */ Double], 
    js.UndefOr[/* openEnded */ Boolean], 
    js.UndefOr[/* thetaStart */ Double], 
    js.UndefOr[/* thetaLength */ Double], 
    typings.three.mod.CylinderBufferGeometry
  ] = js.native
  var CylinderGeometry: Instantiable8[
    js.UndefOr[/* radiusTop */ Double], 
    js.UndefOr[/* radiusBottom */ Double], 
    js.UndefOr[/* height */ Double], 
    js.UndefOr[/* radiusSegments */ Double], 
    js.UndefOr[/* heightSegments */ Double], 
    js.UndefOr[/* openEnded */ Boolean], 
    js.UndefOr[/* thetaStart */ Double], 
    js.UndefOr[/* thetaLength */ Double], 
    typings.three.mod.CylinderGeometry
  ] = js.native
  var Cylindrical: Instantiable0[typings.three.mod.Cylindrical] = js.native
  var DataTexture: Instantiable12[
    /* data */ TypedArray, 
    /* width */ Double, 
    /* height */ Double, 
    js.UndefOr[/* format */ PixelFormat], 
    js.UndefOr[/* type */ TextureDataType], 
    js.UndefOr[/* mapping */ Mapping], 
    js.UndefOr[/* wrapS */ Wrapping], 
    js.UndefOr[/* wrapT */ Wrapping], 
    js.UndefOr[/* magFilter */ TextureFilter], 
    js.UndefOr[/* minFilter */ TextureFilter], 
    js.UndefOr[/* anisotropy */ Double], 
    js.UndefOr[/* encoding */ TextureEncoding], 
    typings.three.mod.DataTexture
  ] = js.native
  var DataTexture3D: Instantiable4[
    /* data */ TypedArray, 
    /* width */ Double, 
    /* height */ Double, 
    /* depth */ Double, 
    typings.three.mod.DataTexture3D
  ] = js.native
  var DataTextureLoader: Instantiable0[typings.three.mod.DataTextureLoader] = js.native
  val DecrementStencilOp: StencilOp = js.native
  val DecrementWrapStencilOp: StencilOp = js.native
  val DefaultLoadingManager: LoadingManager = js.native
  val DepthFormat: PixelFormat = js.native
  val DepthStencilFormat: PixelFormat = js.native
  var DepthTexture: Instantiable9[
    /* width */ Double, 
    /* heighht */ Double, 
    js.UndefOr[/* type */ TextureDataType], 
    js.UndefOr[/* mapping */ Mapping], 
    js.UndefOr[/* wrapS */ Wrapping], 
    js.UndefOr[/* wrapT */ Wrapping], 
    js.UndefOr[/* magFilter */ TextureFilter], 
    js.UndefOr[/* minFilter */ TextureFilter], 
    js.UndefOr[/* anisotropy */ Double], 
    typings.three.mod.DepthTexture
  ] = js.native
  var DirectGeometry: Instantiable0[typings.three.mod.DirectGeometry] = js.native
  var DirectionalLight: Instantiable0[typings.three.mod.DirectionalLight] = js.native
  var DirectionalLightHelper: Instantiable1[/* light */ DirectionalLight, typings.three.mod.DirectionalLightHelper] = js.native
  var DirectionalLightShadow: Instantiable0[typings.three.mod.DirectionalLightShadow] = js.native
  var DiscreteInterpolant: Instantiable3[
    /* parameterPositions */ js.Any, 
    /* samplesValues */ js.Any, 
    /* sampleSize */ Double, 
    typings.three.mod.DiscreteInterpolant
  ] = js.native
  var DodecahedronBufferGeometry: Instantiable0[typings.three.mod.DodecahedronBufferGeometry] = js.native
  var DodecahedronGeometry: Instantiable0[typings.three.mod.DodecahedronGeometry] = js.native
  val DoubleSide: Side = js.native
  val DstAlphaFactor: BlendingDstFactor = js.native
  val DstColorFactor: BlendingDstFactor = js.native
  var EdgesGeometry: Instantiable1[/* geometry */ BufferGeometry, typings.three.mod.EdgesGeometry] = js.native
  var EllipseCurve: Instantiable8[
    /* aX */ Double, 
    /* aY */ Double, 
    /* xRadius */ Double, 
    /* yRadius */ Double, 
    /* aStartAngle */ Double, 
    /* aEndAngle */ Double, 
    /* aClockwise */ Boolean, 
    /* aRotation */ Double, 
    typings.three.mod.EllipseCurve
  ] = js.native
  val EqualDepth: DepthModes = js.native
  val EqualStencilFunc: StencilFunc = js.native
  val EquirectangularReflectionMapping: Mapping = js.native
  val EquirectangularRefractionMapping: Mapping = js.native
  var Euler: TypeofClassEuler = js.native
  var EventDispatcher: Instantiable0[typings.three.mod.EventDispatcher] = js.native
  var ExtrudeBufferGeometry: TypeofClassExtrudeBufferGeometry = js.native
  var ExtrudeGeometry: TypeofClassExtrudeGeometry = js.native
  var Face3: Instantiable3[/* a */ Double, /* b */ Double, /* c */ Double, typings.three.mod.Face3] = js.native
  val FaceColors: Colors = js.native
  var FaceNormalsHelper: Instantiable1[/* object */ Object3D, typings.three.mod.FaceNormalsHelper] = js.native
  var FileLoader: Instantiable0[typings.three.mod.FileLoader] = js.native
  val FlatShading: Shading = js.native
  var Float32Attribute: Instantiable2[/* array */ js.Any, /* itemSize */ Double, typings.three.mod.Float32Attribute] = js.native
  var Float32BufferAttribute: Instantiable2[
    /* array */ Iterable[Double], 
    /* itemSize */ Double, 
    typings.three.mod.Float32BufferAttribute
  ] = js.native
  var Float64Attribute: Instantiable2[/* array */ js.Any, /* itemSize */ Double, typings.three.mod.Float64Attribute] = js.native
  var Float64BufferAttribute: Instantiable2[
    /* array */ Iterable[Double], 
    /* itemSize */ Double, 
    typings.three.mod.Float64BufferAttribute
  ] = js.native
  val FloatType: TextureDataType = js.native
  var Fog: Instantiable1[/* hex */ Double, typings.three.mod.Fog] = js.native
  var FogExp2: Instantiable1[/* hex */ Double, typings.three.mod.FogExp2] = js.native
  var Font: Instantiable1[/* jsondata */ js.Any, typings.three.mod.Font] = js.native
  var FontLoader: Instantiable0[typings.three.mod.FontLoader] = js.native
  val FrontFaceDirectionCCW: FrontFaceDirection = js.native
  val FrontFaceDirectionCW: FrontFaceDirection = js.native
  val FrontSide: Side = js.native
  var Frustum: Instantiable6[
    js.UndefOr[/* p0 */ Plane], 
    js.UndefOr[/* p1 */ Plane], 
    js.UndefOr[/* p2 */ Plane], 
    js.UndefOr[/* p3 */ Plane], 
    js.UndefOr[/* p4 */ Plane], 
    js.UndefOr[/* p5 */ Plane], 
    typings.three.mod.Frustum
  ] = js.native
  val GammaEncoding: TextureEncoding = js.native
  var Geometry: Instantiable0[typings.three.mod.Geometry] = js.native
  var GeometryIdCount: Double = js.native
  val GeometryUtils: TypeofGeometryUtils = js.native
  val GreaterDepth: DepthModes = js.native
  val GreaterEqualDepth: DepthModes = js.native
  val GreaterEqualStencilFunc: StencilFunc = js.native
  val GreaterStencilFunc: StencilFunc = js.native
  var GridHelper: Instantiable2[/* size */ Double, /* divisions */ Double, typings.three.mod.GridHelper] = js.native
  var Group: Instantiable0[typings.three.mod.Group] = js.native
  val HalfFloatType: TextureDataType = js.native
  var HemisphereLight: Instantiable0[typings.three.mod.HemisphereLight] = js.native
  var HemisphereLightHelper: Instantiable2[
    /* light */ HemisphereLight, 
    /* size */ Double, 
    typings.three.mod.HemisphereLightHelper
  ] = js.native
  var HemisphereLightProbe: Instantiable0[typings.three.mod.HemisphereLightProbe] = js.native
  var IcosahedronBufferGeometry: Instantiable0[typings.three.mod.IcosahedronBufferGeometry] = js.native
  var IcosahedronGeometry: Instantiable0[typings.three.mod.IcosahedronGeometry] = js.native
  var ImageBitmapLoader: Instantiable0[typings.three.mod.ImageBitmapLoader] = js.native
  var ImageLoader: Instantiable0[typings.three.mod.ImageLoader] = js.native
  val ImageUtils: TypeofImageUtils = js.native
  var ImmediateRenderObject: Instantiable1[/* material */ Material, typings.three.mod.ImmediateRenderObject] = js.native
  val IncrementStencilOp: StencilOp = js.native
  val IncrementWrapStencilOp: StencilOp = js.native
  var InstancedBufferAttribute: Instantiable2[
    /* array */ ArrayLike[Double], 
    /* itemSize */ Double, 
    typings.three.mod.InstancedBufferAttribute
  ] = js.native
  var InstancedBufferGeometry: Instantiable0[typings.three.mod.InstancedBufferGeometry] = js.native
  var InstancedInterleavedBuffer: Instantiable2[
    /* array */ ArrayLike[Double], 
    /* stride */ Double, 
    typings.three.mod.InstancedInterleavedBuffer
  ] = js.native
  var Int16Attribute: Instantiable2[/* array */ js.Any, /* itemSize */ Double, typings.three.mod.Int16Attribute] = js.native
  var Int16BufferAttribute: Instantiable2[
    /* array */ Iterable[Double], 
    /* itemSize */ Double, 
    typings.three.mod.Int16BufferAttribute
  ] = js.native
  var Int32Attribute: Instantiable2[/* array */ js.Any, /* itemSize */ Double, typings.three.mod.Int32Attribute] = js.native
  var Int32BufferAttribute: Instantiable2[
    /* array */ Iterable[Double], 
    /* itemSize */ Double, 
    typings.three.mod.Int32BufferAttribute
  ] = js.native
  var Int8Attribute: Instantiable2[/* array */ js.Any, /* itemSize */ Double, typings.three.mod.Int8Attribute] = js.native
  var Int8BufferAttribute: Instantiable2[
    /* array */ Iterable[Double], 
    /* itemSize */ Double, 
    typings.three.mod.Int8BufferAttribute
  ] = js.native
  val IntType: TextureDataType = js.native
  var InterleavedBuffer: Instantiable2[
    /* array */ ArrayLike[Double], 
    /* stride */ Double, 
    typings.three.mod.InterleavedBuffer
  ] = js.native
  var InterleavedBufferAttribute: Instantiable3[
    /* interleavedBuffer */ InterleavedBuffer, 
    /* itemSize */ Double, 
    /* offset */ Double, 
    typings.three.mod.InterleavedBufferAttribute
  ] = js.native
  var Interpolant: Instantiable3[
    /* parameterPositions */ js.Any, 
    /* samplesValues */ js.Any, 
    /* sampleSize */ Double, 
    typings.three.mod.Interpolant
  ] = js.native
  val InterpolateDiscrete: InterpolationModes = js.native
  val InterpolateLinear: InterpolationModes = js.native
  val InterpolateSmooth: InterpolationModes = js.native
  val InvertStencilOp: StencilOp = js.native
  val KeepStencilOp: StencilOp = js.native
  var KeyframeTrack: TypeofClassKeyframeTrack = js.native
  var LOD: Instantiable0[typings.three.mod.LOD] = js.native
  var LatheBufferGeometry: Instantiable1[/* points */ js.Array[Vector2], typings.three.mod.LatheBufferGeometry] = js.native
  var LatheGeometry: Instantiable1[/* points */ js.Array[Vector2], typings.three.mod.LatheGeometry] = js.native
  var Layers: Instantiable0[typings.three.mod.Layers] = js.native
  val LessDepth: DepthModes = js.native
  val LessEqualDepth: DepthModes = js.native
  val LessEqualStencilFunc: StencilFunc = js.native
  val LessStencilFunc: StencilFunc = js.native
  var Light: Instantiable0[typings.three.mod.Light] = js.native
  var LightProbe: Instantiable0[typings.three.mod.LightProbe] = js.native
  var LightShadow: Instantiable1[/* camera */ Camera, typings.three.mod.LightShadow] = js.native
  var Line: Instantiable0[typings.three.mod.Line] = js.native
  var Line3: Instantiable0[typings.three.mod.Line3] = js.native
  var LineBasicMaterial: Instantiable0[typings.three.mod.LineBasicMaterial] = js.native
  var LineCurve: Instantiable2[/* v1 */ Vector2, /* v2 */ Vector2, typings.three.mod.LineCurve] = js.native
  var LineCurve3: Instantiable2[/* v1 */ Vector3, /* v2 */ Vector3, typings.three.mod.LineCurve3] = js.native
  var LineDashedMaterial: Instantiable0[typings.three.mod.LineDashedMaterial] = js.native
  var LineLoop: Instantiable0[typings.three.mod.LineLoop] = js.native
  val LinePieces: Double = js.native
  var LineSegments: Instantiable0[typings.three.mod.LineSegments] = js.native
  val LineStrip: Double = js.native
  val LinearEncoding: TextureEncoding = js.native
  val LinearFilter: TextureFilter = js.native
  var LinearInterpolant: Instantiable3[
    /* parameterPositions */ js.Any, 
    /* samplesValues */ js.Any, 
    /* sampleSize */ Double, 
    typings.three.mod.LinearInterpolant
  ] = js.native
  val LinearMipMapLinearFilter: TextureFilter = js.native
  val LinearMipMapNearestFilter: TextureFilter = js.native
  val LinearMipmapLinearFilter: TextureFilter = js.native
  val LinearMipmapNearestFilter: TextureFilter = js.native
  val LinearToneMapping: ToneMapping = js.native
  var Loader: Instantiable0[typings.three.mod.Loader] = js.native
  var LoaderUtils: TypeofClassLoaderUtils = js.native
  var LoadingManager: Instantiable0[typings.three.mod.LoadingManager] = js.native
  val LogLuvEncoding: TextureEncoding = js.native
  val LoopOnce: AnimationActionLoopStyles = js.native
  val LoopPingPong: AnimationActionLoopStyles = js.native
  val LoopRepeat: AnimationActionLoopStyles = js.native
  val LuminanceAlphaFormat: PixelFormat = js.native
  val LuminanceFormat: PixelFormat = js.native
  var Material: Instantiable0[typings.three.mod.Material] = js.native
  var MaterialIdCount: Double = js.native
  var MaterialLoader: Instantiable0[typings.three.mod.MaterialLoader] = js.native
  val Math: TypeofMath = js.native
  var Matrix3: Instantiable0[typings.three.mod.Matrix3] = js.native
  var Matrix4: Instantiable0[typings.three.mod.Matrix4] = js.native
  val MaxEquation: BlendingEquation = js.native
  var Mesh: Instantiable0[typings.three.mod.Mesh] = js.native
  var MeshBasicMaterial: Instantiable0[typings.three.mod.MeshBasicMaterial] = js.native
  var MeshDepthMaterial: Instantiable0[typings.three.mod.MeshDepthMaterial] = js.native
  var MeshDistanceMaterial: Instantiable0[typings.three.mod.MeshDistanceMaterial] = js.native
  var MeshLambertMaterial: Instantiable0[typings.three.mod.MeshLambertMaterial] = js.native
  var MeshMatcapMaterial: Instantiable0[typings.three.mod.MeshMatcapMaterial] = js.native
  var MeshNormalMaterial: Instantiable0[typings.three.mod.MeshNormalMaterial] = js.native
  var MeshPhongMaterial: Instantiable0[typings.three.mod.MeshPhongMaterial] = js.native
  var MeshPhysicalMaterial: Instantiable1[
    /* parameters */ MeshPhysicalMaterialParameters, 
    typings.three.mod.MeshPhysicalMaterial
  ] = js.native
  var MeshStandardMaterial: Instantiable0[typings.three.mod.MeshStandardMaterial] = js.native
  var MeshToonMaterial: Instantiable0[typings.three.mod.MeshToonMaterial] = js.native
  val MinEquation: BlendingEquation = js.native
  val MirroredRepeatWrapping: Wrapping = js.native
  val MixOperation: Combine = js.native
  var MultiMaterial: Instantiable0[typings.three.mod.MultiMaterial] = js.native
  val MultiplyBlending: Blending = js.native
  val MultiplyOperation: Combine = js.native
  val NearestFilter: TextureFilter = js.native
  val NearestMipMapLinearFilter: TextureFilter = js.native
  val NearestMipMapNearestFilter: TextureFilter = js.native
  val NearestMipmapLinearFilter: TextureFilter = js.native
  val NearestMipmapNearestFilter: TextureFilter = js.native
  val NeverDepth: DepthModes = js.native
  val NeverStencilFunc: StencilFunc = js.native
  val NoBlending: Blending = js.native
  val NoColors: Colors = js.native
  val NoToneMapping: ToneMapping = js.native
  val NormalBlending: Blending = js.native
  val NotEqualDepth: DepthModes = js.native
  val NotEqualStencilFunc: StencilFunc = js.native
  var NumberKeyframeTrack: Instantiable3[
    /* name */ String, 
    /* times */ js.Array[js.Any], 
    /* values */ js.Array[js.Any], 
    typings.three.mod.NumberKeyframeTrack
  ] = js.native
  var Object3D: TypeofClassObject3D = js.native
  var Object3DIdCount: Double = js.native
  var ObjectLoader: Instantiable0[typings.three.mod.ObjectLoader] = js.native
  val ObjectSpaceNormalMap: NormalMapTypes = js.native
  var OctahedronBufferGeometry: Instantiable0[typings.three.mod.OctahedronBufferGeometry] = js.native
  var OctahedronGeometry: Instantiable0[typings.three.mod.OctahedronGeometry] = js.native
  val OneFactor: BlendingDstFactor = js.native
  val OneMinusDstAlphaFactor: BlendingDstFactor = js.native
  val OneMinusDstColorFactor: BlendingDstFactor = js.native
  val OneMinusSrcAlphaFactor: BlendingDstFactor = js.native
  val OneMinusSrcColorFactor: BlendingDstFactor = js.native
  var OrthographicCamera: Instantiable4[
    /* left */ Double, 
    /* right */ Double, 
    /* top */ Double, 
    /* bottom */ Double, 
    typings.three.mod.OrthographicCamera
  ] = js.native
  val PCFShadowMap: ShadowMapType = js.native
  val PCFSoftShadowMap: ShadowMapType = js.native
  var ParametricBufferGeometry: Instantiable3[
    /* func */ js.Function3[/* u */ Double, /* v */ Double, /* dest */ Vector3, Unit], 
    /* slices */ Double, 
    /* stacks */ Double, 
    typings.three.mod.ParametricBufferGeometry
  ] = js.native
  var ParametricGeometry: Instantiable3[
    /* func */ js.Function3[/* u */ Double, /* v */ Double, /* dest */ Vector3, Unit], 
    /* slices */ Double, 
    /* stacks */ Double, 
    typings.three.mod.ParametricGeometry
  ] = js.native
  var Path: Instantiable0[typings.three.mod.Path] = js.native
  var PerspectiveCamera: Instantiable0[typings.three.mod.PerspectiveCamera] = js.native
  var Plane: Instantiable0[typings.three.mod.Plane] = js.native
  var PlaneBufferGeometry: Instantiable0[typings.three.mod.PlaneBufferGeometry] = js.native
  var PlaneGeometry: Instantiable0[typings.three.mod.PlaneGeometry] = js.native
  var PlaneHelper: Instantiable1[/* plane */ Plane, typings.three.mod.PlaneHelper] = js.native
  var PointLight: Instantiable0[typings.three.mod.PointLight] = js.native
  var PointLightHelper: Instantiable1[/* light */ PointLight, typings.three.mod.PointLightHelper] = js.native
  var PointLightShadow: Instantiable0[typings.three.mod.PointLightShadow] = js.native
  var Points: Instantiable0[typings.three.mod.Points] = js.native
  var PointsMaterial: Instantiable0[typings.three.mod.PointsMaterial] = js.native
  var PolarGridHelper: Instantiable6[
    /* radius */ Double, 
    /* radials */ Double, 
    /* circles */ Double, 
    /* divisions */ Double, 
    /* color1 */ Color, 
    /* color2 */ Color, 
    typings.three.mod.PolarGridHelper
  ] = js.native
  var PolyhedronBufferGeometry: Instantiable2[
    /* vertices */ js.Array[Double], 
    /* indices */ js.Array[Double], 
    typings.three.mod.PolyhedronBufferGeometry
  ] = js.native
  var PolyhedronGeometry: Instantiable2[
    /* vertices */ js.Array[Double], 
    /* indices */ js.Array[Double], 
    typings.three.mod.PolyhedronGeometry
  ] = js.native
  var PositionalAudio: Instantiable1[/* listener */ AudioListener, typings.three.mod.PositionalAudio] = js.native
  var PositionalAudioHelper: Instantiable1[/* audio */ PositionalAudio, typings.three.mod.PositionalAudioHelper] = js.native
  var PropertyBinding: TypeofClassPropertyBinding with TypeofPropertyBinding = js.native
  var PropertyMixer: Instantiable3[
    /* binding */ js.Any, 
    /* typeName */ String, 
    /* valueSize */ Double, 
    typings.three.mod.PropertyMixer
  ] = js.native
  var QuadraticBezierCurve: Instantiable3[
    /* v0 */ Vector2, 
    /* v1 */ Vector2, 
    /* v2 */ Vector2, 
    typings.three.mod.QuadraticBezierCurve
  ] = js.native
  var QuadraticBezierCurve3: Instantiable3[
    /* v0 */ Vector3, 
    /* v1 */ Vector3, 
    /* v2 */ Vector3, 
    typings.three.mod.QuadraticBezierCurve3
  ] = js.native
  var Quaternion: TypeofClassQuaternion = js.native
  var QuaternionKeyframeTrack: Instantiable3[
    /* name */ String, 
    /* times */ js.Array[js.Any], 
    /* values */ js.Array[js.Any], 
    typings.three.mod.QuaternionKeyframeTrack
  ] = js.native
  var QuaternionLinearInterpolant: Instantiable3[
    /* parameterPositions */ js.Any, 
    /* samplesValues */ js.Any, 
    /* sampleSize */ Double, 
    typings.three.mod.QuaternionLinearInterpolant
  ] = js.native
  val REVISION: String = js.native
  val RGBADepthPacking: DepthPackingStrategies = js.native
  val RGBAFormat: PixelFormat = js.native
  val RGBA_ASTC_10x10_Format: CompressedPixelFormat = js.native
  val RGBA_ASTC_10x5_Format: CompressedPixelFormat = js.native
  val RGBA_ASTC_10x6_Format: CompressedPixelFormat = js.native
  val RGBA_ASTC_10x8_Format: CompressedPixelFormat = js.native
  val RGBA_ASTC_12x10_Format: CompressedPixelFormat = js.native
  val RGBA_ASTC_12x12_Format: CompressedPixelFormat = js.native
  val RGBA_ASTC_4x4_Format: CompressedPixelFormat = js.native
  val RGBA_ASTC_5x4_Format: CompressedPixelFormat = js.native
  val RGBA_ASTC_5x5_Format: CompressedPixelFormat = js.native
  val RGBA_ASTC_6x5_Format: CompressedPixelFormat = js.native
  val RGBA_ASTC_6x6_Format: CompressedPixelFormat = js.native
  val RGBA_ASTC_8x5_Format: CompressedPixelFormat = js.native
  val RGBA_ASTC_8x6_Format: CompressedPixelFormat = js.native
  val RGBA_ASTC_8x8_Format: CompressedPixelFormat = js.native
  val RGBA_PVRTC_2BPPV1_Format: CompressedPixelFormat = js.native
  val RGBA_PVRTC_4BPPV1_Format: CompressedPixelFormat = js.native
  val RGBA_S3TC_DXT1_Format: CompressedPixelFormat = js.native
  val RGBA_S3TC_DXT3_Format: CompressedPixelFormat = js.native
  val RGBA_S3TC_DXT5_Format: CompressedPixelFormat = js.native
  val RGBDEncoding: TextureEncoding = js.native
  val RGBEEncoding: TextureEncoding = js.native
  val RGBEFormat: PixelFormat = js.native
  val RGBFormat: PixelFormat = js.native
  val RGBM16Encoding: TextureEncoding = js.native
  val RGBM7Encoding: TextureEncoding = js.native
  val RGB_ETC1_Format: CompressedPixelFormat = js.native
  val RGB_PVRTC_2BPPV1_Format: CompressedPixelFormat = js.native
  val RGB_PVRTC_4BPPV1_Format: CompressedPixelFormat = js.native
  val RGB_S3TC_DXT1_Format: CompressedPixelFormat = js.native
  var RawShaderMaterial: Instantiable0[typings.three.mod.RawShaderMaterial] = js.native
  var Ray: Instantiable0[typings.three.mod.Ray] = js.native
  var Raycaster: Instantiable0[typings.three.mod.Raycaster] = js.native
  var RectAreaLight: Instantiable0[typings.three.mod.RectAreaLight] = js.native
  var RectAreaLightHelper: Instantiable1[/* light */ RectAreaLight, typings.three.mod.RectAreaLightHelper] = js.native
  val RedFormat: PixelFormat = js.native
  val ReinhardToneMapping: ToneMapping = js.native
  val RepeatWrapping: Wrapping = js.native
  val ReplaceStencilOp: StencilOp = js.native
  val ReverseSubtractEquation: BlendingEquation = js.native
  var RingBufferGeometry: Instantiable6[
    js.UndefOr[/* innerRadius */ Double], 
    js.UndefOr[/* outerRadius */ Double], 
    js.UndefOr[/* thetaSegments */ Double], 
    js.UndefOr[/* phiSegments */ Double], 
    js.UndefOr[/* thetaStart */ Double], 
    js.UndefOr[/* thetaLength */ Double], 
    typings.three.mod.RingBufferGeometry
  ] = js.native
  var RingGeometry: Instantiable6[
    js.UndefOr[/* innerRadius */ Double], 
    js.UndefOr[/* outerRadius */ Double], 
    js.UndefOr[/* thetaSegments */ Double], 
    js.UndefOr[/* phiSegments */ Double], 
    js.UndefOr[/* thetaStart */ Double], 
    js.UndefOr[/* thetaLength */ Double], 
    typings.three.mod.RingGeometry
  ] = js.native
  var Scene: Instantiable0[typings.three.mod.Scene] = js.native
  val SceneUtils: TypeofSceneUtils = js.native
  var ShaderChunk: AnonAlphamapfragment = js.native
  var ShaderLib: AnonBackground = js.native
  var ShaderMaterial: Instantiable0[typings.three.mod.ShaderMaterial] = js.native
  var ShadowMaterial: Instantiable0[typings.three.mod.ShadowMaterial] = js.native
  var Shape: Instantiable0[typings.three.mod.Shape] = js.native
  var ShapeBufferGeometry: Instantiable1[/* shapes */ Shape, typings.three.mod.ShapeBufferGeometry] = js.native
  var ShapeGeometry: Instantiable1[/* shapes */ Shape, typings.three.mod.ShapeGeometry] = js.native
  var ShapePath: Instantiable0[typings.three.mod.ShapePath] = js.native
  val ShapeUtils: TypeofShapeUtils = js.native
  val ShortType: TextureDataType = js.native
  var Skeleton: Instantiable1[/* bones */ js.Array[Bone], typings.three.mod.Skeleton] = js.native
  var SkeletonHelper: Instantiable1[/* bone */ Object3D, typings.three.mod.SkeletonHelper] = js.native
  var SkinnedMesh: Instantiable0[typings.three.mod.SkinnedMesh] = js.native
  val SmoothShading: Shading = js.native
  var Sphere: Instantiable0[typings.three.mod.Sphere] = js.native
  var SphereBufferGeometry: Instantiable7[
    js.UndefOr[/* radius */ Double], 
    js.UndefOr[/* widthSegments */ Double], 
    js.UndefOr[/* heightSegments */ Double], 
    js.UndefOr[/* phiStart */ Double], 
    js.UndefOr[/* phiLength */ Double], 
    js.UndefOr[/* thetaStart */ Double], 
    js.UndefOr[/* thetaLength */ Double], 
    typings.three.mod.SphereBufferGeometry
  ] = js.native
  var SphereGeometry: Instantiable7[
    js.UndefOr[/* radius */ Double], 
    js.UndefOr[/* widthSegments */ Double], 
    js.UndefOr[/* heightSegments */ Double], 
    js.UndefOr[/* phiStart */ Double], 
    js.UndefOr[/* phiLength */ Double], 
    js.UndefOr[/* thetaStart */ Double], 
    js.UndefOr[/* thetaLength */ Double], 
    typings.three.mod.SphereGeometry
  ] = js.native
  var Spherical: Instantiable0[typings.three.mod.Spherical] = js.native
  var SphericalHarmonics3: TypeofClassSphericalHarmonics3 = js.native
  val SphericalReflectionMapping: Mapping = js.native
  var SplineCurve: Instantiable0[typings.three.mod.SplineCurve] = js.native
  var SpotLight: Instantiable6[
    js.UndefOr[/* color */ Color], 
    js.UndefOr[/* intensity */ Double], 
    js.UndefOr[/* distance */ Double], 
    js.UndefOr[/* angle */ Double], 
    js.UndefOr[/* exponent */ Double], 
    js.UndefOr[/* decay */ Double], 
    typings.three.mod.SpotLight
  ] = js.native
  var SpotLightHelper: Instantiable1[/* light */ Light, typings.three.mod.SpotLightHelper] = js.native
  var SpotLightShadow: Instantiable0[typings.three.mod.SpotLightShadow] = js.native
  var Sprite: Instantiable0[typings.three.mod.Sprite] = js.native
  var SpriteMaterial: Instantiable0[typings.three.mod.SpriteMaterial] = js.native
  val SrcAlphaFactor: BlendingDstFactor = js.native
  val SrcAlphaSaturateFactor: BlendingSrcFactor = js.native
  val SrcColorFactor: BlendingDstFactor = js.native
  var StereoCamera: Instantiable0[typings.three.mod.StereoCamera] = js.native
  var StringKeyframeTrack: Instantiable3[
    /* name */ String, 
    /* times */ js.Array[js.Any], 
    /* values */ js.Array[js.Any], 
    typings.three.mod.StringKeyframeTrack
  ] = js.native
  val SubtractEquation: BlendingEquation = js.native
  val SubtractiveBlending: Blending = js.native
  val TangentSpaceNormalMap: NormalMapTypes = js.native
  var TetrahedronBufferGeometry: Instantiable0[typings.three.mod.TetrahedronBufferGeometry] = js.native
  var TetrahedronGeometry: Instantiable0[typings.three.mod.TetrahedronGeometry] = js.native
  var TextBufferGeometry: Instantiable1[/* text */ String, typings.three.mod.TextBufferGeometry] = js.native
  var TextGeometry: Instantiable1[/* text */ String, typings.three.mod.TextGeometry] = js.native
  var Texture: TypeofClassTexture = js.native
  var TextureIdCount: Double = js.native
  var TextureLoader: Instantiable0[typings.three.mod.TextureLoader] = js.native
  var TorusBufferGeometry: Instantiable0[typings.three.mod.TorusBufferGeometry] = js.native
  var TorusGeometry: Instantiable0[typings.three.mod.TorusGeometry] = js.native
  var TorusKnotBufferGeometry: Instantiable6[
    js.UndefOr[/* radius */ Double], 
    js.UndefOr[/* tube */ Double], 
    js.UndefOr[/* tubularSegments */ Double], 
    js.UndefOr[/* radialSegments */ Double], 
    js.UndefOr[/* p */ Double], 
    js.UndefOr[/* q */ Double], 
    typings.three.mod.TorusKnotBufferGeometry
  ] = js.native
  var TorusKnotGeometry: Instantiable6[
    js.UndefOr[/* radius */ Double], 
    js.UndefOr[/* tube */ Double], 
    js.UndefOr[/* tubularSegments */ Double], 
    js.UndefOr[/* radialSegments */ Double], 
    js.UndefOr[/* p */ Double], 
    js.UndefOr[/* q */ Double], 
    typings.three.mod.TorusKnotGeometry
  ] = js.native
  var Triangle: TypeofClassTriangle = js.native
  val TriangleFanDrawMode: TrianglesDrawModes = js.native
  val TriangleStripDrawMode: TrianglesDrawModes = js.native
  val TrianglesDrawMode: TrianglesDrawModes = js.native
  var TubeBufferGeometry: Instantiable1[/* path */ Curve[Vector3], typings.three.mod.TubeBufferGeometry] = js.native
  var TubeGeometry: Instantiable1[/* path */ Curve[Vector3], typings.three.mod.TubeGeometry] = js.native
  val UVMapping: Mapping = js.native
  var Uint16Attribute: Instantiable2[/* array */ js.Any, /* itemSize */ Double, typings.three.mod.Uint16Attribute] = js.native
  var Uint16BufferAttribute: Instantiable2[
    /* array */ Iterable[Double], 
    /* itemSize */ Double, 
    typings.three.mod.Uint16BufferAttribute
  ] = js.native
  var Uint32Attribute: Instantiable2[/* array */ js.Any, /* itemSize */ Double, typings.three.mod.Uint32Attribute] = js.native
  var Uint32BufferAttribute: Instantiable2[
    /* array */ Iterable[Double], 
    /* itemSize */ Double, 
    typings.three.mod.Uint32BufferAttribute
  ] = js.native
  var Uint8Attribute: Instantiable2[/* array */ js.Any, /* itemSize */ Double, typings.three.mod.Uint8Attribute] = js.native
  var Uint8BufferAttribute: Instantiable2[
    /* array */ Iterable[Double], 
    /* itemSize */ Double, 
    typings.three.mod.Uint8BufferAttribute
  ] = js.native
  var Uint8ClampedAttribute: Instantiable2[/* array */ js.Any, /* itemSize */ Double, typings.three.mod.Uint8ClampedAttribute] = js.native
  var Uint8ClampedBufferAttribute: Instantiable2[
    /* array */ Iterable[Double], 
    /* itemSize */ Double, 
    typings.three.mod.Uint8ClampedBufferAttribute
  ] = js.native
  val Uncharted2ToneMapping: ToneMapping = js.native
  var Uniform: Instantiable1[/* value */ js.Any, typings.three.mod.Uniform] = js.native
  var UniformsLib: AnonAomap = js.native
  val UniformsUtils: js.Any = js.native
  val UnsignedByteType: TextureDataType = js.native
  val UnsignedInt248Type: PixelType = js.native
  val UnsignedIntType: TextureDataType = js.native
  val UnsignedShort4444Type: PixelType = js.native
  val UnsignedShort5551Type: PixelType = js.native
  val UnsignedShort565Type: PixelType = js.native
  val UnsignedShortType: TextureDataType = js.native
  val VSMShadowMap: ShadowMapType = js.native
  var Vector2: Instantiable0[typings.three.mod.Vector2] = js.native
  var Vector3: Instantiable0[typings.three.mod.Vector3] = js.native
  var Vector4: Instantiable0[typings.three.mod.Vector4] = js.native
  var VectorKeyframeTrack: Instantiable3[
    /* name */ String, 
    /* times */ js.Array[js.Any], 
    /* values */ js.Array[js.Any], 
    typings.three.mod.VectorKeyframeTrack
  ] = js.native
  val VertexColors: Colors = js.native
  var VertexNormalsHelper: Instantiable1[/* object */ Object3D, typings.three.mod.VertexNormalsHelper] = js.native
  var VideoTexture: Instantiable9[
    /* video */ HTMLVideoElement, 
    js.UndefOr[/* mapping */ Mapping], 
    js.UndefOr[/* wrapS */ Wrapping], 
    js.UndefOr[/* wrapT */ Wrapping], 
    js.UndefOr[/* magFilter */ TextureFilter], 
    js.UndefOr[/* minFilter */ TextureFilter], 
    js.UndefOr[/* format */ PixelFormat], 
    js.UndefOr[/* type */ TextureDataType], 
    js.UndefOr[/* anisotropy */ Double], 
    typings.three.mod.VideoTexture
  ] = js.native
  var WebGLBufferRenderer: Instantiable3[
    /* _gl */ WebGLRenderingContext, 
    /* extensions */ js.Any, 
    /* _infoRender */ js.Any, 
    typings.three.mod.WebGLBufferRenderer
  ] = js.native
  var WebGLCapabilities: Instantiable3[
    /* gl */ WebGLRenderingContext, 
    /* extensions */ js.Any, 
    /* parameters */ WebGLCapabilitiesParameters, 
    typings.three.mod.WebGLCapabilities
  ] = js.native
  var WebGLClipping: Instantiable0[typings.three.mod.WebGLClipping] = js.native
  var WebGLColorBuffer: Instantiable0[typings.three.mod.WebGLColorBuffer] = js.native
  var WebGLDepthBuffer: Instantiable0[typings.three.mod.WebGLDepthBuffer] = js.native
  var WebGLExtensions: Instantiable1[/* gl */ WebGLRenderingContext, typings.three.mod.WebGLExtensions] = js.native
  var WebGLGeometries: Instantiable3[
    /* gl */ WebGLRenderingContext, 
    /* extensions */ js.Any, 
    /* _infoRender */ js.Any, 
    typings.three.mod.WebGLGeometries
  ] = js.native
  var WebGLIndexedBufferRenderer: Instantiable3[
    /* gl */ WebGLRenderingContext, 
    /* properties */ js.Any, 
    /* info */ js.Any, 
    typings.three.mod.WebGLIndexedBufferRenderer
  ] = js.native
  var WebGLInfo: Instantiable0[typings.three.mod.WebGLInfo] = js.native
  var WebGLLights: Instantiable3[
    /* gl */ WebGLRenderingContext, 
    /* properties */ js.Any, 
    /* info */ js.Any, 
    typings.three.mod.WebGLLights
  ] = js.native
  var WebGLMultisampleRenderTarget: Instantiable2[
    /* width */ Double, 
    /* height */ Double, 
    typings.three.mod.WebGLMultisampleRenderTarget
  ] = js.native
  var WebGLObjects: Instantiable3[
    /* gl */ WebGLRenderingContext, 
    /* properties */ js.Any, 
    /* info */ js.Any, 
    typings.three.mod.WebGLObjects
  ] = js.native
  var WebGLProgram: Instantiable6[
    /* renderer */ WebGLRenderer, 
    /* extensions */ WebGLExtensions, 
    /* code */ String, 
    /* material */ ShaderMaterial, 
    /* shader */ WebGLShader, 
    /* parameters */ WebGLRendererParameters, 
    typings.three.mod.WebGLProgram
  ] = js.native
  var WebGLPrograms: Instantiable3[
    /* renderer */ WebGLRenderer, 
    /* extensions */ WebGLExtensions, 
    /* capabilities */ WebGLCapabilities, 
    typings.three.mod.WebGLPrograms
  ] = js.native
  var WebGLProperties: Instantiable0[typings.three.mod.WebGLProperties] = js.native
  var WebGLRenderList: Instantiable0[typings.three.mod.WebGLRenderList] = js.native
  var WebGLRenderLists: Instantiable0[typings.three.mod.WebGLRenderLists] = js.native
  var WebGLRenderTarget: Instantiable2[/* width */ Double, /* height */ Double, typings.three.mod.WebGLRenderTarget] = js.native
  var WebGLRenderTargetCube: Instantiable2[/* width */ Double, /* height */ Double, typings.three.mod.WebGLRenderTargetCube] = js.native
  var WebGLRenderer: Instantiable0[typings.three.mod.WebGLRenderer] = js.native
  var WebGLShader: Instantiable3[/* gl */ js.Any, /* type */ String, /* string */ String, typings.three.mod.WebGLShader] = js.native
  var WebGLShadowMap: Instantiable4[
    /* _renderer */ WebGLRenderer, 
    /* _lights */ js.Array[js.Any], 
    /* _objects */ js.Array[js.Any], 
    /* capabilities */ js.Any, 
    typings.three.mod.WebGLShadowMap
  ] = js.native
  var WebGLState: Instantiable4[
    /* gl */ WebGLRenderingContext, 
    /* extensions */ WebGLExtensions, 
    /* utils */ js.Any, 
    /* capabilities */ WebGLCapabilities, 
    typings.three.mod.WebGLState
  ] = js.native
  var WebGLStencilBuffer: Instantiable0[typings.three.mod.WebGLStencilBuffer] = js.native
  var WebGLTextures: Instantiable7[
    /* gl */ js.Any, 
    /* extensions */ js.Any, 
    /* state */ js.Any, 
    /* properties */ js.Any, 
    /* capabilities */ js.Any, 
    /* paramThreeToGL */ js.Function, 
    /* info */ js.Any, 
    typings.three.mod.WebGLTextures
  ] = js.native
  var WebGLUniforms: TypeofClassWebGLUniforms = js.native
  var WebVRManager: Instantiable1[/* renderer */ js.Any, typings.three.mod.WebVRManager] = js.native
  var WireframeGeometry: Instantiable1[
    /* geometry */ typings.three.geometryMod.Geometry, 
    typings.three.mod.WireframeGeometry
  ] = js.native
  val WrapAroundEnding: InterpolationEndingModes = js.native
  val ZeroCurvatureEnding: InterpolationEndingModes = js.native
  val ZeroFactor: BlendingDstFactor = js.native
  val ZeroSlopeEnding: InterpolationEndingModes = js.native
  val ZeroStencilOp: StencilOp = js.native
  val sRGBEncoding: TextureEncoding = js.native
  def cloneUniforms(uniforms_src: js.Any): js.Any = js.native
  def error(): Unit = js.native
  def error(message: js.Any, optionalParams: js.Any*): Unit = js.native
  def log(): Unit = js.native
  def log(message: js.Any, optionalParams: js.Any*): Unit = js.native
  def mergeUniforms(uniforms: js.Array[_]): js.Any = js.native
  def warn(): Unit = js.native
  def warn(message: js.Any, optionalParams: js.Any*): Unit = js.native
}

