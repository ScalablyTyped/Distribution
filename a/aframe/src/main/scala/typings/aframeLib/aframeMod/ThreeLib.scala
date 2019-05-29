package typings
package aframeLib.aframeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreeLib extends js.Object {
  val AddEquation: threeLib.srcConstantsMod.BlendingEquation = js.native
  val AddOperation: threeLib.srcConstantsMod.Combine = js.native
  val AdditiveBlending: threeLib.srcConstantsMod.Blending = js.native
  val AlphaFormat: threeLib.srcConstantsMod.PixelFormat = js.native
  val AlwaysDepth: threeLib.srcConstantsMod.DepthModes = js.native
  var AmbientLight: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.AmbientLight] = js.native
  var AnimationAction: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.AnimationAction] = js.native
  var AnimationClip: aframeLib.TypeofClassAnimationClip = js.native
  var AnimationLoader: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.AnimationLoader] = js.native
  var AnimationMixer: org.scalablytyped.runtime.Instantiable1[/* root */ js.Any, threeLib.threeMod.AnimationMixer] = js.native
  var AnimationObjectGroup: org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, threeLib.threeMod.AnimationObjectGroup] = js.native
  val AnimationUtilsNs: aframeLib.TypeofAnimationUtils = js.native
  var ArcCurve: org.scalablytyped.runtime.Instantiable6[
    /* aX */ scala.Double, 
    /* aY */ scala.Double, 
    /* aRadius */ scala.Double, 
    /* aStartAngle */ scala.Double, 
    /* aEndAngle */ scala.Double, 
    /* aClockwise */ scala.Boolean, 
    threeLib.threeMod.ArcCurve
  ] = js.native
  var ArrayCamera: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.ArrayCamera] = js.native
  var ArrowHelper: org.scalablytyped.runtime.Instantiable1[/* dir */ threeLib.srcMathVector3Mod.Vector3, threeLib.threeMod.ArrowHelper] = js.native
  var Audio: org.scalablytyped.runtime.Instantiable1[
    /* listener */ threeLib.srcAudioAudioListenerMod.AudioListener, 
    threeLib.threeMod.Audio
  ] = js.native
  var AudioAnalyser: org.scalablytyped.runtime.Instantiable2[/* audio */ js.Any, /* fftSize */ scala.Double, threeLib.threeMod.AudioAnalyser] = js.native
  var AudioBuffer: org.scalablytyped.runtime.Instantiable1[/* context */ js.Any, threeLib.threeMod.AudioBuffer] = js.native
  val AudioContext: stdLib.AudioContext = js.native
  var AudioListener: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.AudioListener] = js.native
  var AudioLoader: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.AudioLoader] = js.native
  var AxesHelper: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.AxesHelper] = js.native
  val BackSide: threeLib.srcConstantsMod.Side = js.native
  val BasicDepthPacking: threeLib.srcConstantsMod.DepthPackingStrategies = js.native
  val BasicShadowMap: threeLib.srcConstantsMod.ShadowMapType = js.native
  var Bone: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.Bone] = js.native
  var BooleanKeyframeTrack: org.scalablytyped.runtime.Instantiable3[
    /* name */ java.lang.String, 
    /* times */ js.Array[js.Any], 
    /* values */ js.Array[js.Any], 
    threeLib.threeMod.BooleanKeyframeTrack
  ] = js.native
  var Box2: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.Box2] = js.native
  var Box3: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.Box3] = js.native
  var Box3Helper: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.Box3Helper] = js.native
  var BoxBufferGeometry: org.scalablytyped.runtime.Instantiable6[
    js.UndefOr[/* width */ scala.Double], 
    js.UndefOr[/* height */ scala.Double], 
    js.UndefOr[/* depth */ scala.Double], 
    js.UndefOr[/* widthSegments */ scala.Double], 
    js.UndefOr[/* heightSegments */ scala.Double], 
    js.UndefOr[/* depthSegments */ scala.Double], 
    threeLib.threeMod.BoxBufferGeometry
  ] = js.native
  var BoxGeometry: org.scalablytyped.runtime.Instantiable6[
    js.UndefOr[/* width */ scala.Double], 
    js.UndefOr[/* height */ scala.Double], 
    js.UndefOr[/* depth */ scala.Double], 
    js.UndefOr[/* widthSegments */ scala.Double], 
    js.UndefOr[/* heightSegments */ scala.Double], 
    js.UndefOr[/* depthSegments */ scala.Double], 
    threeLib.threeMod.BoxGeometry
  ] = js.native
  var BoxHelper: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.BoxHelper] = js.native
  var BufferAttribute: org.scalablytyped.runtime.Instantiable2[
    /* array */ stdLib.ArrayLike[scala.Double], 
    /* itemSize */ scala.Double, 
    threeLib.threeMod.BufferAttribute
  ] = js.native
  var BufferGeometry: aframeLib.TypeofClassBufferGeometry = js.native
  var BufferGeometryLoader: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.BufferGeometryLoader] = js.native
  val BufferGeometryUtilsNs: aframeLib.TypeofBufferGeometryUtils = js.native
  val ByteType: threeLib.srcConstantsMod.TextureDataType = js.native
  val CacheNs: aframeLib.TypeofCache = js.native
  var Camera: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.Camera] = js.native
  var CameraHelper: org.scalablytyped.runtime.Instantiable1[/* camera */ threeLib.srcCamerasCameraMod.Camera, threeLib.threeMod.CameraHelper] = js.native
  var CanvasTexture: org.scalablytyped.runtime.Instantiable9[
    /* canvas */ stdLib.HTMLImageElement, 
    js.UndefOr[/* mapping */ threeLib.srcConstantsMod.Mapping], 
    js.UndefOr[/* wrapS */ threeLib.srcConstantsMod.Wrapping], 
    js.UndefOr[/* wrapT */ threeLib.srcConstantsMod.Wrapping], 
    js.UndefOr[/* magFilter */ threeLib.srcConstantsMod.TextureFilter], 
    js.UndefOr[/* minFilter */ threeLib.srcConstantsMod.TextureFilter], 
    js.UndefOr[/* format */ threeLib.srcConstantsMod.PixelFormat], 
    js.UndefOr[/* type */ threeLib.srcConstantsMod.TextureDataType], 
    js.UndefOr[/* anisotropy */ scala.Double], 
    threeLib.threeMod.CanvasTexture
  ] = js.native
  var CatmullRomCurve3: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.CatmullRomCurve3] = js.native
  val CineonToneMapping: threeLib.srcConstantsMod.ToneMapping = js.native
  var CircleBufferGeometry: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.CircleBufferGeometry] = js.native
  var CircleGeometry: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.CircleGeometry] = js.native
  val ClampToEdgeWrapping: threeLib.srcConstantsMod.Wrapping = js.native
  var Clock: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.Clock] = js.native
  var Color: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.Color] = js.native
  var ColorKeyframeTrack: org.scalablytyped.runtime.Instantiable3[
    /* name */ java.lang.String, 
    /* times */ js.Array[js.Any], 
    /* values */ js.Array[js.Any], 
    threeLib.threeMod.ColorKeyframeTrack
  ] = js.native
  val ColorKeywordsNs: aframeLib.TypeofColorKeywords = js.native
  var CompressedTexture: org.scalablytyped.runtime.Instantiable12[
    /* mipmaps */ js.Array[stdLib.ImageData], 
    /* width */ scala.Double, 
    /* height */ scala.Double, 
    js.UndefOr[/* format */ threeLib.srcConstantsMod.PixelFormat], 
    js.UndefOr[/* type */ threeLib.srcConstantsMod.TextureDataType], 
    js.UndefOr[/* mapping */ threeLib.srcConstantsMod.Mapping], 
    js.UndefOr[/* wrapS */ threeLib.srcConstantsMod.Wrapping], 
    js.UndefOr[/* wrapT */ threeLib.srcConstantsMod.Wrapping], 
    js.UndefOr[/* magFilter */ threeLib.srcConstantsMod.TextureFilter], 
    js.UndefOr[/* minFilter */ threeLib.srcConstantsMod.TextureFilter], 
    js.UndefOr[/* anisotropy */ scala.Double], 
    js.UndefOr[/* encoding */ threeLib.srcConstantsMod.TextureEncoding], 
    threeLib.threeMod.CompressedTexture
  ] = js.native
  var CompressedTextureLoader: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.CompressedTextureLoader] = js.native
  var ConeBufferGeometry: org.scalablytyped.runtime.Instantiable7[
    js.UndefOr[/* radius */ scala.Double], 
    js.UndefOr[/* height */ scala.Double], 
    js.UndefOr[/* radialSegment */ scala.Double], 
    js.UndefOr[/* heightSegment */ scala.Double], 
    js.UndefOr[/* openEnded */ scala.Boolean], 
    js.UndefOr[/* thetaStart */ scala.Double], 
    js.UndefOr[/* thetaLength */ scala.Double], 
    threeLib.threeMod.ConeBufferGeometry
  ] = js.native
  var ConeGeometry: org.scalablytyped.runtime.Instantiable7[
    js.UndefOr[/* radius */ scala.Double], 
    js.UndefOr[/* height */ scala.Double], 
    js.UndefOr[/* radialSegment */ scala.Double], 
    js.UndefOr[/* heightSegment */ scala.Double], 
    js.UndefOr[/* openEnded */ scala.Boolean], 
    js.UndefOr[/* thetaStart */ scala.Double], 
    js.UndefOr[/* thetaLength */ scala.Double], 
    threeLib.threeMod.ConeGeometry
  ] = js.native
  var CubeCamera: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.CubeCamera] = js.native
  val CubeReflectionMapping: threeLib.srcConstantsMod.Mapping = js.native
  val CubeRefractionMapping: threeLib.srcConstantsMod.Mapping = js.native
  var CubeTexture: org.scalablytyped.runtime.Instantiable10[
    js.UndefOr[/* images */ js.Array[js.Any]], 
    js.UndefOr[/* mapping */ threeLib.srcConstantsMod.Mapping], 
    js.UndefOr[/* wrapS */ threeLib.srcConstantsMod.Wrapping], 
    js.UndefOr[/* wrapT */ threeLib.srcConstantsMod.Wrapping], 
    js.UndefOr[/* magFilter */ threeLib.srcConstantsMod.TextureFilter], 
    js.UndefOr[/* minFilter */ threeLib.srcConstantsMod.TextureFilter], 
    js.UndefOr[/* format */ threeLib.srcConstantsMod.PixelFormat], 
    js.UndefOr[/* type */ threeLib.srcConstantsMod.TextureDataType], 
    js.UndefOr[/* anisotropy */ scala.Double], 
    js.UndefOr[/* encoding */ threeLib.srcConstantsMod.TextureEncoding], 
    threeLib.threeMod.CubeTexture
  ] = js.native
  var CubeTextureLoader: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.CubeTextureLoader] = js.native
  val CubeUVReflectionMapping: threeLib.srcConstantsMod.Mapping = js.native
  val CubeUVRefractionMapping: threeLib.srcConstantsMod.Mapping = js.native
  var CubicBezierCurve: org.scalablytyped.runtime.Instantiable4[
    /* v0 */ threeLib.srcMathVector2Mod.Vector2, 
    /* v1 */ threeLib.srcMathVector2Mod.Vector2, 
    /* v2 */ threeLib.srcMathVector2Mod.Vector2, 
    /* v3 */ threeLib.srcMathVector2Mod.Vector2, 
    threeLib.threeMod.CubicBezierCurve
  ] = js.native
  var CubicBezierCurve3: org.scalablytyped.runtime.Instantiable4[
    /* v0 */ threeLib.srcMathVector3Mod.Vector3, 
    /* v1 */ threeLib.srcMathVector3Mod.Vector3, 
    /* v2 */ threeLib.srcMathVector3Mod.Vector3, 
    /* v3 */ threeLib.srcMathVector3Mod.Vector3, 
    threeLib.threeMod.CubicBezierCurve3
  ] = js.native
  var CubicInterpolant: org.scalablytyped.runtime.Instantiable3[
    /* parameterPositions */ js.Any, 
    /* samplesValues */ js.Any, 
    /* sampleSize */ scala.Double, 
    threeLib.threeMod.CubicInterpolant
  ] = js.native
  val CullFaceBack: threeLib.srcConstantsMod.CullFace = js.native
  val CullFaceFront: threeLib.srcConstantsMod.CullFace = js.native
  val CullFaceFrontBack: threeLib.srcConstantsMod.CullFace = js.native
  val CullFaceNone: threeLib.srcConstantsMod.CullFace = js.native
  var Curve: aframeLib.TypeofClassCurve = js.native
  var CurvePath: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.CurvePath[threeLib.srcMathVector2Mod.Vector]] = js.native
  val CurveUtilsNs: aframeLib.TypeofCurveUtils = js.native
  val CustomBlending: threeLib.srcConstantsMod.Blending = js.native
  var CylinderBufferGeometry: org.scalablytyped.runtime.Instantiable8[
    js.UndefOr[/* radiusTop */ scala.Double], 
    js.UndefOr[/* radiusBottom */ scala.Double], 
    js.UndefOr[/* height */ scala.Double], 
    js.UndefOr[/* radialSegments */ scala.Double], 
    js.UndefOr[/* heightSegments */ scala.Double], 
    js.UndefOr[/* openEnded */ scala.Boolean], 
    js.UndefOr[/* thetaStart */ scala.Double], 
    js.UndefOr[/* thetaLength */ scala.Double], 
    threeLib.threeMod.CylinderBufferGeometry
  ] = js.native
  var CylinderGeometry: org.scalablytyped.runtime.Instantiable8[
    js.UndefOr[/* radiusTop */ scala.Double], 
    js.UndefOr[/* radiusBottom */ scala.Double], 
    js.UndefOr[/* height */ scala.Double], 
    js.UndefOr[/* radiusSegments */ scala.Double], 
    js.UndefOr[/* heightSegments */ scala.Double], 
    js.UndefOr[/* openEnded */ scala.Boolean], 
    js.UndefOr[/* thetaStart */ scala.Double], 
    js.UndefOr[/* thetaLength */ scala.Double], 
    threeLib.threeMod.CylinderGeometry
  ] = js.native
  var Cylindrical: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.Cylindrical] = js.native
  var DataTexture: org.scalablytyped.runtime.Instantiable12[
    /* data */ stdLib.ArrayBuffer, 
    /* width */ scala.Double, 
    /* height */ scala.Double, 
    js.UndefOr[/* format */ threeLib.srcConstantsMod.PixelFormat], 
    js.UndefOr[/* type */ threeLib.srcConstantsMod.TextureDataType], 
    js.UndefOr[/* mapping */ threeLib.srcConstantsMod.Mapping], 
    js.UndefOr[/* wrapS */ threeLib.srcConstantsMod.Wrapping], 
    js.UndefOr[/* wrapT */ threeLib.srcConstantsMod.Wrapping], 
    js.UndefOr[/* magFilter */ threeLib.srcConstantsMod.TextureFilter], 
    js.UndefOr[/* minFilter */ threeLib.srcConstantsMod.TextureFilter], 
    js.UndefOr[/* anisotropy */ scala.Double], 
    js.UndefOr[/* encoding */ threeLib.srcConstantsMod.TextureEncoding], 
    threeLib.threeMod.DataTexture
  ] = js.native
  var DataTexture3D: org.scalablytyped.runtime.Instantiable4[
    /* data */ stdLib.ArrayBuffer, 
    /* width */ scala.Double, 
    /* height */ scala.Double, 
    /* depth */ scala.Double, 
    threeLib.threeMod.DataTexture3D
  ] = js.native
  var DataTextureLoader: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.DataTextureLoader] = js.native
  val DefaultLoadingManager: threeLib.srcLoadersLoadingManagerMod.LoadingManager = js.native
  val DepthFormat: threeLib.srcConstantsMod.PixelFormat = js.native
  val DepthStencilFormat: threeLib.srcConstantsMod.PixelFormat = js.native
  var DepthTexture: org.scalablytyped.runtime.Instantiable9[
    /* width */ scala.Double, 
    /* heighht */ scala.Double, 
    js.UndefOr[/* type */ threeLib.srcConstantsMod.TextureDataType], 
    js.UndefOr[/* mapping */ threeLib.srcConstantsMod.Mapping], 
    js.UndefOr[/* wrapS */ threeLib.srcConstantsMod.Wrapping], 
    js.UndefOr[/* wrapT */ threeLib.srcConstantsMod.Wrapping], 
    js.UndefOr[/* magFilter */ threeLib.srcConstantsMod.TextureFilter], 
    js.UndefOr[/* minFilter */ threeLib.srcConstantsMod.TextureFilter], 
    js.UndefOr[/* anisotropy */ scala.Double], 
    threeLib.threeMod.DepthTexture
  ] = js.native
  var DirectGeometry: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.DirectGeometry] = js.native
  var DirectionalLight: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.DirectionalLight] = js.native
  var DirectionalLightHelper: org.scalablytyped.runtime.Instantiable1[
    /* light */ threeLib.srcLightsDirectionalLightMod.DirectionalLight, 
    threeLib.threeMod.DirectionalLightHelper
  ] = js.native
  var DirectionalLightShadow: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.DirectionalLightShadow] = js.native
  var DiscreteInterpolant: org.scalablytyped.runtime.Instantiable3[
    /* parameterPositions */ js.Any, 
    /* samplesValues */ js.Any, 
    /* sampleSize */ scala.Double, 
    threeLib.threeMod.DiscreteInterpolant
  ] = js.native
  var DodecahedronBufferGeometry: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.DodecahedronBufferGeometry] = js.native
  var DodecahedronGeometry: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.DodecahedronGeometry] = js.native
  val DoubleSide: threeLib.srcConstantsMod.Side = js.native
  val DstAlphaFactor: threeLib.srcConstantsMod.BlendingDstFactor = js.native
  val DstColorFactor: threeLib.srcConstantsMod.BlendingDstFactor = js.native
  var EdgesGeometry: org.scalablytyped.runtime.Instantiable1[
    /* geometry */ threeLib.srcCoreBufferGeometryMod.BufferGeometry, 
    threeLib.threeMod.EdgesGeometry
  ] = js.native
  var EllipseCurve: org.scalablytyped.runtime.Instantiable8[
    /* aX */ scala.Double, 
    /* aY */ scala.Double, 
    /* xRadius */ scala.Double, 
    /* yRadius */ scala.Double, 
    /* aStartAngle */ scala.Double, 
    /* aEndAngle */ scala.Double, 
    /* aClockwise */ scala.Boolean, 
    /* aRotation */ scala.Double, 
    threeLib.threeMod.EllipseCurve
  ] = js.native
  val EqualDepth: threeLib.srcConstantsMod.DepthModes = js.native
  val EquirectangularReflectionMapping: threeLib.srcConstantsMod.Mapping = js.native
  val EquirectangularRefractionMapping: threeLib.srcConstantsMod.Mapping = js.native
  var Euler: aframeLib.TypeofClassEuler = js.native
  var EventDispatcher: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.EventDispatcher] = js.native
  var ExtrudeBufferGeometry: aframeLib.TypeofClassExtrudeBufferGeometry = js.native
  var ExtrudeGeometry: aframeLib.TypeofClassExtrudeGeometry = js.native
  var Face3: org.scalablytyped.runtime.Instantiable3[
    /* a */ scala.Double, 
    /* b */ scala.Double, 
    /* c */ scala.Double, 
    threeLib.threeMod.Face3
  ] = js.native
  val FaceColors: threeLib.srcConstantsMod.Colors = js.native
  var FaceNormalsHelper: org.scalablytyped.runtime.Instantiable1[
    /* object */ threeLib.srcCoreObject3DMod.Object3D, 
    threeLib.threeMod.FaceNormalsHelper
  ] = js.native
  var FileLoader: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.FileLoader] = js.native
  val FlatShading: threeLib.srcConstantsMod.Shading = js.native
  var Float32Attribute: org.scalablytyped.runtime.Instantiable2[/* array */ js.Any, /* itemSize */ scala.Double, threeLib.threeMod.Float32Attribute] = js.native
  var Float32BufferAttribute: org.scalablytyped.runtime.Instantiable2[
    /* array */ stdLib.Iterable[scala.Double], 
    /* itemSize */ scala.Double, 
    threeLib.threeMod.Float32BufferAttribute
  ] = js.native
  var Float64Attribute: org.scalablytyped.runtime.Instantiable2[/* array */ js.Any, /* itemSize */ scala.Double, threeLib.threeMod.Float64Attribute] = js.native
  var Float64BufferAttribute: org.scalablytyped.runtime.Instantiable2[
    /* array */ stdLib.Iterable[scala.Double], 
    /* itemSize */ scala.Double, 
    threeLib.threeMod.Float64BufferAttribute
  ] = js.native
  val FloatType: threeLib.srcConstantsMod.TextureDataType = js.native
  var Fog: org.scalablytyped.runtime.Instantiable1[/* hex */ scala.Double, threeLib.threeMod.Fog] = js.native
  var FogExp2: org.scalablytyped.runtime.Instantiable1[/* hex */ scala.Double, threeLib.threeMod.FogExp2] = js.native
  var Font: org.scalablytyped.runtime.Instantiable1[/* jsondata */ js.Any, threeLib.threeMod.Font] = js.native
  var FontLoader: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.FontLoader] = js.native
  val FrontFaceDirectionCCW: threeLib.srcConstantsMod.FrontFaceDirection = js.native
  val FrontFaceDirectionCW: threeLib.srcConstantsMod.FrontFaceDirection = js.native
  val FrontSide: threeLib.srcConstantsMod.Side = js.native
  var Frustum: org.scalablytyped.runtime.Instantiable6[
    js.UndefOr[/* p0 */ threeLib.srcMathPlaneMod.Plane], 
    js.UndefOr[/* p1 */ threeLib.srcMathPlaneMod.Plane], 
    js.UndefOr[/* p2 */ threeLib.srcMathPlaneMod.Plane], 
    js.UndefOr[/* p3 */ threeLib.srcMathPlaneMod.Plane], 
    js.UndefOr[/* p4 */ threeLib.srcMathPlaneMod.Plane], 
    js.UndefOr[/* p5 */ threeLib.srcMathPlaneMod.Plane], 
    threeLib.threeMod.Frustum
  ] = js.native
  val GammaEncoding: threeLib.srcConstantsMod.TextureEncoding = js.native
  var Geometry: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.Geometry] = js.native
  var GeometryIdCount: scala.Double = js.native
  val GeometryUtilsNs: aframeLib.TypeofGeometryUtils = js.native
  val GreaterDepth: threeLib.srcConstantsMod.DepthModes = js.native
  val GreaterEqualDepth: threeLib.srcConstantsMod.DepthModes = js.native
  var GridHelper: org.scalablytyped.runtime.Instantiable2[/* size */ scala.Double, /* divisions */ scala.Double, threeLib.threeMod.GridHelper] = js.native
  var Group: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.Group] = js.native
  val HalfFloatType: threeLib.srcConstantsMod.TextureDataType = js.native
  var HemisphereLight: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.HemisphereLight] = js.native
  var HemisphereLightHelper: org.scalablytyped.runtime.Instantiable2[
    /* light */ threeLib.srcLightsHemisphereLightMod.HemisphereLight, 
    /* size */ scala.Double, 
    threeLib.threeMod.HemisphereLightHelper
  ] = js.native
  var IcosahedronBufferGeometry: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.IcosahedronBufferGeometry] = js.native
  var IcosahedronGeometry: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.IcosahedronGeometry] = js.native
  var ImageBitmapLoader: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.ImageBitmapLoader] = js.native
  var ImageLoader: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.ImageLoader] = js.native
  val ImageUtilsNs: aframeLib.TypeofImageUtils = js.native
  var ImmediateRenderObject: org.scalablytyped.runtime.Instantiable1[
    /* material */ threeLib.srcMaterialsMaterialMod.Material, 
    threeLib.threeMod.ImmediateRenderObject
  ] = js.native
  var InstancedBufferAttribute: org.scalablytyped.runtime.Instantiable2[
    /* array */ stdLib.ArrayLike[scala.Double], 
    /* itemSize */ scala.Double, 
    threeLib.threeMod.InstancedBufferAttribute
  ] = js.native
  var InstancedBufferGeometry: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.InstancedBufferGeometry] = js.native
  var InstancedInterleavedBuffer: org.scalablytyped.runtime.Instantiable2[
    /* array */ stdLib.ArrayLike[scala.Double], 
    /* stride */ scala.Double, 
    threeLib.threeMod.InstancedInterleavedBuffer
  ] = js.native
  var Int16Attribute: org.scalablytyped.runtime.Instantiable2[/* array */ js.Any, /* itemSize */ scala.Double, threeLib.threeMod.Int16Attribute] = js.native
  var Int16BufferAttribute: org.scalablytyped.runtime.Instantiable2[
    /* array */ stdLib.Iterable[scala.Double], 
    /* itemSize */ scala.Double, 
    threeLib.threeMod.Int16BufferAttribute
  ] = js.native
  var Int32Attribute: org.scalablytyped.runtime.Instantiable2[/* array */ js.Any, /* itemSize */ scala.Double, threeLib.threeMod.Int32Attribute] = js.native
  var Int32BufferAttribute: org.scalablytyped.runtime.Instantiable2[
    /* array */ stdLib.Iterable[scala.Double], 
    /* itemSize */ scala.Double, 
    threeLib.threeMod.Int32BufferAttribute
  ] = js.native
  var Int8Attribute: org.scalablytyped.runtime.Instantiable2[/* array */ js.Any, /* itemSize */ scala.Double, threeLib.threeMod.Int8Attribute] = js.native
  var Int8BufferAttribute: org.scalablytyped.runtime.Instantiable2[
    /* array */ stdLib.Iterable[scala.Double], 
    /* itemSize */ scala.Double, 
    threeLib.threeMod.Int8BufferAttribute
  ] = js.native
  val IntType: threeLib.srcConstantsMod.TextureDataType = js.native
  var InterleavedBuffer: org.scalablytyped.runtime.Instantiable2[
    /* array */ stdLib.ArrayLike[scala.Double], 
    /* stride */ scala.Double, 
    threeLib.threeMod.InterleavedBuffer
  ] = js.native
  var InterleavedBufferAttribute: org.scalablytyped.runtime.Instantiable3[
    /* interleavedBuffer */ threeLib.srcCoreInterleavedBufferMod.InterleavedBuffer, 
    /* itemSize */ scala.Double, 
    /* offset */ scala.Double, 
    threeLib.threeMod.InterleavedBufferAttribute
  ] = js.native
  var Interpolant: org.scalablytyped.runtime.Instantiable3[
    /* parameterPositions */ js.Any, 
    /* samplesValues */ js.Any, 
    /* sampleSize */ scala.Double, 
    threeLib.threeMod.Interpolant
  ] = js.native
  val InterpolateDiscrete: threeLib.srcConstantsMod.InterpolationModes = js.native
  val InterpolateLinear: threeLib.srcConstantsMod.InterpolationModes = js.native
  val InterpolateSmooth: threeLib.srcConstantsMod.InterpolationModes = js.native
  var JSONLoader: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.JSONLoader] = js.native
  var KeyframeTrack: aframeLib.TypeofClassKeyframeTrack = js.native
  var LOD: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.LOD] = js.native
  var LatheBufferGeometry: org.scalablytyped.runtime.Instantiable1[
    /* points */ js.Array[threeLib.srcMathVector2Mod.Vector2], 
    threeLib.threeMod.LatheBufferGeometry
  ] = js.native
  var LatheGeometry: org.scalablytyped.runtime.Instantiable1[
    /* points */ js.Array[threeLib.srcMathVector2Mod.Vector2], 
    threeLib.threeMod.LatheGeometry
  ] = js.native
  var Layers: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.Layers] = js.native
  val LessDepth: threeLib.srcConstantsMod.DepthModes = js.native
  val LessEqualDepth: threeLib.srcConstantsMod.DepthModes = js.native
  var Light: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.Light] = js.native
  var LightShadow: org.scalablytyped.runtime.Instantiable1[/* camera */ threeLib.srcCamerasCameraMod.Camera, threeLib.threeMod.LightShadow] = js.native
  var Line: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.Line] = js.native
  var Line3: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.Line3] = js.native
  var LineBasicMaterial: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.LineBasicMaterial] = js.native
  var LineCurve: org.scalablytyped.runtime.Instantiable2[
    /* v1 */ threeLib.srcMathVector2Mod.Vector2, 
    /* v2 */ threeLib.srcMathVector2Mod.Vector2, 
    threeLib.threeMod.LineCurve
  ] = js.native
  var LineCurve3: org.scalablytyped.runtime.Instantiable2[
    /* v1 */ threeLib.srcMathVector3Mod.Vector3, 
    /* v2 */ threeLib.srcMathVector3Mod.Vector3, 
    threeLib.threeMod.LineCurve3
  ] = js.native
  var LineDashedMaterial: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.LineDashedMaterial] = js.native
  var LineLoop: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.LineLoop] = js.native
  val LinePieces: scala.Double = js.native
  var LineSegments: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.LineSegments] = js.native
  val LineStrip: scala.Double = js.native
  val LinearEncoding: threeLib.srcConstantsMod.TextureEncoding = js.native
  val LinearFilter: threeLib.srcConstantsMod.TextureFilter = js.native
  var LinearInterpolant: org.scalablytyped.runtime.Instantiable3[
    /* parameterPositions */ js.Any, 
    /* samplesValues */ js.Any, 
    /* sampleSize */ scala.Double, 
    threeLib.threeMod.LinearInterpolant
  ] = js.native
  val LinearMipMapLinearFilter: threeLib.srcConstantsMod.TextureFilter = js.native
  val LinearMipMapNearestFilter: threeLib.srcConstantsMod.TextureFilter = js.native
  val LinearToneMapping: threeLib.srcConstantsMod.ToneMapping = js.native
  var Loader: aframeLib.TypeofClassLoader = js.native
  var LoaderUtils: aframeLib.TypeofClassLoaderUtils = js.native
  var LoadingManager: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.LoadingManager] = js.native
  val LogLuvEncoding: threeLib.srcConstantsMod.TextureEncoding = js.native
  val LoopOnce: threeLib.srcConstantsMod.AnimationActionLoopStyles = js.native
  val LoopPingPong: threeLib.srcConstantsMod.AnimationActionLoopStyles = js.native
  val LoopRepeat: threeLib.srcConstantsMod.AnimationActionLoopStyles = js.native
  val LuminanceAlphaFormat: threeLib.srcConstantsMod.PixelFormat = js.native
  val LuminanceFormat: threeLib.srcConstantsMod.PixelFormat = js.native
  var Material: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.Material] = js.native
  var MaterialIdCount: scala.Double = js.native
  var MaterialLoader: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.MaterialLoader] = js.native
  val MathNs: aframeLib.TypeofMath = js.native
  var Matrix3: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.Matrix3] = js.native
  var Matrix4: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.Matrix4] = js.native
  val MaxEquation: threeLib.srcConstantsMod.BlendingEquation = js.native
  var Mesh: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.Mesh] = js.native
  var MeshBasicMaterial: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.MeshBasicMaterial] = js.native
  var MeshDepthMaterial: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.MeshDepthMaterial] = js.native
  var MeshDistanceMaterial: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.MeshDistanceMaterial] = js.native
  var MeshLambertMaterial: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.MeshLambertMaterial] = js.native
  var MeshMatcapMaterial: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.MeshMatcapMaterial] = js.native
  var MeshNormalMaterial: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.MeshNormalMaterial] = js.native
  var MeshPhongMaterial: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.MeshPhongMaterial] = js.native
  var MeshPhysicalMaterial: org.scalablytyped.runtime.Instantiable1[
    /* parameters */ threeLib.srcMaterialsMeshPhysicalMaterialMod.MeshPhysicalMaterialParameters, 
    threeLib.threeMod.MeshPhysicalMaterial
  ] = js.native
  var MeshStandardMaterial: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.MeshStandardMaterial] = js.native
  var MeshToonMaterial: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.MeshToonMaterial] = js.native
  val MinEquation: threeLib.srcConstantsMod.BlendingEquation = js.native
  val MirroredRepeatWrapping: threeLib.srcConstantsMod.Wrapping = js.native
  val MixOperation: threeLib.srcConstantsMod.Combine = js.native
  var MultiMaterial: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.MultiMaterial] = js.native
  val MultiplyBlending: threeLib.srcConstantsMod.Blending = js.native
  val MultiplyOperation: threeLib.srcConstantsMod.Combine = js.native
  val NearestFilter: threeLib.srcConstantsMod.TextureFilter = js.native
  val NearestMipMapLinearFilter: threeLib.srcConstantsMod.TextureFilter = js.native
  val NearestMipMapNearestFilter: threeLib.srcConstantsMod.TextureFilter = js.native
  val NeverDepth: threeLib.srcConstantsMod.DepthModes = js.native
  val NoBlending: threeLib.srcConstantsMod.Blending = js.native
  val NoColors: threeLib.srcConstantsMod.Colors = js.native
  val NoToneMapping: threeLib.srcConstantsMod.ToneMapping = js.native
  val NormalBlending: threeLib.srcConstantsMod.Blending = js.native
  val NotEqualDepth: threeLib.srcConstantsMod.DepthModes = js.native
  var NumberKeyframeTrack: org.scalablytyped.runtime.Instantiable3[
    /* name */ java.lang.String, 
    /* times */ js.Array[js.Any], 
    /* values */ js.Array[js.Any], 
    threeLib.threeMod.NumberKeyframeTrack
  ] = js.native
  var Object3D: aframeLib.TypeofClassObject3D = js.native
  var Object3DIdCount: scala.Double = js.native
  var ObjectLoader: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.ObjectLoader] = js.native
  val ObjectSpaceNormalMap: threeLib.srcConstantsMod.NormalMapTypes = js.native
  var OctahedronBufferGeometry: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.OctahedronBufferGeometry] = js.native
  var OctahedronGeometry: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.OctahedronGeometry] = js.native
  val OneFactor: threeLib.srcConstantsMod.BlendingDstFactor = js.native
  val OneMinusDstAlphaFactor: threeLib.srcConstantsMod.BlendingDstFactor = js.native
  val OneMinusDstColorFactor: threeLib.srcConstantsMod.BlendingDstFactor = js.native
  val OneMinusSrcAlphaFactor: threeLib.srcConstantsMod.BlendingDstFactor = js.native
  val OneMinusSrcColorFactor: threeLib.srcConstantsMod.BlendingDstFactor = js.native
  var OrthographicCamera: org.scalablytyped.runtime.Instantiable4[
    /* left */ scala.Double, 
    /* right */ scala.Double, 
    /* top */ scala.Double, 
    /* bottom */ scala.Double, 
    threeLib.threeMod.OrthographicCamera
  ] = js.native
  val PCFShadowMap: threeLib.srcConstantsMod.ShadowMapType = js.native
  val PCFSoftShadowMap: threeLib.srcConstantsMod.ShadowMapType = js.native
  var ParametricBufferGeometry: org.scalablytyped.runtime.Instantiable3[
    /* func */ js.Function3[
      /* u */ scala.Double, 
      /* v */ scala.Double, 
      /* dest */ threeLib.srcMathVector3Mod.Vector3, 
      scala.Unit
    ], 
    /* slices */ scala.Double, 
    /* stacks */ scala.Double, 
    threeLib.threeMod.ParametricBufferGeometry
  ] = js.native
  var ParametricGeometry: org.scalablytyped.runtime.Instantiable3[
    /* func */ js.Function3[
      /* u */ scala.Double, 
      /* v */ scala.Double, 
      /* dest */ threeLib.srcMathVector3Mod.Vector3, 
      scala.Unit
    ], 
    /* slices */ scala.Double, 
    /* stacks */ scala.Double, 
    threeLib.threeMod.ParametricGeometry
  ] = js.native
  var Path: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.Path] = js.native
  var PerspectiveCamera: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.PerspectiveCamera] = js.native
  var Plane: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.Plane] = js.native
  var PlaneBufferGeometry: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.PlaneBufferGeometry] = js.native
  var PlaneGeometry: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.PlaneGeometry] = js.native
  var PlaneHelper: org.scalablytyped.runtime.Instantiable1[/* plane */ threeLib.srcMathPlaneMod.Plane, threeLib.threeMod.PlaneHelper] = js.native
  var PointLight: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.PointLight] = js.native
  var PointLightHelper: org.scalablytyped.runtime.Instantiable1[
    /* light */ threeLib.srcLightsPointLightMod.PointLight, 
    threeLib.threeMod.PointLightHelper
  ] = js.native
  var PointLightShadow: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.PointLightShadow] = js.native
  var Points: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.Points] = js.native
  var PointsMaterial: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.PointsMaterial] = js.native
  var PolarGridHelper: org.scalablytyped.runtime.Instantiable6[
    /* radius */ scala.Double, 
    /* radials */ scala.Double, 
    /* circles */ scala.Double, 
    /* divisions */ scala.Double, 
    /* color1 */ threeLib.srcMathColorMod.Color, 
    /* color2 */ threeLib.srcMathColorMod.Color, 
    threeLib.threeMod.PolarGridHelper
  ] = js.native
  var PolyhedronBufferGeometry: org.scalablytyped.runtime.Instantiable2[
    /* vertices */ js.Array[scala.Double], 
    /* indices */ js.Array[scala.Double], 
    threeLib.threeMod.PolyhedronBufferGeometry
  ] = js.native
  var PolyhedronGeometry: org.scalablytyped.runtime.Instantiable2[
    /* vertices */ js.Array[scala.Double], 
    /* indices */ js.Array[scala.Double], 
    threeLib.threeMod.PolyhedronGeometry
  ] = js.native
  var PositionalAudio: org.scalablytyped.runtime.Instantiable1[
    /* listener */ threeLib.srcAudioAudioListenerMod.AudioListener, 
    threeLib.threeMod.PositionalAudio
  ] = js.native
  var PositionalAudioHelper: org.scalablytyped.runtime.Instantiable1[
    /* audio */ threeLib.srcAudioPositionalAudioMod.PositionalAudio, 
    threeLib.threeMod.PositionalAudioHelper
  ] = js.native
  var PropertyBinding: aframeLib.TypeofClassPropertyBinding = js.native
  val PropertyBindingNs: aframeLib.TypeofPropertyBinding = js.native
  var PropertyMixer: org.scalablytyped.runtime.Instantiable3[
    /* binding */ js.Any, 
    /* typeName */ java.lang.String, 
    /* valueSize */ scala.Double, 
    threeLib.threeMod.PropertyMixer
  ] = js.native
  var QuadraticBezierCurve: org.scalablytyped.runtime.Instantiable3[
    /* v0 */ threeLib.srcMathVector2Mod.Vector2, 
    /* v1 */ threeLib.srcMathVector2Mod.Vector2, 
    /* v2 */ threeLib.srcMathVector2Mod.Vector2, 
    threeLib.threeMod.QuadraticBezierCurve
  ] = js.native
  var QuadraticBezierCurve3: org.scalablytyped.runtime.Instantiable3[
    /* v0 */ threeLib.srcMathVector3Mod.Vector3, 
    /* v1 */ threeLib.srcMathVector3Mod.Vector3, 
    /* v2 */ threeLib.srcMathVector3Mod.Vector3, 
    threeLib.threeMod.QuadraticBezierCurve3
  ] = js.native
  var Quaternion: aframeLib.TypeofClassQuaternion = js.native
  var QuaternionKeyframeTrack: org.scalablytyped.runtime.Instantiable3[
    /* name */ java.lang.String, 
    /* times */ js.Array[js.Any], 
    /* values */ js.Array[js.Any], 
    threeLib.threeMod.QuaternionKeyframeTrack
  ] = js.native
  var QuaternionLinearInterpolant: org.scalablytyped.runtime.Instantiable3[
    /* parameterPositions */ js.Any, 
    /* samplesValues */ js.Any, 
    /* sampleSize */ scala.Double, 
    threeLib.threeMod.QuaternionLinearInterpolant
  ] = js.native
  val REVISION: java.lang.String = js.native
  val RGBADepthPacking: threeLib.srcConstantsMod.DepthPackingStrategies = js.native
  val RGBAFormat: threeLib.srcConstantsMod.PixelFormat = js.native
  val RGBA_ASTC_10x10_Format: threeLib.srcConstantsMod.CompressedPixelFormat = js.native
  val RGBA_ASTC_10x5_Format: threeLib.srcConstantsMod.CompressedPixelFormat = js.native
  val RGBA_ASTC_10x6_Format: threeLib.srcConstantsMod.CompressedPixelFormat = js.native
  val RGBA_ASTC_10x8_Format: threeLib.srcConstantsMod.CompressedPixelFormat = js.native
  val RGBA_ASTC_12x10_Format: threeLib.srcConstantsMod.CompressedPixelFormat = js.native
  val RGBA_ASTC_12x12_Format: threeLib.srcConstantsMod.CompressedPixelFormat = js.native
  val RGBA_ASTC_4x4_Format: threeLib.srcConstantsMod.CompressedPixelFormat = js.native
  val RGBA_ASTC_5x4_Format: threeLib.srcConstantsMod.CompressedPixelFormat = js.native
  val RGBA_ASTC_5x5_Format: threeLib.srcConstantsMod.CompressedPixelFormat = js.native
  val RGBA_ASTC_6x5_Format: threeLib.srcConstantsMod.CompressedPixelFormat = js.native
  val RGBA_ASTC_6x6_Format: threeLib.srcConstantsMod.CompressedPixelFormat = js.native
  val RGBA_ASTC_8x5_Format: threeLib.srcConstantsMod.CompressedPixelFormat = js.native
  val RGBA_ASTC_8x6_Format: threeLib.srcConstantsMod.CompressedPixelFormat = js.native
  val RGBA_ASTC_8x8_Format: threeLib.srcConstantsMod.CompressedPixelFormat = js.native
  val RGBA_PVRTC_2BPPV1_Format: threeLib.srcConstantsMod.CompressedPixelFormat = js.native
  val RGBA_PVRTC_4BPPV1_Format: threeLib.srcConstantsMod.CompressedPixelFormat = js.native
  val RGBA_S3TC_DXT1_Format: threeLib.srcConstantsMod.CompressedPixelFormat = js.native
  val RGBA_S3TC_DXT3_Format: threeLib.srcConstantsMod.CompressedPixelFormat = js.native
  val RGBA_S3TC_DXT5_Format: threeLib.srcConstantsMod.CompressedPixelFormat = js.native
  val RGBDEncoding: threeLib.srcConstantsMod.TextureEncoding = js.native
  val RGBEEncoding: threeLib.srcConstantsMod.TextureEncoding = js.native
  val RGBEFormat: threeLib.srcConstantsMod.PixelFormat = js.native
  val RGBFormat: threeLib.srcConstantsMod.PixelFormat = js.native
  val RGBM16Encoding: threeLib.srcConstantsMod.TextureEncoding = js.native
  val RGBM7Encoding: threeLib.srcConstantsMod.TextureEncoding = js.native
  val RGB_ETC1_Format: threeLib.srcConstantsMod.CompressedPixelFormat = js.native
  val RGB_PVRTC_2BPPV1_Format: threeLib.srcConstantsMod.CompressedPixelFormat = js.native
  val RGB_PVRTC_4BPPV1_Format: threeLib.srcConstantsMod.CompressedPixelFormat = js.native
  val RGB_S3TC_DXT1_Format: threeLib.srcConstantsMod.CompressedPixelFormat = js.native
  var RawShaderMaterial: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.RawShaderMaterial] = js.native
  var Ray: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.Ray] = js.native
  var Raycaster: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.Raycaster] = js.native
  var RectAreaLight: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.RectAreaLight] = js.native
  var RectAreaLightHelper: org.scalablytyped.runtime.Instantiable1[
    /* light */ threeLib.srcLightsRectAreaLightMod.RectAreaLight, 
    threeLib.threeMod.RectAreaLightHelper
  ] = js.native
  val RedFormat: threeLib.srcConstantsMod.PixelFormat = js.native
  val ReinhardToneMapping: threeLib.srcConstantsMod.ToneMapping = js.native
  val RepeatWrapping: threeLib.srcConstantsMod.Wrapping = js.native
  val ReverseSubtractEquation: threeLib.srcConstantsMod.BlendingEquation = js.native
  var RingBufferGeometry: org.scalablytyped.runtime.Instantiable6[
    js.UndefOr[/* innerRadius */ scala.Double], 
    js.UndefOr[/* outerRadius */ scala.Double], 
    js.UndefOr[/* thetaSegments */ scala.Double], 
    js.UndefOr[/* phiSegments */ scala.Double], 
    js.UndefOr[/* thetaStart */ scala.Double], 
    js.UndefOr[/* thetaLength */ scala.Double], 
    threeLib.threeMod.RingBufferGeometry
  ] = js.native
  var RingGeometry: org.scalablytyped.runtime.Instantiable6[
    js.UndefOr[/* innerRadius */ scala.Double], 
    js.UndefOr[/* outerRadius */ scala.Double], 
    js.UndefOr[/* thetaSegments */ scala.Double], 
    js.UndefOr[/* phiSegments */ scala.Double], 
    js.UndefOr[/* thetaStart */ scala.Double], 
    js.UndefOr[/* thetaLength */ scala.Double], 
    threeLib.threeMod.RingGeometry
  ] = js.native
  var Scene: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.Scene] = js.native
  val SceneUtilsNs: aframeLib.TypeofSceneUtils = js.native
  var ShaderChunk: aframeLib.Anon_Alphamapfragment = js.native
  var ShaderLib: aframeLib.Anon_Basic = js.native
  var ShaderMaterial: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.ShaderMaterial] = js.native
  var ShadowMaterial: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.ShadowMaterial] = js.native
  var Shape: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.Shape] = js.native
  var ShapeBufferGeometry: org.scalablytyped.runtime.Instantiable1[
    /* shapes */ threeLib.srcExtrasCoreShapeMod.Shape, 
    threeLib.threeMod.ShapeBufferGeometry
  ] = js.native
  var ShapeGeometry: org.scalablytyped.runtime.Instantiable1[/* shapes */ threeLib.srcExtrasCoreShapeMod.Shape, threeLib.threeMod.ShapeGeometry] = js.native
  var ShapePath: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.ShapePath] = js.native
  val ShapeUtilsNs: aframeLib.TypeofShapeUtils = js.native
  val ShortType: threeLib.srcConstantsMod.TextureDataType = js.native
  var Skeleton: org.scalablytyped.runtime.Instantiable1[/* bones */ js.Array[threeLib.srcObjectsBoneMod.Bone], threeLib.threeMod.Skeleton] = js.native
  var SkeletonHelper: org.scalablytyped.runtime.Instantiable1[/* bone */ threeLib.srcCoreObject3DMod.Object3D, threeLib.threeMod.SkeletonHelper] = js.native
  var SkinnedMesh: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.SkinnedMesh] = js.native
  val SmoothShading: threeLib.srcConstantsMod.Shading = js.native
  var Sphere: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.Sphere] = js.native
  var SphereBufferGeometry: org.scalablytyped.runtime.Instantiable7[
    js.UndefOr[/* radius */ scala.Double], 
    js.UndefOr[/* widthSegments */ scala.Double], 
    js.UndefOr[/* heightSegments */ scala.Double], 
    js.UndefOr[/* phiStart */ scala.Double], 
    js.UndefOr[/* phiLength */ scala.Double], 
    js.UndefOr[/* thetaStart */ scala.Double], 
    js.UndefOr[/* thetaLength */ scala.Double], 
    threeLib.threeMod.SphereBufferGeometry
  ] = js.native
  var SphereGeometry: org.scalablytyped.runtime.Instantiable7[
    js.UndefOr[/* radius */ scala.Double], 
    js.UndefOr[/* widthSegments */ scala.Double], 
    js.UndefOr[/* heightSegments */ scala.Double], 
    js.UndefOr[/* phiStart */ scala.Double], 
    js.UndefOr[/* phiLength */ scala.Double], 
    js.UndefOr[/* thetaStart */ scala.Double], 
    js.UndefOr[/* thetaLength */ scala.Double], 
    threeLib.threeMod.SphereGeometry
  ] = js.native
  var Spherical: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.Spherical] = js.native
  val SphericalReflectionMapping: threeLib.srcConstantsMod.Mapping = js.native
  var SplineCurve: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.SplineCurve] = js.native
  var SpotLight: org.scalablytyped.runtime.Instantiable6[
    js.UndefOr[/* color */ threeLib.srcMathColorMod.Color], 
    js.UndefOr[/* intensity */ scala.Double], 
    js.UndefOr[/* distance */ scala.Double], 
    js.UndefOr[/* angle */ scala.Double], 
    js.UndefOr[/* exponent */ scala.Double], 
    js.UndefOr[/* decay */ scala.Double], 
    threeLib.threeMod.SpotLight
  ] = js.native
  var SpotLightHelper: org.scalablytyped.runtime.Instantiable1[/* light */ threeLib.srcLightsLightMod.Light, threeLib.threeMod.SpotLightHelper] = js.native
  var SpotLightShadow: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.SpotLightShadow] = js.native
  var Sprite: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.Sprite] = js.native
  var SpriteMaterial: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.SpriteMaterial] = js.native
  val SrcAlphaFactor: threeLib.srcConstantsMod.BlendingDstFactor = js.native
  val SrcAlphaSaturateFactor: threeLib.srcConstantsMod.BlendingSrcFactor = js.native
  val SrcColorFactor: threeLib.srcConstantsMod.BlendingDstFactor = js.native
  var StereoCamera: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.StereoCamera] = js.native
  var StringKeyframeTrack: org.scalablytyped.runtime.Instantiable3[
    /* name */ java.lang.String, 
    /* times */ js.Array[js.Any], 
    /* values */ js.Array[js.Any], 
    threeLib.threeMod.StringKeyframeTrack
  ] = js.native
  val SubtractEquation: threeLib.srcConstantsMod.BlendingEquation = js.native
  val SubtractiveBlending: threeLib.srcConstantsMod.Blending = js.native
  val TangentSpaceNormalMap: threeLib.srcConstantsMod.NormalMapTypes = js.native
  var TetrahedronBufferGeometry: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.TetrahedronBufferGeometry] = js.native
  var TetrahedronGeometry: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.TetrahedronGeometry] = js.native
  var TextBufferGeometry: org.scalablytyped.runtime.Instantiable1[/* text */ java.lang.String, threeLib.threeMod.TextBufferGeometry] = js.native
  var TextGeometry: org.scalablytyped.runtime.Instantiable1[/* text */ java.lang.String, threeLib.threeMod.TextGeometry] = js.native
  var Texture: aframeLib.TypeofClassTexture = js.native
  var TextureIdCount: scala.Double = js.native
  var TextureLoader: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.TextureLoader] = js.native
  var TorusBufferGeometry: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.TorusBufferGeometry] = js.native
  var TorusGeometry: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.TorusGeometry] = js.native
  var TorusKnotBufferGeometry: org.scalablytyped.runtime.Instantiable6[
    js.UndefOr[/* radius */ scala.Double], 
    js.UndefOr[/* tube */ scala.Double], 
    js.UndefOr[/* tubularSegments */ scala.Double], 
    js.UndefOr[/* radialSegments */ scala.Double], 
    js.UndefOr[/* p */ scala.Double], 
    js.UndefOr[/* q */ scala.Double], 
    threeLib.threeMod.TorusKnotBufferGeometry
  ] = js.native
  var TorusKnotGeometry: org.scalablytyped.runtime.Instantiable6[
    js.UndefOr[/* radius */ scala.Double], 
    js.UndefOr[/* tube */ scala.Double], 
    js.UndefOr[/* tubularSegments */ scala.Double], 
    js.UndefOr[/* radialSegments */ scala.Double], 
    js.UndefOr[/* p */ scala.Double], 
    js.UndefOr[/* q */ scala.Double], 
    threeLib.threeMod.TorusKnotGeometry
  ] = js.native
  var Triangle: aframeLib.TypeofClassTriangle = js.native
  val TriangleFanDrawMode: threeLib.srcConstantsMod.TrianglesDrawModes = js.native
  val TriangleStripDrawMode: threeLib.srcConstantsMod.TrianglesDrawModes = js.native
  val TrianglesDrawMode: threeLib.srcConstantsMod.TrianglesDrawModes = js.native
  var TubeBufferGeometry: org.scalablytyped.runtime.Instantiable1[
    /* path */ threeLib.srcExtrasCoreCurveMod.Curve[threeLib.srcMathVector3Mod.Vector3], 
    threeLib.threeMod.TubeBufferGeometry
  ] = js.native
  var TubeGeometry: org.scalablytyped.runtime.Instantiable1[
    /* path */ threeLib.srcExtrasCoreCurveMod.Curve[threeLib.srcMathVector3Mod.Vector3], 
    threeLib.threeMod.TubeGeometry
  ] = js.native
  val UVMapping: threeLib.srcConstantsMod.Mapping = js.native
  var Uint16Attribute: org.scalablytyped.runtime.Instantiable2[/* array */ js.Any, /* itemSize */ scala.Double, threeLib.threeMod.Uint16Attribute] = js.native
  var Uint16BufferAttribute: org.scalablytyped.runtime.Instantiable2[
    /* array */ stdLib.Iterable[scala.Double], 
    /* itemSize */ scala.Double, 
    threeLib.threeMod.Uint16BufferAttribute
  ] = js.native
  var Uint32Attribute: org.scalablytyped.runtime.Instantiable2[/* array */ js.Any, /* itemSize */ scala.Double, threeLib.threeMod.Uint32Attribute] = js.native
  var Uint32BufferAttribute: org.scalablytyped.runtime.Instantiable2[
    /* array */ stdLib.Iterable[scala.Double], 
    /* itemSize */ scala.Double, 
    threeLib.threeMod.Uint32BufferAttribute
  ] = js.native
  var Uint8Attribute: org.scalablytyped.runtime.Instantiable2[/* array */ js.Any, /* itemSize */ scala.Double, threeLib.threeMod.Uint8Attribute] = js.native
  var Uint8BufferAttribute: org.scalablytyped.runtime.Instantiable2[
    /* array */ stdLib.Iterable[scala.Double], 
    /* itemSize */ scala.Double, 
    threeLib.threeMod.Uint8BufferAttribute
  ] = js.native
  var Uint8ClampedAttribute: org.scalablytyped.runtime.Instantiable2[
    /* array */ js.Any, 
    /* itemSize */ scala.Double, 
    threeLib.threeMod.Uint8ClampedAttribute
  ] = js.native
  var Uint8ClampedBufferAttribute: org.scalablytyped.runtime.Instantiable2[
    /* array */ stdLib.Iterable[scala.Double], 
    /* itemSize */ scala.Double, 
    threeLib.threeMod.Uint8ClampedBufferAttribute
  ] = js.native
  val Uncharted2ToneMapping: threeLib.srcConstantsMod.ToneMapping = js.native
  var Uniform: org.scalablytyped.runtime.Instantiable1[/* value */ js.Any, threeLib.threeMod.Uniform] = js.native
  var UniformsLib: aframeLib.Anon_Aomap = js.native
  val UniformsUtilsNs: aframeLib.TypeofUniformsUtils = js.native
  val UnsignedByteType: threeLib.srcConstantsMod.TextureDataType = js.native
  val UnsignedInt248Type: threeLib.srcConstantsMod.PixelType = js.native
  val UnsignedIntType: threeLib.srcConstantsMod.TextureDataType = js.native
  val UnsignedShort4444Type: threeLib.srcConstantsMod.PixelType = js.native
  val UnsignedShort5551Type: threeLib.srcConstantsMod.PixelType = js.native
  val UnsignedShort565Type: threeLib.srcConstantsMod.PixelType = js.native
  val UnsignedShortType: threeLib.srcConstantsMod.TextureDataType = js.native
  var Vector2: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.Vector2] = js.native
  var Vector3: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.Vector3] = js.native
  var Vector4: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.Vector4] = js.native
  var VectorKeyframeTrack: org.scalablytyped.runtime.Instantiable3[
    /* name */ java.lang.String, 
    /* times */ js.Array[js.Any], 
    /* values */ js.Array[js.Any], 
    threeLib.threeMod.VectorKeyframeTrack
  ] = js.native
  val VertexColors: threeLib.srcConstantsMod.Colors = js.native
  var VertexNormalsHelper: org.scalablytyped.runtime.Instantiable1[
    /* object */ threeLib.srcCoreObject3DMod.Object3D, 
    threeLib.threeMod.VertexNormalsHelper
  ] = js.native
  var VideoTexture: org.scalablytyped.runtime.Instantiable9[
    /* video */ stdLib.HTMLVideoElement, 
    js.UndefOr[/* mapping */ threeLib.srcConstantsMod.Mapping], 
    js.UndefOr[/* wrapS */ threeLib.srcConstantsMod.Wrapping], 
    js.UndefOr[/* wrapT */ threeLib.srcConstantsMod.Wrapping], 
    js.UndefOr[/* magFilter */ threeLib.srcConstantsMod.TextureFilter], 
    js.UndefOr[/* minFilter */ threeLib.srcConstantsMod.TextureFilter], 
    js.UndefOr[/* format */ threeLib.srcConstantsMod.PixelFormat], 
    js.UndefOr[/* type */ threeLib.srcConstantsMod.TextureDataType], 
    js.UndefOr[/* anisotropy */ scala.Double], 
    threeLib.threeMod.VideoTexture
  ] = js.native
  var WebGLBufferRenderer: org.scalablytyped.runtime.Instantiable3[
    /* _gl */ stdLib.WebGLRenderingContext, 
    /* extensions */ js.Any, 
    /* _infoRender */ js.Any, 
    threeLib.threeMod.WebGLBufferRenderer
  ] = js.native
  var WebGLCapabilities: org.scalablytyped.runtime.Instantiable3[
    /* gl */ stdLib.WebGLRenderingContext, 
    /* extensions */ js.Any, 
    /* parameters */ threeLib.srcRenderersWebglWebGLCapabilitiesMod.WebGLCapabilitiesParameters, 
    threeLib.threeMod.WebGLCapabilities
  ] = js.native
  var WebGLClipping: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.WebGLClipping] = js.native
  var WebGLColorBuffer: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.WebGLColorBuffer] = js.native
  var WebGLDepthBuffer: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.WebGLDepthBuffer] = js.native
  var WebGLExtensions: org.scalablytyped.runtime.Instantiable1[/* gl */ stdLib.WebGLRenderingContext, threeLib.threeMod.WebGLExtensions] = js.native
  var WebGLGeometries: org.scalablytyped.runtime.Instantiable3[
    /* gl */ stdLib.WebGLRenderingContext, 
    /* extensions */ js.Any, 
    /* _infoRender */ js.Any, 
    threeLib.threeMod.WebGLGeometries
  ] = js.native
  var WebGLIndexedBufferRenderer: org.scalablytyped.runtime.Instantiable3[
    /* gl */ stdLib.WebGLRenderingContext, 
    /* properties */ js.Any, 
    /* info */ js.Any, 
    threeLib.threeMod.WebGLIndexedBufferRenderer
  ] = js.native
  var WebGLInfo: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.WebGLInfo] = js.native
  var WebGLLights: org.scalablytyped.runtime.Instantiable3[
    /* gl */ stdLib.WebGLRenderingContext, 
    /* properties */ js.Any, 
    /* info */ js.Any, 
    threeLib.threeMod.WebGLLights
  ] = js.native
  var WebGLMultisampleRenderTarget: org.scalablytyped.runtime.Instantiable2[
    /* width */ scala.Double, 
    /* height */ scala.Double, 
    threeLib.threeMod.WebGLMultisampleRenderTarget
  ] = js.native
  var WebGLObjects: org.scalablytyped.runtime.Instantiable3[
    /* gl */ stdLib.WebGLRenderingContext, 
    /* properties */ js.Any, 
    /* info */ js.Any, 
    threeLib.threeMod.WebGLObjects
  ] = js.native
  var WebGLProgram: org.scalablytyped.runtime.Instantiable8[
    /* renderer */ threeLib.srcRenderersWebGLRendererMod.WebGLRenderer, 
    /* extensions */ threeLib.srcRenderersWebglWebGLExtensionsMod.WebGLExtensions, 
    /* code */ java.lang.String, 
    /* material */ threeLib.srcMaterialsShaderMaterialMod.ShaderMaterial, 
    /* shader */ threeLib.srcRenderersWebglWebGLShaderMod.WebGLShader, 
    /* parameters */ threeLib.srcRenderersWebGLRendererMod.WebGLRendererParameters, 
    /* capabilities */ threeLib.srcRenderersWebglWebGLCapabilitiesMod.WebGLCapabilities, 
    /* textures */ threeLib.srcRenderersWebglWebGLTexturesMod.WebGLTextures, 
    threeLib.threeMod.WebGLProgram
  ] = js.native
  var WebGLPrograms: org.scalablytyped.runtime.Instantiable4[
    /* renderer */ threeLib.srcRenderersWebGLRendererMod.WebGLRenderer, 
    /* extensions */ threeLib.srcRenderersWebglWebGLExtensionsMod.WebGLExtensions, 
    /* capabilities */ threeLib.srcRenderersWebglWebGLCapabilitiesMod.WebGLCapabilities, 
    /* textures */ threeLib.srcRenderersWebglWebGLTexturesMod.WebGLTextures, 
    threeLib.threeMod.WebGLPrograms
  ] = js.native
  var WebGLProperties: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.WebGLProperties] = js.native
  var WebGLRenderList: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.WebGLRenderList] = js.native
  var WebGLRenderLists: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.WebGLRenderLists] = js.native
  var WebGLRenderTarget: org.scalablytyped.runtime.Instantiable2[
    /* width */ scala.Double, 
    /* height */ scala.Double, 
    threeLib.threeMod.WebGLRenderTarget
  ] = js.native
  var WebGLRenderTargetCube: org.scalablytyped.runtime.Instantiable2[
    /* width */ scala.Double, 
    /* height */ scala.Double, 
    threeLib.threeMod.WebGLRenderTargetCube
  ] = js.native
  var WebGLRenderer: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.WebGLRenderer] = js.native
  var WebGLShader: org.scalablytyped.runtime.Instantiable4[
    /* gl */ js.Any, 
    /* type */ java.lang.String, 
    /* string */ java.lang.String, 
    /* debug */ scala.Boolean, 
    threeLib.threeMod.WebGLShader
  ] = js.native
  var WebGLShadowMap: org.scalablytyped.runtime.Instantiable4[
    /* _renderer */ threeLib.srcRenderersWebGLRendererMod.WebGLRenderer, 
    /* _lights */ js.Array[js.Any], 
    /* _objects */ js.Array[js.Any], 
    /* capabilities */ js.Any, 
    threeLib.threeMod.WebGLShadowMap
  ] = js.native
  var WebGLState: org.scalablytyped.runtime.Instantiable4[
    /* gl */ stdLib.WebGLRenderingContext, 
    /* extensions */ threeLib.srcRenderersWebglWebGLExtensionsMod.WebGLExtensions, 
    /* utils */ js.Any, 
    /* capabilities */ threeLib.srcRenderersWebglWebGLCapabilitiesMod.WebGLCapabilities, 
    threeLib.threeMod.WebGLState
  ] = js.native
  var WebGLStencilBuffer: org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.WebGLStencilBuffer] = js.native
  var WebGLTextures: org.scalablytyped.runtime.Instantiable7[
    /* gl */ js.Any, 
    /* extensions */ js.Any, 
    /* state */ js.Any, 
    /* properties */ js.Any, 
    /* capabilities */ js.Any, 
    /* paramThreeToGL */ js.Function, 
    /* info */ js.Any, 
    threeLib.threeMod.WebGLTextures
  ] = js.native
  var WebGLUniforms: aframeLib.TypeofClassWebGLUniforms = js.native
  var WireframeGeometry: org.scalablytyped.runtime.Instantiable1[
    /* geometry */ threeLib.srcCoreGeometryMod.Geometry, 
    threeLib.threeMod.WireframeGeometry
  ] = js.native
  val WrapAroundEnding: threeLib.srcConstantsMod.InterpolationEndingModes = js.native
  val ZeroCurvatureEnding: threeLib.srcConstantsMod.InterpolationEndingModes = js.native
  val ZeroFactor: threeLib.srcConstantsMod.BlendingDstFactor = js.native
  val ZeroSlopeEnding: threeLib.srcConstantsMod.InterpolationEndingModes = js.native
  val sRGBEncoding: threeLib.srcConstantsMod.TextureEncoding = js.native
  def error(): scala.Unit = js.native
  def error(message: js.Any, optionalParams: js.Any*): scala.Unit = js.native
  def log(): scala.Unit = js.native
  def log(message: js.Any, optionalParams: js.Any*): scala.Unit = js.native
  def warn(): scala.Unit = js.native
  def warn(message: js.Any, optionalParams: js.Any*): scala.Unit = js.native
}

