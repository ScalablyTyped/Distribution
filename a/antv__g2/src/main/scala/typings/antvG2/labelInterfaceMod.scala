package typings.antvG2

import org.scalablytyped.runtime.TopLevel
import typings.antvG2.anon.Padding
import typings.antvG2.anon.Path
import typings.antvG2.anon.`0`
import typings.antvG2.antvG2Booleans.`false`
import typings.antvG2.antvG2Strings.bottom
import typings.antvG2.antvG2Strings.left
import typings.antvG2.antvG2Strings.middle
import typings.antvG2.antvG2Strings.right
import typings.antvG2.antvG2Strings.top
import typings.antvG2.dependentsMod.Coordinate
import typings.antvG2.libInterfaceMod.AnimateOption
import typings.antvG2.libInterfaceMod.Datum
import typings.antvG2.libInterfaceMod.GeometryLabelLayoutCfg
import typings.antvG2.libInterfaceMod.LooseObject
import typings.antvG2.libInterfaceMod.MappingDatum
import typings.antvG2.libInterfaceMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object labelInterfaceMod {
  
  /* Inlined parent std.Omit<@antv/g2.@antv/g2/lib/interface.GeometryLabelCfg, 'offset'> */
  trait LabelCfg extends StObject {
    
    var animate: js.UndefOr[AnimateOption | `false` | Null] = js.undefined
    
    var autoRotate: js.UndefOr[Boolean] = js.undefined
    
    var background: js.UndefOr[Padding] = js.undefined
    
    var content: js.UndefOr[Any] = js.undefined
    
    val coordinate: Coordinate
    
    val data: Datum
    
    val elementId: String
    
    val id: String
    
    var labelEmit: js.UndefOr[Boolean] = js.undefined
    
    var labelHeight: js.UndefOr[Double] = js.undefined
    
    var labelLine: js.UndefOr[Null | Boolean | `0`] = js.undefined
    
    var layout: js.UndefOr[GeometryLabelLayoutCfg | js.Array[GeometryLabelLayoutCfg]] = js.undefined
    
    val mappingData: MappingDatum
    
    val offset: js.UndefOr[Double] = js.undefined
    
    var offsetX: js.UndefOr[Double] = js.undefined
    
    var offsetY: js.UndefOr[Double] = js.undefined
    
    val position: js.UndefOr[top | bottom | middle | left | right] = js.undefined
    
    var rotate: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[LooseObject] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object LabelCfg {
    
    inline def apply(coordinate: Coordinate, data: Datum, elementId: String, id: String, mappingData: MappingDatum): LabelCfg = {
      val __obj = js.Dynamic.literal(coordinate = coordinate.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], elementId = elementId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mappingData = mappingData.asInstanceOf[js.Any])
      __obj.asInstanceOf[LabelCfg]
    }
    
    extension [Self <: LabelCfg](x: Self) {
      
      inline def setAnimate(value: AnimateOption | `false`): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateNull: Self = StObject.set(x, "animate", null)
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setAutoRotate(value: Boolean): Self = StObject.set(x, "autoRotate", value.asInstanceOf[js.Any])
      
      inline def setAutoRotateUndefined: Self = StObject.set(x, "autoRotate", js.undefined)
      
      inline def setBackground(value: Padding): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setContent(value: Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setCoordinate(value: Coordinate): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
      
      inline def setData(value: Datum): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setElementId(value: String): Self = StObject.set(x, "elementId", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLabelEmit(value: Boolean): Self = StObject.set(x, "labelEmit", value.asInstanceOf[js.Any])
      
      inline def setLabelEmitUndefined: Self = StObject.set(x, "labelEmit", js.undefined)
      
      inline def setLabelHeight(value: Double): Self = StObject.set(x, "labelHeight", value.asInstanceOf[js.Any])
      
      inline def setLabelHeightUndefined: Self = StObject.set(x, "labelHeight", js.undefined)
      
      inline def setLabelLine(value: Boolean | `0`): Self = StObject.set(x, "labelLine", value.asInstanceOf[js.Any])
      
      inline def setLabelLineNull: Self = StObject.set(x, "labelLine", null)
      
      inline def setLabelLineUndefined: Self = StObject.set(x, "labelLine", js.undefined)
      
      inline def setLayout(value: GeometryLabelLayoutCfg | js.Array[GeometryLabelLayoutCfg]): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setLayoutVarargs(value: GeometryLabelLayoutCfg*): Self = StObject.set(x, "layout", js.Array(value*))
      
      inline def setMappingData(value: MappingDatum): Self = StObject.set(x, "mappingData", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
      
      inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
      
      inline def setPosition(value: top | bottom | middle | left | right): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setStyle(value: LooseObject): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.antvG2.labelInterfaceMod.LabelPointCfg because var conflicts: content, rotate. Inlined x, y, start, color, textAlign, textBaseline, angle, r */ trait LabelItem
    extends StObject
       with LabelCfg {
    
    val angle: js.UndefOr[Double] = js.undefined
    
    /**
      * @title 是否支持捕获
      */
    var capture: js.UndefOr[Boolean] = js.undefined
    
    val color: js.UndefOr[String] = js.undefined
    
    /**
      * @title 牵引线
      */
    @JSName("labelLine")
    var labelLine_LabelItem: js.UndefOr[Null | Boolean | Path] = js.undefined
    
    val r: js.UndefOr[Double] = js.undefined
    
    val start: js.UndefOr[Point] = js.undefined
    
    val textAlign: js.UndefOr[TextAlign] = js.undefined
    
    val textBaseline: js.UndefOr[String] = js.undefined
    
    /**
      * @title labelPoint.x
      */
    var x: js.UndefOr[Double] = js.undefined
    
    /**
      * @title labelPoint.y
      */
    var y: js.UndefOr[Double] = js.undefined
  }
  object LabelItem {
    
    inline def apply(coordinate: Coordinate, data: Datum, elementId: String, id: String, mappingData: MappingDatum): LabelItem = {
      val __obj = js.Dynamic.literal(coordinate = coordinate.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], elementId = elementId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mappingData = mappingData.asInstanceOf[js.Any])
      __obj.asInstanceOf[LabelItem]
    }
    
    extension [Self <: LabelItem](x: Self) {
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      inline def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setLabelLine(value: Boolean | Path): Self = StObject.set(x, "labelLine", value.asInstanceOf[js.Any])
      
      inline def setLabelLineNull: Self = StObject.set(x, "labelLine", null)
      
      inline def setLabelLineUndefined: Self = StObject.set(x, "labelLine", js.undefined)
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setRUndefined: Self = StObject.set(x, "r", js.undefined)
      
      inline def setStart(value: Point): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setTextAlign(value: TextAlign): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setTextBaseline(value: String): Self = StObject.set(x, "textBaseline", value.asInstanceOf[js.Any])
      
      inline def setTextBaselineUndefined: Self = StObject.set(x, "textBaseline", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait LabelPointCfg extends StObject {
    
    val angle: js.UndefOr[Double] = js.undefined
    
    val color: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[Any] = js.undefined
    
    val r: js.UndefOr[Double] = js.undefined
    
    var rotate: js.UndefOr[Double] = js.undefined
    
    val start: js.UndefOr[Point] = js.undefined
    
    val textAlign: js.UndefOr[TextAlign] = js.undefined
    
    val textBaseline: js.UndefOr[String] = js.undefined
    
    /**
      * @title labelPoint.x
      */
    var x: js.UndefOr[Double] = js.undefined
    
    /**
      * @title labelPoint.y
      */
    var y: js.UndefOr[Double] = js.undefined
  }
  object LabelPointCfg {
    
    inline def apply(): LabelPointCfg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelPointCfg]
    }
    
    extension [Self <: LabelPointCfg](x: Self) {
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setContent(value: Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setRUndefined: Self = StObject.set(x, "r", js.undefined)
      
      inline def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setStart(value: Point): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setTextAlign(value: TextAlign): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setTextBaseline(value: String): Self = StObject.set(x, "textBaseline", value.asInstanceOf[js.Any])
      
      inline def setTextBaselineUndefined: Self = StObject.set(x, "textBaseline", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait PolarLabelItem
    extends StObject
       with LabelItem {
    
    /**
      * @title 是否不可见
      */
    var invisible: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @title 占比
      */
    val percent: js.UndefOr[Double] = js.undefined
  }
  object PolarLabelItem {
    
    inline def apply(coordinate: Coordinate, data: Datum, elementId: String, id: String, mappingData: MappingDatum): PolarLabelItem = {
      val __obj = js.Dynamic.literal(coordinate = coordinate.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], elementId = elementId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mappingData = mappingData.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolarLabelItem]
    }
    
    extension [Self <: PolarLabelItem](x: Self) {
      
      inline def setInvisible(value: Boolean): Self = StObject.set(x, "invisible", value.asInstanceOf[js.Any])
      
      inline def setInvisibleUndefined: Self = StObject.set(x, "invisible", js.undefined)
      
      inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antvG2.antvG2Strings.start
    - typings.antvG2.antvG2Strings.center
    - typings.antvG2.antvG2Strings.end
    - typings.antvG2.antvG2Strings.left
    - typings.antvG2.antvG2Strings.right
  */
  trait TextAlign extends StObject
  object TextAlign {
    
    inline def center: typings.antvG2.antvG2Strings.center = "center".asInstanceOf[typings.antvG2.antvG2Strings.center]
    
    inline def end: typings.antvG2.antvG2Strings.end = "end".asInstanceOf[typings.antvG2.antvG2Strings.end]
    
    inline def left: typings.antvG2.antvG2Strings.left = "left".asInstanceOf[typings.antvG2.antvG2Strings.left]
    
    inline def right: typings.antvG2.antvG2Strings.right = "right".asInstanceOf[typings.antvG2.antvG2Strings.right]
    
    inline def start: typings.antvG2.antvG2Strings.start = "start".asInstanceOf[typings.antvG2.antvG2Strings.start]
  }
  
  type Writeable[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {-readonly [ P in keyof T ]: T[P]}
    */ typings.antvG2.antvG2Strings.Writeable & TopLevel[T]
}
