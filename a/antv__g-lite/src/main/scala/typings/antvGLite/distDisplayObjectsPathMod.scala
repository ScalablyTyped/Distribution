package typings.antvGLite

import typings.antvGLite.anon.AbsolutePath
import typings.antvGLite.antvGLiteStrings._empty
import typings.antvGLite.antvGLiteStrings.`class`
import typings.antvGLite.antvGLiteStrings.all
import typings.antvGLite.antvGLiteStrings.anchor
import typings.antvGLite.antvGLiteStrings.auto
import typings.antvGLite.antvGLiteStrings.both
import typings.antvGLite.antvGLiteStrings.clipPath
import typings.antvGLite.antvGLiteStrings.clipPathTargets
import typings.antvGLite.antvGLiteStrings.cursor
import typings.antvGLite.antvGLiteStrings.d
import typings.antvGLite.antvGLiteStrings.display
import typings.antvGLite.antvGLiteStrings.draggable
import typings.antvGLite.antvGLiteStrings.droppable
import typings.antvGLite.antvGLiteStrings.fill
import typings.antvGLite.antvGLiteStrings.fillOpacity
import typings.antvGLite.antvGLiteStrings.filter
import typings.antvGLite.antvGLiteStrings.hidden
import typings.antvGLite.antvGLiteStrings.hitArea
import typings.antvGLite.antvGLiteStrings.increasedLineWidthForHitTesting
import typings.antvGLite.antvGLiteStrings.inner
import typings.antvGLite.antvGLiteStrings.lineCap
import typings.antvGLite.antvGLiteStrings.lineDash
import typings.antvGLite.antvGLiteStrings.lineDashOffset
import typings.antvGLite.antvGLiteStrings.lineJoin
import typings.antvGLite.antvGLiteStrings.lineWidth
import typings.antvGLite.antvGLiteStrings.markerEnd
import typings.antvGLite.antvGLiteStrings.markerEndOffset
import typings.antvGLite.antvGLiteStrings.markerMid
import typings.antvGLite.antvGLiteStrings.markerStart
import typings.antvGLite.antvGLiteStrings.markerStartOffset
import typings.antvGLite.antvGLiteStrings.miterLimit
import typings.antvGLite.antvGLiteStrings.none
import typings.antvGLite.antvGLiteStrings.offsetDistance
import typings.antvGLite.antvGLiteStrings.offsetPath
import typings.antvGLite.antvGLiteStrings.offsetPathTargets
import typings.antvGLite.antvGLiteStrings.opacity
import typings.antvGLite.antvGLiteStrings.outer
import typings.antvGLite.antvGLiteStrings.painted
import typings.antvGLite.antvGLiteStrings.path
import typings.antvGLite.antvGLiteStrings.pointerEvents
import typings.antvGLite.antvGLiteStrings.shadowBlur
import typings.antvGLite.antvGLiteStrings.shadowColor
import typings.antvGLite.antvGLiteStrings.shadowOffsetX
import typings.antvGLite.antvGLiteStrings.shadowOffsetY
import typings.antvGLite.antvGLiteStrings.shadowType
import typings.antvGLite.antvGLiteStrings.stroke
import typings.antvGLite.antvGLiteStrings.strokeDasharray
import typings.antvGLite.antvGLiteStrings.strokeDashoffset
import typings.antvGLite.antvGLiteStrings.strokeLinecap
import typings.antvGLite.antvGLiteStrings.strokeLinejoin
import typings.antvGLite.antvGLiteStrings.strokeOpacity
import typings.antvGLite.antvGLiteStrings.strokeWidth
import typings.antvGLite.antvGLiteStrings.textTransform
import typings.antvGLite.antvGLiteStrings.transform
import typings.antvGLite.antvGLiteStrings.transformOrigin
import typings.antvGLite.antvGLiteStrings.visibility
import typings.antvGLite.antvGLiteStrings.visible
import typings.antvGLite.antvGLiteStrings.visiblefill
import typings.antvGLite.antvGLiteStrings.visiblepainted
import typings.antvGLite.antvGLiteStrings.visiblestroke
import typings.antvGLite.antvGLiteStrings.zIndex
import typings.antvGLite.distCssMod.CSSGradientValue
import typings.antvGLite.distCssMod.CSSRGB
import typings.antvGLite.distCssMod.CSSUnitValue
import typings.antvGLite.distCssParserColorMod.Pattern
import typings.antvGLite.distCssParserFilterMod.ParsedFilterStyleProperty
import typings.antvGLite.distCssParserTransformMod.ParsedTransform
import typings.antvGLite.distCssStyleValueRegistryMod.CSSGlobalKeywords
import typings.antvGLite.distDisplayObjectsDisplayObjectMod.DisplayObject
import typings.antvGLite.distDomInterfacesMod.DisplayObjectConfig
import typings.antvGLite.distShapesMod.Point
import typings.antvGLite.distTypesMod.BaseStyleProps
import typings.antvGLite.distTypesMod.ColorType
import typings.antvGLite.distTypesMod.Cursor
import typings.antvGLite.distTypesMod.ParsedBaseStyleProps
import typings.antvGLite.distTypesMod.TextTransform
import typings.antvUtil.libPathTypesMod.PathArray
import typings.glMatrix.mod.vec2
import typings.glMatrix.mod.vec3
import typings.std.CanvasLineCap
import typings.std.CanvasLineJoin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDisplayObjectsPathMod {
  
  @JSImport("@antv/g-lite/dist/display-objects/Path", "Path")
  @js.native
  open class Path () extends DisplayObject[PathStyleProps, ParsedPathStyleProps] {
    def this(param0: DisplayObjectConfig[PathStyleProps]) = this()
    
    def attributeChangedCallback(
      attrName: pointerEvents,
      oldValue: js.UndefOr[
          none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all | CSSGlobalKeywords
        ],
      newValue: js.UndefOr[
          none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all | CSSGlobalKeywords
        ],
      prevParsedValue: js.UndefOr[
          none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all | CSSGlobalKeywords
        ],
      newParsedValue: js.UndefOr[
          none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all | CSSGlobalKeywords
        ]
    ): Unit = js.native
    def attributeChangedCallback(attrName: shadowType, oldValue: inner | outer | both): Unit = js.native
    def attributeChangedCallback(attrName: shadowType, oldValue: inner | outer | both, newValue: inner | outer | both): Unit = js.native
    def attributeChangedCallback(
      attrName: shadowType,
      oldValue: inner | outer | both,
      newValue: inner | outer | both,
      prevParsedValue: inner | outer | both
    ): Unit = js.native
    def attributeChangedCallback(
      attrName: shadowType,
      oldValue: inner | outer | both,
      newValue: inner | outer | both,
      prevParsedValue: inner | outer | both,
      newParsedValue: inner | outer | both
    ): Unit = js.native
    def attributeChangedCallback(
      attrName: shadowType,
      oldValue: inner | outer | both,
      newValue: inner | outer | both,
      prevParsedValue: Unit,
      newParsedValue: inner | outer | both
    ): Unit = js.native
    def attributeChangedCallback(
      attrName: shadowType,
      oldValue: inner | outer | both,
      newValue: Unit,
      prevParsedValue: inner | outer | both
    ): Unit = js.native
    def attributeChangedCallback(
      attrName: shadowType,
      oldValue: inner | outer | both,
      newValue: Unit,
      prevParsedValue: inner | outer | both,
      newParsedValue: inner | outer | both
    ): Unit = js.native
    def attributeChangedCallback(
      attrName: shadowType,
      oldValue: inner | outer | both,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: inner | outer | both
    ): Unit = js.native
    def attributeChangedCallback(attrName: shadowType, oldValue: Unit, newValue: inner | outer | both): Unit = js.native
    def attributeChangedCallback(
      attrName: shadowType,
      oldValue: Unit,
      newValue: inner | outer | both,
      prevParsedValue: inner | outer | both
    ): Unit = js.native
    def attributeChangedCallback(
      attrName: shadowType,
      oldValue: Unit,
      newValue: inner | outer | both,
      prevParsedValue: inner | outer | both,
      newParsedValue: inner | outer | both
    ): Unit = js.native
    def attributeChangedCallback(
      attrName: shadowType,
      oldValue: Unit,
      newValue: inner | outer | both,
      prevParsedValue: Unit,
      newParsedValue: inner | outer | both
    ): Unit = js.native
    def attributeChangedCallback(attrName: shadowType, oldValue: Unit, newValue: Unit, prevParsedValue: inner | outer | both): Unit = js.native
    def attributeChangedCallback(
      attrName: shadowType,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: inner | outer | both,
      newParsedValue: inner | outer | both
    ): Unit = js.native
    def attributeChangedCallback(
      attrName: shadowType,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: inner | outer | both
    ): Unit = js.native
    def attributeChangedCallback(
      attrName: visibility,
      oldValue: js.UndefOr[visible | hidden | CSSGlobalKeywords],
      newValue: js.UndefOr[visible | hidden | CSSGlobalKeywords],
      prevParsedValue: js.UndefOr[visible | hidden | CSSGlobalKeywords],
      newParsedValue: js.UndefOr[visible | hidden | CSSGlobalKeywords]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_anchor(
      attrName: anchor,
      oldValue: js.UndefOr[vec2 | vec3 | String],
      newValue: js.UndefOr[vec2 | vec3 | String],
      prevParsedValue: js.UndefOr[js.Tuple3[Double, Double, Double]],
      newParsedValue: js.UndefOr[js.Tuple3[Double, Double, Double]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_class(attrName: `class`): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_class(attrName: `class`, oldValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_class(attrName: `class`, oldValue: String, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_class(attrName: `class`, oldValue: String, newValue: String, prevParsedValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_class(
      attrName: `class`,
      oldValue: String,
      newValue: String,
      prevParsedValue: String,
      newParsedValue: String
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_class(
      attrName: `class`,
      oldValue: String,
      newValue: String,
      prevParsedValue: Unit,
      newParsedValue: String
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_class(attrName: `class`, oldValue: String, newValue: Unit, prevParsedValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_class(
      attrName: `class`,
      oldValue: String,
      newValue: Unit,
      prevParsedValue: String,
      newParsedValue: String
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_class(attrName: `class`, oldValue: String, newValue: Unit, prevParsedValue: Unit, newParsedValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_class(attrName: `class`, oldValue: Unit, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_class(attrName: `class`, oldValue: Unit, newValue: String, prevParsedValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_class(
      attrName: `class`,
      oldValue: Unit,
      newValue: String,
      prevParsedValue: String,
      newParsedValue: String
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_class(attrName: `class`, oldValue: Unit, newValue: String, prevParsedValue: Unit, newParsedValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_class(attrName: `class`, oldValue: Unit, newValue: Unit, prevParsedValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_class(attrName: `class`, oldValue: Unit, newValue: Unit, prevParsedValue: String, newParsedValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_class(attrName: `class`, oldValue: Unit, newValue: Unit, prevParsedValue: Unit, newParsedValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_clipPath(
      attrName: clipPath,
      oldValue: js.UndefOr[(typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]) | Null],
      newValue: js.UndefOr[(typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]) | Null],
      prevParsedValue: js.UndefOr[(typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]) | Null],
      newParsedValue: js.UndefOr[(typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]) | Null]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_clipPathTargets(attrName: clipPathTargets): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_clipPathTargets(
      attrName: clipPathTargets,
      oldValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_clipPathTargets(
      attrName: clipPathTargets,
      oldValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      newValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_clipPathTargets(
      attrName: clipPathTargets,
      oldValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      newValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      prevParsedValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_clipPathTargets(
      attrName: clipPathTargets,
      oldValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      newValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      prevParsedValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      newParsedValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_clipPathTargets(
      attrName: clipPathTargets,
      oldValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      newValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      prevParsedValue: Unit,
      newParsedValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_clipPathTargets(
      attrName: clipPathTargets,
      oldValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      newValue: Unit,
      prevParsedValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_clipPathTargets(
      attrName: clipPathTargets,
      oldValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      newValue: Unit,
      prevParsedValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      newParsedValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_clipPathTargets(
      attrName: clipPathTargets,
      oldValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_clipPathTargets(
      attrName: clipPathTargets,
      oldValue: Unit,
      newValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_clipPathTargets(
      attrName: clipPathTargets,
      oldValue: Unit,
      newValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      prevParsedValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_clipPathTargets(
      attrName: clipPathTargets,
      oldValue: Unit,
      newValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      prevParsedValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      newParsedValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_clipPathTargets(
      attrName: clipPathTargets,
      oldValue: Unit,
      newValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      prevParsedValue: Unit,
      newParsedValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_clipPathTargets(
      attrName: clipPathTargets,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_clipPathTargets(
      attrName: clipPathTargets,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      newParsedValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_clipPathTargets(
      attrName: clipPathTargets,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_cursor(attrName: cursor): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_cursor(attrName: cursor, oldValue: Unit, newValue: Unit, prevParsedValue: Unit, newParsedValue: Cursor): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_cursor(attrName: cursor, oldValue: Unit, newValue: Unit, prevParsedValue: Cursor): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_cursor(attrName: cursor, oldValue: Unit, newValue: Unit, prevParsedValue: Cursor, newParsedValue: Cursor): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_cursor(attrName: cursor, oldValue: Unit, newValue: Cursor): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_cursor(attrName: cursor, oldValue: Unit, newValue: Cursor, prevParsedValue: Unit, newParsedValue: Cursor): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_cursor(attrName: cursor, oldValue: Unit, newValue: Cursor, prevParsedValue: Cursor): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_cursor(
      attrName: cursor,
      oldValue: Unit,
      newValue: Cursor,
      prevParsedValue: Cursor,
      newParsedValue: Cursor
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_cursor(attrName: cursor, oldValue: Cursor): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_cursor(attrName: cursor, oldValue: Cursor, newValue: Unit, prevParsedValue: Unit, newParsedValue: Cursor): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_cursor(attrName: cursor, oldValue: Cursor, newValue: Unit, prevParsedValue: Cursor): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_cursor(
      attrName: cursor,
      oldValue: Cursor,
      newValue: Unit,
      prevParsedValue: Cursor,
      newParsedValue: Cursor
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_cursor(attrName: cursor, oldValue: Cursor, newValue: Cursor): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_cursor(
      attrName: cursor,
      oldValue: Cursor,
      newValue: Cursor,
      prevParsedValue: Unit,
      newParsedValue: Cursor
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_cursor(attrName: cursor, oldValue: Cursor, newValue: Cursor, prevParsedValue: Cursor): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_cursor(
      attrName: cursor,
      oldValue: Cursor,
      newValue: Cursor,
      prevParsedValue: Cursor,
      newParsedValue: Cursor
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_d(attrName: d): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_d(attrName: d, oldValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_d(attrName: d, oldValue: String, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_d(
      attrName: d,
      oldValue: String,
      newValue: String,
      prevParsedValue: Unit,
      newParsedValue: AbsolutePath
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_d(attrName: d, oldValue: String, newValue: String, prevParsedValue: AbsolutePath): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_d(
      attrName: d,
      oldValue: String,
      newValue: String,
      prevParsedValue: AbsolutePath,
      newParsedValue: AbsolutePath
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_d(attrName: d, oldValue: String, newValue: Unit, prevParsedValue: Unit, newParsedValue: AbsolutePath): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_d(attrName: d, oldValue: String, newValue: Unit, prevParsedValue: AbsolutePath): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_d(
      attrName: d,
      oldValue: String,
      newValue: Unit,
      prevParsedValue: AbsolutePath,
      newParsedValue: AbsolutePath
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_d(attrName: d, oldValue: String, newValue: PathArray): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_d(
      attrName: d,
      oldValue: String,
      newValue: PathArray,
      prevParsedValue: Unit,
      newParsedValue: AbsolutePath
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_d(attrName: d, oldValue: String, newValue: PathArray, prevParsedValue: AbsolutePath): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_d(
      attrName: d,
      oldValue: String,
      newValue: PathArray,
      prevParsedValue: AbsolutePath,
      newParsedValue: AbsolutePath
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_d(attrName: d, oldValue: Unit, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_d(attrName: d, oldValue: Unit, newValue: String, prevParsedValue: Unit, newParsedValue: AbsolutePath): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_d(attrName: d, oldValue: Unit, newValue: String, prevParsedValue: AbsolutePath): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_d(
      attrName: d,
      oldValue: Unit,
      newValue: String,
      prevParsedValue: AbsolutePath,
      newParsedValue: AbsolutePath
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_d(attrName: d, oldValue: Unit, newValue: Unit, prevParsedValue: Unit, newParsedValue: AbsolutePath): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_d(attrName: d, oldValue: Unit, newValue: Unit, prevParsedValue: AbsolutePath): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_d(
      attrName: d,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: AbsolutePath,
      newParsedValue: AbsolutePath
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_d(attrName: d, oldValue: Unit, newValue: PathArray): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_d(
      attrName: d,
      oldValue: Unit,
      newValue: PathArray,
      prevParsedValue: Unit,
      newParsedValue: AbsolutePath
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_d(attrName: d, oldValue: Unit, newValue: PathArray, prevParsedValue: AbsolutePath): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_d(
      attrName: d,
      oldValue: Unit,
      newValue: PathArray,
      prevParsedValue: AbsolutePath,
      newParsedValue: AbsolutePath
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_d(attrName: d, oldValue: PathArray): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_d(attrName: d, oldValue: PathArray, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_d(
      attrName: d,
      oldValue: PathArray,
      newValue: String,
      prevParsedValue: Unit,
      newParsedValue: AbsolutePath
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_d(attrName: d, oldValue: PathArray, newValue: String, prevParsedValue: AbsolutePath): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_d(
      attrName: d,
      oldValue: PathArray,
      newValue: String,
      prevParsedValue: AbsolutePath,
      newParsedValue: AbsolutePath
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_d(
      attrName: d,
      oldValue: PathArray,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: AbsolutePath
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_d(attrName: d, oldValue: PathArray, newValue: Unit, prevParsedValue: AbsolutePath): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_d(
      attrName: d,
      oldValue: PathArray,
      newValue: Unit,
      prevParsedValue: AbsolutePath,
      newParsedValue: AbsolutePath
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_d(attrName: d, oldValue: PathArray, newValue: PathArray): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_d(
      attrName: d,
      oldValue: PathArray,
      newValue: PathArray,
      prevParsedValue: Unit,
      newParsedValue: AbsolutePath
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_d(attrName: d, oldValue: PathArray, newValue: PathArray, prevParsedValue: AbsolutePath): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_d(
      attrName: d,
      oldValue: PathArray,
      newValue: PathArray,
      prevParsedValue: AbsolutePath,
      newParsedValue: AbsolutePath
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_display(attrName: display): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_display(attrName: display, oldValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_display(attrName: display, oldValue: String, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_display(attrName: display, oldValue: String, newValue: String, prevParsedValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_display(
      attrName: display,
      oldValue: String,
      newValue: String,
      prevParsedValue: String,
      newParsedValue: String
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_display(
      attrName: display,
      oldValue: String,
      newValue: String,
      prevParsedValue: Unit,
      newParsedValue: String
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_display(attrName: display, oldValue: String, newValue: Unit, prevParsedValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_display(
      attrName: display,
      oldValue: String,
      newValue: Unit,
      prevParsedValue: String,
      newParsedValue: String
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_display(attrName: display, oldValue: String, newValue: Unit, prevParsedValue: Unit, newParsedValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_display(attrName: display, oldValue: Unit, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_display(attrName: display, oldValue: Unit, newValue: String, prevParsedValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_display(
      attrName: display,
      oldValue: Unit,
      newValue: String,
      prevParsedValue: String,
      newParsedValue: String
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_display(attrName: display, oldValue: Unit, newValue: String, prevParsedValue: Unit, newParsedValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_display(attrName: display, oldValue: Unit, newValue: Unit, prevParsedValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_display(attrName: display, oldValue: Unit, newValue: Unit, prevParsedValue: String, newParsedValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_display(attrName: display, oldValue: Unit, newValue: Unit, prevParsedValue: Unit, newParsedValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_draggable(attrName: draggable): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_draggable(attrName: draggable, oldValue: Boolean): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_draggable(attrName: draggable, oldValue: Boolean, newValue: Boolean): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_draggable(attrName: draggable, oldValue: Boolean, newValue: Boolean, prevParsedValue: Boolean): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_draggable(
      attrName: draggable,
      oldValue: Boolean,
      newValue: Boolean,
      prevParsedValue: Boolean,
      newParsedValue: Boolean
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_draggable(
      attrName: draggable,
      oldValue: Boolean,
      newValue: Boolean,
      prevParsedValue: Unit,
      newParsedValue: Boolean
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_draggable(attrName: draggable, oldValue: Boolean, newValue: Unit, prevParsedValue: Boolean): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_draggable(
      attrName: draggable,
      oldValue: Boolean,
      newValue: Unit,
      prevParsedValue: Boolean,
      newParsedValue: Boolean
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_draggable(
      attrName: draggable,
      oldValue: Boolean,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Boolean
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_draggable(attrName: draggable, oldValue: Unit, newValue: Boolean): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_draggable(attrName: draggable, oldValue: Unit, newValue: Boolean, prevParsedValue: Boolean): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_draggable(
      attrName: draggable,
      oldValue: Unit,
      newValue: Boolean,
      prevParsedValue: Boolean,
      newParsedValue: Boolean
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_draggable(
      attrName: draggable,
      oldValue: Unit,
      newValue: Boolean,
      prevParsedValue: Unit,
      newParsedValue: Boolean
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_draggable(attrName: draggable, oldValue: Unit, newValue: Unit, prevParsedValue: Boolean): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_draggable(
      attrName: draggable,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Boolean,
      newParsedValue: Boolean
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_draggable(
      attrName: draggable,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Boolean
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_droppable(attrName: droppable): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_droppable(attrName: droppable, oldValue: Boolean): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_droppable(attrName: droppable, oldValue: Boolean, newValue: Boolean): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_droppable(attrName: droppable, oldValue: Boolean, newValue: Boolean, prevParsedValue: Boolean): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_droppable(
      attrName: droppable,
      oldValue: Boolean,
      newValue: Boolean,
      prevParsedValue: Boolean,
      newParsedValue: Boolean
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_droppable(
      attrName: droppable,
      oldValue: Boolean,
      newValue: Boolean,
      prevParsedValue: Unit,
      newParsedValue: Boolean
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_droppable(attrName: droppable, oldValue: Boolean, newValue: Unit, prevParsedValue: Boolean): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_droppable(
      attrName: droppable,
      oldValue: Boolean,
      newValue: Unit,
      prevParsedValue: Boolean,
      newParsedValue: Boolean
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_droppable(
      attrName: droppable,
      oldValue: Boolean,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Boolean
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_droppable(attrName: droppable, oldValue: Unit, newValue: Boolean): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_droppable(attrName: droppable, oldValue: Unit, newValue: Boolean, prevParsedValue: Boolean): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_droppable(
      attrName: droppable,
      oldValue: Unit,
      newValue: Boolean,
      prevParsedValue: Boolean,
      newParsedValue: Boolean
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_droppable(
      attrName: droppable,
      oldValue: Unit,
      newValue: Boolean,
      prevParsedValue: Unit,
      newParsedValue: Boolean
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_droppable(attrName: droppable, oldValue: Unit, newValue: Unit, prevParsedValue: Boolean): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_droppable(
      attrName: droppable,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Boolean,
      newParsedValue: Boolean
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_droppable(
      attrName: droppable,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Boolean
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fill(
      attrName: fill,
      oldValue: js.UndefOr[ColorType | Pattern],
      newValue: js.UndefOr[ColorType | Pattern],
      prevParsedValue: js.UndefOr[CSSRGB | js.Array[CSSGradientValue] | Pattern],
      newParsedValue: js.UndefOr[CSSRGB | js.Array[CSSGradientValue] | Pattern]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(attrName: fillOpacity): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(attrName: fillOpacity, oldValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(attrName: fillOpacity, oldValue: String, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(attrName: fillOpacity, oldValue: String, newValue: String, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(
      attrName: fillOpacity,
      oldValue: String,
      newValue: String,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(
      attrName: fillOpacity,
      oldValue: String,
      newValue: String,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(attrName: fillOpacity, oldValue: String, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(attrName: fillOpacity, oldValue: String, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(
      attrName: fillOpacity,
      oldValue: String,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(
      attrName: fillOpacity,
      oldValue: String,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(attrName: fillOpacity, oldValue: String, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(
      attrName: fillOpacity,
      oldValue: String,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(
      attrName: fillOpacity,
      oldValue: String,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(attrName: fillOpacity, oldValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(attrName: fillOpacity, oldValue: Double, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(attrName: fillOpacity, oldValue: Double, newValue: String, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(
      attrName: fillOpacity,
      oldValue: Double,
      newValue: String,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(
      attrName: fillOpacity,
      oldValue: Double,
      newValue: String,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(attrName: fillOpacity, oldValue: Double, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(attrName: fillOpacity, oldValue: Double, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(
      attrName: fillOpacity,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(
      attrName: fillOpacity,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(attrName: fillOpacity, oldValue: Double, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(
      attrName: fillOpacity,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(
      attrName: fillOpacity,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(attrName: fillOpacity, oldValue: Unit, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(attrName: fillOpacity, oldValue: Unit, newValue: String, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(
      attrName: fillOpacity,
      oldValue: Unit,
      newValue: String,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(
      attrName: fillOpacity,
      oldValue: Unit,
      newValue: String,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(attrName: fillOpacity, oldValue: Unit, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(attrName: fillOpacity, oldValue: Unit, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(
      attrName: fillOpacity,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(
      attrName: fillOpacity,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(attrName: fillOpacity, oldValue: Unit, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(
      attrName: fillOpacity,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(
      attrName: fillOpacity,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_filter(attrName: filter): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_filter(attrName: filter, oldValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_filter(attrName: filter, oldValue: String, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_filter(
      attrName: filter,
      oldValue: String,
      newValue: String,
      prevParsedValue: js.Array[ParsedFilterStyleProperty]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_filter(
      attrName: filter,
      oldValue: String,
      newValue: String,
      prevParsedValue: js.Array[ParsedFilterStyleProperty],
      newParsedValue: js.Array[ParsedFilterStyleProperty]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_filter(
      attrName: filter,
      oldValue: String,
      newValue: String,
      prevParsedValue: Unit,
      newParsedValue: js.Array[ParsedFilterStyleProperty]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_filter(
      attrName: filter,
      oldValue: String,
      newValue: Unit,
      prevParsedValue: js.Array[ParsedFilterStyleProperty]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_filter(
      attrName: filter,
      oldValue: String,
      newValue: Unit,
      prevParsedValue: js.Array[ParsedFilterStyleProperty],
      newParsedValue: js.Array[ParsedFilterStyleProperty]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_filter(
      attrName: filter,
      oldValue: String,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: js.Array[ParsedFilterStyleProperty]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_filter(attrName: filter, oldValue: Unit, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_filter(
      attrName: filter,
      oldValue: Unit,
      newValue: String,
      prevParsedValue: js.Array[ParsedFilterStyleProperty]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_filter(
      attrName: filter,
      oldValue: Unit,
      newValue: String,
      prevParsedValue: js.Array[ParsedFilterStyleProperty],
      newParsedValue: js.Array[ParsedFilterStyleProperty]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_filter(
      attrName: filter,
      oldValue: Unit,
      newValue: String,
      prevParsedValue: Unit,
      newParsedValue: js.Array[ParsedFilterStyleProperty]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_filter(
      attrName: filter,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: js.Array[ParsedFilterStyleProperty]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_filter(
      attrName: filter,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: js.Array[ParsedFilterStyleProperty],
      newParsedValue: js.Array[ParsedFilterStyleProperty]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_filter(
      attrName: filter,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: js.Array[ParsedFilterStyleProperty]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_hitArea(
      attrName: hitArea,
      oldValue: js.UndefOr[(typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]) | Null],
      newValue: js.UndefOr[(typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]) | Null],
      prevParsedValue: js.UndefOr[(typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]) | Null],
      newParsedValue: js.UndefOr[(typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]) | Null]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(attrName: increasedLineWidthForHitTesting): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(attrName: increasedLineWidthForHitTesting, oldValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(attrName: increasedLineWidthForHitTesting, oldValue: String, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: String,
      newValue: String,
      prevParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: String,
      newValue: String,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: String,
      newValue: String,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(attrName: increasedLineWidthForHitTesting, oldValue: String, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: String,
      newValue: Double,
      prevParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: String,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: String,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: String,
      newValue: Unit,
      prevParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: String,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: String,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(attrName: increasedLineWidthForHitTesting, oldValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(attrName: increasedLineWidthForHitTesting, oldValue: Double, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: Double,
      newValue: String,
      prevParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: Double,
      newValue: String,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: Double,
      newValue: String,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(attrName: increasedLineWidthForHitTesting, oldValue: Double, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(attrName: increasedLineWidthForHitTesting, oldValue: Unit, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: Unit,
      newValue: String,
      prevParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: Unit,
      newValue: String,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: Unit,
      newValue: String,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(attrName: increasedLineWidthForHitTesting, oldValue: Unit, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(attrName: increasedLineWidthForHitTesting, oldValue: Unit, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineCap(attrName: lineCap): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineCap(
      attrName: lineCap,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: CanvasLineCap
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineCap(attrName: lineCap, oldValue: Unit, newValue: Unit, prevParsedValue: CanvasLineCap): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineCap(
      attrName: lineCap,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: CanvasLineCap,
      newParsedValue: CanvasLineCap
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineCap(attrName: lineCap, oldValue: Unit, newValue: CanvasLineCap): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineCap(
      attrName: lineCap,
      oldValue: Unit,
      newValue: CanvasLineCap,
      prevParsedValue: Unit,
      newParsedValue: CanvasLineCap
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineCap(attrName: lineCap, oldValue: Unit, newValue: CanvasLineCap, prevParsedValue: CanvasLineCap): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineCap(
      attrName: lineCap,
      oldValue: Unit,
      newValue: CanvasLineCap,
      prevParsedValue: CanvasLineCap,
      newParsedValue: CanvasLineCap
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineCap(attrName: lineCap, oldValue: CanvasLineCap): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineCap(
      attrName: lineCap,
      oldValue: CanvasLineCap,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: CanvasLineCap
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineCap(attrName: lineCap, oldValue: CanvasLineCap, newValue: Unit, prevParsedValue: CanvasLineCap): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineCap(
      attrName: lineCap,
      oldValue: CanvasLineCap,
      newValue: Unit,
      prevParsedValue: CanvasLineCap,
      newParsedValue: CanvasLineCap
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineCap(attrName: lineCap, oldValue: CanvasLineCap, newValue: CanvasLineCap): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineCap(
      attrName: lineCap,
      oldValue: CanvasLineCap,
      newValue: CanvasLineCap,
      prevParsedValue: Unit,
      newParsedValue: CanvasLineCap
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineCap(
      attrName: lineCap,
      oldValue: CanvasLineCap,
      newValue: CanvasLineCap,
      prevParsedValue: CanvasLineCap
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineCap(
      attrName: lineCap,
      oldValue: CanvasLineCap,
      newValue: CanvasLineCap,
      prevParsedValue: CanvasLineCap,
      newParsedValue: CanvasLineCap
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineDash(
      attrName: lineDash,
      oldValue: js.UndefOr[Double | String | (js.Array[String | Double])],
      newValue: js.UndefOr[Double | String | (js.Array[String | Double])],
      prevParsedValue: js.UndefOr[js.Tuple2[Double, Double]],
      newParsedValue: js.UndefOr[js.Tuple2[Double, Double]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineDashOffset(attrName: lineDashOffset): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineDashOffset(attrName: lineDashOffset, oldValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineDashOffset(attrName: lineDashOffset, oldValue: Double, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineDashOffset(attrName: lineDashOffset, oldValue: Double, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineDashOffset(
      attrName: lineDashOffset,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineDashOffset(
      attrName: lineDashOffset,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineDashOffset(attrName: lineDashOffset, oldValue: Double, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineDashOffset(
      attrName: lineDashOffset,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineDashOffset(
      attrName: lineDashOffset,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineDashOffset(attrName: lineDashOffset, oldValue: Unit, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineDashOffset(attrName: lineDashOffset, oldValue: Unit, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineDashOffset(
      attrName: lineDashOffset,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineDashOffset(
      attrName: lineDashOffset,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineDashOffset(attrName: lineDashOffset, oldValue: Unit, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineDashOffset(
      attrName: lineDashOffset,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineDashOffset(
      attrName: lineDashOffset,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineJoin(attrName: lineJoin): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineJoin(
      attrName: lineJoin,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: CanvasLineJoin
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineJoin(attrName: lineJoin, oldValue: Unit, newValue: Unit, prevParsedValue: CanvasLineJoin): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineJoin(
      attrName: lineJoin,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: CanvasLineJoin,
      newParsedValue: CanvasLineJoin
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineJoin(attrName: lineJoin, oldValue: Unit, newValue: CanvasLineJoin): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineJoin(
      attrName: lineJoin,
      oldValue: Unit,
      newValue: CanvasLineJoin,
      prevParsedValue: Unit,
      newParsedValue: CanvasLineJoin
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineJoin(attrName: lineJoin, oldValue: Unit, newValue: CanvasLineJoin, prevParsedValue: CanvasLineJoin): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineJoin(
      attrName: lineJoin,
      oldValue: Unit,
      newValue: CanvasLineJoin,
      prevParsedValue: CanvasLineJoin,
      newParsedValue: CanvasLineJoin
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineJoin(attrName: lineJoin, oldValue: CanvasLineJoin): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineJoin(
      attrName: lineJoin,
      oldValue: CanvasLineJoin,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: CanvasLineJoin
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineJoin(attrName: lineJoin, oldValue: CanvasLineJoin, newValue: Unit, prevParsedValue: CanvasLineJoin): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineJoin(
      attrName: lineJoin,
      oldValue: CanvasLineJoin,
      newValue: Unit,
      prevParsedValue: CanvasLineJoin,
      newParsedValue: CanvasLineJoin
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineJoin(attrName: lineJoin, oldValue: CanvasLineJoin, newValue: CanvasLineJoin): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineJoin(
      attrName: lineJoin,
      oldValue: CanvasLineJoin,
      newValue: CanvasLineJoin,
      prevParsedValue: Unit,
      newParsedValue: CanvasLineJoin
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineJoin(
      attrName: lineJoin,
      oldValue: CanvasLineJoin,
      newValue: CanvasLineJoin,
      prevParsedValue: CanvasLineJoin
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineJoin(
      attrName: lineJoin,
      oldValue: CanvasLineJoin,
      newValue: CanvasLineJoin,
      prevParsedValue: CanvasLineJoin,
      newParsedValue: CanvasLineJoin
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(attrName: lineWidth): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(attrName: lineWidth, oldValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(attrName: lineWidth, oldValue: String, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(attrName: lineWidth, oldValue: String, newValue: String, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(
      attrName: lineWidth,
      oldValue: String,
      newValue: String,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(
      attrName: lineWidth,
      oldValue: String,
      newValue: String,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(attrName: lineWidth, oldValue: String, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(attrName: lineWidth, oldValue: String, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(
      attrName: lineWidth,
      oldValue: String,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(
      attrName: lineWidth,
      oldValue: String,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(attrName: lineWidth, oldValue: String, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(
      attrName: lineWidth,
      oldValue: String,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(
      attrName: lineWidth,
      oldValue: String,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(attrName: lineWidth, oldValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(attrName: lineWidth, oldValue: Double, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(attrName: lineWidth, oldValue: Double, newValue: String, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(
      attrName: lineWidth,
      oldValue: Double,
      newValue: String,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(
      attrName: lineWidth,
      oldValue: Double,
      newValue: String,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(attrName: lineWidth, oldValue: Double, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(attrName: lineWidth, oldValue: Double, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(
      attrName: lineWidth,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(
      attrName: lineWidth,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(attrName: lineWidth, oldValue: Double, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(
      attrName: lineWidth,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(
      attrName: lineWidth,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(attrName: lineWidth, oldValue: Unit, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(attrName: lineWidth, oldValue: Unit, newValue: String, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(
      attrName: lineWidth,
      oldValue: Unit,
      newValue: String,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(
      attrName: lineWidth,
      oldValue: Unit,
      newValue: String,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(attrName: lineWidth, oldValue: Unit, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(attrName: lineWidth, oldValue: Unit, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(
      attrName: lineWidth,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(
      attrName: lineWidth,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(attrName: lineWidth, oldValue: Unit, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(
      attrName: lineWidth,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(attrName: lineWidth, oldValue: Unit, newValue: Unit, prevParsedValue: Unit, newParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEnd(attrName: markerEnd): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEnd(
      attrName: markerEnd,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEnd(attrName: markerEnd, oldValue: Unit, newValue: Unit, prevParsedValue: DisplayObject[Any, Any]): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEnd(
      attrName: markerEnd,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: DisplayObject[Any, Any],
      newParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEnd(attrName: markerEnd, oldValue: Unit, newValue: DisplayObject[Any, Any]): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEnd(
      attrName: markerEnd,
      oldValue: Unit,
      newValue: DisplayObject[Any, Any],
      prevParsedValue: Unit,
      newParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEnd(
      attrName: markerEnd,
      oldValue: Unit,
      newValue: DisplayObject[Any, Any],
      prevParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEnd(
      attrName: markerEnd,
      oldValue: Unit,
      newValue: DisplayObject[Any, Any],
      prevParsedValue: DisplayObject[Any, Any],
      newParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEnd(attrName: markerEnd, oldValue: DisplayObject[Any, Any]): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEnd(
      attrName: markerEnd,
      oldValue: DisplayObject[Any, Any],
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEnd(
      attrName: markerEnd,
      oldValue: DisplayObject[Any, Any],
      newValue: Unit,
      prevParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEnd(
      attrName: markerEnd,
      oldValue: DisplayObject[Any, Any],
      newValue: Unit,
      prevParsedValue: DisplayObject[Any, Any],
      newParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEnd(attrName: markerEnd, oldValue: DisplayObject[Any, Any], newValue: DisplayObject[Any, Any]): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEnd(
      attrName: markerEnd,
      oldValue: DisplayObject[Any, Any],
      newValue: DisplayObject[Any, Any],
      prevParsedValue: Unit,
      newParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEnd(
      attrName: markerEnd,
      oldValue: DisplayObject[Any, Any],
      newValue: DisplayObject[Any, Any],
      prevParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEnd(
      attrName: markerEnd,
      oldValue: DisplayObject[Any, Any],
      newValue: DisplayObject[Any, Any],
      prevParsedValue: DisplayObject[Any, Any],
      newParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEndOffset(attrName: markerEndOffset): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEndOffset(attrName: markerEndOffset, oldValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEndOffset(attrName: markerEndOffset, oldValue: Double, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEndOffset(attrName: markerEndOffset, oldValue: Double, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEndOffset(
      attrName: markerEndOffset,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEndOffset(
      attrName: markerEndOffset,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEndOffset(attrName: markerEndOffset, oldValue: Double, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEndOffset(
      attrName: markerEndOffset,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEndOffset(
      attrName: markerEndOffset,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEndOffset(attrName: markerEndOffset, oldValue: Unit, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEndOffset(attrName: markerEndOffset, oldValue: Unit, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEndOffset(
      attrName: markerEndOffset,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEndOffset(
      attrName: markerEndOffset,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEndOffset(attrName: markerEndOffset, oldValue: Unit, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEndOffset(
      attrName: markerEndOffset,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEndOffset(
      attrName: markerEndOffset,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerMid(attrName: markerMid): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerMid(
      attrName: markerMid,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerMid(attrName: markerMid, oldValue: Unit, newValue: Unit, prevParsedValue: DisplayObject[Any, Any]): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerMid(
      attrName: markerMid,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: DisplayObject[Any, Any],
      newParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerMid(attrName: markerMid, oldValue: Unit, newValue: DisplayObject[Any, Any]): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerMid(
      attrName: markerMid,
      oldValue: Unit,
      newValue: DisplayObject[Any, Any],
      prevParsedValue: Unit,
      newParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerMid(
      attrName: markerMid,
      oldValue: Unit,
      newValue: DisplayObject[Any, Any],
      prevParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerMid(
      attrName: markerMid,
      oldValue: Unit,
      newValue: DisplayObject[Any, Any],
      prevParsedValue: DisplayObject[Any, Any],
      newParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerMid(attrName: markerMid, oldValue: DisplayObject[Any, Any]): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerMid(
      attrName: markerMid,
      oldValue: DisplayObject[Any, Any],
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerMid(
      attrName: markerMid,
      oldValue: DisplayObject[Any, Any],
      newValue: Unit,
      prevParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerMid(
      attrName: markerMid,
      oldValue: DisplayObject[Any, Any],
      newValue: Unit,
      prevParsedValue: DisplayObject[Any, Any],
      newParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerMid(attrName: markerMid, oldValue: DisplayObject[Any, Any], newValue: DisplayObject[Any, Any]): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerMid(
      attrName: markerMid,
      oldValue: DisplayObject[Any, Any],
      newValue: DisplayObject[Any, Any],
      prevParsedValue: Unit,
      newParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerMid(
      attrName: markerMid,
      oldValue: DisplayObject[Any, Any],
      newValue: DisplayObject[Any, Any],
      prevParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerMid(
      attrName: markerMid,
      oldValue: DisplayObject[Any, Any],
      newValue: DisplayObject[Any, Any],
      prevParsedValue: DisplayObject[Any, Any],
      newParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStart(attrName: markerStart): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStart(
      attrName: markerStart,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStart(attrName: markerStart, oldValue: Unit, newValue: Unit, prevParsedValue: DisplayObject[Any, Any]): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStart(
      attrName: markerStart,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: DisplayObject[Any, Any],
      newParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStart(attrName: markerStart, oldValue: Unit, newValue: DisplayObject[Any, Any]): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStart(
      attrName: markerStart,
      oldValue: Unit,
      newValue: DisplayObject[Any, Any],
      prevParsedValue: Unit,
      newParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStart(
      attrName: markerStart,
      oldValue: Unit,
      newValue: DisplayObject[Any, Any],
      prevParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStart(
      attrName: markerStart,
      oldValue: Unit,
      newValue: DisplayObject[Any, Any],
      prevParsedValue: DisplayObject[Any, Any],
      newParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStart(attrName: markerStart, oldValue: DisplayObject[Any, Any]): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStart(
      attrName: markerStart,
      oldValue: DisplayObject[Any, Any],
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStart(
      attrName: markerStart,
      oldValue: DisplayObject[Any, Any],
      newValue: Unit,
      prevParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStart(
      attrName: markerStart,
      oldValue: DisplayObject[Any, Any],
      newValue: Unit,
      prevParsedValue: DisplayObject[Any, Any],
      newParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStart(attrName: markerStart, oldValue: DisplayObject[Any, Any], newValue: DisplayObject[Any, Any]): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStart(
      attrName: markerStart,
      oldValue: DisplayObject[Any, Any],
      newValue: DisplayObject[Any, Any],
      prevParsedValue: Unit,
      newParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStart(
      attrName: markerStart,
      oldValue: DisplayObject[Any, Any],
      newValue: DisplayObject[Any, Any],
      prevParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStart(
      attrName: markerStart,
      oldValue: DisplayObject[Any, Any],
      newValue: DisplayObject[Any, Any],
      prevParsedValue: DisplayObject[Any, Any],
      newParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStartOffset(attrName: markerStartOffset): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStartOffset(attrName: markerStartOffset, oldValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStartOffset(attrName: markerStartOffset, oldValue: Double, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStartOffset(attrName: markerStartOffset, oldValue: Double, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStartOffset(
      attrName: markerStartOffset,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStartOffset(
      attrName: markerStartOffset,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStartOffset(attrName: markerStartOffset, oldValue: Double, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStartOffset(
      attrName: markerStartOffset,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStartOffset(
      attrName: markerStartOffset,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStartOffset(attrName: markerStartOffset, oldValue: Unit, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStartOffset(attrName: markerStartOffset, oldValue: Unit, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStartOffset(
      attrName: markerStartOffset,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStartOffset(
      attrName: markerStartOffset,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStartOffset(attrName: markerStartOffset, oldValue: Unit, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStartOffset(
      attrName: markerStartOffset,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStartOffset(
      attrName: markerStartOffset,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(attrName: miterLimit): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(attrName: miterLimit, oldValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(attrName: miterLimit, oldValue: String, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(attrName: miterLimit, oldValue: String, newValue: String, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(
      attrName: miterLimit,
      oldValue: String,
      newValue: String,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(
      attrName: miterLimit,
      oldValue: String,
      newValue: String,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(attrName: miterLimit, oldValue: String, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(attrName: miterLimit, oldValue: String, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(
      attrName: miterLimit,
      oldValue: String,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(
      attrName: miterLimit,
      oldValue: String,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(attrName: miterLimit, oldValue: String, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(
      attrName: miterLimit,
      oldValue: String,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(
      attrName: miterLimit,
      oldValue: String,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(attrName: miterLimit, oldValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(attrName: miterLimit, oldValue: Double, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(attrName: miterLimit, oldValue: Double, newValue: String, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(
      attrName: miterLimit,
      oldValue: Double,
      newValue: String,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(
      attrName: miterLimit,
      oldValue: Double,
      newValue: String,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(attrName: miterLimit, oldValue: Double, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(attrName: miterLimit, oldValue: Double, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(
      attrName: miterLimit,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(
      attrName: miterLimit,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(attrName: miterLimit, oldValue: Double, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(
      attrName: miterLimit,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(
      attrName: miterLimit,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(attrName: miterLimit, oldValue: Unit, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(attrName: miterLimit, oldValue: Unit, newValue: String, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(
      attrName: miterLimit,
      oldValue: Unit,
      newValue: String,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(
      attrName: miterLimit,
      oldValue: Unit,
      newValue: String,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(attrName: miterLimit, oldValue: Unit, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(attrName: miterLimit, oldValue: Unit, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(
      attrName: miterLimit,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(
      attrName: miterLimit,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(attrName: miterLimit, oldValue: Unit, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(
      attrName: miterLimit,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(
      attrName: miterLimit,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetDistance(attrName: offsetDistance): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetDistance(attrName: offsetDistance, oldValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetDistance(attrName: offsetDistance, oldValue: Double, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetDistance(attrName: offsetDistance, oldValue: Double, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetDistance(
      attrName: offsetDistance,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetDistance(
      attrName: offsetDistance,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetDistance(attrName: offsetDistance, oldValue: Double, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetDistance(
      attrName: offsetDistance,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetDistance(
      attrName: offsetDistance,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetDistance(attrName: offsetDistance, oldValue: Unit, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetDistance(attrName: offsetDistance, oldValue: Unit, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetDistance(
      attrName: offsetDistance,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetDistance(
      attrName: offsetDistance,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetDistance(attrName: offsetDistance, oldValue: Unit, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetDistance(
      attrName: offsetDistance,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetDistance(
      attrName: offsetDistance,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetPath(
      attrName: offsetPath,
      oldValue: js.UndefOr[(typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]) | Null],
      newValue: js.UndefOr[(typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]) | Null],
      prevParsedValue: js.UndefOr[(typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]) | Null],
      newParsedValue: js.UndefOr[(typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]) | Null]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetPathTargets(attrName: offsetPathTargets): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetPathTargets(
      attrName: offsetPathTargets,
      oldValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetPathTargets(
      attrName: offsetPathTargets,
      oldValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      newValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetPathTargets(
      attrName: offsetPathTargets,
      oldValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      newValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      prevParsedValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetPathTargets(
      attrName: offsetPathTargets,
      oldValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      newValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      prevParsedValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      newParsedValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetPathTargets(
      attrName: offsetPathTargets,
      oldValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      newValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      prevParsedValue: Unit,
      newParsedValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetPathTargets(
      attrName: offsetPathTargets,
      oldValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      newValue: Unit,
      prevParsedValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetPathTargets(
      attrName: offsetPathTargets,
      oldValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      newValue: Unit,
      prevParsedValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      newParsedValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetPathTargets(
      attrName: offsetPathTargets,
      oldValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetPathTargets(
      attrName: offsetPathTargets,
      oldValue: Unit,
      newValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetPathTargets(
      attrName: offsetPathTargets,
      oldValue: Unit,
      newValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      prevParsedValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetPathTargets(
      attrName: offsetPathTargets,
      oldValue: Unit,
      newValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      prevParsedValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      newParsedValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetPathTargets(
      attrName: offsetPathTargets,
      oldValue: Unit,
      newValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      prevParsedValue: Unit,
      newParsedValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetPathTargets(
      attrName: offsetPathTargets,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetPathTargets(
      attrName: offsetPathTargets,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      newParsedValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetPathTargets(
      attrName: offsetPathTargets,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: js.Array[typings.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(attrName: opacity): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(attrName: opacity, oldValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(attrName: opacity, oldValue: String, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(attrName: opacity, oldValue: String, newValue: String, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(
      attrName: opacity,
      oldValue: String,
      newValue: String,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(
      attrName: opacity,
      oldValue: String,
      newValue: String,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(attrName: opacity, oldValue: String, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(attrName: opacity, oldValue: String, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(
      attrName: opacity,
      oldValue: String,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(
      attrName: opacity,
      oldValue: String,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(attrName: opacity, oldValue: String, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(
      attrName: opacity,
      oldValue: String,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(attrName: opacity, oldValue: String, newValue: Unit, prevParsedValue: Unit, newParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(attrName: opacity, oldValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(attrName: opacity, oldValue: Double, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(attrName: opacity, oldValue: Double, newValue: String, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(
      attrName: opacity,
      oldValue: Double,
      newValue: String,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(
      attrName: opacity,
      oldValue: Double,
      newValue: String,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(attrName: opacity, oldValue: Double, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(attrName: opacity, oldValue: Double, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(
      attrName: opacity,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(
      attrName: opacity,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(attrName: opacity, oldValue: Double, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(
      attrName: opacity,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(attrName: opacity, oldValue: Double, newValue: Unit, prevParsedValue: Unit, newParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(attrName: opacity, oldValue: Unit, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(attrName: opacity, oldValue: Unit, newValue: String, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(
      attrName: opacity,
      oldValue: Unit,
      newValue: String,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(attrName: opacity, oldValue: Unit, newValue: String, prevParsedValue: Unit, newParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(attrName: opacity, oldValue: Unit, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(attrName: opacity, oldValue: Unit, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(
      attrName: opacity,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(attrName: opacity, oldValue: Unit, newValue: Double, prevParsedValue: Unit, newParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(attrName: opacity, oldValue: Unit, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(attrName: opacity, oldValue: Unit, newValue: Unit, prevParsedValue: Double, newParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(attrName: opacity, oldValue: Unit, newValue: Unit, prevParsedValue: Unit, newParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_path(
      attrName: path,
      oldValue: String,
      newValue: String,
      prevParsedValue: AbsolutePath,
      newParsedValue: AbsolutePath
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_path(
      attrName: path,
      oldValue: String,
      newValue: Unit,
      prevParsedValue: AbsolutePath,
      newParsedValue: AbsolutePath
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_path(
      attrName: path,
      oldValue: String,
      newValue: PathArray,
      prevParsedValue: AbsolutePath,
      newParsedValue: AbsolutePath
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_path(
      attrName: path,
      oldValue: Unit,
      newValue: String,
      prevParsedValue: AbsolutePath,
      newParsedValue: AbsolutePath
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_path(
      attrName: path,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: AbsolutePath,
      newParsedValue: AbsolutePath
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_path(
      attrName: path,
      oldValue: Unit,
      newValue: PathArray,
      prevParsedValue: AbsolutePath,
      newParsedValue: AbsolutePath
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_path(
      attrName: path,
      oldValue: PathArray,
      newValue: String,
      prevParsedValue: AbsolutePath,
      newParsedValue: AbsolutePath
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_path(
      attrName: path,
      oldValue: PathArray,
      newValue: Unit,
      prevParsedValue: AbsolutePath,
      newParsedValue: AbsolutePath
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_path(
      attrName: path,
      oldValue: PathArray,
      newValue: PathArray,
      prevParsedValue: AbsolutePath,
      newParsedValue: AbsolutePath
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowBlur(attrName: shadowBlur): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowBlur(attrName: shadowBlur, oldValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowBlur(attrName: shadowBlur, oldValue: Double, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowBlur(attrName: shadowBlur, oldValue: Double, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowBlur(
      attrName: shadowBlur,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowBlur(
      attrName: shadowBlur,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowBlur(attrName: shadowBlur, oldValue: Double, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowBlur(
      attrName: shadowBlur,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowBlur(
      attrName: shadowBlur,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowBlur(attrName: shadowBlur, oldValue: Unit, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowBlur(attrName: shadowBlur, oldValue: Unit, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowBlur(
      attrName: shadowBlur,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowBlur(
      attrName: shadowBlur,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowBlur(attrName: shadowBlur, oldValue: Unit, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowBlur(
      attrName: shadowBlur,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowBlur(
      attrName: shadowBlur,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowColor(attrName: shadowColor): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowColor(
      attrName: shadowColor,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: CSSRGB
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowColor(attrName: shadowColor, oldValue: Unit, newValue: Unit, prevParsedValue: CSSRGB): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowColor(
      attrName: shadowColor,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: CSSRGB,
      newParsedValue: CSSRGB
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowColor(attrName: shadowColor, oldValue: Unit, newValue: ColorType): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowColor(
      attrName: shadowColor,
      oldValue: Unit,
      newValue: ColorType,
      prevParsedValue: Unit,
      newParsedValue: CSSRGB
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowColor(attrName: shadowColor, oldValue: Unit, newValue: ColorType, prevParsedValue: CSSRGB): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowColor(
      attrName: shadowColor,
      oldValue: Unit,
      newValue: ColorType,
      prevParsedValue: CSSRGB,
      newParsedValue: CSSRGB
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowColor(attrName: shadowColor, oldValue: ColorType): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowColor(
      attrName: shadowColor,
      oldValue: ColorType,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: CSSRGB
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowColor(attrName: shadowColor, oldValue: ColorType, newValue: Unit, prevParsedValue: CSSRGB): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowColor(
      attrName: shadowColor,
      oldValue: ColorType,
      newValue: Unit,
      prevParsedValue: CSSRGB,
      newParsedValue: CSSRGB
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowColor(attrName: shadowColor, oldValue: ColorType, newValue: ColorType): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowColor(
      attrName: shadowColor,
      oldValue: ColorType,
      newValue: ColorType,
      prevParsedValue: Unit,
      newParsedValue: CSSRGB
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowColor(attrName: shadowColor, oldValue: ColorType, newValue: ColorType, prevParsedValue: CSSRGB): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowColor(
      attrName: shadowColor,
      oldValue: ColorType,
      newValue: ColorType,
      prevParsedValue: CSSRGB,
      newParsedValue: CSSRGB
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetX(attrName: shadowOffsetX): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetX(attrName: shadowOffsetX, oldValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetX(attrName: shadowOffsetX, oldValue: Double, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetX(attrName: shadowOffsetX, oldValue: Double, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetX(
      attrName: shadowOffsetX,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetX(
      attrName: shadowOffsetX,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetX(attrName: shadowOffsetX, oldValue: Double, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetX(
      attrName: shadowOffsetX,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetX(
      attrName: shadowOffsetX,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetX(attrName: shadowOffsetX, oldValue: Unit, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetX(attrName: shadowOffsetX, oldValue: Unit, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetX(
      attrName: shadowOffsetX,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetX(
      attrName: shadowOffsetX,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetX(attrName: shadowOffsetX, oldValue: Unit, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetX(
      attrName: shadowOffsetX,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetX(
      attrName: shadowOffsetX,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetY(attrName: shadowOffsetY): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetY(attrName: shadowOffsetY, oldValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetY(attrName: shadowOffsetY, oldValue: Double, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetY(attrName: shadowOffsetY, oldValue: Double, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetY(
      attrName: shadowOffsetY,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetY(
      attrName: shadowOffsetY,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetY(attrName: shadowOffsetY, oldValue: Double, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetY(
      attrName: shadowOffsetY,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetY(
      attrName: shadowOffsetY,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetY(attrName: shadowOffsetY, oldValue: Unit, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetY(attrName: shadowOffsetY, oldValue: Unit, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetY(
      attrName: shadowOffsetY,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetY(
      attrName: shadowOffsetY,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetY(attrName: shadowOffsetY, oldValue: Unit, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetY(
      attrName: shadowOffsetY,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetY(
      attrName: shadowOffsetY,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowType(attrName: shadowType): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_stroke(
      attrName: stroke,
      oldValue: js.UndefOr[ColorType | Pattern],
      newValue: js.UndefOr[ColorType | Pattern],
      prevParsedValue: js.UndefOr[CSSRGB | js.Array[CSSGradientValue] | Pattern],
      newParsedValue: js.UndefOr[CSSRGB | js.Array[CSSGradientValue] | Pattern]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeDasharray(
      attrName: strokeDasharray,
      oldValue: js.UndefOr[String | (js.Array[String | Double])],
      newValue: js.UndefOr[String | (js.Array[String | Double])],
      prevParsedValue: js.UndefOr[String | (js.Array[String | Double])],
      newParsedValue: js.UndefOr[String | (js.Array[String | Double])]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeDashoffset(attrName: strokeDashoffset): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeDashoffset(attrName: strokeDashoffset, oldValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeDashoffset(attrName: strokeDashoffset, oldValue: Double, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeDashoffset(attrName: strokeDashoffset, oldValue: Double, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeDashoffset(
      attrName: strokeDashoffset,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeDashoffset(
      attrName: strokeDashoffset,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeDashoffset(attrName: strokeDashoffset, oldValue: Double, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeDashoffset(
      attrName: strokeDashoffset,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeDashoffset(
      attrName: strokeDashoffset,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeDashoffset(attrName: strokeDashoffset, oldValue: Unit, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeDashoffset(attrName: strokeDashoffset, oldValue: Unit, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeDashoffset(
      attrName: strokeDashoffset,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeDashoffset(
      attrName: strokeDashoffset,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeDashoffset(attrName: strokeDashoffset, oldValue: Unit, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeDashoffset(
      attrName: strokeDashoffset,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeDashoffset(
      attrName: strokeDashoffset,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinecap(attrName: strokeLinecap): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinecap(
      attrName: strokeLinecap,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: CanvasLineCap
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinecap(attrName: strokeLinecap, oldValue: Unit, newValue: Unit, prevParsedValue: CanvasLineCap): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinecap(
      attrName: strokeLinecap,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: CanvasLineCap,
      newParsedValue: CanvasLineCap
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinecap(attrName: strokeLinecap, oldValue: Unit, newValue: CanvasLineCap): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinecap(
      attrName: strokeLinecap,
      oldValue: Unit,
      newValue: CanvasLineCap,
      prevParsedValue: Unit,
      newParsedValue: CanvasLineCap
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinecap(attrName: strokeLinecap, oldValue: Unit, newValue: CanvasLineCap, prevParsedValue: CanvasLineCap): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinecap(
      attrName: strokeLinecap,
      oldValue: Unit,
      newValue: CanvasLineCap,
      prevParsedValue: CanvasLineCap,
      newParsedValue: CanvasLineCap
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinecap(attrName: strokeLinecap, oldValue: CanvasLineCap): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinecap(
      attrName: strokeLinecap,
      oldValue: CanvasLineCap,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: CanvasLineCap
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinecap(attrName: strokeLinecap, oldValue: CanvasLineCap, newValue: Unit, prevParsedValue: CanvasLineCap): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinecap(
      attrName: strokeLinecap,
      oldValue: CanvasLineCap,
      newValue: Unit,
      prevParsedValue: CanvasLineCap,
      newParsedValue: CanvasLineCap
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinecap(attrName: strokeLinecap, oldValue: CanvasLineCap, newValue: CanvasLineCap): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinecap(
      attrName: strokeLinecap,
      oldValue: CanvasLineCap,
      newValue: CanvasLineCap,
      prevParsedValue: Unit,
      newParsedValue: CanvasLineCap
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinecap(
      attrName: strokeLinecap,
      oldValue: CanvasLineCap,
      newValue: CanvasLineCap,
      prevParsedValue: CanvasLineCap
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinecap(
      attrName: strokeLinecap,
      oldValue: CanvasLineCap,
      newValue: CanvasLineCap,
      prevParsedValue: CanvasLineCap,
      newParsedValue: CanvasLineCap
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinejoin(attrName: strokeLinejoin): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinejoin(
      attrName: strokeLinejoin,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: CanvasLineJoin
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinejoin(attrName: strokeLinejoin, oldValue: Unit, newValue: Unit, prevParsedValue: CanvasLineJoin): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinejoin(
      attrName: strokeLinejoin,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: CanvasLineJoin,
      newParsedValue: CanvasLineJoin
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinejoin(attrName: strokeLinejoin, oldValue: Unit, newValue: CanvasLineJoin): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinejoin(
      attrName: strokeLinejoin,
      oldValue: Unit,
      newValue: CanvasLineJoin,
      prevParsedValue: Unit,
      newParsedValue: CanvasLineJoin
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinejoin(
      attrName: strokeLinejoin,
      oldValue: Unit,
      newValue: CanvasLineJoin,
      prevParsedValue: CanvasLineJoin
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinejoin(
      attrName: strokeLinejoin,
      oldValue: Unit,
      newValue: CanvasLineJoin,
      prevParsedValue: CanvasLineJoin,
      newParsedValue: CanvasLineJoin
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinejoin(attrName: strokeLinejoin, oldValue: CanvasLineJoin): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinejoin(
      attrName: strokeLinejoin,
      oldValue: CanvasLineJoin,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: CanvasLineJoin
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinejoin(
      attrName: strokeLinejoin,
      oldValue: CanvasLineJoin,
      newValue: Unit,
      prevParsedValue: CanvasLineJoin
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinejoin(
      attrName: strokeLinejoin,
      oldValue: CanvasLineJoin,
      newValue: Unit,
      prevParsedValue: CanvasLineJoin,
      newParsedValue: CanvasLineJoin
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinejoin(attrName: strokeLinejoin, oldValue: CanvasLineJoin, newValue: CanvasLineJoin): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinejoin(
      attrName: strokeLinejoin,
      oldValue: CanvasLineJoin,
      newValue: CanvasLineJoin,
      prevParsedValue: Unit,
      newParsedValue: CanvasLineJoin
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinejoin(
      attrName: strokeLinejoin,
      oldValue: CanvasLineJoin,
      newValue: CanvasLineJoin,
      prevParsedValue: CanvasLineJoin
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinejoin(
      attrName: strokeLinejoin,
      oldValue: CanvasLineJoin,
      newValue: CanvasLineJoin,
      prevParsedValue: CanvasLineJoin,
      newParsedValue: CanvasLineJoin
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(attrName: strokeOpacity): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(attrName: strokeOpacity, oldValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(attrName: strokeOpacity, oldValue: String, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(attrName: strokeOpacity, oldValue: String, newValue: String, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(
      attrName: strokeOpacity,
      oldValue: String,
      newValue: String,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(
      attrName: strokeOpacity,
      oldValue: String,
      newValue: String,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(attrName: strokeOpacity, oldValue: String, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(attrName: strokeOpacity, oldValue: String, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(
      attrName: strokeOpacity,
      oldValue: String,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(
      attrName: strokeOpacity,
      oldValue: String,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(attrName: strokeOpacity, oldValue: String, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(
      attrName: strokeOpacity,
      oldValue: String,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(
      attrName: strokeOpacity,
      oldValue: String,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(attrName: strokeOpacity, oldValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(attrName: strokeOpacity, oldValue: Double, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(attrName: strokeOpacity, oldValue: Double, newValue: String, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(
      attrName: strokeOpacity,
      oldValue: Double,
      newValue: String,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(
      attrName: strokeOpacity,
      oldValue: Double,
      newValue: String,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(attrName: strokeOpacity, oldValue: Double, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(attrName: strokeOpacity, oldValue: Double, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(
      attrName: strokeOpacity,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(
      attrName: strokeOpacity,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(attrName: strokeOpacity, oldValue: Double, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(
      attrName: strokeOpacity,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(
      attrName: strokeOpacity,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(attrName: strokeOpacity, oldValue: Unit, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(attrName: strokeOpacity, oldValue: Unit, newValue: String, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(
      attrName: strokeOpacity,
      oldValue: Unit,
      newValue: String,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(
      attrName: strokeOpacity,
      oldValue: Unit,
      newValue: String,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(attrName: strokeOpacity, oldValue: Unit, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(attrName: strokeOpacity, oldValue: Unit, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(
      attrName: strokeOpacity,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(
      attrName: strokeOpacity,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(attrName: strokeOpacity, oldValue: Unit, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(
      attrName: strokeOpacity,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(
      attrName: strokeOpacity,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeWidth(
      attrName: strokeWidth,
      oldValue: js.UndefOr[String | Double],
      newValue: js.UndefOr[String | Double],
      prevParsedValue: js.UndefOr[String | Double],
      newParsedValue: js.UndefOr[String | Double]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_textTransform(
      attrName: textTransform,
      oldValue: js.UndefOr[TextTransform | _empty],
      newValue: js.UndefOr[TextTransform | _empty],
      prevParsedValue: js.UndefOr[TextTransform | _empty],
      newParsedValue: js.UndefOr[TextTransform | _empty]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_transform(
      attrName: transform,
      oldValue: String,
      newValue: String,
      prevParsedValue: js.Array[ParsedTransform],
      newParsedValue: js.Array[ParsedTransform]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_transform(
      attrName: transform,
      oldValue: String,
      newValue: Unit,
      prevParsedValue: js.Array[ParsedTransform],
      newParsedValue: js.Array[ParsedTransform]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_transform(
      attrName: transform,
      oldValue: Unit,
      newValue: String,
      prevParsedValue: js.Array[ParsedTransform],
      newParsedValue: js.Array[ParsedTransform]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_transform(
      attrName: transform,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: js.Array[ParsedTransform],
      newParsedValue: js.Array[ParsedTransform]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_transformOrigin(attrName: transformOrigin): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_transformOrigin(attrName: transformOrigin, oldValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_transformOrigin(attrName: transformOrigin, oldValue: String, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_transformOrigin(
      attrName: transformOrigin,
      oldValue: String,
      newValue: String,
      prevParsedValue: js.Tuple3[CSSUnitValue, CSSUnitValue, CSSUnitValue]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_transformOrigin(
      attrName: transformOrigin,
      oldValue: String,
      newValue: String,
      prevParsedValue: js.Tuple3[CSSUnitValue, CSSUnitValue, CSSUnitValue],
      newParsedValue: js.Tuple3[CSSUnitValue, CSSUnitValue, CSSUnitValue]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_transformOrigin(
      attrName: transformOrigin,
      oldValue: String,
      newValue: String,
      prevParsedValue: Unit,
      newParsedValue: js.Tuple3[CSSUnitValue, CSSUnitValue, CSSUnitValue]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_transformOrigin(
      attrName: transformOrigin,
      oldValue: String,
      newValue: Unit,
      prevParsedValue: js.Tuple3[CSSUnitValue, CSSUnitValue, CSSUnitValue]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_transformOrigin(
      attrName: transformOrigin,
      oldValue: String,
      newValue: Unit,
      prevParsedValue: js.Tuple3[CSSUnitValue, CSSUnitValue, CSSUnitValue],
      newParsedValue: js.Tuple3[CSSUnitValue, CSSUnitValue, CSSUnitValue]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_transformOrigin(
      attrName: transformOrigin,
      oldValue: String,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: js.Tuple3[CSSUnitValue, CSSUnitValue, CSSUnitValue]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_transformOrigin(attrName: transformOrigin, oldValue: Unit, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_transformOrigin(
      attrName: transformOrigin,
      oldValue: Unit,
      newValue: String,
      prevParsedValue: js.Tuple3[CSSUnitValue, CSSUnitValue, CSSUnitValue]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_transformOrigin(
      attrName: transformOrigin,
      oldValue: Unit,
      newValue: String,
      prevParsedValue: js.Tuple3[CSSUnitValue, CSSUnitValue, CSSUnitValue],
      newParsedValue: js.Tuple3[CSSUnitValue, CSSUnitValue, CSSUnitValue]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_transformOrigin(
      attrName: transformOrigin,
      oldValue: Unit,
      newValue: String,
      prevParsedValue: Unit,
      newParsedValue: js.Tuple3[CSSUnitValue, CSSUnitValue, CSSUnitValue]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_transformOrigin(
      attrName: transformOrigin,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: js.Tuple3[CSSUnitValue, CSSUnitValue, CSSUnitValue]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_transformOrigin(
      attrName: transformOrigin,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: js.Tuple3[CSSUnitValue, CSSUnitValue, CSSUnitValue],
      newParsedValue: js.Tuple3[CSSUnitValue, CSSUnitValue, CSSUnitValue]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_transformOrigin(
      attrName: transformOrigin,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: js.Tuple3[CSSUnitValue, CSSUnitValue, CSSUnitValue]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_zIndex(attrName: zIndex): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_zIndex(attrName: zIndex, oldValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_zIndex(attrName: zIndex, oldValue: Double, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_zIndex(attrName: zIndex, oldValue: Double, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_zIndex(
      attrName: zIndex,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_zIndex(
      attrName: zIndex,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_zIndex(attrName: zIndex, oldValue: Double, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_zIndex(
      attrName: zIndex,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_zIndex(attrName: zIndex, oldValue: Double, newValue: Unit, prevParsedValue: Unit, newParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_zIndex(attrName: zIndex, oldValue: Unit, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_zIndex(attrName: zIndex, oldValue: Unit, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_zIndex(
      attrName: zIndex,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_zIndex(attrName: zIndex, oldValue: Unit, newValue: Double, prevParsedValue: Unit, newParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_zIndex(attrName: zIndex, oldValue: Unit, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_zIndex(attrName: zIndex, oldValue: Unit, newValue: Unit, prevParsedValue: Double, newParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_zIndex(attrName: zIndex, oldValue: Unit, newValue: Unit, prevParsedValue: Unit, newParsedValue: Double): Unit = js.native
    
    /**
      * Get end tangent vector
      */
    def getEndTangent(): js.Array[js.Array[Double]] = js.native
    
    /**
      * Returns the point at a given ratio of the total length in path.
      */
    def getPoint(ratio: Double): Point = js.native
    
    /**
      * Returns the point at a given distance along the path.
      * @see https://developer.mozilla.org/en-US/docs/Web/API/SVGGeometryElement/getPointAtLength
      */
    def getPointAtLength(distance: Double): Point = js.native
    
    /**
      * Get start tangent vector
      */
    def getStartTangent(): js.Array[js.Array[Double]] = js.native
    
    /**
      * Returns the total length of the path.
      * @see https://developer.mozilla.org/en-US/docs/Web/API/SVGGeometryElement/getTotalLength
      */
    def getTotalLength(): Double = js.native
    
    /* private */ var markerEndAngle: Any = js.native
    
    /**
      * markers placed at the mid
      */
    /* private */ var markerMidList: Any = js.native
    
    /* private */ var markerStartAngle: Any = js.native
    
    /* private */ var placeMarkerMid: Any = js.native
    
    /* private */ var transformMarker: Any = js.native
  }
  
  trait ParsedPathStyleProps
    extends StObject
       with ParsedBaseStyleProps {
    
    var d: js.UndefOr[AbsolutePath] = js.undefined
    
    var markerEnd: js.UndefOr[DisplayObject[Any, Any]] = js.undefined
    
    var markerEndOffset: js.UndefOr[Double] = js.undefined
    
    var markerMid: js.UndefOr[DisplayObject[Any, Any]] = js.undefined
    
    var markerStart: js.UndefOr[DisplayObject[Any, Any]] = js.undefined
    
    var markerStartOffset: js.UndefOr[Double] = js.undefined
    
    var path: AbsolutePath
  }
  object ParsedPathStyleProps {
    
    inline def apply(path: AbsolutePath, transform: js.Array[ParsedTransform]): ParsedPathStyleProps = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedPathStyleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParsedPathStyleProps] (val x: Self) extends AnyVal {
      
      inline def setD(value: AbsolutePath): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      inline def setDUndefined: Self = StObject.set(x, "d", js.undefined)
      
      inline def setMarkerEnd(value: DisplayObject[Any, Any]): Self = StObject.set(x, "markerEnd", value.asInstanceOf[js.Any])
      
      inline def setMarkerEndOffset(value: Double): Self = StObject.set(x, "markerEndOffset", value.asInstanceOf[js.Any])
      
      inline def setMarkerEndOffsetUndefined: Self = StObject.set(x, "markerEndOffset", js.undefined)
      
      inline def setMarkerEndUndefined: Self = StObject.set(x, "markerEnd", js.undefined)
      
      inline def setMarkerMid(value: DisplayObject[Any, Any]): Self = StObject.set(x, "markerMid", value.asInstanceOf[js.Any])
      
      inline def setMarkerMidUndefined: Self = StObject.set(x, "markerMid", js.undefined)
      
      inline def setMarkerStart(value: DisplayObject[Any, Any]): Self = StObject.set(x, "markerStart", value.asInstanceOf[js.Any])
      
      inline def setMarkerStartOffset(value: Double): Self = StObject.set(x, "markerStartOffset", value.asInstanceOf[js.Any])
      
      inline def setMarkerStartOffsetUndefined: Self = StObject.set(x, "markerStartOffset", js.undefined)
      
      inline def setMarkerStartUndefined: Self = StObject.set(x, "markerStart", js.undefined)
      
      inline def setPath(value: AbsolutePath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait PathSegment extends StObject {
    
    var command: /* import warning: importer.ImportType#apply Failed type conversion: @antv/util.@antv/util/lib/path/types.PathArray[0] */ js.Any
    
    var currentPoint: js.Tuple2[Double, Double]
    
    var endTangent: (js.Tuple2[Double, Double]) | Null
    
    var nextPoint: (js.Tuple2[Double, Double]) | Null
    
    var params: /* import warning: importer.ImportType#apply Failed type conversion: @antv/util.@antv/util/lib/path/types.PathArray[0] */ js.Any
    
    var prePoint: (js.Tuple2[Double, Double]) | Null
    
    var startTangent: (js.Tuple2[Double, Double]) | Null
  }
  object PathSegment {
    
    inline def apply(
      command: /* import warning: importer.ImportType#apply Failed type conversion: @antv/util.@antv/util/lib/path/types.PathArray[0] */ js.Any,
      currentPoint: js.Tuple2[Double, Double],
      params: /* import warning: importer.ImportType#apply Failed type conversion: @antv/util.@antv/util/lib/path/types.PathArray[0] */ js.Any
    ): PathSegment = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], currentPoint = currentPoint.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], endTangent = null, nextPoint = null, prePoint = null, startTangent = null)
      __obj.asInstanceOf[PathSegment]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PathSegment] (val x: Self) extends AnyVal {
      
      inline def setCommand(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @antv/util.@antv/util/lib/path/types.PathArray[0] */ js.Any
      ): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setCurrentPoint(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "currentPoint", value.asInstanceOf[js.Any])
      
      inline def setEndTangent(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "endTangent", value.asInstanceOf[js.Any])
      
      inline def setEndTangentNull: Self = StObject.set(x, "endTangent", null)
      
      inline def setNextPoint(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "nextPoint", value.asInstanceOf[js.Any])
      
      inline def setNextPointNull: Self = StObject.set(x, "nextPoint", null)
      
      inline def setParams(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @antv/util.@antv/util/lib/path/types.PathArray[0] */ js.Any
      ): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setPrePoint(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "prePoint", value.asInstanceOf[js.Any])
      
      inline def setPrePointNull: Self = StObject.set(x, "prePoint", null)
      
      inline def setStartTangent(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "startTangent", value.asInstanceOf[js.Any])
      
      inline def setStartTangentNull: Self = StObject.set(x, "startTangent", null)
    }
  }
  
  trait PathStyleProps
    extends StObject
       with BaseStyleProps {
    
    var d: js.UndefOr[String | PathArray] = js.undefined
    
    /**
      * marker will be positioned at the last point
      */
    var markerEnd: js.UndefOr[DisplayObject[Any, Any]] = js.undefined
    
    /**
      * offset relative to original position
      */
    var markerEndOffset: js.UndefOr[Double] = js.undefined
    
    var markerMid: js.UndefOr[DisplayObject[Any, Any]] = js.undefined
    
    /**
      * marker will be positioned at the first point
      */
    var markerStart: js.UndefOr[DisplayObject[Any, Any]] = js.undefined
    
    /**
      * offset relative to original position
      */
    var markerStartOffset: js.UndefOr[Double] = js.undefined
    
    var path: js.UndefOr[String | PathArray] = js.undefined
  }
  object PathStyleProps {
    
    inline def apply(): PathStyleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PathStyleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PathStyleProps] (val x: Self) extends AnyVal {
      
      inline def setD(value: String | PathArray): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      inline def setDUndefined: Self = StObject.set(x, "d", js.undefined)
      
      inline def setMarkerEnd(value: DisplayObject[Any, Any]): Self = StObject.set(x, "markerEnd", value.asInstanceOf[js.Any])
      
      inline def setMarkerEndOffset(value: Double): Self = StObject.set(x, "markerEndOffset", value.asInstanceOf[js.Any])
      
      inline def setMarkerEndOffsetUndefined: Self = StObject.set(x, "markerEndOffset", js.undefined)
      
      inline def setMarkerEndUndefined: Self = StObject.set(x, "markerEnd", js.undefined)
      
      inline def setMarkerMid(value: DisplayObject[Any, Any]): Self = StObject.set(x, "markerMid", value.asInstanceOf[js.Any])
      
      inline def setMarkerMidUndefined: Self = StObject.set(x, "markerMid", js.undefined)
      
      inline def setMarkerStart(value: DisplayObject[Any, Any]): Self = StObject.set(x, "markerStart", value.asInstanceOf[js.Any])
      
      inline def setMarkerStartOffset(value: Double): Self = StObject.set(x, "markerStartOffset", value.asInstanceOf[js.Any])
      
      inline def setMarkerStartOffsetUndefined: Self = StObject.set(x, "markerStartOffset", js.undefined)
      
      inline def setMarkerStartUndefined: Self = StObject.set(x, "markerStart", js.undefined)
      
      inline def setPath(value: String | PathArray): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
}
