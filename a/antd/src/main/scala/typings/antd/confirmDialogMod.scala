package typings.antd

import typings.antd.modalModalMod.ModalFuncProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object confirmDialogMod {
  
  @JSImport("antd/lib/modal/ConfirmDialog", JSImport.Default)
  @js.native
  def default(props: ConfirmDialogProps): Element = js.native
  
  @js.native
  trait ConfirmDialogProps extends ModalFuncProps {
    
    var afterClose: js.UndefOr[js.Function0[Unit]] = js.native
    
    def close(args: js.Any*): Unit = js.native
    
    var rootPrefixCls: js.UndefOr[String] = js.native
  }
  object ConfirmDialogProps {
    
    @scala.inline
    def apply(close: /* repeated */ js.Any => Unit): ConfirmDialogProps = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close))
      __obj.asInstanceOf[ConfirmDialogProps]
    }
    
    @scala.inline
    implicit class ConfirmDialogPropsMutableBuilder[Self <: ConfirmDialogProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterClose(value: () => Unit): Self = StObject.set(x, "afterClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAfterCloseUndefined: Self = StObject.set(x, "afterClose", js.undefined)
      
      @scala.inline
      def setClose(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRootPrefixCls(value: String): Self = StObject.set(x, "rootPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootPrefixClsUndefined: Self = StObject.set(x, "rootPrefixCls", js.undefined)
    }
  }
}
