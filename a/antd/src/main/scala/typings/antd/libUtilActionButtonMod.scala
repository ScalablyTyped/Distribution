package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.libButtonButtonMod.ButtonProps
import typings.antd.libButtonButtonMod.LegacyButtonType
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilActionButtonMod extends Shortcut {
  
  @JSImport("antd/lib/_util/ActionButton", JSImport.Default)
  @js.native
  val default: FC[ActionButtonProps] = js.native
  
  trait ActionButtonProps extends StObject {
    
    var actionFn: js.UndefOr[js.Function1[/* repeated */ Any, Any | PromiseLike[Any]]] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var buttonProps: js.UndefOr[ButtonProps] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var close: js.UndefOr[js.Function] = js.undefined
    
    var emitEvent: js.UndefOr[Boolean] = js.undefined
    
    var prefixCls: String
    
    var quitOnNullishReturnValue: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[LegacyButtonType] = js.undefined
  }
  object ActionButtonProps {
    
    inline def apply(prefixCls: String): ActionButtonProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionButtonProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActionButtonProps] (val x: Self) extends AnyVal {
      
      inline def setActionFn(value: /* repeated */ Any => Any | PromiseLike[Any]): Self = StObject.set(x, "actionFn", js.Any.fromFunction1(value))
      
      inline def setActionFnUndefined: Self = StObject.set(x, "actionFn", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setButtonProps(value: ButtonProps): Self = StObject.set(x, "buttonProps", value.asInstanceOf[js.Any])
      
      inline def setButtonPropsUndefined: Self = StObject.set(x, "buttonProps", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClose(value: js.Function): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setEmitEvent(value: Boolean): Self = StObject.set(x, "emitEvent", value.asInstanceOf[js.Any])
      
      inline def setEmitEventUndefined: Self = StObject.set(x, "emitEvent", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setQuitOnNullishReturnValue(value: Boolean): Self = StObject.set(x, "quitOnNullishReturnValue", value.asInstanceOf[js.Any])
      
      inline def setQuitOnNullishReturnValueUndefined: Self = StObject.set(x, "quitOnNullishReturnValue", js.undefined)
      
      inline def setType(value: LegacyButtonType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type _To = FC[ActionButtonProps]
  
  /* This means you don't have to write `default`, but can instead just say `libUtilActionButtonMod.foo` */
  override def _to: FC[ActionButtonProps] = default
}
