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
import scala.scalajs.js.`|`
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
    @scala.inline
    def defaultProps_=(x: OnChange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait SegmentedControl
    extends Component[SegmentedControlProps, js.Any, js.Any] {
    
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MSegmentedControl(nextProps: SegmentedControlProps): Unit = js.native
    
    def onClick(e: MouseEvent[HTMLDivElement, NativeMouseEvent], index: js.Any, value: js.Any): Unit = js.native
    
    def renderSegmentItem(idx: Double, value: String, selected: Boolean): Element = js.native
  }
  
  @js.native
  trait SegmentedControlProps extends SegmentedControlPropsType {
    
    var className: js.UndefOr[String] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object SegmentedControlProps {
    
    @scala.inline
    def apply(): SegmentedControlProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SegmentedControlProps]
    }
    
    @scala.inline
    implicit class SegmentedControlPropsMutableBuilder[Self <: SegmentedControlProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
