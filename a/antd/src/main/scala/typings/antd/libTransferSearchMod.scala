package typings.antd

import typings.react.mod.FormEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTransferSearchMod {
  
  @JSImport("antd/lib/transfer/search", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: TransferSearchProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait TransferSearchProps extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var handleClear: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* e */ FormEvent[HTMLElement], Unit]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object TransferSearchProps {
    
    inline def apply(): TransferSearchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransferSearchProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransferSearchProps] (val x: Self) extends AnyVal {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHandleClear(value: () => Unit): Self = StObject.set(x, "handleClear", js.Any.fromFunction0(value))
      
      inline def setHandleClearUndefined: Self = StObject.set(x, "handleClear", js.undefined)
      
      inline def setOnChange(value: /* e */ FormEvent[HTMLElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
