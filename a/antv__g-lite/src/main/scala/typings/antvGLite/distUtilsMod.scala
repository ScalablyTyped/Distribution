package typings.antvGLite

import org.scalablytyped.runtime.StringDictionary
import typings.antvGLite.anon.PartialParsedTextStylePro
import typings.antvGLite.anon.Polygons
import typings.antvGLite.anon.R
import typings.antvGLite.anon.X1
import typings.antvGLite.antvGLiteStrings.all
import typings.antvGLite.antvGLiteStrings.auto
import typings.antvGLite.antvGLiteStrings.fill
import typings.antvGLite.antvGLiteStrings.none
import typings.antvGLite.antvGLiteStrings.painted
import typings.antvGLite.antvGLiteStrings.stroke
import typings.antvGLite.antvGLiteStrings.visible
import typings.antvGLite.antvGLiteStrings.visiblefill
import typings.antvGLite.antvGLiteStrings.visiblepainted
import typings.antvGLite.antvGLiteStrings.visiblestroke
import typings.antvGLite.distCanvasMod.Canvas
import typings.antvGLite.distCssMod.CSSGradientValue
import typings.antvGLite.distCssMod.CSSRGB
import typings.antvGLite.distCssParserColorMod.Pattern
import typings.antvGLite.distCssStyleValueRegistryMod.CSSGlobalKeywords
import typings.antvGLite.distDisplayObjectsMod.Circle
import typings.antvGLite.distDisplayObjectsMod.DisplayObject
import typings.antvGLite.distDisplayObjectsMod.Ellipse
import typings.antvGLite.distDisplayObjectsMod.Line
import typings.antvGLite.distDisplayObjectsMod.Path
import typings.antvGLite.distDisplayObjectsMod.Polygon
import typings.antvGLite.distDisplayObjectsMod.Polyline
import typings.antvGLite.distDisplayObjectsMod.Rect
import typings.antvGLite.distDomInterfacesMod.IElement
import typings.antvGLite.distTypesMod.CanvasLike
import typings.antvGLite.distUtilsGradientMod.ColorStop
import typings.antvGLite.distUtilsGradientMod.GradientNode
import typings.antvUtil.libPathTypesMod.AbsoluteArray
import typings.antvUtil.libPathTypesMod.CurveArray
import typings.glMatrix.mod.mat3
import typings.glMatrix.mod.mat4
import typings.glMatrix.mod.quat
import typings.glMatrix.mod.vec2
import typings.glMatrix.mod.vec3
import typings.glMatrix.mod.vec4
import typings.std.HTMLElement
import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsMod {
  
  @JSImport("@antv/g-lite/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@antv/g-lite/dist/utils", "AsyncParallelHook")
  @js.native
  open class AsyncParallelHook[T, AdditionalOptions] ()
    extends typings.antvGLite.distUtilsTapableMod.AsyncParallelHook[T, AdditionalOptions] {
    def this(args: js.Array[Any]) = this()
    def this(args: js.Array[Any], name: Any) = this()
    def this(args: Unit, name: Any) = this()
  }
  
  @JSImport("@antv/g-lite/dist/utils", "AsyncSeriesWaterfallHook")
  @js.native
  open class AsyncSeriesWaterfallHook[T, AdditionalOptions] ()
    extends typings.antvGLite.distUtilsTapableMod.AsyncSeriesWaterfallHook[T, AdditionalOptions] {
    def this(args: js.Array[Any]) = this()
    def this(args: js.Array[Any], name: Any) = this()
    def this(args: Unit, name: Any) = this()
  }
  
  inline def DCHECK(bool: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("DCHECK")(bool.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def DCHECK_EQ(a: Any, b: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("DCHECK_EQ")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def DCHECK_NE(a: Any, b: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("DCHECK_NE")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@antv/g-lite/dist/utils", "ERROR_MSG_METHOD_NOT_IMPLEMENTED")
  @js.native
  val ERROR_MSG_METHOD_NOT_IMPLEMENTED: /* "Method not implemented." */ String = js.native
  
  @JSImport("@antv/g-lite/dist/utils", "ERROR_MSG_USE_DOCUMENT_ELEMENT")
  @js.native
  val ERROR_MSG_USE_DOCUMENT_ELEMENT: /* "Use document.documentElement instead." */ String = js.native
  
  @JSImport("@antv/g-lite/dist/utils", "MOUSE_POINTER_ID")
  @js.native
  val MOUSE_POINTER_ID: /* 1 */ Double = js.native
  
  @JSImport("@antv/g-lite/dist/utils", "SyncHook")
  @js.native
  open class SyncHook[T, R, AdditionalOptions] ()
    extends typings.antvGLite.distUtilsTapableMod.SyncHook[T, R, AdditionalOptions] {
    def this(args: js.Array[Any]) = this()
    def this(args: js.Array[Any], name: Any) = this()
    def this(args: Unit, name: Any) = this()
  }
  
  @JSImport("@antv/g-lite/dist/utils", "SyncWaterfallHook")
  @js.native
  open class SyncWaterfallHook[T, AdditionalOptions] ()
    extends typings.antvGLite.distUtilsTapableMod.SyncWaterfallHook[T, AdditionalOptions] {
    def this(args: js.Array[Any]) = this()
    def this(args: js.Array[Any], name: Any) = this()
    def this(args: Unit, name: Any) = this()
  }
  
  @JSImport("@antv/g-lite/dist/utils", "TOUCH_TO_POINTER")
  @js.native
  val TOUCH_TO_POINTER: Record[String, String] = js.native
  
  object camelCase {
    
    inline def apply(args: Any*): Any = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    @JSImport("@antv/g-lite/dist/utils", "camelCase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g-lite/dist/utils", "camelCase.cache")
    @js.native
    def cache: Map[Any, Any] = js.native
    inline def cache_=(x: Map[Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cache")(x.asInstanceOf[js.Any])
  }
  
  inline def cleanExistedCanvas(container: String, canvas: Canvas): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cleanExistedCanvas")(container.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def cleanExistedCanvas(container: HTMLElement, canvas: Canvas): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cleanExistedCanvas")(container.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def colorStopToString(colorStop: ColorStop): String = ^.asInstanceOf[js.Dynamic].applyDynamic("colorStopToString")(colorStop.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def computeLinearGradient(width: Double, height: Double, angle: Double): X1 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeLinearGradient")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[X1]
  
  inline def computeRadialGradient(width: Double, height: Double, cx: Double, cy: Double): R = (^.asInstanceOf[js.Dynamic].applyDynamic("computeRadialGradient")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], cx.asInstanceOf[js.Any], cy.asInstanceOf[js.Any])).asInstanceOf[R]
  
  inline def convertToPath(`object`: Circle): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToPath")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def convertToPath(`object`: Circle, applyLocalTransform: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToPath")(`object`.asInstanceOf[js.Any], applyLocalTransform.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def convertToPath(`object`: Ellipse): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToPath")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def convertToPath(`object`: Ellipse, applyLocalTransform: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToPath")(`object`.asInstanceOf[js.Any], applyLocalTransform.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def convertToPath(`object`: Line): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToPath")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def convertToPath(`object`: Line, applyLocalTransform: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToPath")(`object`.asInstanceOf[js.Any], applyLocalTransform.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def convertToPath(`object`: Path): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToPath")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def convertToPath(`object`: Path, applyLocalTransform: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToPath")(`object`.asInstanceOf[js.Any], applyLocalTransform.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def convertToPath(`object`: Polygon): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToPath")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def convertToPath(`object`: Polygon, applyLocalTransform: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToPath")(`object`.asInstanceOf[js.Any], applyLocalTransform.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def convertToPath(`object`: Polyline): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToPath")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def convertToPath(`object`: Polyline, applyLocalTransform: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToPath")(`object`.asInstanceOf[js.Any], applyLocalTransform.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def convertToPath(`object`: Rect): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToPath")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def convertToPath(`object`: Rect, applyLocalTransform: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToPath")(`object`.asInstanceOf[js.Any], applyLocalTransform.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def createVec3(x: vec2 | vec3 | vec4): vec3 = ^.asInstanceOf[js.Dynamic].applyDynamic("createVec3")(x.asInstanceOf[js.Any]).asInstanceOf[vec3]
  inline def createVec3(x: vec2 | vec3 | vec4, y: Double): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("createVec3")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[vec3]
  inline def createVec3(x: vec2 | vec3 | vec4, y: Double, z: Double): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("createVec3")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[vec3]
  inline def createVec3(x: vec2 | vec3 | vec4, y: Unit, z: Double): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("createVec3")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[vec3]
  inline def createVec3(x: Double): vec3 = ^.asInstanceOf[js.Dynamic].applyDynamic("createVec3")(x.asInstanceOf[js.Any]).asInstanceOf[vec3]
  inline def createVec3(x: Double, y: Double): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("createVec3")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[vec3]
  inline def createVec3(x: Double, y: Double, z: Double): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("createVec3")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[vec3]
  inline def createVec3(x: Double, y: Unit, z: Double): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("createVec3")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[vec3]
  
  inline def decompose(mat: mat3): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("decompose")(mat.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def decomposeMat4(matrix: mat4, translation: vec3, scale: vec3, skew: vec3, perspective: vec4, quaternion: vec4): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("decomposeMat4")(matrix.asInstanceOf[js.Any], translation.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], skew.asInstanceOf[js.Any], perspective.asInstanceOf[js.Any], quaternion.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def definedProps(obj: js.Object): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("definedProps")(obj.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  
  inline def deg2rad(deg: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("deg2rad")(deg.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def deg2turn(deg: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("deg2turn")(deg.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def extractPolygons(pathArray: AbsoluteArray): Polygons = ^.asInstanceOf[js.Dynamic].applyDynamic("extractPolygons")(pathArray.asInstanceOf[js.Any]).asInstanceOf[Polygons]
  
  inline def findClosestClipPathTarget(`object`: DisplayObject[Any, Any]): DisplayObject[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("findClosestClipPathTarget")(`object`.asInstanceOf[js.Any]).asInstanceOf[DisplayObject[Any, Any]]
  
  inline def formatAttribute(name: String, value: Any): js.Tuple2[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatAttribute")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[String, Any]]
  
  inline def fromRotationTranslationScale(rotation: Double, x: Double, y: Double, scaleX: Double, scaleY: Double): mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRotationTranslationScale")(rotation.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any])).asInstanceOf[mat3]
  
  inline def getAngle(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getAngle")().asInstanceOf[Double]
  inline def getAngle(angle: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getAngle")(angle.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getEuler(out: vec3, quat: mat4 | quat): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("getEuler")(out.asInstanceOf[js.Any], quat.asInstanceOf[js.Any])).asInstanceOf[vec3]
  
  inline def getHeight($el: CanvasLike): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeight")($el.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getHeight($el: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeight")($el.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getOrCalculatePathTotalLength(path: Path): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrCalculatePathTotalLength")(path.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getRotationInRadians(mat: mat3): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getRotationInRadians")(mat.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getScaling(out: vec2, mat: mat3): vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("getScaling")(out.asInstanceOf[js.Any], mat.asInstanceOf[js.Any])).asInstanceOf[vec2]
  
  inline def getStyle($el: CanvasLike, property: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyle")($el.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getStyle($el: HTMLElement, property: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyle")($el.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getTranslation(out: vec2, mat: mat3): vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("getTranslation")(out.asInstanceOf[js.Any], mat.asInstanceOf[js.Any])).asInstanceOf[vec2]
  
  inline def getWidth($el: CanvasLike): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWidth")($el.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getWidth($el: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWidth")($el.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def grad2deg(grads: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("grad2deg")(grads.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def hasArcOrBezier(path: AbsoluteArray): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasArcOrBezier")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("@antv/g-lite/dist/utils", "isBrowser")
  @js.native
  val isBrowser: Boolean = js.native
  
  inline def isFillOrStrokeAffected(): js.Tuple2[Boolean, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")().asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(
    pointerEvents: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all
  ): js.Tuple2[Boolean, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(
    pointerEvents: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all,
    fill: js.Array[CSSGradientValue]
  ): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(
    pointerEvents: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all,
    fill: js.Array[CSSGradientValue],
    stroke: js.Array[CSSGradientValue]
  ): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(
    pointerEvents: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all,
    fill: js.Array[CSSGradientValue],
    stroke: CSSRGB
  ): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(
    pointerEvents: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all,
    fill: js.Array[CSSGradientValue],
    stroke: Pattern
  ): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(
    pointerEvents: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all,
    fill: Unit,
    stroke: js.Array[CSSGradientValue]
  ): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(
    pointerEvents: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all,
    fill: Unit,
    stroke: CSSRGB
  ): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(
    pointerEvents: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all,
    fill: Unit,
    stroke: Pattern
  ): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(
    pointerEvents: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all,
    fill: CSSRGB
  ): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(
    pointerEvents: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all,
    fill: CSSRGB,
    stroke: js.Array[CSSGradientValue]
  ): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(
    pointerEvents: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all,
    fill: CSSRGB,
    stroke: CSSRGB
  ): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(
    pointerEvents: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all,
    fill: CSSRGB,
    stroke: Pattern
  ): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(
    pointerEvents: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all,
    fill: Pattern
  ): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(
    pointerEvents: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all,
    fill: Pattern,
    stroke: js.Array[CSSGradientValue]
  ): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(
    pointerEvents: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all,
    fill: Pattern,
    stroke: CSSRGB
  ): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(
    pointerEvents: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all,
    fill: Pattern,
    stroke: Pattern
  ): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: Unit, fill: js.Array[CSSGradientValue]): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: Unit, fill: js.Array[CSSGradientValue], stroke: js.Array[CSSGradientValue]): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: Unit, fill: js.Array[CSSGradientValue], stroke: CSSRGB): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: Unit, fill: js.Array[CSSGradientValue], stroke: Pattern): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: Unit, fill: Unit, stroke: js.Array[CSSGradientValue]): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: Unit, fill: Unit, stroke: CSSRGB): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: Unit, fill: Unit, stroke: Pattern): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: Unit, fill: CSSRGB): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: Unit, fill: CSSRGB, stroke: js.Array[CSSGradientValue]): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: Unit, fill: CSSRGB, stroke: CSSRGB): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: Unit, fill: CSSRGB, stroke: Pattern): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: Unit, fill: Pattern): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: Unit, fill: Pattern, stroke: js.Array[CSSGradientValue]): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: Unit, fill: Pattern, stroke: CSSRGB): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: Unit, fill: Pattern, stroke: Pattern): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: CSSGlobalKeywords): js.Tuple2[Boolean, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: CSSGlobalKeywords, fill: js.Array[CSSGradientValue]): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(
    pointerEvents: CSSGlobalKeywords,
    fill: js.Array[CSSGradientValue],
    stroke: js.Array[CSSGradientValue]
  ): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: CSSGlobalKeywords, fill: js.Array[CSSGradientValue], stroke: CSSRGB): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: CSSGlobalKeywords, fill: js.Array[CSSGradientValue], stroke: Pattern): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: CSSGlobalKeywords, fill: Unit, stroke: js.Array[CSSGradientValue]): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: CSSGlobalKeywords, fill: Unit, stroke: CSSRGB): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: CSSGlobalKeywords, fill: Unit, stroke: Pattern): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: CSSGlobalKeywords, fill: CSSRGB): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: CSSGlobalKeywords, fill: CSSRGB, stroke: js.Array[CSSGradientValue]): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: CSSGlobalKeywords, fill: CSSRGB, stroke: CSSRGB): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: CSSGlobalKeywords, fill: CSSRGB, stroke: Pattern): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: CSSGlobalKeywords, fill: Pattern): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: CSSGlobalKeywords, fill: Pattern, stroke: js.Array[CSSGradientValue]): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: CSSGlobalKeywords, fill: Pattern, stroke: CSSRGB): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: CSSGlobalKeywords, fill: Pattern, stroke: Pattern): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  
  inline def isFunction(func: Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(func.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  inline def makePerspective(out: mat4, left: Double, right: Double, top: Double, bottom: Double, near: Double, far: Double): mat4 = (^.asInstanceOf[js.Dynamic].applyDynamic("makePerspective")(out.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], top.asInstanceOf[js.Any], bottom.asInstanceOf[js.Any], near.asInstanceOf[js.Any], far.asInstanceOf[js.Any])).asInstanceOf[mat4]
  
  inline def parseGradient(code: String): js.Array[GradientNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseGradient")(code.asInstanceOf[js.Any]).asInstanceOf[js.Array[GradientNode]]
  
  inline def path2Segments(path: CurveArray): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("path2Segments")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def rad2deg(rad: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rad2deg")(rad.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def setDOMSize($el: CanvasLike, width: Double, height: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDOMSize")($el.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def sortByZIndex(o1: IElement[Any, Any], o2: IElement[Any, Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sortByZIndex")(o1.asInstanceOf[js.Any], o2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def toFontString(attributes: PartialParsedTextStylePro): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toFontString")(attributes.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def translatePathToString(pathArray: AbsoluteArray, x: Double, y: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePathToString")(pathArray.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def translatePathToString(pathArray: AbsoluteArray, x: Double, y: Double, startOffsetX: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePathToString")(pathArray.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], startOffsetX.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def translatePathToString(pathArray: AbsoluteArray, x: Double, y: Double, startOffsetX: Double, startOffsetY: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePathToString")(pathArray.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], startOffsetX.asInstanceOf[js.Any], startOffsetY.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def translatePathToString(
    pathArray: AbsoluteArray,
    x: Double,
    y: Double,
    startOffsetX: Double,
    startOffsetY: Double,
    endOffsetX: Double
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePathToString")(pathArray.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], startOffsetX.asInstanceOf[js.Any], startOffsetY.asInstanceOf[js.Any], endOffsetX.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def translatePathToString(
    pathArray: AbsoluteArray,
    x: Double,
    y: Double,
    startOffsetX: Double,
    startOffsetY: Double,
    endOffsetX: Double,
    endOffsetY: Double
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePathToString")(pathArray.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], startOffsetX.asInstanceOf[js.Any], startOffsetY.asInstanceOf[js.Any], endOffsetX.asInstanceOf[js.Any], endOffsetY.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def translatePathToString(
    pathArray: AbsoluteArray,
    x: Double,
    y: Double,
    startOffsetX: Double,
    startOffsetY: Double,
    endOffsetX: Unit,
    endOffsetY: Double
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePathToString")(pathArray.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], startOffsetX.asInstanceOf[js.Any], startOffsetY.asInstanceOf[js.Any], endOffsetX.asInstanceOf[js.Any], endOffsetY.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def translatePathToString(
    pathArray: AbsoluteArray,
    x: Double,
    y: Double,
    startOffsetX: Double,
    startOffsetY: Unit,
    endOffsetX: Double
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePathToString")(pathArray.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], startOffsetX.asInstanceOf[js.Any], startOffsetY.asInstanceOf[js.Any], endOffsetX.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def translatePathToString(
    pathArray: AbsoluteArray,
    x: Double,
    y: Double,
    startOffsetX: Double,
    startOffsetY: Unit,
    endOffsetX: Double,
    endOffsetY: Double
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePathToString")(pathArray.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], startOffsetX.asInstanceOf[js.Any], startOffsetY.asInstanceOf[js.Any], endOffsetX.asInstanceOf[js.Any], endOffsetY.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def translatePathToString(
    pathArray: AbsoluteArray,
    x: Double,
    y: Double,
    startOffsetX: Double,
    startOffsetY: Unit,
    endOffsetX: Unit,
    endOffsetY: Double
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePathToString")(pathArray.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], startOffsetX.asInstanceOf[js.Any], startOffsetY.asInstanceOf[js.Any], endOffsetX.asInstanceOf[js.Any], endOffsetY.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def translatePathToString(pathArray: AbsoluteArray, x: Double, y: Double, startOffsetX: Unit, startOffsetY: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePathToString")(pathArray.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], startOffsetX.asInstanceOf[js.Any], startOffsetY.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def translatePathToString(
    pathArray: AbsoluteArray,
    x: Double,
    y: Double,
    startOffsetX: Unit,
    startOffsetY: Double,
    endOffsetX: Double
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePathToString")(pathArray.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], startOffsetX.asInstanceOf[js.Any], startOffsetY.asInstanceOf[js.Any], endOffsetX.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def translatePathToString(
    pathArray: AbsoluteArray,
    x: Double,
    y: Double,
    startOffsetX: Unit,
    startOffsetY: Double,
    endOffsetX: Double,
    endOffsetY: Double
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePathToString")(pathArray.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], startOffsetX.asInstanceOf[js.Any], startOffsetY.asInstanceOf[js.Any], endOffsetX.asInstanceOf[js.Any], endOffsetY.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def translatePathToString(
    pathArray: AbsoluteArray,
    x: Double,
    y: Double,
    startOffsetX: Unit,
    startOffsetY: Double,
    endOffsetX: Unit,
    endOffsetY: Double
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePathToString")(pathArray.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], startOffsetX.asInstanceOf[js.Any], startOffsetY.asInstanceOf[js.Any], endOffsetX.asInstanceOf[js.Any], endOffsetY.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def translatePathToString(
    pathArray: AbsoluteArray,
    x: Double,
    y: Double,
    startOffsetX: Unit,
    startOffsetY: Unit,
    endOffsetX: Double
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePathToString")(pathArray.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], startOffsetX.asInstanceOf[js.Any], startOffsetY.asInstanceOf[js.Any], endOffsetX.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def translatePathToString(
    pathArray: AbsoluteArray,
    x: Double,
    y: Double,
    startOffsetX: Unit,
    startOffsetY: Unit,
    endOffsetX: Double,
    endOffsetY: Double
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePathToString")(pathArray.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], startOffsetX.asInstanceOf[js.Any], startOffsetY.asInstanceOf[js.Any], endOffsetX.asInstanceOf[js.Any], endOffsetY.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def translatePathToString(
    pathArray: AbsoluteArray,
    x: Double,
    y: Double,
    startOffsetX: Unit,
    startOffsetY: Unit,
    endOffsetX: Unit,
    endOffsetY: Double
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePathToString")(pathArray.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], startOffsetX.asInstanceOf[js.Any], startOffsetY.asInstanceOf[js.Any], endOffsetX.asInstanceOf[js.Any], endOffsetY.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def turn2deg(turn: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("turn2deg")(turn.asInstanceOf[js.Any]).asInstanceOf[Double]
}
