package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.buttonButtonMod.ButtonProps
import typings.antd.buttonButtonMod.LegacyButtonType
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionButtonMod extends Shortcut {
  
  @JSImport("antd/lib/modal/ActionButton", JSImport.Default)
  @js.native
  val default: FC[ActionButtonProps] = js.native
  
  @js.native
  trait ActionButtonProps extends StObject {
    
    var actionFn: js.UndefOr[js.Function1[/* repeated */ js.Any, _ | js.Thenable[_]]] = js.native
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var buttonProps: js.UndefOr[ButtonProps] = js.native
    
    var closeModal: js.Function = js.native
    
    var prefixCls: String = js.native
    
    var `type`: js.UndefOr[LegacyButtonType] = js.native
  }
  object ActionButtonProps {
    
    @scala.inline
    def apply(closeModal: js.Function, prefixCls: String): ActionButtonProps = {
      val __obj = js.Dynamic.literal(closeModal = closeModal.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionButtonProps]
    }
    
    @scala.inline
    implicit class ActionButtonPropsMutableBuilder[Self <: ActionButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionFn(value: /* repeated */ js.Any => _ | js.Thenable[_]): Self = StObject.set(x, "actionFn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setActionFnUndefined: Self = StObject.set(x, "actionFn", js.undefined)
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setButtonProps(value: ButtonProps): Self = StObject.set(x, "buttonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonPropsUndefined: Self = StObject.set(x, "buttonProps", js.undefined)
      
      @scala.inline
      def setCloseModal(value: js.Function): Self = StObject.set(x, "closeModal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: LegacyButtonType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type _To = FC[ActionButtonProps]
  
  /* This means you don't have to write `default`, but can instead just say `actionButtonMod.foo` */
  override def _to: FC[ActionButtonProps] = default
}
