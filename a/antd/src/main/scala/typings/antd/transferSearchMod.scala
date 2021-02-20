package typings.antd

import typings.antd.anon.Placeholder
import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.react.mod.FormEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLAnchorElement
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transferSearchMod {
  
  @JSImport("antd/lib/transfer/search", JSImport.Default)
  @js.native
  class default () extends Search
  /* static members */
  object default {
    
    @JSImport("antd/lib/transfer/search", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/lib/transfer/search", "default.defaultProps")
    @js.native
    def defaultProps: Placeholder = js.native
    @scala.inline
    def defaultProps_=(x: Placeholder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Search
    extends Component[TransferSearchProps, js.Any, js.Any] {
    
    def handleChange(e: ChangeEvent[HTMLInputElement]): Unit = js.native
    
    def handleClear(e: MouseEvent[HTMLAnchorElement, NativeMouseEvent]): Unit = js.native
  }
  
  @js.native
  trait TransferSearchProps extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var handleClear: js.UndefOr[js.Function1[/* e */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* e */ FormEvent[HTMLElement], Unit]] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[String] = js.native
  }
  object TransferSearchProps {
    
    @scala.inline
    def apply(): TransferSearchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransferSearchProps]
    }
    
    @scala.inline
    implicit class TransferSearchPropsMutableBuilder[Self <: TransferSearchProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setHandleClear(value: /* e */ MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "handleClear", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleClearUndefined: Self = StObject.set(x, "handleClear", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* e */ FormEvent[HTMLElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
