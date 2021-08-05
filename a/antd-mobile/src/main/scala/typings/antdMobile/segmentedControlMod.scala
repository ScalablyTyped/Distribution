package typings.antdMobile

import typings.antdMobile.anon.OnChange
import typings.antdMobile.segmentedControlPropsTypeMod.SegmentedControlPropsType
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object segmentedControlMod {
  
  @JSImport("antd-mobile/lib/segmented-control", JSImport.Default)
  @js.native
  class default protected () extends SegmentedControl {
    def this(props: SegmentedControlProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/segmented-control", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/segmented-control", "default.defaultProps")
    @js.native
    def defaultProps: OnChange = js.native
    inline def defaultProps_=(x: OnChange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait SegmentedControl
    extends Component[SegmentedControlProps, js.Any, js.Any] {
    
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MSegmentedControl(nextProps: SegmentedControlProps): Unit = js.native
    
    def onClick(e: MouseEvent[HTMLDivElement, NativeMouseEvent], index: js.Any, value: js.Any): Unit = js.native
    
    def renderSegmentItem(idx: Double, value: String, selected: Boolean): Element = js.native
  }
  
  trait SegmentedControlProps
    extends StObject
       with SegmentedControlPropsType {
    
    var className: js.UndefOr[String] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object SegmentedControlProps {
    
    inline def apply(): SegmentedControlProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SegmentedControlProps]
    }
    
    extension [Self <: SegmentedControlProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
