package typings.antvG2plot.anon

import typings.antvG2plot.libTypesAttrMod.ColorAttr
import typings.antvG2plot.libTypesAttrMod.ShapeAttr
import typings.antvG2plot.libTypesAttrMod.ShapeStyle
import typings.antvG2plot.libTypesAttrMod.SizeAttr
import typings.antvG2plot.libTypesAttrMod.StyleAttr
import typings.antvG2plot.libTypesAttrMod.TooltipAttr
import typings.antvG2plot.libTypesCommonMod.Datum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @antv/g2plot.@antv/g2plot/lib/adaptor/geometries/base.MappingOptions & std.Pick<@antv/g2plot.@antv/g2plot/lib/adaptor/geometries/point.PointGeometryOptions, 'state'> */
trait MappingOptionsPickPointGe extends StObject {
  
  /** color 映射 */
  val color: js.UndefOr[ColorAttr] = js.undefined
  
  /** shape 映射 */
  val shape: js.UndefOr[ShapeAttr] = js.undefined
  
  /** 大小映射, 提供回调的方式 */
  val size: js.UndefOr[SizeAttr] = js.undefined
  
  var state: js.UndefOr[typings.antvG2plot.libTypesStateMod.State] = js.undefined
  
  /** 样式映射 */
  val style: js.UndefOr[StyleAttr] = js.undefined
  
  /** tooltip 映射 */
  val tooltip: js.UndefOr[TooltipAttr] = js.undefined
}
object MappingOptionsPickPointGe {
  
  inline def apply(): MappingOptionsPickPointGe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MappingOptionsPickPointGe]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MappingOptionsPickPointGe] (val x: Self) extends AnyVal {
    
    inline def setColor(value: ColorAttr): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorFunction2(value: (/* datum */ Datum, /* defaultColor */ js.UndefOr[String]) => String): Self = StObject.set(x, "color", js.Any.fromFunction2(value))
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: String*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setShape(value: ShapeAttr): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeFunction1(value: /* datum */ Datum => String): Self = StObject.set(x, "shape", js.Any.fromFunction1(value))
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setShapeVarargs(value: String*): Self = StObject.set(x, "shape", js.Array(value*))
    
    inline def setSize(value: SizeAttr): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeFunction1(value: /* datum */ Datum => Double): Self = StObject.set(x, "size", js.Any.fromFunction1(value))
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setState(value: typings.antvG2plot.libTypesStateMod.State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStyle(value: StyleAttr): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleFunction1(value: /* datum */ Datum => ShapeStyle): Self = StObject.set(x, "style", js.Any.fromFunction1(value))
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTooltip(value: /* datum */ Datum => NameString): Self = StObject.set(x, "tooltip", js.Any.fromFunction1(value))
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
