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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<bizcharts.bizcharts.AxisProps> */
@js.native
trait ReadonlyAxisProps extends StObject {
  
  val children: js.UndefOr[ReactNode] = js.native
  
  val grid: js.UndefOr[AxisGrid | Null] = js.native
  
  val key: js.UndefOr[typings.react.mod.Key] = js.native
  
  val label: js.UndefOr[AxisLabel | Null] = js.native
  
  val line: js.UndefOr[typings.antvG2.mod.Styles.line | Null] = js.native
  
  val min: js.UndefOr[Double] = js.native
  
  val name: js.UndefOr[String] = js.native
  
  val position: js.UndefOr[PositionType] = js.native
  
  val ref: js.UndefOr[LegacyRef[_]] = js.native
  
  val subTickCount: js.UndefOr[Double] = js.native
  
  val subTickLine: js.UndefOr[typings.antvG2.mod.Styles.tickLine] = js.native
  
  val tickLine: js.UndefOr[typings.antvG2.mod.Styles.tickLine | Null] = js.native
  
  val title: js.UndefOr[AxisTitle | Boolean | Null] = js.native
  
  val visible: js.UndefOr[Boolean] = js.native
  
  val zIndex: js.UndefOr[Double] = js.native
}
object ReadonlyAxisProps {
  
  @scala.inline
  def apply(): ReadonlyAxisProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyAxisProps]
  }
  
  @scala.inline
  implicit class ReadonlyAxisPropsMutableBuilder[Self <: ReadonlyAxisProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setGrid(value: AxisGrid): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridNull: Self = StObject.set(x, "grid", null)
    
    @scala.inline
    def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    @scala.inline
    def setKey(value: typings.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setLabel(value: AxisLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelNull: Self = StObject.set(x, "label", null)
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLine(value: line): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineNull: Self = StObject.set(x, "line", null)
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPosition(value: PositionType): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setRef(value: LegacyRef[_]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    @scala.inline
    def setSubTickCount(value: Double): Self = StObject.set(x, "subTickCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubTickCountUndefined: Self = StObject.set(x, "subTickCount", js.undefined)
    
    @scala.inline
    def setSubTickLine(value: tickLine): Self = StObject.set(x, "subTickLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubTickLineUndefined: Self = StObject.set(x, "subTickLine", js.undefined)
    
    @scala.inline
    def setTickLine(value: tickLine): Self = StObject.set(x, "tickLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickLineNull: Self = StObject.set(x, "tickLine", null)
    
    @scala.inline
    def setTickLineUndefined: Self = StObject.set(x, "tickLine", js.undefined)
    
    @scala.inline
    def setTitle(value: AxisTitle | Boolean): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleNull: Self = StObject.set(x, "title", null)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
