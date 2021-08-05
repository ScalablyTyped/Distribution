package typings.antDesignPro.anon

import typings.antvG2.mod.AxisGrid
import typings.antvG2.mod.AxisLabel
import typings.antvG2.mod.AxisTitle
import typings.antvG2.mod.Styles.line
import typings.antvG2.mod.Styles.tickLine
import typings.bizcharts.mod.PositionType
import typings.react.mod.LegacyRef
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<bizcharts.bizcharts.AxisProps> */
trait ReadonlyAxisProps extends StObject {
  
  val children: js.UndefOr[ReactNode] = js.undefined
  
  val grid: js.UndefOr[AxisGrid | Null] = js.undefined
  
  val key: js.UndefOr[typings.react.mod.Key] = js.undefined
  
  val label: js.UndefOr[AxisLabel | Null] = js.undefined
  
  val line: js.UndefOr[typings.antvG2.mod.Styles.line | Null] = js.undefined
  
  val min: js.UndefOr[Double] = js.undefined
  
  val name: js.UndefOr[String] = js.undefined
  
  val position: js.UndefOr[PositionType] = js.undefined
  
  val ref: js.UndefOr[LegacyRef[js.Any]] = js.undefined
  
  val subTickCount: js.UndefOr[Double] = js.undefined
  
  val subTickLine: js.UndefOr[typings.antvG2.mod.Styles.tickLine] = js.undefined
  
  val tickLine: js.UndefOr[typings.antvG2.mod.Styles.tickLine | Null] = js.undefined
  
  val title: js.UndefOr[AxisTitle | Boolean | Null] = js.undefined
  
  val visible: js.UndefOr[Boolean] = js.undefined
  
  val zIndex: js.UndefOr[Double] = js.undefined
}
object ReadonlyAxisProps {
  
  inline def apply(): ReadonlyAxisProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyAxisProps]
  }
  
  extension [Self <: ReadonlyAxisProps](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setGrid(value: AxisGrid): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setGridNull: Self = StObject.set(x, "grid", null)
    
    inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    inline def setKey(value: typings.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLabel(value: AxisLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLine(value: line): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineNull: Self = StObject.set(x, "line", null)
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPosition(value: PositionType): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRef(value: LegacyRef[js.Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setSubTickCount(value: Double): Self = StObject.set(x, "subTickCount", value.asInstanceOf[js.Any])
    
    inline def setSubTickCountUndefined: Self = StObject.set(x, "subTickCount", js.undefined)
    
    inline def setSubTickLine(value: tickLine): Self = StObject.set(x, "subTickLine", value.asInstanceOf[js.Any])
    
    inline def setSubTickLineUndefined: Self = StObject.set(x, "subTickLine", js.undefined)
    
    inline def setTickLine(value: tickLine): Self = StObject.set(x, "tickLine", value.asInstanceOf[js.Any])
    
    inline def setTickLineNull: Self = StObject.set(x, "tickLine", null)
    
    inline def setTickLineUndefined: Self = StObject.set(x, "tickLine", js.undefined)
    
    inline def setTitle(value: AxisTitle | Boolean): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
