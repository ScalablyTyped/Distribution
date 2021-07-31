package typings.antdMobile

import typings.antdMobile.anon.PrefixClsSize
import typings.antdMobile.whiteSpacePropsTypeMod.WhiteSpacePropsType
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object whiteSpaceMod {
  
  @JSImport("antd-mobile/lib/white-space", JSImport.Default)
  @js.native
  class default () extends WhiteSpace
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/white-space", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/white-space", "default.defaultProps")
    @js.native
    def defaultProps: PrefixClsSize = js.native
    @scala.inline
    def defaultProps_=(x: PrefixClsSize): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait WhiteSpace
    extends Component[WhiteSpaceProps, js.Any, js.Any]
  
  trait WhiteSpaceProps
    extends StObject
       with WhiteSpacePropsType {
    
    var className: js.UndefOr[String] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object WhiteSpaceProps {
    
    @scala.inline
    def apply(): WhiteSpaceProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WhiteSpaceProps]
    }
    
    @scala.inline
    implicit class WhiteSpacePropsMutableBuilder[Self <: WhiteSpaceProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setOnClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
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
